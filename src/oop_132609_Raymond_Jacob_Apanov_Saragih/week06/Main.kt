package oop_132609_Raymond_Jacob_Apanov_Saragih.week06

fun processCheckout(method: PaymentMethod, amount: Double) {

    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {

    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    val lamp = SmartLamp("LAMP001", "Ruang Tamu")
    val speaker = SmartSpeaker("SPK001", "Google Nest Dapur")
    val cctv = SmartCCTV("CCTV001", "Ezviz Garasi")

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}
