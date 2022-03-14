fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val isTriangle = (a + b) > c && (a + c) > b && (b + c) > a
    val result = if (isTriangle) "YES" else "NO"
    println(result)
}