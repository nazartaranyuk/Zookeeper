fun main() {
    val inputListSize = readln().toInt()
    val list = mutableListOf<Int>()
    repeat(inputListSize) { list.add(readln().toInt()) }
    list.filter { it % 4 == 0}.maxOrNull().run(::println)
}