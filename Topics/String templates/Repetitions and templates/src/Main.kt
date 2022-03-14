fun main() {
    val input = readln()
    var i = 0
    val string: StringBuilder = StringBuilder()
    while(i < input.length) {
        string.append(input)
        i++
    }
    println("${input.length} repetitions of the word $input: $string")
}