package `week-two`

fun main() {

    val x = "ahmed"
//    x.print()
    //easyPrint() is accessed because it's an Any extension
//    x.easyPrint()


    val t = 2
//    t.evenOrOdd()
//    t.comp(4)
    //easyPrint() is accessed because it's an Any extension
//    t.easyPrint()

    val str = "hgfdsa"
//    str.repeating(3)
    str.voels()

}

fun String.voels(){
    this.forEach {
        when(it){
            'a', 'e', 'i', 'o', 'u' -> println("$this, HAS A VOEL")
        }
    }
}

//-----------------EXTENSION---------------------
//used almost always with predefined classes (String, Int, Double...etc)
//this function is for the class String
fun String.print(){
    this.forEach {
        if (it == 'f') println(it)
    }
}

fun Int.evenOrOdd(){
    if(this % 2 == 0){
        println("This Number Is Even")
    }else {
        println("This Number Is Odd")
    }
}

fun Int.comp(num1: Int){
    if(this > num1){
        println("$this Is Bigger")
    }else if (num1 > this){
        println("$num1 Is Bigger")
    }else {
        println("$this equals $num1")
    }
}


fun String.repeating(num: Int){
//    print(this)
//    var i = 1
//    while (i <= num){
//        print(" $this!")
//        i++
//    }

    println(this + " $this!".repeat(num))
}

//this function would be accessed from all pre-defined classes (String, Int, Double...etc)
fun Any.easyPrint(){
    println(this)
}