package `week-one`

fun main() {
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var finalNumber = 0
    val result = valuesToAdd.filter { it < 7 }
        .map { it * 2 }
        .forEach{
            finalNumber += it
        }

    println(finalNumber)

    val vegetable = listOf("Carrot", "Lettuce", "Cucumber")
    val fruit = listOf("Apple", "Grapes", "Watermelon")

    val grocery = vegetable.flatMap { fruit }

    println(grocery)
}
