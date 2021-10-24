package `week-two`

fun main() {
    val a = A()
    val b = B()
    val c = C()
    val d = D()

    println(d.add(2,2))
    d.running()
}

open class A{

    open fun running(){
        println("Running...")
    }

    open fun add(num1: Int, num2: Int): Int{
        return num1 + num2
    }
}

open class B: A(){
    override fun add(num1: Int, num2: Int): Int {
        print("Your Result Is: ")
        return super.add(num1, num2)
    }

    fun go(){

    }
}

class C: A(){


}

class D: B(){


    init {
        //check what add() exist B's or A's or both and print all of them

    }

    //D will inherit add form B because it's closest to it from A
    //You can't access A's add()
    override fun add(num1: Int, num2: Int): Int {
        return super.add(num1, num2)
    }

}