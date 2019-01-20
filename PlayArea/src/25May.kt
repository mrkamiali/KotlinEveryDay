val x = 1

fun main(args: Array<String>) {
    hFun1 { }
    hFun2()
    hfun3({
        println(it)
    })
    hfun4({ a, b ->
        println(a + b)
    })

    val mybvv: (a: Int) -> String = { a -> a.toString() }
    println(mybvv(1))

    val sum: Int.(a: Int) -> Int = { a: Int -> plus(a) }

  println(  sum(22, 1))
    hfun5({ it:Int ->
       this.plus(it)
   })
    val list = listOf(1,2,3,45,6,7,4,3,2)
    println(list.filter(::isOddd))
    val predicte:(a:Int)->Boolean = ::isOddd


    println(::x.get())
    println(::x.name)


}

fun isOddd(a:Int)= a%2!=0
fun hfun5(function: Int.(a: Int) -> Int) {
    println(function(12, 12))
}

fun hfun4(function: (a: Int, b: Int) -> Unit) {
    function(2, 3)
}

fun hfun3(function: (a: Int) -> Unit) {
    function(3)
}

fun hFun2(): () -> Unit {
    return {
        println("Hello Return")
    }
}

fun hFun1(function: () -> Unit) {
    println("HELLO")
}