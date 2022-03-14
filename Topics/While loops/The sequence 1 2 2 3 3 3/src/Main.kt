fun main() {
    val input = readln().toInt()
    var i = 1
    var counter = 0
    while(i <= input) {
        repeat(i) {
            if(counter != input) {
                print("$i ")
                counter++
            }
        }
        i++
    }


}