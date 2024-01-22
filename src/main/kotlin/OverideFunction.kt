open class Shape {
    open fun draw(color: String, strokeWidth: Int) {
        println("Drawing a shape with color $color and stroke with $strokeWidth")
    }
}

class Circle : Shape() {
    override fun draw(color: String, strokeWidth: Int) {
        println("Drawing a circle with the color $color and stroke width $strokeWidth")
    }
}

fun main() {
    val shape: Shape = Circle()
    shape.draw(color = "red", strokeWidth = 3)

    val vehicle1: Car = Car()
    val vehicle2: Vehicle = Bicyccle()

    vehicle1.move(speed = 60, direction = "north")
    vehicle2.move(speed = 15, direction = "south")
}

open class Vehicle {
    open fun move(speed: Int, direction: String) {
        println("The vehicle is moving at $speed km/h $direction")
    }
}

class Car:Vehicle(){
    override fun move(speed: Int, direction: String) {
        println("The car is moving at $speed km/h $direction")
    }
}
class Bicyccle():Vehicle(){
    override fun move(speed: Int, direction: String) {
        println("The bicycle is moving at $speed km/h $direction")
    }
}

