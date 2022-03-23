import java.time.LocalDate
import java.util.*

class AcademyStudent(
    val name: String = "",
    var birthDate: LocalDate?
) {
    fun calculateAge(currentYear: Int): Int{
        val resultAge = currentYear - birthDate?.year!!
        return resultAge
    }
}
