package UTS_132609_Raymond_Jacob_Apanov_Saragih

abstract class Cateringmenu(
    val name: String,
    menuCode: String,
    basePrice: Double
) : Ibillable {

    var menuCode: String = menuCode.uppercase()
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    var basePrice: Double = 0.0
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    init {
        this.basePrice = basePrice
    }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}