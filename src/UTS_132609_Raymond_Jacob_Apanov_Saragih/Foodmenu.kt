package UTS_132609_Raymond_Jacob_Apanov_Saragih

class Foodmenu(name: String, menuCode: String, basePrice: Double) :
    Cateringmenu(name, menuCode, basePrice) {

    var packagingFee: Double = 3000.0

    override fun calculateSubtotal(quantity: Int): Double =
        (basePrice + packagingFee) * quantity

    override fun printMenuDetails(quantity: Int) {
        println("[FOOD] $menuCode - $name")
        println("   Qty: $quantity portions | Subtotal: ${rupiah(calculateSubtotal(quantity))}")
    }
}