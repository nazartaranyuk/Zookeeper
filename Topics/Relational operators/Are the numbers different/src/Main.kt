fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a != b && b != c && a != c) {
        println(true)
    } else {
        println(false)
    }
}