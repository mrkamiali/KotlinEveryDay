@file:JvmName("JointString")


fun String.myFun():Char {

    return this.get(this.length-1)
}

fun javaclass():Int{
    return 232
}

fun main(args: Array<String>) {

    val list = listOf(2, 12, 4, 5, 6, 7)
    println(joinToString(list))
    var asd = "kamran"

    println(asd.myFun())
}

fun <T> joinToString(
        collection: Collection<T>,
        seperator: String = "Kam",
        prefrix: String = "",
        postfix: String= "."
): String {

    val result = StringBuilder(prefrix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(seperator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}