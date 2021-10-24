package `week-one`
//------------------------------VISIBILITY------------------------------
// - public function could be accessed from anywhere
// - private functions could be accessed only inside the same file
// - internal function could be accessed from the same file or all files inside the same package
// - protected?


fun main() {
//    loading()
    val score = 85
    val healthPoints = 80
    var isHealing = false

    //1
//    val totalPoints = showScore(score)
//    println(totalPoints)
//    println(score)

    //2
//    showResult()
    //passing both healthPoint and isHealing values

    //3
//    checkPlayersHealth(healthPoints = healthPoints, isHealing = true)

    //4
    //passing only the healthPoints and using the default value set for isHealing (false)
//    checkPlayersHealth(healthPoints = healthPoints)

}

//1
//A Unit function which is 'Void'
fun showScore(score: Int) {
    println(score * 10)
}

//2
//In case the function has only one line of code replace {} with =
fun showResult() = println(addNumbers(firstNumber = 3,secondNumber = 2))

//same as the above but when it's a return value function
fun ff(x: Int): Int =  x + x

//Multi lines function syntax
fun addNumbers(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber+secondNumber
}

//3, 4
//defaulting isHealing to false, in case there is no argument is passed in main for isHealing
fun checkPlayersHealth(healthPoints: Int, isHealing: Boolean = false){
    when(healthPoints){
        100 -> println("Your health is great")
        in 90..99 -> println("You got few scratches")
        in 75..89 -> {
            if(isHealing) println("You have scratches but you are healing..")
            else println("You are going to die MATE :(")
        }
        else -> println("GAME OVER")
    }
}

//functions overloading same as c++, two function can have the same name but not the same parameters
//the change could be in the number of parameter count or datatype or returning type
fun adding(num1:Int, num2:Int):Int {
    return num1 + num2
}
fun adding(num1:Int, num2:Double):Double {
    //when you do a mathematical operation between Int and Double the value datatype is Double
    //also if you add Int + String the outcome is String
    return num1 + num2
}
fun adding(num1:Int, num2:Int, num3:Int):Int {
    return num1 + num2 + num3
}

//fun loading(timePeriod1:Int, timePeriod2:Int, timePeriod3:Int, timePeriod4:Int){
//    print("Loading")
//    Timer().schedule(100){
//        print(".")
//    }
//    Timer().schedule(500){
//        print(".")
//    }
//    Timer().schedule(1000){
//        print(".")
//    }
//    Timer().schedule(1500){
//        print(".")
//    }
//    Timer().schedule(2000){
//        print(".")
//    }
//    Timer().schedule(2500){
//        print(".")
//    }
//}

//fun getUsername(){
//    println("###############################################")
//    println("Please Enter The First Player Name: ")
//    val firstPlayerName = readLine()
//    println("Please Enter The First Player Points: ")
//    val firstPlayerPoints = readLine()
//    println("\nPlease Enter The Second Player Name: ")
//    val secondPlayerName = readLine()
//    println("Please Enter The second Player Points: ")
//    val secondPlayerPoints = readLine()
////    loading()
//}