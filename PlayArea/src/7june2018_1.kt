
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {

    val dNow = Date()
    val ft = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S")

    println("Current Date: " + ft.format(dNow))



    var h = Human("Kamran",20)
    var s:Human = Studet()
    var t:Human = Teacher()

    println(h.name)
    var studet = Studet()
    println(studet.name)
//    var st1 = t as Studet
//    st1.name = "Imran"
//    println(st1.name)
//    st1.subject = "Android"

//    (s as Studet).subject = "Java"
//    println(s.subject)




//    InheritanceCasting
////    var student = Studet()
//    h.name = "Kamran"
//    var st1 = s as Studet
//    s.name = "Imran"
//    st1.subject = "Android"
//    println(h.name)
//    println(st1.name)
//    println(st1.subject)

    //parent to child
//    human.name = "Kamran"
////    student.subject = "Android"
//    println(human.name)
//    println(student.name)
//    println(teacher.name)

}

open class Human(var name:String ,var age:Int)

class Studet():Human("Studentname",12){
    var subject:String = ""
}
//open class Human(){
//    var name:String = ""
//    var age:Int = 0
//}
//class Studet:Human(){
//    var subject:String = ""
//}
class Teacher:Human("teachername",10){

}




//    var human = Human()
//    var teacher = Teacher()
//    var student11= Student1()
//    student11.name = "Kamran"
//    student11.age = 10
//    student11.subject = "Android"
//    println(human.name)
//    println(student11.name)
//    println(teacher.name)
//}
//
//open class Human {
//    var name: String = ""
//    var age: Int = -1
//}
//
//class Student1 : Human() {
//    var subject: String = ""
//}
//class Teacher:Human(){
//
//}