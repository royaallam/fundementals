package `week-one`
fun main(){
    //5
//    println(name())
    //6
//    name(){"it's best practice to use the {} out side of ()"}
//    name {"cloud be used this way also"}
//    name1(5)

    high(5) {
        println("this")
        it + 15
    }
}

fun high(num1:Int, math: (x:Int) -> Int){
    println(math(num1))
}

//5
//anonymous functions used when you want to cal the function one or twice + it can be used as a parameter in other functions
//anonymous functions (you must set a returning type in the head even if it's Unit)
//val/var functionName: (parameterOne:datatype, parameterTwo:datatype)-> returnType = {
// some code block
//
// value //the return statement is writing at the last line without the keyword return
// }
val name:() -> String = {
    "Mohammed"
}
var name1:(x:Int)-> Unit = {
    println(it)
}
fun name(math: (num1:Int)->Unit):Int {

    return 5
}

//6
//how to call an anonymous function in a function parameter
// Higher order function
//fun name(math: (num1:Int)->String):String {
//
//}