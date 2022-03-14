
fun main() {
    val startBalance = readln().toInt()
    val purchasePayments = readln().split(" ").map { it.toInt() }
    var availableBalance = startBalance

    purchasePayments.forEach {
        if (availableBalance >= it) {
            availableBalance -= it
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $availableBalance, but you need $it.")
            return
        }
    }
    println("Thank you for choosing us to manage your account! Your balance is $availableBalance.")

}
