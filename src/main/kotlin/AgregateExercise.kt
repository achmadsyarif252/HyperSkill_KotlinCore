data class Spell2(val name: String, val power: Int)

fun main() {
    val input = readln().split(" ")
    val spells = input.map { Spell2(it.split("-")[0], it.split("-")[1].toInt()) }

    // write your code here
    val res = spells.maxByOrNull { it.power }

    println(res)

    val list2 = readln().split(" ").map { it.toDouble() }
    // write your code here
    val res2 = list2.average()


    println(res2)
}