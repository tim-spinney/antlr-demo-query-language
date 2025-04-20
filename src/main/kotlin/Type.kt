open class Type(val name: String)

class UserDefinedType(name: String) : Type(name) {
    val fields = mutableMapOf<String, TypeReference>()
    override fun toString() = "TYPE $name: $fields"
}

data object IntType : Type("Int")

val builtInTypes = listOf(IntType).associateBy { it.name }

data class TypeReference(val type: Type, val isNullable: Boolean, val isReference: Boolean) {
    override fun toString() = "${type.name}${if(isReference) "&" else ""}${if(isNullable) "?" else ""}"
}