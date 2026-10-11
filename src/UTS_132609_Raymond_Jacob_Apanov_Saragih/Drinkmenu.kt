package UTS_132609_Raymond_Jacob_Apanov_Saragih

class Drinkmenu(name: String, menuCode: String, basePrice: Double, var isLargeSize: Boolean) :
    Cateringmenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val price = if (isLargeSize) basePrice + 5000 else basePrice
        return price * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val size = if (isLargeSize) "Large" else "Regular"
        println("[DRINK] $menuCode - $name ($size)")
        println("   Qty: $quantity cups | Subtotal: ${rupiah(calculateSubtotal(quantity))}")
    }
}