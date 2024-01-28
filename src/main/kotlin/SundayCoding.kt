import java.math.BigDecimal
import java.math.BigInteger
import java.math.RoundingMode

fun main() {
    val x = readln().toBigDecimal()
    val y = readln().toBigDecimal()
    val z = readln().toBigDecimal()
    val result = ((x + y + z) / BigDecimal.valueOf(3)).toBigInteger()
    println(result)
}