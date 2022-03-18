import junit.framework.TestCase
import org.junit.Test

class StudentTest {
    @Test
    fun `Calculate age`() {
        val student = Student("Elisabeth", 1993)
        val resultAge = student.calculateAge(2022)
        TestCase.assertEquals(29, resultAge)
    }

}