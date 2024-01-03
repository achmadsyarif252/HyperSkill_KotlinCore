import java.io.File
import java.io.FileNotFoundException
import java.util.*

data class Ship(val name: String, val ammunition: Int)

fun main() {
//    val ships = readln().split(" ")
//    val shipsList = ships.map { Ship(it.split("-")[0], it.split("-")[1].toInt()) }.findLast { it.ammunition > 200 }
//
//    println(shipsList?.name ?: "No ship found")

    val listOfNames = listOf("Pablo", "John", "Jane", "Mary", "Peter")
    println(
        listOfNames.firstNotNullOf { item -> item.length.takeIf { it >= 5 } }
    )

    val list = readln().split(" ")
    // write your code here
    val res = list.firstOrNull { it[it.length - 1] == 'm' }?.reversed()

    println(res)
    try {
        Scanner(File("file.txt")).use { scanner ->
            val number = scanner.nextInt()
            println(number * 100)
        }
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } finally {
        println("Finally part")
    }
}