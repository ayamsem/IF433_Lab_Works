package oop_132609_Raymond_Jacob_Apanov_Saragih.week12

sealed class FeederException(msg: String) : Exception(msg)

class FoodEmptyException(
    val requested: Int,
    val available: Int
) : FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")