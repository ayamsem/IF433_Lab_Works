package oop_132609_Raymond_Jacob_Apanov_Saragih.week10

fun main() {

    val intBox = Box(100)
    val stringBox = Box("Bitcoin")

    println("Integer Box: ${intBox.value}")
    println("String Box: ${stringBox.value}")

    val pairBox = PairBox(1, "Ethereum")

    println("PairBox Key: ${pairBox.key}")
    println("PairBox Value: ${pairBox.value}")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")
}
