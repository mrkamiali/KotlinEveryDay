fun main(args: Array<String>) {
    val lambdaFun = {
        println("Simple Lambda fun")
    }
    lambdaFun()
    val complexLambdaFun: (a: Int, b: Int) -> Int = { a, b ->
        a + b
    }
    val complexLambdaFun1 = complexLambdaFun(12, 12)
    println(complexLambdaFun1)
    //HighOrderFUn
    hFun({ println("HighORderFun") })
    hFun1({ a ->
        println(a)
    })
    hFun2({ a ->
        a.toString()
    })
    hFun3({ a, b ->
        (a + b).toString()
    })
    hFun4({
        { a, b ->
            println("Firstline")
            a + b
        }
    })
    //ReceiverType
    val av = 21
    hFun5({ a ->
        val sum = this.plus(a)
        println(sum)

    })

    val myfun = { a: Int ->
        a % 2 != 0
    }
    val list = listOf(1, 2, 3, 5, 6, 7, 8, 9)
    val abx = ::odd
    println(list.filter(abx))

    val stringPlus: String.(String) -> String = String::plus
    println(stringPlus("asd","sd"))
    "sd".stringPlus("Sd")

    abc((2)){ 12 }

    val student = Student()
    student.name = "Kamran"
    student.a = 12
    println(student.name)
    println(student.a)

}


class Student(){
    var name:String = ""
    var a:Int= 2
    constructor(n:String,a: Int):this(){
        this.name = n
        this.a = a

    }
}
private fun abc(a:Int,functio:()->Int){
    println(a+functio())
}
private fun odd(a: Int) = a % 2 != 0
private fun hFun5(funName: Int.(a: Int) -> Unit) {
    funName(1, 2)
}


private fun hFun4(funName: () -> (a: Int, b: Int) -> Int) {
    val funName1 = funName()
    val funName11 = funName1(25, 25)
    println(funName11)
}

private fun hFun3(funName: (a: Int, b: Int) -> String) {
    val funName1 = funName(25, 25)
    println(funName1)
}

private fun hFun2(funName: (a: Int) -> String) {
    val funName1 = funName(25)
    println(funName1)
}

private fun hFun1(funName: (a: Int) -> Unit) {
    funName(12)
}

private fun hFun(funName: () -> Unit) {
    funName()
}
