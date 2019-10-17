package fh.joanneum.sweng.lab1

fun main() {
    //val testShape = Shape()
    val testRectangle = Rectangle(width = 5.0, length = 5.0 )
    println(testRectangle)
    println(testRectangle.getArea())
    val circle = Circle(radius = 5.0, color = "red")
    println(circle)
    println(circle.getArea())
    testRectangle.length

    val circle1 = Circle(radius = 10.0, color = "red")
    val circle2 = Circle(radius = 10.0, color = "red")
    println(circle1 == circle2)

    val canvas = Canvas()
    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", radius = 1.0))
    println(canvas.getTotalArea()) //  13.14

}

