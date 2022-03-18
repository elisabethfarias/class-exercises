import junit.framework.TestCase.assertEquals
import org.junit.Test

class RectangleTest  {
    @Test
    fun `Calculate area of Rectangle`() {
        val rectangle = Rectangle(5.0, 10.0)
        val result = rectangle.calculateRectancleArea()
        assertEquals(50.0, result)
    }

    @Test
    fun `Calculate perimeter area of Rectangle`() {
        val rectangle = Rectangle(5.0, 10.0)
        val result = rectangle.calculatePerimeterRectangle()
        assertEquals(30.0, result)
    }


}