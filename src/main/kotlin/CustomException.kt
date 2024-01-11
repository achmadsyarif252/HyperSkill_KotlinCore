fun testFunction(a: Int, b: Int): Int {
    return a / b
}

//fun main() {
////    try {
////        testFunction(1, 0)
////    } catch (e: Exception) {
////        throw Exception("testFunction() failed", e)
////    }
//
//    myFunction(-3)
//}

class LessThanZero : Exception("Parameter less than zero")
class GreaterThan : Exception("Parameter greater than ten")

fun myFunction(par: Int) {
    if (par < 0) throw LessThanZero()
    else if (par > 10) throw GreaterThan()
}

class DivisionByZero : ArithmeticException()

fun integerDivision(a: Int, b: Int): Int {
    try {
        if (b == 0) throw DivisionByZero()
    } catch (e: DivisionByZero) {
        println(e.message)
    }
    return a / b
}

fun main() {
    integerDivision(4, 0)
    throw MyCustomException("Message")
    throw MyCustomException("Message",ArithmeticException())
//    throw MyCustomException(ArithmeticException())

}

class MyCustomException: Exception {
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
}
