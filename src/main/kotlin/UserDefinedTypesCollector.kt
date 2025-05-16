import org.antlr.v4.runtime.tree.ParseTreeWalker

class UserDefinedTypesCollector(private val existingTypes: Map<String, Type> = builtInTypes) {
    fun collectTypes(ctx: TypeDefsParser.TypeDefsContext): TypeCollectionResult {
        val parseTreeWalker = ParseTreeWalker()
        val treeListener = TypeCollectingTreeListener(existingTypes)
        parseTreeWalker.walk(treeListener, ctx)
        return treeListener.result
    }
}

abstract class TypeIssue {
    abstract val message: String
    override fun toString() = message
}

class TypeCollectionResult(val typeDefinitions: Map<String, Type>, val errors: List<TypeIssue>)

class InvalidReference(val owningTypeName: String, val fieldName: String, val referencedTypeName: String) : TypeIssue() {
    override val message = "Undefined type $referencedTypeName referenced by $owningTypeName::$fieldName"
}

class TypeRedeclaration(val typeDef: TypeDefsParser.TypeDefContext) : TypeIssue() {
    override val message = "Redeclaration of type ${typeDef.TypeName().text} at ${typeDef.start.line}:${typeDef.start.charPositionInLine}"
}

class FieldRedeclaration(val owningTypeName: String, val field: TypeDefsParser.FieldDefContext) : TypeIssue() {
    override val message = "Redeclaration of field $owningTypeName::${field.VarName().text} at ${field.start.line}:${field.start.charPositionInLine}"
}

private class PlaceholderType(name: String) : Type(name)

private class TypeCollectingTreeListener(private val existingTypes: Map<String, Type>) : TypeDefsBaseListener() {
    private val _typeDefinitions = mutableMapOf<String, UserDefinedType>()
    private var currentTypeDefinition: UserDefinedType? = null

    private val _typeIssues = mutableListOf<TypeIssue>()

    val result get() = TypeCollectionResult(_typeDefinitions.toMap(), _typeIssues.toList())

    override fun enterTypeDef(ctx: TypeDefsParser.TypeDefContext) {
        val typeName = ctx.TypeName().text
        if(existingTypes.containsKey(typeName) || _typeDefinitions.containsKey(typeName)) {
            _typeIssues += TypeRedeclaration(ctx)
        } else {
            currentTypeDefinition = UserDefinedType(typeName)
        }
    }

    override fun exitTypeDef(ctx: TypeDefsParser.TypeDefContext) {
        if(currentTypeDefinition != null) {
            _typeDefinitions[currentTypeDefinition!!.name] = currentTypeDefinition!!
            currentTypeDefinition = null
        }
    }

    override fun enterFieldDef(ctx: TypeDefsParser.FieldDefContext) {
        if(currentTypeDefinition == null) {
            return
        }
        val fieldName = ctx.VarName().text
        val typeReferenceNode = ctx.typeReference()
        val typeName = typeReferenceNode.TypeName().text
        val typeReference = TypeReference(
            getTypeOrPlaceholder(typeName),
            isNullable = typeReferenceNode.NullableModifier() != null,
        )
        if(currentTypeDefinition!!.fields.containsKey(fieldName)) {
            _typeIssues += FieldRedeclaration(currentTypeDefinition!!.name, ctx)
        } else {
            currentTypeDefinition!!.fields[fieldName] = typeReference
        }
    }

    override fun exitTypeDefs(ctx: TypeDefsParser.TypeDefsContext) {
        _typeDefinitions.forEach { (typeName, typeDef) ->
            typeDef.fields.forEach { (fieldName, field) ->
                if(field.type is PlaceholderType) {
                    val realType = getType(field.type.name)
                    if(realType == null) {
                        _typeIssues += InvalidReference(typeDef.name, fieldName, field.type.name)
                    } else {
                        typeDef.fields[fieldName] = field.copy(type = realType)
                    }
                }
            }
        }
    }

    private fun getType(typeName: String): Type? = existingTypes.getOrElse(typeName) {
        _typeDefinitions[typeName]
    }

    private fun getTypeOrPlaceholder(typeName: String) = getType(typeName) ?: PlaceholderType(typeName)
}