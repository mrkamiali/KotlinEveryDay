class Paramid {
    fun touch(){
        println("touch")
    }
    infix fun createParamid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in i..rows - 1) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()
        }
    }
}

infix fun Int.add(a: Int): Int {

    return this + a
}

infix fun Int.subtract(a: Int): Int {

    return this / a
}

fun main(args: Array<String>) {
    val structure = Paramid()

    structure createParamid 4

    val nm = 4
    val i = nm add 4
    println(i)
    structure.touch()


}