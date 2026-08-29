package oop_132609_Raymond_Jacob_Apanov_Saragih.week01

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"

fun main() {
    val name: String = "Raymond Jacob Apanov Saragih"
    val score: Int = 80
    println("Status: ${calculateStatus(score)}")


    println("Nama: $name, Nilai: $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"

    }
    println("Grade kamu: $grade")
    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panajang ID: $idLength")
}