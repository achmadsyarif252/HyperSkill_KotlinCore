class Cat(val name: String, val color: String) {
    fun sayMeow() {
        println("$name says: \"Meow\".")
    }

    inner class Bow(val color: String) {
        fun putOnABow() {
            sayMeow()
            println("The bow is on!")
        }

        fun printColor() {
            println("The cat named $name has a ${this@Cat.color} bow.")
        }
    }
}

fun main() {
    val cat: Cat = Cat("Princess", "Grey")
    val bow: Cat.Bow = cat.Bow("Golden")

    bow.printColor()
    bow.putOnABow()

    val regex = "\\s+".toRegex()
    val numbers = readln().split(" ").map { it.toInt() }.toTypedArray() // an array of 5 integer numbers
    println(numbers.joinToString())

    println(numbers.first())
    println(numbers.last())
    println(numbers.lastIndex)

}

class ChristmasTree(var color: String) {

    fun putTreeTopper(color: String) {
        val treeTopper = TreeTopper(color)
        treeTopper.sparkle()
    }

    inner class TreeTopper(var color: String) {

        fun sparkle() {
            println("The sparkling $color tree topper looks stunning on the ${this@ChristmasTree.color} Christmas tree!")
        }
    }
}

class Pumpkin(val type: String, val isForHalloween: Boolean) {
    fun addCandle() {
        if (isForHalloween) {
            val candle = Candle()
            candle.burning()
        } else {
            println("We don't need a candle.")
        }
    }

    inner class Candle {
        fun burning() {
            println("The candle is burning inside this spooky $type pumpkin! Boooooo!")
        }
    }
}

