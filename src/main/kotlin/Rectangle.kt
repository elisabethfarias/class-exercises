class Rectangle (
    val rectangleBase: Double = 0.0,
    val rectangleHeight: Double = 0.0
) {
    fun calculateRectancleArea(): Double {
        val areaValue = rectangleBase * rectangleHeight
        return areaValue
    }

    fun calculatePerimeterRectangle(): Double {
        val perimeterValue = 2 * (rectangleBase + rectangleHeight)
        return perimeterValue
    }
}


