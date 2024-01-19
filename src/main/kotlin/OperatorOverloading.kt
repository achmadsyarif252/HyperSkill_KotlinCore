operator fun String.unaryMinus() = this.reversed()
infix operator fun String.times(n: Int) = this.repeat(n)

operator fun Pair<Int, Int>.unaryMinus() = Pair(-first, -second)
operator fun Pair<Int, Int>.inc() = Pair(first + 1, second + 1)
operator fun Pair<Int, Int>.plus(other: Pair<Int, Int>) =
    Pair(first + other.first, second + other.second)

operator fun Pair<Int, Int>.contains(n: Int) = n in first..second
operator fun Pair<Int, Int>.get(n: Int) = when (n) {
    0 -> first
    1 -> second
    else -> throw IndexOutOfBoundsException()
}

operator fun Pair<Int, Int>.invoke(newLine: Boolean) {
    print("($first,$second)")
    if (newLine) println()
}

operator fun StringBuilder.plusAssign(other: String) {
    this.append(other)
}

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            return other.x == x && other.y == y
        }
        return false
    }
}

class Point2(val x: Int, val y: Int) : Comparable<Point2> {
    override fun compareTo(other: Point2): Int {
        return if (x == other.x) y.compareTo(other.y) else x.compareTo(other.x)
    }
}

// define the function
operator fun String.div(number: Int): Int {
    return this.toInt() / number;
}

operator fun StringBuilder.timesAssign(n: Int) {
    this.append(this.toString().repeat(n))
}

// define the function
operator fun Collection<String>.contains(limit: Int) = any { it.length > limit }

// define the function
operator fun List<Double>.invoke(markLimit: Double) = filter { it > markLimit }.average()

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

    var point = Pair(1, 2)
    println(point[0])
    println(point[1])

    val name2 = StringBuilder("Kotlin")
    name2 += "is awesome"
    println(name)

    val p1 = Point(1, 2)
    val p2 = Point(1, 2)
    println(p1 == p2)

    val p3 = Point2(1, 2)
    val p4 = Point2(1, 2)
    println(p3 < p4)
    println(p3 <= p4)

    println("13" / 8)
    println("12" / 2)

    val sb = StringBuilder("Kotlin")
    sb *= 2
    println(sb)
}