interface AnimalHyperskill {
    fun myAnimalMethod()
    val numberOfLimbs: Int
    fun move()
    fun communicate(): String

    fun printDefaultNumberOfLimbs() {
        println(numberOfLimbs)
    }

    val age: Int
        get() = 10
}

class Cat2 : AnimalHyperskill {
    override val numberOfLimbs: Int = 4
    override fun myAnimalMethod() {
        TODO("Not yet implemented")
    }

    override fun move() {
//        run()
    }

    override fun communicate(): String {
        return "sayMeow"
    }

}

class Parrot : AnimalHyperskill {
    override val numberOfLimbs: Int = 2
    override fun communicate(): String {
        TODO("Not yet implemented")
    }

    override fun move() {
        TODO("Not yet implemented")
    }

    override fun myAnimalMethod() {
        TODO("Not yet implemented")
    }
}