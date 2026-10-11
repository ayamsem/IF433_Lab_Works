package UTS_132609_Raymond_Jacob_Apanov_Saragih

import java.util.Locale

fun rupiah(value: Double): String= "Rp " + "%R,.0f".format(Locale.GERMANY, value)