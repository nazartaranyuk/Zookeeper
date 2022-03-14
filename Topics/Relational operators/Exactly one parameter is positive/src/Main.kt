fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    (listOf(a, b, c)
        .filter { it > 0 }
        .size == 1)
        .run(::println)


}