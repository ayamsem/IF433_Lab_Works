package oop_132609_Raymond_Jacob_Apanov_Saragih.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\n--- BATTLE START ---")


    while (hero.isAlive() && enemyHp > 0) {
        println("\nHP Hero (${hero.name}): ${hero.hp} | HP Musuh: $enemyHp")
        print("Pilih Aksi (1. Serang, 2. Kabur): ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh tersisa: $enemyHp")


            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas serangan sebesar $enemyDamage damage!")
                hero.takeDamage(enemyDamage)
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur dari pertempuran!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }


    println("\n--- BATTLE END ---")
    if (hero.isAlive() && enemyHp == 0) {
        println("Selamat! ${hero.name} Menang!")
    } else if (!hero.isAlive()) {
        println("${hero.name} telah gugur dalam pertempuran...")
    } else {
        println("Pertempuran berakhir tanpa pemenang (Kabur).")
    }
}