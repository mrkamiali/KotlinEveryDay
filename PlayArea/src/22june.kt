fun main(args: Array<String>) {
    val student = Studentt("test")
    println(student.name)
    println(student.id)
}

class Studentt(name:String){
     var name:String = ""
     var id:Int = 1

    constructor(name:String,age:Int):this(name){
        this.name = name
        this.id = age
    }

}