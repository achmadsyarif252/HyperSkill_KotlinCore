fun main() {
    val intValue = 32
    val intValue2 = 64
    val intValue3 = 32

    println(intValue.hashCode())
    println(intValue2.hashCode())
    println(intValue3.hashCode())

    println(intValue.hashCode() == intValue2.hashCode())
    println(intValue.hashCode() == intValue3.hashCode())

    val stringValue = "Hello"
    val stringValue2 = "Hello"
    val stringValue3 = "Hello World"

    println(stringValue.hashCode())
    println(stringValue2.hashCode())
    println(stringValue3.hashCode())

    println(stringValue.hashCode() == stringValue2.hashCode())
    println(stringValue.hashCode() == stringValue3.hashCode())

    val person1 = PersonHash("John", 32)
    val person2 = PersonHash("John", 32)
    val person3 = PersonHash("John", 64)

    println(person1.hashCode()) // 71750741
    println(person2.hashCode()) // 71750741
    println(person3.hashCode()) // 71750773

    println(person1.hashCode() == person2.hashCode()) // true
    println(person1.hashCode() == person3.hashCode()) // false


    val intValue1 = 32
    val intValue21 = 64
    val intValue31 = 32

    println(intValue1.equals(intValue21)) // false
    println(intValue1.equals(intValue31)) // true
    println(intValue1 == intValue21) // false
    println(intValue1 == intValue31) // true

    val stringValue1 = "Hello"
    val stringValue21 = "Hello"
    val stringValue31 = "Hello World"

    println(stringValue1.equals(stringValue21)) // true
    println(stringValue1.equals(stringValue31)) // false
    println(stringValue1 == stringValue21) // true
    println(stringValue1 == stringValue31) // false

    val userInfo1 = UserInfo("John", 32, "Johnny", "pepe@pepe.com")
    val userInfo2 = UserInfo("John", 32, "Johnny", "pepe@pepe.com")
    println(userInfo1 == userInfo2)
}

class PersonHash(val name: String, val age: Int) {
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age.hashCode()
        return result
    }
}

class UserInfo(val name: String, val age: Int, val userName: String, val email: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo) return false

        if (userName != other.userName) return false
        return email == other.email
    }
}

// complete the definition of the ship
class Ship3(val name: String, val ammunition: Int) {
    override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Ship3) return false

        return ammunition == other.ammunition
    }
}