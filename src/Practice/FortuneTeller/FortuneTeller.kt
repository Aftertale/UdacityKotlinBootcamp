package Practice.FortuneTeller

import java.lang.Math.random
import java.util.*

fun main(args: Array<String>){
    var fortune: String = ""
    while(!fortune.contains("Take it easy" )) {
        fortune = getFortuneCookie(getBirthday()!!)
        println("\nYour fortune is: $fortune")
    }
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf("Awesome things coming your way!",
        "You will probably die today",
        "You will step in dog poop",
        "You will poop and someone else will step in it.",
        "You will get lazy and start writing gibberish for a coding exercise",
        "hobble dee bo. mofa nel escalo.",
        "Take it easy!")
    print("Enter your birthday")
    return fortunes[birthday.rem(7)]
}

fun getBirthday(): Int? {
    println("What is your birthday?")
    val rollDice = { Random().nextInt(12) + 1}
    return readLine()?.toIntOrNull()
}