fun main() {
    val list = readln().split(" ").map { it.toInt() }

    // write your code here
    val res = list.dropLastWhile { it % 2 == 0 }

    println(res)

    println(readln().split(" ").chunked(2))
    val list2 = readln().split(" ").takeWhile { it.startsWith("j") }
    println(list)

    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }.takeWhile { it.power > 50 }
    println(spells)

    val list3 = readln().split(" ")
    // write your code here
    val res2 = list3.sumOf{it.length}

    println(res2)
}

class Spell4(val name: String, val power: Int)
