import java.math.BigDecimal
import java.math.BigInteger

fun main() {
//    var number = 0
//    while (readln().toInt()!=0){
//        number++
//    }
//    println(number)
//    try {
//        val first = readln().toInt()
//        val second = readln().toInt()
//        println(first / second)
//    } catch (e: Exception) {
//        println(e.message)
//    } finally {
//        println("This is the end, my friend.")
//    }

//    val result = readln().lowercase().let { input ->
//        ('a'..'z').filter { it !in input }.joinToString("")
//    }
//    println(result)

//    val a = readln().toBigInteger()
//    val b = readln().toBigInteger()
//    var percentage = listOf(a * BigInteger.valueOf(100) / (a + b), b * BigInteger.valueOf(100) / (a + b))
//    println("${percentage.first()}% ${percentage.last()}%")

    val ships = readln().split(" ")
    val shipsList = ships.map { Ship(it.split("-")[0], it.split("-")[1].toInt()) }

    val list = readln().split(" ")

    // write your code here
    val res = list.sortedBy { it.lowercase() }


    println(res)
}

abstract class Shape2 {
    abstract val area: Int
}

class Square(val side: Double) : Shape2() {
    override val area = this.side.toInt() * 4
}