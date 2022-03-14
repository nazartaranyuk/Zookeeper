import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val inputList = mutableListOf<Int>()
    while(scanner.hasNext()) {
        inputList.add(scanner.nextInt())
    }
    val maxInList = inputList.maxOrNull()
    val indexOfMaxElem = inputList.indexOf(inputList.maxOrNull()) + 1
    println("$maxInList $indexOfMaxElem")
}