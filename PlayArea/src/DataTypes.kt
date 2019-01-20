fun main(args: Array<String>) {

    //VARIABLES
    var a = "Axiom"
    println("a is " + a)
    println("a is $a")
    val immutable = " This value can't be change"
    println("immutable value is $immutable")
    //Val cannot be change
//    immutable = "Kotlin batch"
    var bigInt: Int = Integer.MAX_VALUE
    var smallInt: Int = Integer.MIN_VALUE

    println("Big int is $bigInt")
    println("Small int is $smallInt")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Big Long is $bigLong")
    println("Small Long is $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Big Double is $bigDouble")
    println("Small Double is $smallDouble")

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE
    println("Big Float is $bigFloat")
    println("Small Float is $smallFloat")

    var bigShort: Short = Short.MAX_VALUE
    var smallShort: Short = Short.MIN_VALUE

    println("Big Short Value is $bigShort")
    println("Small Short Value is $smallShort")

    var bigByte: Byte = Byte.MAX_VALUE
    var smallByte: Byte = Byte.MIN_VALUE
    println("Big Byte Value is $bigByte")
    println("Small Byte Value is $smallByte")

    var myBool: Boolean = true
    println("MyBool is $myBool")

    var myString: String = "MY String"
    println("MY STring is $myString")

    var myChar: Char = 'A'
    println("My Char is $myChar")

    val (firstvar, secVar) = Pair(1, "x")
    println("First value of pair is $firstvar")
    println("Second value of pair is $secVar")

    var myName:String = "Kamran"
    println("My name is ${myName}")

    val str1: String = "A random Value"
    val str2: String = "a random Value"

    println("String Equals : ${str1.equals(str2)}")
    println("String Comparsion : ${str1.compareTo(str2)}")

    println("2nd Index ${myName[2]}")
    println("AFter Replace : ${myName}")
    println("Index 2 - 7 :  ${myName.subSequence(2,6)}")

    println("Check Any keyword : ${str1.contains("random")}")


//    \t
//    \b
//    \n
//    \r
//    \’
//    \”
//    \$


    print("my name is   ${myName} \n ALI ")
}
