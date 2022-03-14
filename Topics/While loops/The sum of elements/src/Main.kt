
fun main() {
    val inputList = mutableListOf<Int>()
    while(true) {
        val inputElem = readln().toInt()
        if (inputElem == 0) {
            break
        } else {
            inputList.add(inputElem)
        }
    }
    inputList.sum().run(::println)
}