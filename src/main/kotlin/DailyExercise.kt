fun add(x: Int, y: Int) = x + y

fun subtract(x: Int, y: Int) = x - y

fun divide(x: Int, y: Int) = x / y

fun multiply(x: Int, y: Int) = x * y

fun calculate(x: Int, y: Int, operator: (Int, Int) -> Int) {
    // write your code here
    val result = operator(x, y)
    print(result)
}

fun main() {
//    val x: Int = readLine()!!.toInt()
//    val y: Int = readLine()!!.toInt()
//    val operator: String = readLine()!!
//    when (operator) {
//        // write your code here
//        "add" -> calculate(x, y, ::add)
//        "subtract" -> calculate(x, y, ::subtract)
//        "multiply" -> calculate(x, y, ::multiply)
//        "divide" -> calculate(x, y, ::divide)
//    }

//    val input = readln().split(" ")
//    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }
//
//    // write your code here
//    val res = spells.filter { it.power >= 40 }.fold(0){ acc, spell -> acc + spell.power }


//    println(res)

//    val list = readln().split(" ")
    // write your code here
//    val res = list.foldIndexed(0) { i, a, s -> a + (i + 1) % 2 * s.length }
    readln().also {
        println(it[0])
    }




//    println(res)
}

data class Spell3(val name: String, val power: Int)
