fun main(args: Array<String>) {

    val result = repeatedString("aba", 10)

    println(result)
}

fun repeatedString(s: String, n: Long): Long {
    var repeatedString = s
    println(repeatedString)
    while (repeatedString.length <= n){
          for (c in s) {
            if (repeatedString.length.toLong()== n){
                println(repeatedString.length)
                println(repeatedString)
                break
            }else{
                repeatedString = "$repeatedString$c"
            }

        }
        println(repeatedString)
    }
    var count: Long = 0
    for ( c : Char in repeatedString) {
        if (c=='a'){
            count++
        }
    }

    print("Count = $count")


    return count

}
