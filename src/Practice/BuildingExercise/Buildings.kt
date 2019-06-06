package Practice.BuildingExercise

import com.sun.xml.internal.rngom.parse.host.Base

open class BaseBuildingMaterial(){
    open val numberNeeded = 1

    fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) =
        if(building.actualMaterialsNeeded <= 500) println("This building is small")
        else println("Big Building")
}

class Wood(): BaseBuildingMaterial(){
    override val numberNeeded = 4
}

class Brick(): BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial> (val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * buildingMaterial.numberNeeded

    fun build(){
        println("We needed ${actualMaterialsNeeded.toString()} piecess of ${buildingMaterial::class.simpleName}")
    }

}

fun main(args: Array<String>){

    val myBuilding = Building(Wood())
    myBuilding.build()
}