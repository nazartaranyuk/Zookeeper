fun main() {
    val inputLength = readln().toInt()
    val inputList = mutableListOf<Int>()
    var D = 0
    var C = 0
    var B = 0
    var A = 0
    repeat(inputLength) {
        inputList.add(readln().toInt())
    }
    inputList.forEach{
        when (it) {
            2 -> D += 1
            3 -> C += 1
            4 -> B += 1
            5 -> A += 1
        }
    }
    println("$D $C $B $A")
}