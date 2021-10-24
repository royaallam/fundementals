package `week-two`

fun main() {

//    val x = Test()
//    val y = Test()
//
//    x will have its own counter variable with its own value
//    and y's counter variable value can be different, (it's not linked together)
//    x.addCount()
//    y.addCount()

    //This is not an instant, this is just renaming the singleton class
//    val singleton = Game

    //line 17 and 18 are exactly the same thing
//    singleton.addCount()
//    Game.addCount()

//    Game.counter

    //accessing Math variables and function using the class name 'Because it's singleton class'
//    Math.operation(2,2)
//    println(Math.result)
//    Math.operation(3,3)
//    println(Math.result)
//
//    //you can create an instant if a class has a companion class inside it.
//    //but the instant 't' can't access the things that's inside the companion class because it's a singleton class
//    val t = Test()
//
//    //deleteCounter() is not inside the companion object so t can access it
//    t.deleteCounter()
//    //using the function that's inside the companion class that's inside Test class
//    Test.addCount()


    val i = A()

    i.running()
    //------------------------------OBJECT AS EXPRESSION------------------------------
    //creating a singleton class named 'singletonClass' that inherit from class 'A'
    // 'singletonClass' can access all class 'A' functions/variables and override them
    //Exactly like creating a singleton class but different syntax
    //this way is useful in android
    val singletonClass = object : A(){
        override fun running() {
            super.running()
            println("Running.....")
        }
    }
    singletonClass.running()
}

//------------------------------SINGLETON------------------------------
//A singleton class holds the state of its values (when updated)
//Also there is no primary or secondary constructors in singletons
object Game{
    //counter will hold its value, not like regular class when every instant have their own variables values
    var counter = 0


    //functions could be accessed using the singleton class name
    fun addCount(){
        counter++
        println(counter)
    }
}

//This is a regular class, the different between it and singletons is that you can create multiple instant of it
//where singleton you can't
class Test{

    //this variables can't be used inside the companion object (needs to be declared inside it)
    var tt = 0
    //------------------------------COMPANION OBJECT------------------------------
    //companion object makes the class as if it is a Singleton class
    //a companion class is basically a singleton class inside a regular class
    companion object {
        //all what's inside here could only be access using the class name 'Test'
        //counter will hold its value ALWAYS.
        var counter = 0

        fun addCount(){
            counter++
            println(counter)
        }
    }

    //this function can be accessed using an instant of Test only
    fun deleteCounter(){

    }
}

//------------------------------SINGLETON------------------------------
object Math{
    //result will hold its value ALWAYS.
    var result = 1

    fun operation(num1: Int, num2: Int){
        result += (num1 * num2)
    }
}


class Gg{

    companion object{
        var result = 0

        fun operation(num1: Int, num2: Int){
            result += num1 + num2
        }
    }

    var counter = 0

    fun addCount(){
        counter++
    }
}