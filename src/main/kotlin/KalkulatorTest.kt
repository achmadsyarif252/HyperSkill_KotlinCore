interface Kalkulator {
    fun add(x: Int, y: Int): Int
    fun subtract(x: Int, y: Int): Int
}

class CalculatorService(private val calculator: Kalkulator) {
    fun addAndSubtract(x: Int, y: Int): Int {
        val sum = calculator.add(x, y)
        val difference = calculator.subtract(x, y)

        println("Sum = " + sum + " difference = " + difference)
        return sum - difference
    }
}

fun main() {
    val calculatorService = CalculatorService(object : Kalkulator {
        override fun add(x: Int, y: Int): Int {
            return x + y;
        }

        override fun subtract(x: Int, y: Int): Int {
            return x - y;
        }
    });

    println(calculatorService.addAndSubtract(10, 20))
}

fun checkNumber(number: Int): String {
    return if (number % 2 == 0) "even" else "odd"
}



