fun main() {

    val str = "Mohammedd Fahadd"
    val pattern = "(\\w)\\1+".toRegex()
    println(str.replace(pattern, "**"))
}