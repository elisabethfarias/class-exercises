class Student(
    val name: String,
    val birthDate: Int
) {
    fun calculateAge(currentYear: Int): Int {
        val resultAge = currentYear - birthDate
        return resultAge
    }
}