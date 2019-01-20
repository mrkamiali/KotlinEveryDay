package android_bootcamp.spices


import android_bootcamp.Spice


fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Spice("Yellow Curry", "mild")),
            SpiceContainer(Spice("Red Curry", "medium")),
            SpiceContainer(Spice("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}
class SpiceContainer(var spice:Spice) {
    val label:String = spice.name
}
