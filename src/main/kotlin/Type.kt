open class Type(val name: String)

class UserDefinedType(name: String) : Type(name) {
    val fields = mutableMapOf<String, TypeReference>()
    override fun toString() = "TYPE $name: $fields"
}

data object IntType : Type("Int")

val builtInTypes: Map<String, Type> = listOf(IntType).associateBy { it.name }

data class TypeReference(val type: Type, val isNullable: Boolean) {
    override fun toString() = "${type.name}${if(isNullable) "?" else ""}"
}