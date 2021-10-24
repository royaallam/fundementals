package `week-one`
import java.nio.channels.CompletionHandler

fun main(){

    println(adding) // will print the header of the anonymous function only
    println(multi(2,2))

    test(1){ succes ->
        if (succes)
            println("It's even")
        else
            println("It's odd")
    }
}

// "adding" is a variable holding the anonymous function
// naming the parameters helps with the readability
val adding: (num1: Int, num2: Int) -> Int = {
        number1, number2 ->
    number1 + number2
}

// without naming the parameters
val multi: (Int,Int) -> Int = {
    num1, num2 -> // naming the coming values
    num1 * num2
}

val completionHandler: (succes: Boolean) -> Unit = {
    if (it == true) println("Logged")
    else println("Something went wrong")
}

fun test(num1: Int, completionHandler: (Boolean) -> Unit) {
    if (num1 % 2 == 0)
        completionHandler(true)
    else
        completionHandler(false)
}