package oop_132609_Raymond_Jacob_Apanov_Saragih.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12

                Product.Electronic(
                    id = id,
                    name = name,
                    warrantyMonths = warranty
                )
            }

            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"

                Product.Clothing(
                    id = id,
                    name = name,
                    size = size
                )
            }

            else -> null
        }
    }

    fun checkout(product: Product) {
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(id)!!

        println("Transaction ID: $transactionId")
    }
}
