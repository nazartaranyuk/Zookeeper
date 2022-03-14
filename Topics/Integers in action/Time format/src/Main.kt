import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    // enter your code
    val date = Date(totalSeconds)

    val jdf = SimpleDateFormat("H:mm:ss")
    jdf.timeZone = TimeZone.getTimeZone("GMT-0")

    println(jdf.format(date))
}