fun main(args: Array<String>) {

    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    var x: Int = 4
    println(x + 1)
    x += 1
    println(x)
    val PI = 3.142
    println(PI)

    sum(2, 2)
    println("Return Sum is ${returnSum(1, 1)}")
    println("Expresion body fun ${expressionSum(3, 3)}")
    voidFun()

    var s = 1
    val s1 = "s is $s"
    println(s1)
    s = 2

    val s2 = "${s1.replace("is", "was")}, but now is $s"
    println(s2)
    println("MAX function ${max1(5, 6)}")
    println("MAX FUN expression as body ${maxOf(2, 5)}")

    val list = listOf("kiwifruit", "banana", "apple")
    for (s in list) {
        println(s)
    }
    for ((index, value) in list.withIndex()) {
        println("INDEX $index value $value")
    }
    var index = 0
    while (index < list.size) {
        println(list.get(index))
        index++
    }
    println(describe(123))
    val x1 = 10
    val y = 9
    for (a in 1..y + 1) {
        println("fits in range")
    }
    val list1 = listOf("a", "b", "c")
    if (-1 !in 0..list1.lastIndex) {
        println("NOT in range")
    }
    if (list1.size !in list.indices) {
        println("size not matched")
    }
    for (item in list1) {

    }
    when {
        "orange" in list1 -> println(" ORANGE")
        "angoore" in list1 -> println(" ANGOORE")
        "a" in list1 -> println(" A")
        else -> println("NOt match")
    }
    list.filter {
        it.startsWith("b")
    }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { (println(it)) }

    val myList = listOf(5, 4, 6, 8, 7, 3, 9, 20)
    val filterLsit = myList.filter { x -> x >= 5 }
    for (i in filterLsit) {
        println(i)
    }
    val sA = 10000
    val sB = 10000
    println(sA===sB)
    val boxA :Int? = sA
    val boxB :Int? = sA
    println(boxA===boxB)
    val inta:Int? = 1
//    val longA:Long? = inta
    val l = 1L +3
    println(l)

    val s3 = "abc" + 1
    println(s3 + "def")


    val myarray = Array(10,init = {it -> 100})

    myarray.set(0,2120)
    myarray.set(1,2341)
    myarray.set(2,2322)
//    myarray.set(3,233)
    myarray.set(4,24)
    myarray.set(5,25)
    myarray.set(6,26)
//    myarray.set(7,27)
    myarray.set(8,28)
//    myarray.set(9,29)
    var asdasd :Int=4

    asdasd.toString();
   var aa:String="wwasdfs"

//    println(aa.toInt())


    for (i in myarray) {
        println(i)
    }

    val text = """
        >Tell me and I forget.
    >Teach me and I remember.
    >Involve me and I learn.
    >(Benjamin Franklin)
    """.trimMargin(">")
    println(text)

    println("/$ Kamran $text")

    var any:Any  = 123
    when (any){
        is String -> println("Is String")
        is Int -> println("Is Int")
        else -> println("NOt mactched")
    }


}

//default values in args
fun foo(a: String = "", b: Int = 0) {

}

fun describe(obj: Any): String = when (obj) {
    1 -> "One"
    "Hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "Not a string"
    else -> "Unknown"
}

fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null
    return obj.length
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b
fun max1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun voidFun(): Unit {
    println("Void Function")
}

fun expressionSum(a: Int, b: Int) = a + b
fun returnSum(a: Int, b: Int): Int {

    return a + b
}

fun sum(a: Int, b: Int) {
    println("Sum of a + b is " + (a + b))
}