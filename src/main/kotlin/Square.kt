class Square(
    var side: Double = 0.0
) {
    fun calculateSquareArea(): Double {
        val areaValue = side * side
        return areaValue
    }

    fun calculatePerimeterSquareArea(): Double {
        val perimeterValue = 4 * side
        return perimeterValue
    }
}