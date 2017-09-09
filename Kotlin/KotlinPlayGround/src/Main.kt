fun main(args: Array<String>) {
    println("Hello WOlrd.")
//   if(true is Boolean){
//       print("Yes It is !\n")
//   }
//    var letterGrade: Char = 'K';
//    println("K is Char: ${letterGrade is Char}")
//println("3.142 to INt: "+3.142.toInt())
//println("65 to Int: "+65.toChar())
//println("A to int: "+'A'.toInt())

//    val myName = "Kamran Ali"
//    val longStr = " My Name is Kamran ALi"
//
//    var fName: String = "Kamran"
//    var lName: String = "Ali"
//
//    fName = "Ali"
//    var  fullName = fName +" "+lName;
//    println("Name :$fullName")
//
//    var str1 = "A random String "
//    var str2 = "a random String "
//
//    println("Equal: ${str1.equals(str2)}")
//    println("Comparison: ${str1.compareTo(str2)}")
//    println("2nd Index: ${str1[2]}")
//    println("Index 2 to 7: ${str1.subSequence(2,8)}")
//    println("Contains: ${str1.contains("random")}")

//    var myArray = arrayOf(1,1.23,"Doug")
//    println(myArray[1])
//    myArray[1] = 3.142
//    println(myArray.size)
//    println(myArray.contains("Doug"))
//    var partArray = myArray.copyOfRange(0,1)
//    println("First : ${myArray.first()}")
//    println("Doug Index: ${myArray.indexOf("Doug")}")

//    var myArray = Array(5,{ x -> x*x})
//
//    println(myArray.get(1))
//    println(myArray.get(2))
//    println(myArray.get(3))
//
//    var typArr: Array<String> = arrayOf("Ali","Kamran")
//    println(typArr.get(1))

//    val ontTo10 = 1..10
//    val alpha = "A".."Z"
//    println("R.in Alpha : ${"R" in alpha}")
//
//    val tenTo1 = 10.downTo(1)
//    val twoTo20 = 2.rangeTo(20)
//    val rng3 = twoTo20.step(2)
//
//    for (x in rng3) {
//        println("rng3 : $x")
//    }
//    for (x in ontTo10.reversed()){
//        println("Reversed : $x")
//    }
//    var myArray: Array<Int> = arrayOf(3,6,9,12,15,18)
//
//    for (x in myArray.indices){
//        println("indices is : ${myArray[x]}")
//    }
//
//    for ((index,value) in myArray.withIndex()){
//        println("Index : $index Value : $value")
//    }

//    fun add(num1: Int,num2: Int) : Int = num1 + num2
//    println("5 + 4 = ${add(5,4)}")
//
//    fun subtract(num1: Int, num2:Int) = num1 - num2
//    println("5 - 4 = ${subtract(5,4)}")
//
//    fun sayHello(name:String) : Unit = println("Hello $name")
//    sayHello("kamran")
//    val (two,three) = retrnTwoValues(1)
//    println("Returned VAlues: $two & $three")

    //factorial Print
//    println("5! = ${facto(5)}")

//    val numList = 1..20
//    val evenList = numList.filter { it%2 == 0 }
//    evenList.forEach { n-> println(n) }

//    val mult3 = makemathFunc(3)
//    println("5*3 = ${mult3(5)}"    )
//    val numList2 = arrayOf(1,2,3,4,5)
//    val multiply2 = {num: Int -> num *2}
//    mathOnList(numList2,multiply2)

    //LIST
//    var numList = 0..3;
//    numList.forEach { n -> println("eleme : $n")}
//
//    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
//    val list2: List<Int> = listOf(1,2,3)
//    list1.forEach { n -> println("mutable : $n")}
//    list2.forEach { n -> println("element : $n")}

    //MAP
//    var map = mutableMapOf<Int, Any?>();
//
//    val map2 = mutableMapOf(1 to "Kamran", 2 to 25)
//
//    map[1] = "Ali"
//    map[2] = 42
//
//    println("Map Size : ${map.size}")
//
//    map.put(3,"Kamran ALi")
//    map.remove(2)
//
//    for ((x,y) in map){
//        println("Key: $x Value : $y")
//    }

    //Class Object
//    val objectOfClass = Animal("Cat",2.0,12.0)
//    objectOfClass.getInfo()
//val childObject = Dog("Dog",3.0,1.0,"Ali");
//    childObject.getInfo()

    //InterFace
//    val tweet = Bird("Tweety")
//    tweet.fly(10.0)

//    var num1: Int = 2
//    var num2: Int = 4
//
//    var result = 0
//    result = if (num1>num2)  num1 else num2
//    println("result: $result")

    //Switch
//    val num:Int = 4
//    when (num){
//        1-> println("1")
//        2-> println("2")
//        3-> println("3")
//        4-> println("4")
//        else -> println("NotMatched")
    }
}

interface Flyable{
    fun fly(distmiles: Double):Unit
}
class Bird constructor(val name: String): Flyable {
    override fun fly(distmiles: Double) {
        println("$name flies $distmiles miles")
    }

}

class  Dog(name: String,
           height:Double,
           weight: Double,
           val owner: String) : Animal(name,height,weight){

}


open class Animal(val name:String, var height:Double,
                  var weight:Double){

    init {
        val regex = Regex(".*\\d+.*")
        require(!name.matches(regex)){"Animal Name Can't contain Number!"}
        require(height >0){"Height must be greater then Zero"}
        require(weight >0){"Weight must be greater then Zero"}
    }
    open fun getInfo() : Unit {
        println("$name is $height tall and weights $weight")
    }
}

fun mathOnList(numList: Array<Int>, myFun: (num:Int) -> Int){
    for (num1 in numList){
        println("MathOnList: ${myFun(num1)}")
    }
}

fun makemathFunc(num1:Int): (Int) -> Int = {num2 -> num1 * num2}

//tail Recursion
fun facto(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0 ) return z
        else return factTail(y-1,y*z)
    }
    return  factTail(x,1)
}

fun retrnTwoValues(num: Int): Pair<Int, Int> {

    return Pair(num + 1, num + 2)
}
