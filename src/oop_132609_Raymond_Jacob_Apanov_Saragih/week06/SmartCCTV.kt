package oop_132609_Raymond_Jacob_Apanov_Saragih.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("$name menyala.")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan.")
    }

    override fun startRecord() {
        println("$name mulai merekam.")
    }
}