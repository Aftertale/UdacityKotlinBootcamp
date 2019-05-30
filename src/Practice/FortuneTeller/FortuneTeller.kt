package Practice.FortuneTeller

fun main(args: Array<String>){
    println("Your fortune is: ")
    println(getFortuneCookie())
}

fun getFortuneCookie(): String {
    val fortunes = listOf("Awesome things coming your way!",
        "You will probably die today",
        "You will step in dog poop",
        "You will poop and someone else will step in it.",
        "You will get lazy and start writing gibberish for a coding exercise",
        "hobble dee bo. mofa nel escalo.")
    print("Enter your birthday")
    var birthday: Int = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(6)]
}