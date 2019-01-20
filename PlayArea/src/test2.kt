import testpackage2.concatStrings

class Structure() {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}

//What is an infix function? Add to the function
//the ability to use it with infix notation,
//that means we can use the function as an arithmetic
//operator, i.e., using it without writing dots and parentheses.

fun main(args: Array<String>) {

    val str1:String = "sd "
    val str2:String = "sd "
    val str3:String = "sd "

    str1.concatStrings(str2,str3)

    val obj = Structure()
//    obj.createPyramid(4)
    obj createPyramid 4

    println(getSum(2,2))
    println(tes())

    var a = 12
    var b =1
    var result:Boolean

    result = true or false
    println(result)
    println(11.rem(2))

    var aa=0
    for (a in 1.until(5)){
        println(a)
    }
    println(10.times(2))
    println(check(1))
}
fun check(a:Int = 0 ,b: Int = 23) = a+b
fun getSum(a:Int,b:Int):Int = a+ b
fun tes():Int{
    println("outer")
    return abs()
}
fun abs():Int {
    println("innerFun")
    return 2.plus(3)
}