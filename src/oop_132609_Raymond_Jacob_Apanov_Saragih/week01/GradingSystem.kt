package oop_132609_Raymond_Jacob_Apanov_Saragih.week01

fun main() {
    val name: String = "Raymond Jacob Apanov Saragih"
    val score: Int = 80


    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"

    }
    println("Grade kamu: $grade")
}