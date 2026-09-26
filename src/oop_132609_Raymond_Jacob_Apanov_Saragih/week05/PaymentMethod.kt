package oop_132609_Raymond_Jacob_Apanov_Saragih.week05

abstract class PaymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}