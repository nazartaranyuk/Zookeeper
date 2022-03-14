fun main() {
    val inputLength = readln().toInt()
    val inputList = mutableListOf<Int>()
    repeat(inputLength) {
        inputList.add(readln().toInt())
    }
    inputList.count { it > 0 }.run(::println)
}