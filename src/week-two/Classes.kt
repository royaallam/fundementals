package `week-two`

fun main() {
    val studentOne = College("Mohammed", 1234, 4.0)

    studentOne.addCourse("Programming 1")
    studentOne.addCourse("Programming 2")

//    studentOne.printInfo()

    studentOne.deleteCourse("math101")
    studentOne.deleteCourse("Programming 1")

    studentOne.printInfo()

    val hamd = College("anas", 1234, 4.0, "BI")
    hamd.printInfo()

    //---------------Getters & Setters--------------
    hamd.teacherDgree = "one"
//    println(hamd.teacherDgree)
}

//------------------------------*Classes*------------------------------
//(studentName: String, studentId: Int, studentGPA: Double) This is called the primary constructor
class College(private var name: String, private var id: Int, private var gpa: Double) {

    //    val studentName: String = name
//    val studentId: Int = id
//    val studentGPA: Double = gpa
    private var hobbies: MutableList<String>

    private val courses = mutableListOf<String>()
    //---------------Getters & Setters--------------
    //---------------LATE-INIT--------------
    lateinit var teacherDgree: String
//        get() = field.uppercase()
//        set(value) {
//            field = value + "test"
//        }

    //---------------LAZY INIT--------------
    val test by lazy { 5 }

    //-----Constructor-----
    //could be after the class name or separate like this:
    constructor(
        teacherName: String,
        teacherId: Int,
        teacherGPA: Double,
        teacherDgree: String
    ) : this(name = teacherName, id = teacherId, gpa = teacherGPA) {
        this.teacherDgree = teacherDgree
    }

    //---------------INIT--------------
    //will execute when you create new object
    //usually used when initializing variables instead of initializing at the top
    init {
        hobbies = mutableListOf()
        println("$name, Welcome to our university")
    }

    //---------------Methods--------------
    fun addCourse(courseName: String) {
        if (courses.contains(courseName)) {
            println("You Added $courseName Previously!!!")
        } else {
            courses.add(courseName)
            println("$courseName Course Has Been Added Successfully.")

        }
    }

    fun deleteCourse(courseName: String) {
        println("Your Courses: \n$courses")
        if (courses.contains(courseName)) {
            courses.remove(courseName)
            println("$courseName Has Been Removed")
        } else {
            println("Sorry, You Don't Have That Course")
        }

    }

    fun changeName(newName: String) {
        name = newName
    }

    fun printInfo() {
        // :: is used to check if teacherDgree is initialized or not
        if (!::teacherDgree.isInitialized) {
            println("Hi $name \nYour ID: $id \nYour GPA: $gpa \nYour Registered Courses: $courses")
        } else {
            println("Hi $name \nYour ID: $id \nYour GPA: $gpa \nYour Degree: $teacherDgree \nYour Registered Courses: $courses")
        }
    }
}



