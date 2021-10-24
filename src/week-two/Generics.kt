package `week-two`


//fun main() {
////    val x = Gen("The value here could be any datatype: 'Int, Double, String, Float or Char")
//
//    val y = Gen("Boooooo")
//    y.printGen()
//}

//------------------------------GENERICS------------------------------
class Gen<T>(val item: T){

    fun printGen(){
        println(item)
    }
//    init {
////        println(item)
//    }

//    var box = mutableListOf<T>()

    //in the parameters you can use both Y and T
//    fun <Y> addItem(itemOne: Y, itemTwo: T){
//        //box.add(itemOne) //This won't work because type doesn't match, box only accept type T.
//        box.add(itemTwo) // This works since box accept type T and itemTwo type is T
//    }
}

//------------------------------GENERICS CONSTRAINTS------------------------------
//The most common way of using generics
class Hats(val numberOfHats: Int){

    fun getNumberOfHat(): Int{
        return numberOfHats
    }
}


class LootBox<T: Hats>(val item: T){

    fun printItem(){
        //Type casting
        val x = item as Hats
        println(x.getNumberOfHat())
    }
}

fun main() {
    //Can do this
//    val box = LootBox(Hats(5))
//    box.printItem()

    //Or this
//    val headWaer = Hats(5)
//    val box = LootBox(headWaer)

    //------------VARARG---------------
    printing(1,2,3,4,5,6,7)

}




//----------VARARG-----------
//it's like an array
//the number of element inside of item depends on how many you put in the function call
fun printing(vararg item: Int){
    for (i in item){
        println(i)
    }
}