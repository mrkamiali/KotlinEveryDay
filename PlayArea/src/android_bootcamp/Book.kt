package android_bootcamp

open class Book(val title: String, var author: String) {

    var currentPage = 0
    open fun readpage() {
        currentPage += 1
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {
    private var wordsRead = 0
    override fun readpage() {
        wordsRead = wordsRead + 250
    }
}