package android_bootcamp.spices

fun main(args: Array<String>) {

    var curry = Curry("Marchi", "Hard")
    println(curry.prepareSpice())
}

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) {
    abstract fun prepareSpice()
}

class Curry(name: String, spiceness: String, color: SpiceColor = YellowSpiceColor)
    : Spice(name, spiceness, color)
        , Grinder
        {
    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.GREEN

}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

//
//fun main (args: Array<String>) {
//    delegate() //1
//}
//
//fun delegate() {
//    val pleco = Plecostomus() //2
//    println("Fish has has color ${pleco.color}") //11
//    pleco.eat() //12
//}
//
//interface FishAction {
//    fun eat()
//}
//
//interface FishColor {
//    val color: String
//}
//
//object GoldColor : FishColor { //4 5
//    override val color = "gold" //6
//}
////9
//class PrintingFishAction(val food: String) : FishAction {
//    override fun eat() {
//        println(food) //13
//    }
//}
////3 7
//class Plecostomus (fishColor: FishColor = GoldColor):
//        FishAction by PrintingFishAction("eat a lot of algae"), //8
//        FishColor by fishColor //10