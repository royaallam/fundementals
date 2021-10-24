package `week-two`

fun main() {

    val str = "mmood"
    val words = listOf("book", "bookworm", "Bible",
        "bookish","cookbook", "bookstore", "pocketbook")

    val pattern = "book".toRegex()
    val pattern2 = str.toRegex()

    println("*********************")
    println("containsMatchIn function")

    str.forEach { ch ->
        if (pattern2.containsMatchIn(ch.toString())){
            println("$ch matches")
        }
    }
//    words.forEach { word ->
//        if (pattern.containsMatchIn(word)) {
//            println("$word matches")
//        }
//    }

    println("*********************")
    println("matches function")

    str.forEach {
        if (pattern2.matches(it.toString())){
            println("$it matches")
        }
    }
//    words.forEach { word ->
//        if (pattern.matches(word)) {
//            println("$word matches")
//        }
//    }
}