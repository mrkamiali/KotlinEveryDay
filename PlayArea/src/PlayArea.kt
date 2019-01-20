import java.io.BufferedReader
import java.io.Reader
import java.util.*
import kotlin.collections.ArrayList

var adasd = "sd"
fun main(args: Array<String>) {

    adasd = "asdsa"
    println(adasd)
    var mutableVariable = "Kamran"
    val immutableVariable = "Kamran"
    val yearstocompute = 6.5e5
    val noinitilzer: Int = 0
    val message: String
    var any: Any
    any = 12
    any = "asd"


    println("Hello World")
    println(max(5, 4))
    println(yearstocompute)
    message = "Karan"
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
    println("\$x")
    val person = Person()
    println(person.name)
    person.name = "Kamran"
    println(person.name)
    val rectangle = Rectangle(4,4)
    println(rectangle.isSquare)
    println(createRandomRectangle().isSquare)
    println(Color.values()[0])
    println(Color.valueOf("RED"))
    println(getCOlorName(Color.RED))
    println(setOf(Color.RED,Color.GREEN))

    println(javaclass())
    val c = 1
//    if ('A' in 'A'..'Z'){
//        throw IllegalArgumentException("My Exception")
//    }

//    var myInt = readLine()
//    println(myInt.toString())

//    val scanner = Scanner(System.`in`)
//    println(scanner.nextInt())

    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
    val map = TreeMap<Int,String>()
    map.put(1,"as")
    map.put(2,"as")
    map.put(3,"as")
    map.put(4,"as")

    for ((key,value) in map){
        println("$key = $value")
    }

    var a = IntArray(10)
    a[0] = 12


    println("Kamran")
    val m1 = hashSetOf(1,2,3,4,5,1,2)
    println(m1.toString())
    val lis = arrayListOf(1,4,6,1)
    println(lis.toString())
    val map2 = hashMapOf(1 to "one",2 to "two")
    val array = IntArray(2 ,{
        it -> 2
    })

    var listof = listOf(1,2,3,1,2,3)
    var setof = setOf(4,6,8,9,1,2,3,4,5,1,2,3)
    println(listof[2])

    println(listof)
    println(setof)
    for ((index,element) in m1.withIndex()){
//        m1.add(index,12)
    }
    lis.add(1,6)

}
fun eval(e:Expr):Int{
    if (e is Num){
        val n = e as Num
        return n.value
    }
    if (e is Sum){
        return eval(e.rightVal)+ eval(e.leftVal)
    }
    throw IllegalArgumentException("Unknown expression")
}

interface Expr
class Num(val value:Int) :Expr
class Sum(val leftVal:Expr, val rightVal:Expr):Expr


fun getCOlorName(color:Color) = when(color){
    Color.RED -> "RED"
    else -> throw Exception("DirtyCOlor")
}
enum class Color(
        val r: Int, val g: Int, val b: Int
){
    RED(141,232,214),
    GREEN(321,123,123)
}
fun createRandomRectangle():Rectangle{
    val random = Random()
    return Rectangle(random.nextInt(20),random.nextInt(20))
}
class Rectangle(val height:Int,val width:Int){
    val isSquare:Boolean
    get() = height == width
}
//fun max(a:Int , b:Int):Int{
//    return if (a>b) a else b
//}
fun max(a: Int, b: Int) = if (a > b) a else b

class Person {
    var name: String? = null
    constructor()

    constructor(name1: String?) {
        this.name = name1
    }

var bac = "asdasd"
}

