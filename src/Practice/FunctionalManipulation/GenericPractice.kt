package Practice.FunctionalManipulation

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for(item in this) {
        if (block(item) == 0)
            result.add(item)
    }
    return result
}

fun main(args: Array<String>){
    var myList: List<Int>  = listOf(1,2,3,4,5,6,7,8,9,0)
    var newList = myList.divisibleBy({it.rem(3)})
    println(newList.toString())
}