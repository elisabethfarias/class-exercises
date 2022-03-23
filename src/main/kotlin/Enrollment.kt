import java.util.*

class Enrollment (
    val id: Int = 0,
    val enrollmentDate: Date?,
    var academyStudent: AcademyStudent,
    var physicalAssessments: List<PhysicalAssessment>? = ArrayList()
) {
    fun informationLastReview() {

    }

    fun informationAssessmentDate() {

    }
}