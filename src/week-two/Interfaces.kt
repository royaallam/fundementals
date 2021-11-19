package `week-two`

import kotlin.math.PI

//Doing HW-Week2_Day03_Inheritance_and_ClassTypes in a better way.

fun main() {
    val c = Circle("Cir", "Blue", 10.0)
    val t = Triangle("Tri", "Blue", 10.0, 10.0)
    val r = Rectangle("Rect", "Blue", 13.0, 10.0)

    c.info()
    println(c.computedArea())
    println()

    t.info()
    println(t.computedArea())
    println()

    r.info()
    println(r.computedArea())
    println()
}

//------------------------------INTERFACES------------------------------
// - an interface doesn't have constructors
interface Shape{

    //Variables and functions are called members

    val shapeName: String
    val shapeColor: String
    //When you declare a function you can write the whole function head 'Signature'.
    //Functions can't have a body 'implementation'
    //but any class that will implement this interface needs to implement all of it's functions
    fun info()

    fun computedArea(): Double 

}

//An Error would appear if you don't implement all the Shape's interface functions and variables
class Circle(override val shapeName: String, override val shapeColor: String, private val raduis: Double): Shape{

    //When implementing the interface's member the keyword 'override' is required.

    //Even the interface's variables must be implemented
    //Either here or in the primary constructor
//    override val shapeName = shapeName
//    //Must be initialized
//        get() = "Boo"

//    override val shapeColor: String
//        get() = "Blue"

    override fun info() {
        println("The Circle's name is: '$shapeName', And it's color is: '$shapeColor'")
    }

    override fun computedArea(): Double {
        print("Computed Area of '$shapeName' is: ")
        return "%.2f".format(PI * raduis).toDouble()
    }
}

//An Error would appear if you don't implement all the Shape's interface functions and variables
class Triangle(override val shapeName: String, override val shapeColor: String, private val base: Double, private val height: Double): Shape{

    //When implementing the interface's member the keyword 'override' is required.

    //Even the interface's variables must be implemented
    //Either here or in the primary constructor
//    override val shapeName = shapeName
//    //Must be initialized
//        get() = "Boo"

//    override val shapeColor: String
//        get() = "Blue"

    override fun info() {
        println("The Triangle's name is: '$shapeName', And it's color is: '$shapeColor'")
    }

    override fun computedArea(): Double {
        print("Computed Area of '$shapeName' is: ")
        return (height * base)/2
    }
}

//An Error would appear if you don't implement all the Shape's interface functions and variables
class Rectangle(override val shapeName: String, override val shapeColor: String, private val width: Double, private val height: Double): Shape{

    //When implementing the interface's member the keyword 'override' is required.

    //Even the interface's variables must be implemented
    //Either here or in the primary constructor
//    override val shapeName = shapeName
//    //Must be initialized
//        get() = "Boo"

//    override val shapeColor: String
//        get() = "Blue"

    override fun info() {
        println("The Rectangle's name is: '$shapeName', And it's color is: '$shapeColor'")
    }

    override fun computedArea(): Double {
        print("Computed Area of '$shapeName' is: ")
        return width * height
    }
}