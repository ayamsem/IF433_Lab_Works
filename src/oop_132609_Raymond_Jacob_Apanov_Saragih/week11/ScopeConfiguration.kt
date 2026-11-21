package oop_132609_Raymond_Jacob_Apanov_Saragih.week11

data class User(
    var name: String = "",
    var age: Int = 0
)

fun main() {
    println("=== TEST APPLY ===")

    val user = User().apply {
        name = "Alex"
        age = 25
    }

    println(user)
}

