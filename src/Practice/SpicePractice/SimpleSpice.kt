package Practice.SpicePractice

class Spice (val name: String, val spiciness: String = "mild" ) {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
        }
    }
    init {
        println("${this.name}: ${this.spiciness}")
    }
}

fun makeSalt() = Spice("Salt")


fun main(args: Array<String>) {
    val spices = listOf(
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val lessSpicy = spices.filter { it.heat <= 5 }
}