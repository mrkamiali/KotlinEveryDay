var name: String = ""
    get() {
        println("gets Called!")
        return field
    }
    set(value) {
        println("set called!")
        field = value
    }


fun String.get(index: String): Char {
    println("this one")
    return this[index.toInt()]
}

fun String.plus(other: Int): Char {
    println("this one")
    return this[other]
}

fun Any?.toString(a: String): String {
    if (this == null) return "null"
    return toString()
}

val IntArray.lastindex: Int
    get() {
        return this.size - 1
    }

fun main(args: Array<String>) {
    var myname: String = "kamran"
    name = "kamran"
    println(myname.get("2"))
    println(myname.plus(1))
    var any: Any? = null
    any = "KKAMRAN"
    println(any.toString(""))

    val intArrayOf = intArrayOf(1, 2, 23, 12, 123, 123, 123, 123, 23213, 12)
    println(intArrayOf.lastindex)
//    highorderFun1({number ->
//        println("hello Lambda")
//        number.toString()
//    })

    highorderFun1(highorderFun2())

    val arrayOf = arrayOf("1", "1", "1", "1", "1", "1")
    highorderFun1 { toString() }
    var a = 0

    arrayOf.forEach {
        println(it) }
}

fun concatinList(): Array<String>.() -> Array<String> {
    var a = 0
    return {
        for (s in this) {
            s + (a + 1)
        }
        this

    }
}

private fun highorderFun1(function: Int.() -> String) {
    function(5)

}

fun highorderFun2(): (Int) -> String {
    return {
        println(it.toString())
        it.toString()
    }
}

fun highorderFun3(): Int.() -> String {
    return ({ toString() })
    //can be ommitted ()
}
