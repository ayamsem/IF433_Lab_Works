package oop_132609_Raymond_Jacob_Apanov_Saragih.week06

interface Clickable {

    val name: String
    fun click()
}
class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}