const val FIRST = 0
const val NINTH = 9
const val LAST = 99

fun main() {
    val numbers = MutableList(100) { 0 }
    numbers[FIRST] = 1
    numbers[NINTH] = 10
    numbers[LAST] = 100


    // do not touch the lines below 
    println(numbers.joinToString())
}