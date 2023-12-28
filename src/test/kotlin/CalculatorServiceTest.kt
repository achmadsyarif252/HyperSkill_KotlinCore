import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import io.mockk.*


@Test
fun testingMockKalkulator() {
    val mockKalkulator = mockk<Kalkulator>()

    every { mockKalkulator.add(2, 3) } returns 5;
    every { mockKalkulator.subtract(2, 3) } returns -1;

    val calculatorService = CalculatorService(mockKalkulator)
    val result = calculatorService.addAndSubtract(2, 3)

    assert(result == 6)

    val example = spy(Example())

    every { example.method1() } returns "spy1"

    assertEquals("spy1", example.method1()) // Returns "spy1"

    assertEquals("method2", example.method2()) // Returns "method2"
}

class Example {
    fun method1(): String {
        return "method1"
    }

    fun method2(): String {
        return "method2"
    }
}

