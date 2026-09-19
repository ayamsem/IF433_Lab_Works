package oop_132609_Raymond_Jacob_Apanov_Saragih.week04

open class Vehicle(val brand: String) {
    var speed: Int = 0

    open fun accelerate() {
        speed += 10
        println("melaju, kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("beep beep!")
    }
}