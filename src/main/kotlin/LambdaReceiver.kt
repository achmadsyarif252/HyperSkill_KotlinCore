import kotlin.random.Random

fun Int.sum(a: Int) = this + a
fun Int.isEvent() = this % 2 == 0
val sum: (Int, Int) -> Int = { a, b -> a + b }
val sum2: Int.(Int) -> Int = { a -> this + a }
fun Int.opp(f: Int.() -> Int): Int = f()

fun myString(init: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(init).toString()
}

fun MutableMap<String, Any>.apply(block: MutableMap<String, Any>.() -> Unit): MutableMap<String, Any> {
    block()
    return this
}

fun main() {
    println(30.sum(20))
    val random = Random.nextInt(100)
    println("Apakah $random adalah angka genap ? : ${random.isEvent()}")
    println("Penjumlahan ${sum(29, 30)}")
    println(1.sum2(200))

    var res = 10.opp { this.times(2) }
    println(res)
    res = 10.opp { plus(19).div(10) }

    res = 10.opp { plus(10) }
    println(res)

    res = 10.opp { this * 2 }
    println(res)

    val str = myString {
        append("Hello".uppercase())
        append("World!")
    }
    println(str)

    val student: MutableMap<String, Any> = mutableMapOf(
        "name" to "John",
        "age" to 20
    )

    student.apply {
        this["name"] = (this["name"] as String).uppercase()
        this["age"] = (this["age"] as Int) + 1
    }

    println(student)

    val a = readln()
    val res2 = builderString {
        append("<tag>")
        append(a)
        append("</tag>")
    }
    println(res2)
}

val isDivisible: Int.(Int) -> Boolean = {
    this % it == 0
}

/* Do not change code below */
fun builderString(
    builder: StringBuilder.(String) -> Unit
): String {
    val stringBuilder = StringBuilder()
    stringBuilder.builder("")
    return stringBuilder.toString()
}

data class Course(val name: String, val students: List<Student2>)
data class Student2(val name: String)

class CourseBuilder(val name: String) {
    val students = mutableListOf<Student2>()
    fun student(name: String) = students.add(Student2(name))
    fun build() = Course(name, students)
}

fun buildCourse(name: String, init: CourseBuilder.() -> Unit): Course {
    return CourseBuilder(name).apply(init).build()
}