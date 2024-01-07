open class Person(val name: String) {
    fun talk() {
        println("$name is talking")
    }
}

class Employee(name: String, val id: Int) : Person(name) {
    fun work() {
        println("@name is working with id $id")
    }
}

fun main() {
    val person = Person("John")
    person.talk()

    val employee = Employee("Jane", 123)
    employee.talk()
    employee.work()

    val dog = Dog("Inu", 20)
    println(dog.name)
}

open class Animal(open val name: String, val age: Int)

class Dog(override var name: String, age: Int) : Animal(name, age) {
    init {
        this.name = "Dog: $name"
    }
}