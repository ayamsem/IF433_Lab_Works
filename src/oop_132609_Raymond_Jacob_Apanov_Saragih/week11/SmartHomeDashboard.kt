package oop_132609_Raymond_Jacob_Apanov_Saragih.week11

fun main() {
    println("=== SMART HOME CONFIGURATION ===")

    val homeDevices = mutableListOf<SmartDevice>()

    println("Smart Home Device List berhasil dibuat")

    val smartLight = SmartDevice(
        "Philips WiZ Living Room",
        "Lighting"
    ).apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    println("Lampu berhasil dikonfigurasi: ${smartLight.name}")

    val securityCamera = SmartDevice(
        "Ezviz Outdoor",
        "Camera"
    ).apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}