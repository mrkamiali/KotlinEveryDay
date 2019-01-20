package android_bootcamp.pair

import java.util.*


const val maxBooksBorrow = 10
object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

fun canBorrow(count: Int): Boolean {

    return count <= maxBooksBorrow
}

fun main(args: Array<String>) {


    val mylist = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    var reverselist = reversList(mylist)
    println(reverselist)
    println(mylist.reversed())
    val book = Book("Romeon and Juliet", "William Shakespeare", 1597,0.0)
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

    val allBooks = setOf("Macbeth", "Romeo and Juliet", "Hamlet", "A Midsummer Night's Dream")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any() { it.value.contains("Hamlet") })
    var moreBooks = mutableMapOf("William" to "Shakspare")
    println(moreBooks.getOrPut("doc") { "doc" })
    println(moreBooks)

    val puppy = Puppy()
    val book1 = Book("Oliver Twist", "Charles Dickens", 1837, 540.0)
    while (book1.pages <= 0.0){
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
}

fun reversList(mylist: List<Int>): List<Int> {
    var reverseList = mutableListOf<Int>()
    for (i in mylist.size - 1 downTo 0) {
        reverseList.add(mylist[i])
    }
    return reverseList
}
fun Book.weigthOfBook():Double{
    return pages*1.5
}
fun Book.tornPages(torn:Int) = if (pages>torn)  pages -= torn else pages = 0.0

class Puppy{
    fun playWithBook(book :Book){
        book.tornPages(Random().nextInt(12))
    }
}
class Book(val title: String, val author: String, val year: Int,var pages:Double) {


    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    fun getTitleAuthor(): Pair<String, String> {

        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
    fun printUrl(){
        println(BASE_URL)
    }

}

