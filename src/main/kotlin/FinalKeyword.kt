open class Animal2 {
    open fun makeSound() {
        println("The animal makes a sound")
    }
}

class Dog2 : Animal2() {
    override final fun makeSound() {
        println("The dog barks")
    }
}