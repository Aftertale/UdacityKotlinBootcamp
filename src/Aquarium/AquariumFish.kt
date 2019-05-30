package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction{
    override val color = "grey"
    override fun eat() {
        println("Eating fish and people!")
    }
}

class Plecostomus: AquariumFish(), FishAction{
    override val color = "gold"
    override fun eat() {
        println("Eating algae ... and people!")
    }
}

interface FishAction {
    fun eat()
}