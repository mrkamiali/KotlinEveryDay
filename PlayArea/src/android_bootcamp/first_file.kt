package android_bootcamp

import java.util.*

fun main(args: Array<String>) {
    dayofWeek()
    eatfishrandomly()

//    for (i in 1..10) {
//        val fortuneCookie = getFortuneCookie()
//        println("Your fortune is ${fortuneCookie}")
//        if (fortuneCookie.contains("Take it easy")) break
//
//    }

//    print("How's your mood ")
//    var mood = readLine()
//    println()
//    print("How's the weather ")
//    var weather = readLine()
//    println(whatShouldIDoToday(mood ?: "sad",weather ?:"sunny",  0))

    //Filter
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "green curry", "red curry", "red pepper")

    val sortedBy = spices.filter { it.contains("curry") }.sortedBy { it.length }
    println(sortedBy)
    val filter = spices.filter { it.startsWith('c') && it.endsWith('e') }
    println(filter)
    val filter1 = spices.take(3).filter { it.startsWith('c') }
    println(filter1)

    //Lambda
    val rollDice: () -> Int = { Random().nextInt(12) }
    println(rollDice())
    val rolDice2: (() -> Int) -> Int = {
        it()
    }
    println(rolDice2(rollDice))
    gamePlay(rollDice)


    var simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")
    var spice1 = Spice("spice1", "spiceness1")
    var spice2= Spice("spice2", "spiceness2")
    var spice3 = Spice("spice3", "spiceness3")
    var spice4 = Spice("spice4", "spiceness4")

}

fun gamePlay(rollDice: () -> Int) {
    println(rollDice())
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        ifhappyandsunny(mood, weather) -> "go for a walk"
        ifsadandrainyandtemp(mood, weather, temperature) -> "stay in bed"
        onlytemp(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun onlytemp(temperature: Int) = temperature > 35

fun ifsadandrainyandtemp(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun ifhappyandsunny(mood: String, weather: String) = mood == "happy" && weather == "Sunny"

fun getFortuneCookie(): String {
    val fortuneList = listOf<String>("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    print("Enter Your Birthday ")
    var birthday: Int = readLine()?.toIntOrNull() ?: 1
    val i = birthday.rem(fortuneList.size)
    println(i)

    return fortuneList[i]
}

fun eatfishrandomly() {
    val day = randomDay()
    val food = randomFood(day)
    println("Fish eat ${food} on $day")
}

fun randomFood(day: String?): String? {
    return when (day) {
        "Monday" -> "pellets"
        "Tuesday" -> "Mangoes"
        "Wednesday" -> "Apple"
        "Thursday" -> "Banana"
        "Friday" -> "Granade"
        "Saturday" -> "PineApple"
        "Sunday" -> "Strewberry"
        else -> "0"
    }

}

fun randomDay(): String? {
    val dayList = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return dayList[Random().nextInt(7)] ?: "0"
}

fun dayofWeek() {
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}
