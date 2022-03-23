import java.math.RoundingMode
import java.util.*

class PhysicalAssessment(
    val id: String = "",
    val enrollment: Enrollment,
    val evaluatorName: String,
    val evaluantionDate: Date?,
    var weight: Double = 0.0,
    var height: Double = 0.0,
    var status: String = "",
    var imc: Double = 0.0
) {

    fun calculateImc(): Double {
        this.imc = weight / (height * height)
        return formatValueImc(this.imc)
    }

    private fun formatValueImc(imc: Double): Double {
       return imc.toBigDecimal().setScale(2, RoundingMode.HALF_EVEN).toDouble()
    }

    fun resultStatusImc() {
       var imc = calculateImc()
        if(this.imc > 18.5 && this.imc <= 24.9) {
            this.status = "Normal IMC"
        } else if (this.imc > 25.0 && this.imc <=29.9) {
            this.status = "Overweight"
        } else if(this.imc > 30.0 && this.imc <= 39.9) {
            this.status = "Obesity"
        }
    }
}