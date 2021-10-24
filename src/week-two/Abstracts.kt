package `week-two`


fun main() {

    val ss = Sqaur("Sqa", "Purple", 5.0, 5.0)
    val tt = Trianglee("Tri", "Yellow", 7.9, 3.0)

    ss.info()
    println(ss.computedArea())
    println()

    tt.info()
    println(tt.computedArea())
    println()
}
//------------------------------ABSTRACT CLASS------------------------------
abstract class ShapeTwo(private val shapeName: String, private val shapeColor: String){

    //this is regular function "can't override it"
    fun info(){
        println("Shape Name: $shapeName \nShape Color: $shapeColor")
    }

    //This is an abstract function, which needs to be implemented in the subclass
    //the keyword abstract does what the keyword 'open' do "it replaces it in a sense"
    abstract fun computedArea(): Double
}

class Sqaur(private val shapeName: String, private val shapeColor: String, private val width: Double, private val height: Double):
    ShapeTwo(shapeName,shapeColor) {

    override fun computedArea(): Double {
        return width * height
    }
}

class Trianglee(private val shapeName: String, private val shapeColor: String, private val base: Double, private val height: Double):
    ShapeTwo(shapeName,shapeColor) {

    override fun computedArea(): Double {
        return "%.2f".format((base * height) / 2).toDouble()
    }
}