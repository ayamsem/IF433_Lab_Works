package UTS_132609_Raymond_Jacob_Apanov_Saragih

class Cateringorder(val customer: Customer) {
    var status: OrderStatus = OrderStatus.WAITING_LIST
    private val orderItems: MutableList<Pair<Cateringmenu, Int>> = mutableListOf()

    fun addMenuToOrder(menuItem: Cateringmenu, qty: Int) {
        orderItems.add(Pair(menuItem, qty))
    }

    fun printInvoice() {
        println("=========== INVOICE ===========")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAdress}")
        println("Order Status: $status")
        println()

        var grandTotal = 0.0
        for ((index, item) in orderItems.withIndex()) {
            val (menu, qty) = item
            print("${index + 1}.")
            menu.printMenuDetails(qty)
            grandTotal += menu.calculateSubtotal(qty)
        }
        println("---------------------------------")
        println("Grand Total: ${rupiah(grandTotal)}")
        println("=================================")
    }
}

