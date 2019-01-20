fun main(args: Array<String>) {


//    Variables
    var name = "Kamran"
    var name1: String = "Ali"

    println("My name is $name $name1")

    val name2 = "KAMRAN"
    val name4: String = "ALI"
    println("MY NAME IS $name2 $name4")

    name = "KHaN"

    //String Template
    val myName = if (args.size > 0) args[0] else "KOTLIN"
    println("Hello $myName")

    //if you want use expression within the QUOTES
    println("HEllo ${if (args.size > 0) args[0] else "someone"} !")

    //    NullSaftey

//    val a : String = "abc"
//    a = null
    var b: String? = "abc"
    b = null
    val length = if (b != null) b.length else -1

    if (b != null && b.length > 0) {
        println("b is not null")
    } else {
        println("b i null")
    }
    //Safe Call
    println(b?.length)

    //Simple if else
    val age: Int = 10
    if (age > 10) {
        println("Age is greater than 10")
    } else {
        println("Age is les then 10")
    }

    //nested if else
    if (age > 10) {
        println("Age is Greate than 10")
    } else if (age == 10) {
        println("Age is equals to 10")
    } else if (age < 10) {
        println("Age is less than 10")
    } else {
        println("Age doesn't matched.")
    }

    when (age) {

        5 -> println("Age is 5")
        8 -> println("Age is 8")
        10 -> println("Age is 10")
        else -> println("No case matched.")
    }

    var myVar: Any
    myVar = 10

    when (myVar) {
        is String -> println()
        is Int -> println()
        is Double -> println()
        is Char -> println()
        else -> println("No type matched")
    }

    var x: Int = 10

    when (x) {
        !in 1..10 -> println("found in the given Range")
        in 1..10 -> println("found in the given Range")
    }

    when (x) {
        5, 10 -> println("found")
    }


    var num = 1

    while (num <= 10) {
        println("Value of num is $num")
        num++
    }

    var dowhileNum = 0
    do {
        println("Value of do while num is $dowhileNum")
        dowhileNum++
    } while (dowhileNum <= 10)

    var abc = "100"
    println(abc.toInt())
    var nmber = 100
    println(nmber.toChar())

    val myarrray = arrayOf<String>("1", "Kamran", "12", "abc")
    for (item: String in myarrray) {
        println(item)
    }
    for (x in 1..10) {

    }
    val ranges = 0..10
    for (x in ranges.reversed()) {
        println(x)
    }
    val map = HashMap<String, Int>()
    map.put("two", 2)
    map.put("one", 1)
    map.put("asd", 1)
    map.put("ondsae", 4)
    map.put("one", 1)

    for ((key, value) in map) {
        println("$key $value")
    }
    map.forEach { key, value -> println("$key = $value") }
    println("---------------------------------------------")



}