package Practice.WhatToDo

fun main(args: Array<String>){
    whatShouldIDoToday("happy")
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24){
    when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}