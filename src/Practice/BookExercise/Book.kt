package Practice.BookExercise

import java.time.Year
import kotlin.random.Random

const val MAX_BORROWED_BOOKS = 4

class Book(val title: String, val author: String, val year: Int, var pages: Int) {

    companion object Constants {
        const val BASE_URL = "www.bookworm.com"

    }

    fun getTitleToAuthor(): Pair<String, String>{
        return (title to author)
    }
    fun getTitleAuthorAndYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

    fun canBorrow(hasBooks: Int): Boolean{
        return (hasBooks < MAX_BORROWED_BOOKS)
    }

    fun printUrl(): String {
        return "${Constants.BASE_URL}/${this.title}.html"
    }
}

fun Book.getWeight(): Double { return pages * 1.5 }

fun Book.tornPages(tornPages: Int){ if(pages > tornPages) pages -= tornPages else pages = 0 }

fun main(args: Array<String>) {
    val itBook = Book("It", "Stephen King", 1983, 742)
    println("${itBook.title} weighs ${itBook.getWeight()} grams")
    itBook.tornPages(50)
    println("${itBook.title} weighs ${itBook.getWeight()} grams")
    val myPuppy: Puppy = Puppy()
    while(itBook.pages > 0) {
        myPuppy.playWithBook(itBook)
        println("${itBook.title} now has only ${itBook.pages} pages!!!")
    }
    println("Sad Puppy, no more pages! :(")

    val allBooks: Set<String> = setOf("Hamlet", "King Lear", "The Taming of the Shrew", "Romeo and Juliet")

    val library = mapOf("Shakespeare" to allBooks)

    println(library.any { it.value.contains("Hamlet")})

    var moreBooks: MutableMap<String, String> = mutableMapOf("The Gunslinger" to "Stephen King")

    moreBooks.getOrPut("The Gunslinger") { "Stephen King"}
    moreBooks.getOrPut("The War of the Worlds") { "H.G. Wells"}

    print(moreBooks.toString())

}

class Puppy() {
    fun playWithBook(book: Book){
        book.tornPages(Random.nextInt(100))
    }
}