data class PersonB(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val address: String
)

data class PersonBuilder(
    var firstName: String = "",
    var lastName: String = "",
    var age: Int = 0,
    var address: String = ""
)

fun personBuilder(init: PersonBuilder.() -> Unit): PersonB {
    val builder = PersonBuilder()
    builder.init()
    return PersonB(builder.firstName, builder.lastName, builder.age, builder.address)
}

fun buildString(action: (StringBuilder).() -> Unit): String {
    val stringBuilder = StringBuilder()
    action(stringBuilder)
    return stringBuilder.toString()
}

fun main() {
    val person = personBuilder {
        firstName = "John"
        lastName = "Doe"
        age = 30
        address = "123 Main St"
    }

    println(buildString {
        append("I Love")
        append("Learning Kotlin")
        append("With Hyperskill")
    })// I Love learning Kotlin with HyperSkill
}