package android_bootcamp

class Spice(var name: String, var spiceness: String = "mild") {
    val heat: Int
        get() {
            return when (spiceness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("name $name spiceness= $spiceness , heat = $heat")
    }
}