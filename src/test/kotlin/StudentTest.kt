import junit.framework.TestCase
import org.junit.Test
import java.time.LocalDate
import java.time.Month
import java.util.*

class StudentTest {
    @Test
    fun `Calculate age`() {
        val student = AcademyStudent("", null)
        student.birthDate = LocalDate.of(1993, 9, 11)
        val resultAge = student.calculateAge(2022)
        TestCase.assertEquals(29, resultAge)
    }


}