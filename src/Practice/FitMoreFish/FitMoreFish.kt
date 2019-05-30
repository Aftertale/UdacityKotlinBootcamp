package Practice.FitMoreFish

fun main(args: Array<String>){
    println("canAddFish(10.0, listOf(3,3,3)) --> ${canAddFish(10.0, listOf(3,3,3))}")
    println("canAddFish(8.0, listOf(2,2,2), hasDecorations = false) --> ${canAddFish(8.0, listOf(2,2,2), hasDecorations = false)}")
    println("canAddFish(9.0, listOf(1,1,3), 3) --> ${canAddFish(9.0, listOf(1,1,3), 3)}")
    println("canAddFish(10.0, listOf(), 7, true) --> ${canAddFish(10.0, listOf(), 7, true)}")
    println("betterCanAddFish(10.0, listOf(3,3,3)) --> ${betterCanAddFish(10.0, listOf(3,3,3))}")
    println("betterCanAddFish(8.0, listOf(2,2,2), hasDecorations = false) --> ${betterCanAddFish(8.0, listOf(2,2,2), hasDecorations = false)}")
    println("bettercanAddFish(9.0, listOf(1,1,3), 3) --> ${betterCanAddFish(9.0, listOf(1,1,3), 3)}")
    println("bettercanAddFish(10.0, listOf(), 7, true) --> ${betterCanAddFish(10.0, listOf(), 7, true)}")
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean{
    var tankCapacity = tankSize
    if(hasDecorations){ tankCapacity = tankSize * .8 }

    return (currentFish.sum().plus(fishSize) <= tankCapacity)
}

fun betterCanAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}