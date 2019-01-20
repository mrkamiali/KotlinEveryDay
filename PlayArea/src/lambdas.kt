fun main(args: Array<String>) {

//    val product = {x:Int,y:Int-> x*y}
    val product: (Int, Int) -> Int = { x, y -> x * y }
    println(product(2, 3))

    val list = listOf(2,3,4,5,7,12)
//    val count = list.count({ x -> x > 3 })
    val count = list.count { it > 5 }
    println(count)

    var sum = 0
    list.forEach { sum += it }
    println(sum)

    add({ x: Int, y: Int -> x + y })
    val array = Array<Int>(5, { 5 })
    array[0]= 6
    array[1]= 8
    array[2]= 9
    array[3]= 4
    array[4]= 3
   println( max(list,{x,y->x<y}))

    if (false and true){
        println("sds")
    }

}

fun max(list: List<Int>, less: (Int, Int) -> Boolean):Int {

    var max: Int = 0
    for (i in list)
        if (max== 0 || less(max,i))
            max = i
    return max
}

fun add(i: (Int, Int) -> Int) {
    println(i(2, 1))
}
