fun main() {
    val input = readln()
    try {

        val list = input.split(",")
        if (list == listOf("")) {
            throw IllegalArgumentException()
        }
        val numbers = list.map { it.toInt() }
        val average = numbers.average()
        println(average)

    } catch (e: Exception) { // Write the code to handle each exception as recommended
        when (e) {
            is NumberFormatException -> println("Cannot calculate average of an empty list!")
            is IllegalArgumentException -> println("Invalid input!")
            else -> println("An error occurred!")
        }
    }
    for (element in Thread.currentThread().stackTrace) {
        println(element)
    }
}


