package UdacityPractice

import java.util.*

fun main(args: Array<String>){
    daysOfTheWeek()
}

fun daysOfTheWeek(){
    println("What day is it today?")

    val dayNum = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val day: String = when (dayNum) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "That's not a day!!!"
    }

    println("Today is $day")
}