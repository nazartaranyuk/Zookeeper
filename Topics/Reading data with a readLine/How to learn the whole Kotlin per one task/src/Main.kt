
fun main() {
    var i = 0
    val finalOutput: StringBuilder = StringBuilder()
    while(i < 5) {
        val userInput = readLine()
        finalOutput.append("$userInput ")
        i++
    }
    println(finalOutput)
}