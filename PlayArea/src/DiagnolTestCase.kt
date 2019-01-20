import kotlin.math.absoluteValue

fun main(args: Array<String>) {

    var arr = arrayOf(intArrayOf(11, 2, 4),
            intArrayOf(4, 5, 6),
            intArrayOf(10, 8, -12))
    val result = diagonalDifference(arr)

    println(result)
}

// Complete the diagonalDifference function below.
fun diagonalDifference(array: Array<IntArray>): Int {
    var sum = 0
    var sum2 = 0
    for (x in 0 until array.size) {
        if (x >= array[x].size) {
            break
        }
        sum += array[x][x]
        sum2 += array[x][(array.size - 1) - x]
    }
    val i = sum - sum2
    return Math.abs(sum - sum2)

}