package oop_132609_Raymond_Jacob_Apanov_Saragih.week03

fun main() {

    val player = Player("ayamsem")

    player.addXp(50)
    println("Level: ${player.level}")

    player.addXp(60)
    println("Level: ${player.level}")
}