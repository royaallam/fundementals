package `week-one`
//fun main() {
//    //## Part I - Null Safety.
//    println(getLength("This is a string"))
//
//    println()
//    //## Part II - Strings.
//    val str = "The quick brown fox jumps over the lazy dog."
//    val new_str = str.substring(10, 26)
//
//    println("old = $str")
//    println("new = $new_str")
//
//    println()
//    //## Part III - Numbers.
//    fahrenheitToCelsius()
//
//}
//
////## Part I - Null Safety.
//fun getLength(str: String?) : Int {
//    // Add null check here
//    if (str == null) {
//        return 0
//    } else {
//        print("\"$str\" length is: ")
//        return str.length
//    }
//}
//
////## Part III - Numbers.
//fun fahrenheitToCelsius() {
//    var check = false
//    while (!check) {
//        print("Enter temperature in fahrenheit: ")
//        try {
//            val tempInFahrenhiet = readLine()?.toDouble()
//            if (tempInFahrenhiet != null) {
//                val tempInCelsius = ((tempInFahrenhiet - 32) * 5) / 9
//                val formter = "%.1f"
//                println(
//                    "${formter.format(tempInFahrenhiet)} degree Fahrenheit is equal to ${
//                        formter.format(tempInCelsius)
//                    } in Celsius."
//                )
//                check = true
//            } else {
//                println("unexpected error")
//            }
//        } catch (e: NumberFormatException) {
//            println("Type miss match")
//        }
//    }
//}







fun main(){
//    //------------------------------NULLS & EXCEPTION HANDLERS------------------------------
    var x:Int? = null //x is nulliable type

//------------------------------SAFE CALL------------------------------
    val result1 = x?.plus(5)
    println(result1)

    //check null
    if(x != null){
        val result3 = x!!.plus(5)
        println(result3)
    } else {
        println("x is null")
    }
//
//    //------------------------------ASSERTION CALL------------------------------
    val result2 = x!!.plus(5)
    println(result2)

    val name:String? = null
    var theFinalName:String = ""
    //1
    if(name != null){
        theFinalName = name
    } else {
        theFinalName = "The name is null"
    }
//    //2
//    theFinalName = name ?: "The name is null"
    //works as well like this too:
          println(name ?: "The name is null")
    //1 and 2 has the same effect but 2 is shorter, therefore it's better

    //------------------------------TRY AND CATCH------------------------------
    try {
        print(5/0)
    } catch (e: ArithmeticException){
        //e.message : prints out the message in english
        println(e.message)
        //e.localizedMessage : prints out the message in the device language (arabic, english...etc)
        println(e.localizedMessage)
        //or print a custom message
        println("Custom message")
    } catch (e: NullPointerException){
        println("Custom message")
    } catch (e : Exception){
        //to figure out what is the new exception print "e" alone
        println(e)
    }

    //------------------------------STRINGS------------------------------

    //.split()
    val numbers = "1,2,3,4,5,6,7,8,9"
    println(numbers.split(","))
    val names = "Mohammed Fahad Aloufi"
    println(names.split("d"))
    val ones = "abc1def1ghi1"
    println(ones.split("1"))
//
    //.indexOf()
    val name5 = "mohammed"
    println(name5.indexOf("o"))

    //    unicode
    println("\u2718")

    //string destructuring
    //if the number of splited name > variables it's okey but not the way around
    val names1 = "anas ahmed assma khaled"
    val (name1, name2, name3, name4) = names1.split(" ")
    println(name1)
    println(name2)
    println(name3)
    println(name4)
    println(names.reversed())

    //------------------------------NUMBERS------------------------------
    val remaining = 8.7 / 3.41
    val formter = "%.2f"
    println("The remaining: ${formter.format(remaining)}")
}