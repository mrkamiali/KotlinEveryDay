val x1 = 1
fun main(args: Array<String>) {
    println(::x1.get())
    println(::x1.name)

    hFUn8 { }
    hFUn8(12) { a, v ->
        println("$a $v")
    }
    hFUn9(::myFUn)
    hFU1n(::isOOD)
    val mylist = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val filter = mylist.filter(::isOOD)
    println(filter)
    hFUn5 { _, a -> a }
}

fun isOOD(x: Int) = x % 2 == 0
fun hFUn(function: () -> Unit) {}
fun hFUn1(function: () -> String) {}
fun hFUn2(function: () -> Int) {}
fun hFUn3(function: () -> Any) {}
fun hFUn4(function: (a: Int) -> Int) {}
fun hFUn5(function: (a: Int, b: Int) -> Int) {}
fun hFUn6(function: Int.() -> Unit) {
    2.function()
    function(2)
}

fun hFUn7(function: (String.(a: Int) -> Unit)?) {
    function?.invoke("as", 1)
}

fun hFUn8(function: () -> Unit) {}
fun hFUn8(a: Int, function: (a: Int, b: Int) -> Unit) {}
fun hFUn9(function: () -> Unit) {
    function()
}

fun myFUn() {
    println("SimpleFun")
}

fun hFU1n(function: (Int) -> Boolean) {}
fun hFU2n(a: String): String {

    return a
}

fun hFU3n(a: Int): () -> Unit {
    val lf = {}
    return lf
}

