fun main() {
    val rectangle = Rectangle(10.0,5.0)
    val resultArea = rectangle.calculateRectancleArea()
    println(resultArea)

    val resultPerimeter = rectangle.calculatePerimeterRectangle()
    println(resultPerimeter)

    val square = Square(10.0)
    val squareResultArea = square.calculateSquareArea()
    println(squareResultArea)

    val squarePerimeter = square.calculatePerimeterSquareArea()
    println(squarePerimeter)

    val student = Student("Elisabeth", 1993)
    val resultAge = student.calculateAge(2022)
    println(resultAge)

}