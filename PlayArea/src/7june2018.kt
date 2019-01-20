fun main(args: Array<String>) {

    val cat = Cat()

    cat.age = 2
    cat.color = "White"
//    cat.name = "cato"
    println(cat.age)
    println(cat.color)
    println(cat.name)
    cat.meow()
    cat.eat()

}

open class Animal {
    open var name: String = ""
    var color: String = ""
    open fun eat() {
        println("Eating")
    }
}

class Cat : Animal() {
    override var name:String = "cato"
    var age: Int = -1
    fun meow() {
        println("Meow")
    }

    override fun eat() {
//        super.eat()
        println("Cat is eating")
    }
}

class Dog : Animal() {
    var breed: String = ""
    fun bark() {
        println("woa woao")
    }
}