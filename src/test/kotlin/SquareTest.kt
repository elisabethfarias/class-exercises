import junit.framework.TestCase
import org.junit.Test

class SquareTest {
    @Test
    fun `Calculate area of Square`() {
        val square = Square(10.0)
        val result = square.calculateSquareArea()
        TestCase.assertEquals(100.0, result)
    }

    @Test
    fun `Calculate perimeter area of Square`() {
        val square = Square(10.0)
        val result = square.calculatePerimeterSquareArea()
        TestCase.assertEquals(40.0, result)
    }
}