
package oop_132609_Raymond_Jacob_Apanov_Saragih.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf(
            "id" to "E01",
            "name" to "Laptop",
            "type" to "ELECTRONIC",
            "warranty" to 24
        ),
        mapOf(
            "id" to "C01",
            "name" to "T-Shirt",
            "type" to "CLOTHING",
            "size" to "XL"
        ),
        mapOf(
            "id" to "E02",
            "name" to "Mouse",
            "type" to "ELECTRONIC",
            "warranty" to "Not An Integer"
        ),
        mapOf(
            "name" to "Ghost Item",
            "type" to "CLOTHING"
        ),
        mapOf(
            "id" to "X01",
            "name" to "Unknown",
            "type" to "FOOD"
        )
    )

    val parser = ApiParser()

    println("=== E-COMMERCE API DATA PARSER ===")

    for (raw in rawApiData) {
        try {
            parser.parseProduct(raw)?.let { product ->
                when (product) {
                    is Product.Electronic -> {
                        println(
                            "Electronic: ${product.name} " +
                                    "(Warranty ${product.warrantyMonths})"
                        )
                    }

                    is Product.Clothing -> {
                        println(
                            "Clothing: ${product.name} " +
                                    "(Size ${product.size})"
                        )
                    }
                }

                parser.checkout(product)
                println()
            } ?: println(
                "Skipped: Unknown product type '${raw["type"]}'"
            )


        } catch (e: IllegalArgumentException) {
            println("Data Corrupt: ${e.message}")
        }
    }
}
