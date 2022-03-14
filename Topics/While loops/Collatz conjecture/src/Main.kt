fun main() {
    var input = readln().toInt()
    val list = mutableListOf<Int>()
    list.add(input)
    while(input != 1) {
        if (input % 2 == 0) {
            input /= 2
        } else {
            input = input * 3 + 1
        }
        list.add(input)
    }
    println(list.joinToString(" "))
}