fun main(args: Array<String>) {
    loop@for (a in 1..3){
        println()
        println("outer Loop $a")
        for (i in 1..5){
            if (i == 3) continue@loop
            println("inner loop $i")
        }
//        if (a == 3) continue@loop
        println("THis will never be printed")
        println()
    }
    fun1()
    fun2()
}
fun fun1(){
    println("fun 1")
    return
    println("after fun ")

}
fun fun2(){
    println("fun 2")
}