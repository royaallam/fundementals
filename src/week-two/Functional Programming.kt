package `week-two`

fun main() {
//    val x = mutableListOf(5, 10, 15 ,22, 99)
//
//    //This does what the forEach do, using functional programming
//    val result = x.filter { it > 15 }

    //the above line is more convenient, because the forEach has more time complexity 'Big O Notation'
//    x.forEach{
//        if (it > 15){
//            result.add(it)
//        }
//    }
//filter exclude element that does not match the condition
    //Another Example
    val strs = mutableListOf("ahmed", "hi", "hello", "car")
    val result2 = strs.filter { it.length > 4 }

//    println(result2)
//map will put all element in the new list but will do some changes
    val xi = mutableListOf(5, 10, 15 ,22, 99)
    val result3 = xi.map { it * 2}
    println(result3)


    //---------------FUNCTIONAL PROGRAMMING---------------
    //using functions back to back
    val xii = mutableListOf(5, 10, 15 ,22, 100, 102, 200)
//    val result4 = xii.filter { it > 25 }.map { it * 2 } //could be written this way
    val result4 = xii.filter { it > 25 }
        .map { it * 2 } //Or like this, but this way is more readable and common.
//    println(result4)

    //filterNot will treat && as if it || and vise versa
    val result5 = xii.filterNot { it < 10 && it % 2 == 0 }

    val str = "abcc"
    str.replaceRepetative()

}

fun String.replaceRepetative(){
    var temp = ""
    this.forEach {
        println(it)
    }
}

fun Int.reverse(): Int{
//    val ff = 12345
//    val result5 = ff.reverse()
//    println(result5)

    var value = this
    var reverse = 0

    while (value != 0) {
        val digit = value % 10
        reverse = reverse * 10 + digit
        value /= 10
    }
    return reverse
}