val value = 1

fun main(args: Array<String>) {
    funh { println("emptyFUn") }
    funh1 { "Kamran" }
    funh2 { it.toString() }
    val funh3 = funh3 { it.toString() }
    funh(funh3)
    val funh4 = funh4({ it.toString() })
    funh1(funh4)
    funh5 { this.toString() }
    funh6 { it -> this.plus(it) }
    funh7 {
        var toString = it.toString()
        toString = null.toString()
        toString
    }

    val list = listOf(3, 5, 6, 7, 8, 9, 12, 11, 23)
    println(list.filter(::checkOdd))

    println(::value.get())
    println(::value.name)
    val strs = listOf("a", "bc", "def")
    println(strs.map(String::length))

    val intPlus: Int.(Int) -> Int = Int::plus
    intPlus(22,2)
    2.intPlus(22)

}


fun checkOdd(a:Int)= a%2 != 0

fun funh7(function: ((a: Int) -> String)?) {
    val invoke = function?.invoke(222)
    println(invoke)
}

fun funh6(function: Int.(a: Int) -> Int) {
    val function1 = function(112, 124)
    println(function1)
}

fun funh5(function: Int.() -> String) {
    val function1 = function(122)
    println(function1)
}

fun funh4(function: (a: Int) -> String): () -> String {
    return {
        val function1 = function(11)
         function1
    }
}

fun funh3(function: (a: Int) -> String): () -> Unit {
    return { println(function(12)) }
}

fun funh2(function: (a: Int) -> String) {
    val function1 = function(23)
    println(function1)
}

fun funh1(function: () -> String) {
    val function1 = function()
    println(function1)
}

fun funh(function: () -> Unit) {
    function()
}