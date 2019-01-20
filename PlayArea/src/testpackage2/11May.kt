package testpackage2

fun main(args: Array<String>) {
    val str1: String = "hey "
    val str2: String = "hello "
    val str3: String = "world."
    println(str1 + str2 + str3)
    println(str1.concatStrings(str2, str3))

    val a: Int = 10
    val b: Int = 4
    println(a.checkGreater(b))
    str1.length
    val arrayListOf = arrayListOf(6, 2, 3, 2, 4, 5, 2)
    val map = arrayListOf.filter {
        it.equals(2)
    }.map {
        it
    }
    println(map)
    println(arrayListOf.checkNumber(2))

    println(arrayListOf.lastIndex)
    println(arrayListOf.hasTwo)
    println(arrayListOf.set9)

    arrayListOf.fold(1,{
        acc:Int,i:Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // The last expression in a lambda is considered the return value:
        result
    })

}

fun <T, R> Collection<T>.fold(
        initial: R,
        combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

var MutableList<Int>.set9: Int
    get() = this[0]
    set(value) {
        this[0] = value
    }

val List<Int>.hasTwo: Boolean
    get() = this.contains(2)

fun MutableCollection<Int>.checkNumber(a: Int): Int {
    for (i in this) {
        if (i > a) return i
        else return 2

    }
    return 0
}

fun Int.checkGreater(a: Int): Boolean {
    return this > a
}

fun String.concatStrings(st1: String, st2: String): String {
    return this + st1 + st2
}