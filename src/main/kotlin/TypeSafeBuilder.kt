class BuilderPerson private constructor(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val address: String
) {
    class Builder {
        private var firstName: String = ""
        private var lastName: String = ""
        private var age: Int = 0
        private var address: String = ""

        fun setFirstName(firstName: String): Builder {
            this.firstName = firstName
            return this
        }

        fun setLastName(lastName: String): Builder {
            this.lastName = lastName
            return this
        }

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun setAddress(address: String): Builder {
            this.address = address
            return this
        }

        fun build(): BuilderPerson {
            return BuilderPerson(firstName, lastName, age, address)
        }
    }
}

fun main() {
    val person = BuilderPerson.Builder()
        .setFirstName("John")
        .setLastName("Doe")
        .setAge(30)
        .setAddress("123 Main st")
        .build()
}