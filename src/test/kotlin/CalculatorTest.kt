import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    //create a mock MathService using the @MockK annotation
    @MockK
//    lateinit var mathService: MathService

    @InjectMockKs
    lateinit var calculator: Kalkulator

    //set up the mock behaviour fot the MathService using the MockK API
//    @Before
//    fun setUp() {
//        MockKAnnotations.init(this)
//        every { mathService.add(any(), any()) } returns 5
//    }

    // Test that our Calculator instance is correctly using the mocked MathService
    @Test
    fun `test add method`() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }


    @Test
    fun `when adding 1 and 2 expect 3`() {
        val result = Calculator.add(1, 2)
        assertEquals(3, result)
    }

    @Test
    fun `when 2 is checked if even expect true`() {
        assertTrue(Calculator.isEven(2))
    }

    @Test
    fun `when dividing by 0 expect IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> {
            Calculator.divide(10, 0)
        }
    }
}