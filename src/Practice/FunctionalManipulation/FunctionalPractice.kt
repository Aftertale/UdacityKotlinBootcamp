package Practice.FunctionalManipulation

import java.net.NoRouteToHostException

enum class Directions{
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = {path.add(Directions.EAST) }
    val west = {path.add(Directions.WEST) }
    val end = { path.add(Directions.END); println("GAME OVER $path"); path.clear(); false }
    fun makeMove(command: String?){
        if(command.equals("n")) move(north)
        else if(command.equals("s")) move(south)
        else if(command.equals("e")) move(east)
        else if(command.equals("w")) move(west)
        else move(end)
    }
}

fun main(args: Array<String>) {
    val game: Game = Game()
    while(true){
        print("Enter a direction n/s/e/w")
        game.makeMove(readLine())
    }


}

fun move( where: () -> Boolean ){
    where.invoke()
}