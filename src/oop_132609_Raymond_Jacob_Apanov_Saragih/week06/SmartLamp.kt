package oop_132609_Raymond_Jacob_Apanov_Saragih.week06

class Smartphone(override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("$name menyala.")
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }
}
