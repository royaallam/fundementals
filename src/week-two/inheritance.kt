package `week-two`

import java.util.*
import kotlin.concurrent.schedule

fun main() {
//    val a = Animal()
    val cat = Cat()
//    val dog = Dog()
//    val parrot = Parrot()
//    val lion = Lion()

    cat.substracting(5,1)
    cat.substracting(5.3,1.5)
    cat.substracting(4.5f,1.5f)
    cat.substracting("str","str")
    cat.substracting(1,2.2)
}

//1- if you don't want to use the primary constructor you can declare a class without () like so: class Animal { //body }
//2- if you want the class to be the parent you should write "open"
open class Animal{

    fun playing(){

    }
    //we write open to make it overridable
    open fun sound(){

    }

}

class Cat: Animal() {
    init {
//        sound()
    }

    fun substracting(n1: Any, n2: Any){
        if (n1 is Int && n2 is Int){
            println("The Sub of the two integers is $n1 - $n2 = ${n1-n2}")
        }else if (n1 is Double && n2 is Double){
            println("The Sub of the two doubles is $n1 - $n2 = ${n1-n2}")
        }else if (n1 is Float && n2 is Float){
            println("The Sub of the two floats is $n1 - $n2 = ${n1-n2}")
        }else{
            println("Wrong Values")
        }
    }

    override fun sound() {
        //super.funName is useful when you don't want to override the whole function, but just add something to it
        super.sound()
        println("Meowing...")
//        Runtime.getRuntime().exec("afplay " + "/Users/modfh/Downloads/Cat-meowing-loudly-sound-effect/Cat-meowing-loudly-sound-effect.mp3");
    }

    fun adding(n1: Any, n2: Any){
        //'type casting' : holding values in a variable and specifying the holding variable type
//        val num1 = n1 as Int
//        val num2 = n2 as Int
//        println(num1 + num2)

        //'Checking type', It's more safe than 'type casting'
        if (n1 is Double && n2 is Double){
            //the IDEA will smart caste n1 and n2 to Double if the condition is true
            println(n1 + n2)
        }else if (n1 is Int && n2 is Int){
            //the IDEA will smart caste n1 and n2 to Int if the condition is true
            println(n1 + n2)
        }else if (n1 is String && n2 is String){
            //the IDEA will smart caste n1 and n2 to String if the condition is true
            println(n1 + n2)
        }
    }



}

class Dog: Animal(){

    init {
        sound()
    }

    override fun sound() {
        println("Barking...")
//        Runtime.getRuntime().exec("afplay " + "/Users/modfh/Downloads/Dogs-barking-sound-outside/Dogs-barking-sound-outside.mp3");
    }

}

class Parrot: Animal(){

    init {
        sound()
    }
    override fun sound() {
        println("whiseling...")
    }
}

class Lion: Animal(){

    init {
        sound()
    }
    override fun sound() {
        println("Roaring...")
    }
}