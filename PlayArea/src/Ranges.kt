fun main(args: Array<String>) {

    val oneTo10 = 1..10

    for (x in oneTo10) print(x)
    for (i in 1..4) print(i)
    for (i in 5 downTo 1) print(i)
    for (i in 1..6 step 2) print(i)

    println()
    for (i in 1 until 10) print(i)
    println()
    for (i in oneTo10.reversed()) print(i)

    println("My name is \t Kamran")

    if (1==4) println("true")

    when (23){
        1-> print("true")
        23-> print("false")
        else -> print("no no no")
    }
}
