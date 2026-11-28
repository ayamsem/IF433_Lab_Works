package oop_132609_Raymond_Jacob_Apanov_Saragih.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")