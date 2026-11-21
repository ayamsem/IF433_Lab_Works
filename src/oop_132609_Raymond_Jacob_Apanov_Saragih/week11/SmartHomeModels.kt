package oop_132609_Raymond_Jacob_Apanov_Saragih.week11

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)