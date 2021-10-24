package `week-two`
//Q1 = what dose Race Conditions mean
//A race condition is a type of concurrency bug that occurs when two or more threads
//access shared data and try to change it at the same time which leads to unpredictable results.

//Q2 = is there any Race Conditions in the code
//Yes, It was on line 15, Because although weapon is checked for a null value in the if statement,
//there's still a possibility of the Player’s weapon property to be a null value
//between the time that check passed and the time the name of the weapon was printed.

//Q3 = what's the best way to solve the compiling error in the code using scopeFunction
//To use also to guard against null like below.

class Weapon(val name: String)
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        if (weapon != null) {
            weapon?.also {
                println(it.name)
            }
        }
    } }
fun main() {
    Player().printWeaponName()
}