package UTS_132609_Raymond_Jacob_Apanov_Saragih

import java.util.Scanner

fun main() {
    println("=== UMN CATERING MANAGER SYSTEM ===")

    println("[Database Setup] Adding Nasi Goreng Spesial...")
    val nasiGoreng = Foodmenu("Nasi Goreng Spesial", "nsg01", -15000.0)
    nasiGoreng.basePrice = 25000.0
    println("[Database Setup] Price updated to ${rupiah(nasiGoreng.basePrice)}")

    val ayamBakar = Foodmenu("Ayam Bakar Madu", "aym02", 35000.0)
    val esTeh = Drinkmenu("Es Teh Lemon", "lem01", 8000.0, true)

    val catalog: List<Cateringmenu> = listOf(nasiGoreng, ayamBakar, esTeh)

    val scanner = Scanner(System.`in`)
    println()
    println("--- CUSTOMER DATA INPUT ---")
    print("Enter Customer Name: ")
    val name = scanner.nextLine()
    print("Enter Phone Number: ")
    val phone = scanner.nextLine()
    print("Enter Delivery Address: ")
    val address = scanner.nextLine()

    val customer = Customer(name, phone, address)
    val order = Cateringorder(customer)

    while (true) {
        println()
        println("--- MENU CATALOG ---")
        for ((i, menu) in catalog.withIndex()) {
            println("${i + 1}. ${menu.name}")
        }
        println("0. [FINISH & CHECKOUT]")
        print("Select Menu Number: ")

        val choice = scanner.nextLine().trim().toIntOrNull()

        if (choice == null) {
            println("Please enter a number.")
            continue
        }
        if (choice == 0) {
            println("Processing Checkout...")
            break
        }
        if (choice !in 1..catalog.size) {
            println("Invalid menu number!")
            continue
        }

        print("Enter Quantity: ")
        val qty = scanner.nextLine().trim().toIntOrNull()
        if (qty == null || qty <= 0) {
            println("Invalid quantity!")
            continue
        }

        order.addMenuToOrder(catalog[choice - 1], qty) // list index = number - 1
        println("Order successfully added!")
    }

    println()
    order.status = OrderStatus.COOKING
    order.printInvoice()
}