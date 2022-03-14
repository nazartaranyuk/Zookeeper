const val CODE_OF_CHAR_ONE = '1'.code
const val CODE_OF_CHAR_TWO = '9'.code

fun main() {

    val input = readln().first()
    println(input.isUpperCase() || (input.code in CODE_OF_CHAR_ONE..CODE_OF_CHAR_TWO))

}