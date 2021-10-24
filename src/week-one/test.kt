package `week-one`
fun main(){

    var student = 95
    // (in 95..100) setting a range between 95 to 100
    if(student in 95..100){
        println("A+")
    }else if(student >= 60){
        println("Passed")
    }else {
        println("Failed")
    }
}