package Practice.Spices

import java.awt.Color
import java.awt.Color.YELLOW

fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry("yellow curry", "mild")),
        SpiceContainer(Curry("red curry", "medium")),
        SpiceContainer(Curry("green curry", "hot")))
    for(element in spiceCabinet) println(element.label)
}

sealed class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry (name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spice (name , spiciness, color), Grinder {
    override fun grind(){}
    override fun prepareSpice() {
        grind()
    }
}

interface Grinder{
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

data class SpiceContainer (var spice: Spice){
    val label = spice.name
}

