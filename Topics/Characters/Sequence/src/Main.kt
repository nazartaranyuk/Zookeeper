fun main() {
    val a = readln().first().code // 99
    val b = readln().first().code // 98
    val c = readln().first().code // 97
    print(c - 1 == b && b - 1 == a)
}