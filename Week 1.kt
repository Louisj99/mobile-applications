fun main() {
    dataTypes()
    calender()
    maths()
    val bookstore = Bookstore()
    bookstore.listBooks()
}

fun dataTypes() {
    // Numbers
    val intValue: Int = 10000
    val doubleValue: Double = 100.00
    val floatValue: Float = 100.00f
    val longValue: Long = 1000000004
    val shortValue: Short = 10
    val byteValue: Byte = 1

    // Characters
    val letter: Char = 'k'    // defining a variable         // Assigning a value to it
    println("$letter")

    // Booleans
    val bool: Boolean = true

    //Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val stringArray : Array<String> = arrayOf("a", "b", "c")

    //nullable types
    val name: String? = null
}

fun calender() {
    val firstDay = 1
    val dates = listOf(2,5,32,30)

    for (date in dates) {
        if (date<0 || date>31) {
            println("Invalid date: $date")
        }else {
            var day = date%7 + firstDay - 1
            when(day) {
                1 -> println("$date is a Monday")
                2 -> println("$date is a Tuesday")
                3 -> println("$date is a Wednesday")
                4 -> println("$date is a Thursday")
                5 -> println("$date is a Friday")
                6 -> println("$date is a Saturday")
                7 -> println("$date is a Sunday")
            }
        }
    }
}
// example of a class and data class
data class book (
        val title: String,
        val author: String,
        val price: Int)

class Bookstore {
    private val books = listOf(
            book("The Great Gatsby", "F. Scott Fitzgerald", 10),
            book("The DaVinci Code", "Dan Brown", 15),
            book("Angels & Demons", "Dan Brown", 12),
            book("The Alchemist", "Paulo Coelho", 20),
    )
    fun listBooks() {
        books.forEachIndexed { index, book ->
            println("${index + 1}. ${book.title} by ${book.author}")
        }
    }
}

fun maths() {
    val sum = { x: Int, y: Int -> x + y }

    val result1 = sum(4, 5)
    val result2 = sum(6, 7)

    println("result1 = $result1")
    println("result2 = $result2")
}