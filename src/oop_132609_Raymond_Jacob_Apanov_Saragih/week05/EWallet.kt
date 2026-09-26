package oop_132609_Raymond_Jacob_Apanov_Saragih.week05

class EWallet(
    accountName: String,
    var balance: Double
) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("$accountName: Pembayaran berhasil. Sisa saldo: $balance")
        } else {
            println("$accountName: Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName: Top up berhasil. Saldo sekarang: $balance")
    }
}