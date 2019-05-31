package Practice.DiceRollPractice

import java.util.*

val rollDice2: (Int) -> Int = { sides ->
    if(sides == 0)0
    else(Random().nextInt(sides) + 1)
}
fun main(args: Array<String>) {
    gamePlay(rollDice2(12))
}

fun gamePlay(diceRoll: Int){
    println(diceRoll)
}