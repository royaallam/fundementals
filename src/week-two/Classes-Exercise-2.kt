package `week-two`

import java.lang.NumberFormatException
//week2-day2 exercise

fun main() {
    val student = University("Mohammed", 12345)
//    val teacher = University("Anas", 67890, "BA")

    var hobbiesCount: Int

    while (true) {
        print("How many hobbies would you like to enter: ")
        try {
            hobbiesCount = readLine()!!.toInt()
            break
        } catch (e: NumberFormatException) {
            println("Please Enter A Number!!")
        }
    }
    student.addHobbies(hobbiesCount)
    student.printHobbies()
}

class University(private val name: String, private val id: Int) {

    private lateinit var hobbies: MutableSet<String>
    lateinit var teacherDgree: String

    constructor(
        teacherName: String,
        teacherId: Int,
        teacherDgree: String
    ) : this(name = teacherName, id = teacherId) {
        this.teacherDgree = teacherDgree
    }

    init {
        hobbies = mutableSetOf()
        println("Hello, Welcome to our university $name, ID: $id")
    }

    fun addHobbies(hobbyCount: Int){
        var i = 0
        lateinit var hobby: String
        while (i< hobbyCount) {
            print("Enter Hobby ${i+1}: ")
            hobby = readLine()!!
            if (hobby.isEmpty()){
                println("Please Enter A Valid Hobby")
            }else{
                hobbies.add(hobby)
                println("$hobby has been added to your hobbies")
                i++
            }
        }
    }

    fun printHobbies(){
        println("\nYour Hobbies: ")
        for (hobby in hobbies){
            println(hobby)
        }
    }
}