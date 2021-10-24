package `week-one`

//    val healthPoints = 30
//    val isHealing = true

//    if healthPoint <= 30 and isHealing is true print "your health is awful but you are healing"
//    if healthPoint <= 30 and isHealing is false print "you are dying"
//    else if health point > 30 print "You health is good
//
//    if (healthPoints <= 30){
//        if (isHealing) {
//            println("Your health is awful but you are healing...")
//        }else{
//            println("YOU ARE DYING")
//        }
//    }else {
//        println("Your health is good")
//    }

fun main(){

    var studentMark = 85
    // (in 95..100) setting a range between 95 to 100
    if(studentMark in 95..100){
        println("A+")
    }else if(studentMark in 90..94){
        println("A")
    }else if(studentMark in 85..89){
        println("B+")
    }else if(studentMark in 80..84){
        println("B")
    }else if(studentMark in 75..79){
        println("C+")
    }else if(studentMark in 70..74){
        println("C")
    }else if(studentMark in 65..69){
        println("D+")
    }else if(studentMark in 60..64){
        println("D")
    }else {
        println("Failed")
    }

    when(studentMark){
        in 95..100 -> println("A+")
        in 90..94 -> println("A")
        in 85..89 -> {
            println("B+")
        }
        in 80..84 -> {
            println("B")
        }
        in 75..79 -> println("C+")
        in 70..74 -> println("C")
        in 65..69 -> println("D+")
        in 60..64 -> println("D")
        else -> println("Failed")
    }

    val studentGrade = when(studentMark){
        in 95..100 -> "A+"
        in 90..94 -> "A"
        in 85..89 -> "B+"
        in 80..84 -> "B"
        in 75..79 -> "C+"
        in 70..74 -> "C"
        in 65..69 -> "D+"
        in 60..64 -> "D"
        else -> "Failed"

    }
    println("Student Grade: $studentGrade")

//    String Template
    val firstName = "Mohammed"
    val lastName ="Aloufi"
    val fullName = "$firstName $lastName"

    println(fullName)

//    Nested if
    var healthPoints = 69
    var isHealing = false
    if (healthPoints <= 75) {
        if (isHealing){
            println("Health: $healthPoints% \nYou Are Healing...")
        }else {
            println("YOU'RE GONNA DIE")
        }
    }else {
        println("Healh: $healthPoints%")
    }
}