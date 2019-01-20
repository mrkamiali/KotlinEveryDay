fun main(args: Array<String>) {
    var pakistani = Pakistani()
    println(pakistani.firstname)
    println(pakistani.lastname)
    pakistani.getHeight()
    pakistani.eat()

}

interface interfae1 {
    fun test()
}
abstract class Person1 {
    var name = "Kamran ali"
    open var firstname: String = "Kamran"
    abstract var lastname: String
    abstract fun eat()
    open fun getHeight() {}
    fun gotoSchool() {}
}

class Pakistani : Person1() , interfae1{

    override fun test() {
    }

    override var lastname: String
        get() = "Ali"
        set(value) {}
    override var firstname: String = "Arsalan"

    override fun eat() {
        println("$firstname is eating")

    }

    override fun getHeight() {
        println("height of $lastname is 6'' ")
    }
}