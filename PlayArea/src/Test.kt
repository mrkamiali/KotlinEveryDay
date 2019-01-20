
infix fun Int.shll(x: Int): Int {
    return x
}
infix fun String.prefix(x: String): String{
    return this + x
}
infix fun Int.check(a:Int):Int{

    return this+a
}

fun main(args: Array<String>) {

    println(3.check(2))
    println(3 check 3)
    println(3 shll 2)
    val array = Array(10, init = { "a" })
    array.set(1,"b")
//    println(fooo(array))
    fooo("A","B","C")
//    comp(a =false,b= true, c= *intArrayOf(2,3,4))
    comp(1,2,3,b= true )
    val a  = true
    val b  = true

    println("asd".prefix("ddd"))


}


fun comp(vararg c : Int, a:Boolean = true , b :Boolean = false ){
    println("$a $b")
    for (s in c) {
        println("s $s")
    }
}
//fun fooo(a:Array<String>){
fun fooo(vararg a:String){

    for (s in a) {
        println(s)
    }
}
fun foo(bar: Int = 0, baz: Int = 1,qux: () -> Unit) {  }

