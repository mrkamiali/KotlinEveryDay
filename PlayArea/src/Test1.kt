
fun main(args: Array<String>) {

    val a = 9
    val b = 4
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max)

    var x = 12
    when (x) {
        11 -> println("11")
        12 -> println("12")
        else -> println("no match")
    }
    val abc = when (x) {
        11 -> println("11")
        12 -> println("12")
        else -> println("no match")
    }
    println(abc)

    while (x > 0) {
        println("value of x $x")
        x--
        if (x == 5) break
    }

    for (x in 1..12) {
        println("x $x")
        if (x == 4) {
            continue
        }
    }
    println("done")
//    loop@ for(a in 1..3){
//        println("loop@ $a")
//    }

    gotoLine46@ for (i in 1..100) {
        println("val of i $i")
        for (j in 1..100) {
            println("val of j $j")
            if (j == 3) continue@gotoLine46
        }
    }
    foo()
    foo1()
    foo2()
    val oneMillion = 1_000_000
    println(oneMillion)
    val hexBytes = 0xFF_EC_DE_5E

    println(hexBytes)
    val a1: Int? = 1 // A boxed Int (java.lang.Integer)
//    val b1: Long? = a1




}
fun foo3(){
    run loop@{


    }
}

fun foo2() {
    val listOf = listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
        println(value)
    })
    println(" done with anonymous function")
}

fun foo1() {
    listOf(1, 2, 3, 4, 5).forEach lit@{ i ->
        if (i == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        println("foo1 $i")
    }
    println(" done with explicit label")
}

fun foo() {
    listOf(1, 2, 3, 4, 5, 6).forEach {
        if (it == 3) return
        println("it $it")
    }
    println("this point is unreachable")
}