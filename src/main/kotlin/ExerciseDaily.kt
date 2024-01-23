fun main() {
//    var number = 0
//    while (readln().toInt()!=0){
//        number++
//    }
//    println(number)
    try {
        val first = readln().toInt()
        val second = readln().toInt()
        println(first / second)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}

abstract class Shape2 {
    abstract val area: Int
}

class Square(val side: Double) : Shape2() {
    override val area = this.side.toInt() * 4
}