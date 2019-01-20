fun main(args: Array<String>) {

    val value = "Kamran"
    value.printValue()
    value.printlength()
    value.concateString(" Ali")
    var myInt = 10
    println(myInt.sumFun(10))
    println(myInt.subFun(10))
    println(myInt.multiplyFun(10))
    println(myInt.divideFun(10))
    val intArrayOf = intArrayOf(1, 2, 3, 4, 5)
    val concatein = intArrayOf.concatein(3)
    for (i in concatein) {
        print(i)
    }
    println()
    val splitString = "My name is Kamran "
    val splitString1 = splitString.splitString()
    splitString1.forEach({ println(it) })


}

class myCalss(a: String) {
    private var a: String = ""
    private var b: String = ""

    constructor(a: String, b: String) : this(a) {
        this.a = a
        this.b = b

    }

    init {
        this.a = a
    }

}

fun String.splitString(): ArrayList<String> {
    var temp = ""
    val arrayListOf = arrayListOf<String>()
    for (c in this) {
        if (!c.equals(' ')) {
            temp += c
        } else {
            arrayListOf.add(temp)
            temp = ""
        }
    }
    return arrayListOf
}

fun IntArray.concatein(a: Int): IntArray {
    var myArray = IntArray(this.size, { it })
    for ((index, i) in this.withIndex()) {
        myArray[index] = i + a
    }
    return myArray
}

fun String.printValue() {
    println(this)
}

fun String.printlength() {
    println(this.length / 2)
}

fun String.concateString(a: String) {
    println(this + "" + a)
}

fun Int.sumFun(a: Int): Int {
    return this + a
}

fun Int.subFun(a: Int): Int {
    return this - a
}

fun Int.multiplyFun(a: Int): Int {
    return this * a
}

fun Int.divideFun(a: Int): Int {
    return this / a
}