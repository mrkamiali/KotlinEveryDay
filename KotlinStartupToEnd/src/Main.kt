fun main(args: Array<String>) {
    val integer:Int = 1 ;
    val string:String = "Kamtan"
    val anythingpossible = "String or int or any thing."
    var x = 'g'
    var value = 6
    value += 1
    println(value)

    var a = sum(5,5)
    println(a)
    printSum(9,9)
    val PI = 3.142

    val  result = Address(null)
    result.name = "Kamran"
}
//Function having two Int parameters with Int return type:
fun sum(a:Int,b:Int): Int{
    return a + b
}
//Function returning no meaningful value:
fun printSum(a:Int,b:Int): Unit{
    println("sum of $a and $b is ${a+b}")
}

