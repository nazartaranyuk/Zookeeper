fun main() {
    val input = readln().toInt()
    print(if (input.isPositive()) "YES" else "NO")
}
fun Int.isPositive() = this > 0