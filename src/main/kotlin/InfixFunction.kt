infix fun Int.add(x: Int) = this + x

// complete the definition
//infix fun List<Double>.average(markLimit: Double) = this.filter { it > markLimit }.sum() / this.count { it > markLimit }
infix fun List<Double>.average2(markLimit: Double) = this.filter { it > markLimit }.average()

// complete the definition
//infix fun List<String>.secret(limit: Int) = this.filter { it.length > limit }.run {
//    var result = 0;
//    this.forEach {
//        result += it.length
//    }
//    result
//}

infix fun List<String>.secret(limit: Int) = this.filter { it.length > limit }.sumOf { it.length }


fun main() {
//    println(10.add(20))
//    println(10 add 20)
//
//    println(1 add 2 + 3)
//    println(1 add (2 + 3))
//    println(0..(1 add 4))
//
//    println(1 and 2 xor 3 add 4) // 1 and 2 xor (3 add 4) -> 7
//    println(1 add 2 in 3..4)     // (1 add 2) in 3..4 -> true
//
//    val listOfGrades = listOf(5.5, 4.6, 3.0, 2.5, 10.0, 9.9, 8.75)
//    println(listOfGrades average2 5.0)
//
//    val a = listOf(1, 2, 3, 4, 5, 7, 8).sum()
//
//    var list = listOf("expetum", "axio", "lithigum", "magnum", "anima")
//
//    println(list secret 5)
//
//    fibbonacci(20)
    val listOfShip = listOf(Ship2(name = "Tiger 212", ammunition = 200))
    println(listOfShip battle 50)

}

// complete the definition
infix fun List<Ship2>.battle(ammunitionLimit: Int) = this.filter { it.ammunition > ammunitionLimit }.map { it.name }


data class Ship2(val name: String, val ammunition: Int)

fun fibbonacci(n: Int) {
    var list = mutableListOf<Int>()
    for (i in 0..n) {
        if (i == 0 || i == 1) list.add(i) else list.add(list[i - 1] + list[i - 2])

    }
    println(list.joinToString(" "))
}