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

    val airConditioner = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(airConditioner)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )

    println("\n=== SEARCHING SECURITY CAMERA ===")

    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }
}