operator fun String.unaryMinus() = this.reversed()
infix operator fun String.times(n: Int) = this.repeat(n)

operator fun Pair<Int,Int>.unaryMinus() = Pair(-first,-second)
operator fun Pair<Int,Int>.inc() = Pair(first+1,second+1)
operator fun Pair<Int, Int>.plus(other: Pair<Int, Int>) =
    Pair(first + other.first, second + other.second)

operator fun Pair<Int, Int>.contains(n: Int) = n in first..second

fun main() {
    val name = "Kotlin"
    println(-name)

    println(name * 3)

    var p = Pair(1, 2)
    println(-p) // (-1, -2)
    println(++p) // (2, 3)

    var point1 = Pair(1, 2)
    var point2 = Pair(3, 4)
    println(point1 + point2) // (4, 6)

    var point3 = Pair(1, 2)
    println(1 in point3) // true
}