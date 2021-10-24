package `week-one`
fun main() {
    val isHeald = true
    val health = 70

    when(health){
        100 -> println("Your health is fine")
        in 90..99 -> println("You got few scratches")
        in 75..89 -> {
            when(isHeald){
                true -> println("You got a lot of scratches but you are healing")
                false -> println("You are going to die")
            }
        }
        else -> println("You are dead")
    }

    val playerStatus = when{
        health == 100 -> "Your health is fine"
        health in 90..99 -> "You got few scratches"
        health in 75..89 && isHeald -> "You got a lot of scratches but you are healing"
        health in 75..89 && !isHeald -> "You are going to die"
        else -> "You are dead"
    }
    println(playerStatus)

    //anonymous functions
    math(2, 3){ num1, num2 ->
        print("$num1 + $num2 = ")
        num1 + num2
    }
    math(2, 3){ num1, num2 ->
        print("$num1 - $num2 = ")
        num1 - num2
    }
    math(2, 3){ num1, num2 ->
        print("$num1 * $num2 = ")
        num1 * num2
    }
    math(2, 3){ num1, num2 ->
        print("$num1 / $num2 = ")
        num1 / num2
    }
}

//anonymous functions
fun math(num1: Int, num2: Int, operation: (Int, Int) -> Int) {
    println(operation(num1, num2))
}