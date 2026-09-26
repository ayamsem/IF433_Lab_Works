package oop_132609_Raymond_Jacob_Apanov_Saragih.week05

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName: Transaksi berhasil. Used amount: $usedAmount")
        } else {
            println("$accountName: Transaksi ditolak")
        }
    }
}