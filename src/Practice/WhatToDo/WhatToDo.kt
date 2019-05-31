package Practice.WhatToDo

fun main(args: Array<String>){
    println("How do you feel?")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String{
    return when {
        isSadShittyDay(mood, weather) -> "Binge watch Netflix"
        isHappyAndSunny(mood, weather) -> "go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isWarm(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isSadShittyDay(mood: String, weather: String) = mood == "sad" && weather == "Shitty"
fun isSadRainyCold(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isWarm(temperature: Int) = temperature > 35
fun isHappyAndSunny(mood: String, weather: String) = mood == "Happy" && weather == "Sunny"