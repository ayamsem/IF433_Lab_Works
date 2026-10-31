package oop_132609_Raymond_Jacob_Apanov_Saragih.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order (null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order (null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga Rp$price, Pajak: Rp$tax"
} ?: "Transaksi Invalid: Harga Belum di-set!"

println(receipt)