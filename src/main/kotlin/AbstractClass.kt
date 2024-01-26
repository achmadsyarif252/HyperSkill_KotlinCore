abstract class AnimalAbstract {
    abstract fun move()
    abstract fun makeSound()

    fun eat(): Boolean = false
    fun sleep(): Boolean = false
}

//each of abstract method in parent abstract class must be overriden in the implementation class (not in other abstract class)

class CatAnimal : Mammal() {
    override fun feeding() {
        TODO("Not yet implemented")
    }

    override fun move() {
        TODO("Not yet implemented")
    }

    override fun makeSound() {
        TODO("Not yet implemented")
    }

}

abstract class Mammal : AnimalAbstract() {
    abstract fun feeding()
}

open class Polygon {
    open fun draw() {
        // Some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // Classes that inherit WildShape need to provide their own draw method instead of using the default on Polygon
    abstract override fun draw()
}

fun main() {
    val cat: AnimalAbstract = CatAnimal()
    cat.move()
    cat.makeSound()
}

interface ShapeInterface {
    fun calculateArea(): Double
    fun calculatePerimeter(): Double
}

abstract class AbstractShape : ShapeInterface {
    //common behavior or properties for shaped can be implemented here
}

class Rectangle(private val width: Double, private val height: Double) : AbstractShape() {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

class CircleShape(private val radius: Double) : AbstractShape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

}