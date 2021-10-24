package `week-two`

import java.lang.NumberFormatException

//week2-day2 exercise
fun main() {
    val user = Library("Mohammed", 1234567890)

    while (true){
        try {
            println("\n1- Enter New Book \n2- Search For A Book \n3- View All Books \n4- Buy A Book \n 5-Exist")
            print("Enter Your Choise Number: ")
            val choise =  readLine()
            if (choise == "1"){
                var booksCount = 0
                while (true){
                    try {
                        print("\nHow many books you would like to enter: ")
                        booksCount =  readLine()!!.toInt()
                        if (booksCount == 0){
                            println("Invalid Entry")
                            continue
                        } else break
                    }catch (e: NumberFormatException){
                        println("Numbers are only allowed")
                    }catch (e: NullPointerException){
                        println("Invalid Entry")
                    }
                }

                var i = 0
                while (i < booksCount) {
                    print("\nEnter Book ${i+1} Section Name: ")
                    var bookSection = readLine()!!
                    print("Enter Book ${i+1} Name: ")
                    var bookName = readLine()!!
                    if (bookSection.isEmpty() || bookName.isEmpty()){
                        println("Entry is invalid!!!")
                    }else{
                        user.addBook(bookSection,bookName)
                        i++
                    }
                }
            } else if (choise == "2"){
                var bookName = ""
                try {
                    print("\nEnter Book Name: ")
                    bookName = readLine()!!
                }catch (e: NumberFormatException){
                    println("Numbers are only allowed")
                }catch (e: NullPointerException){
                    println("Invalid Entry")
                }
                val result = user.availablity(bookName = bookName)
                if (result) println("Book Exist")
                else println("Book Doesn't Exist")

            } else if (choise == "3"){
                user.printInfo()
            } else if (choise == "4"){
                var bookName = ""
                try {
                    print("\nEnter Book Name: ")
                    bookName = readLine()!!
                }catch (e: NumberFormatException){
                    println("Numbers are only allowed")
                }catch (e: NullPointerException){
                    println("Invalid Entry")
                }
                user.buyBook(bookName)
            }else if (choise == "5"){
                break
            }else {
                println("An Error Occurred")
                break
            }
        }catch (e: NumberFormatException){
            println("Numbers are only allowed")
        }catch (e: NullPointerException){
            println("Invalid Entry")
        }
    }
}
class Library(private val name: String, private val id: Int) {
    lateinit var books: MutableMap<String, String>
    var booksCount: Int

    init {
        books = mutableMapOf()
        booksCount = 0
        println("Account Created Successfully")
        println("Hi $name \nYour ID is: $id")
    }

    fun addBook(bookSection: String, bookName: String){
        if (books.contains(bookSection) || books.containsValue(bookName)){
            println("Book Already Exist")
        } else {
            books.put(bookSection,bookName)
            println("($bookSection, $bookName) has been added successfully")
            booksCount++
        }
    }

    fun availablity(bookName: String): Boolean{
        return books.containsValue(bookName)
    }

    fun printInfo(){
        if (books.count() == 0){
            println("Sorry, You Library Is Empty")
        } else {
            var counter = 1
            println("The number of books in your library: $booksCount")
            for (book in books){
                println("${counter}- Book Section: ${book.key}, Book Name: ${book.value}")
                counter++
            }
        }
    }

    fun buyBook(bookName: String){
        if (books.contains(bookName)){
            println("You Bought: $bookName")
            books.remove(bookName)
            booksCount--
        } else {
            println("Book Doesn't Exist")
        }
    }
}