private fun hFun7(ava: (ass: (Int) -> Int) -> String): String {

    return ava({
        println(it)
        it
    })
}

fun main(args: Array<String>) {

    val a1: (Int) -> Int = {
        it
    }
    val a2: (ass: (Int) -> Int) -> String = { a1(12).toString() }
    println(hFun7(a2))

    hFun { println("hello") }
    hFun1 {s,d-> println(s+d) }
    hFun2 { it.toString() }
    hFun2(hFun3())
    hFun4({ toString() })

    val a: (Int) -> Int = { i -> i + 1 }
    hFun5(a)

    val repeat: String.(Int) -> String = { times: Int -> repeat(times) }

    println(hFun6(repeat))
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))

    val sum: Int.(Int) -> Int = { a -> this.plus(a) }
    println(sum(2, 3))
    val sum1 = fun Int.(other: Int): Int = this + other

    val b = 2 ;
    val c = 2 ;

    max2("MAX",{b,c -> b>c})
    hFun8({b,c->
        b+c})
}


private fun hFun8(function: (Int,Int) -> Int){
    println(function(2,3))
}
fun max2(a:String,function:(b:Int,c:Int)->Boolean){}

fun isOdd(x: Int) = x % 2 != 0

private fun hFun6(function: String.(Int) -> String): String {
    return function("Kamran ", 4)
}

private fun hFun5(function: (Int) -> Int) {
    println(function(5))
}

private fun hFun4(function: String.() -> Unit) {
    function("jar")
}

private fun hFun3(): Int.() -> String {
    return {
        println("returnFUn")
        toString()
    }
}

private fun hFun2(function: (Int) -> String) {
    function(2)
}

private fun hFun1(function: (Int,Int) -> Unit) {
    function(3,3)
}

private fun hFun(function: () -> Unit) {
    function()
}