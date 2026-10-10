package oop_132609_Raymond_Jacob_Apanov_Saragih.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}