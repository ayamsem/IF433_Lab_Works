package oop_132609_Raymond_Jacob_Apanov_Saragih.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.7, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 5, -12.4, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, 4.3, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 8, 6.1, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 25, -2.8, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 12, 3.6, "CLOSED")
    )

    val closedTrades = tradeHistory.filter {
        it.status == "CLOSED"
    }

    val winningTrades = closedTrades.filter {
        it.roe > 0
    }

    val losingTrades = closedTrades.filter {
        it.roe < 0
    }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${"%.1f".format(java.util.Locale.US, it.roe)}% ROE (Lev: ${it.leverage}x)"
        }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: ${"%+.1f".format(java.util.Locale.US, it.roe)}% ROE (Lev: ${it.leverage}x)"
        }


    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    println("\n--- WINNING TRADES ---")

    topPerformersString.forEach {
        println(it)
    }

    println("\n--- LOSING TRADES ---")

    worstPerformersString.forEach {
        println(it)
    }

    println("\n--- UNIQUE TRADING PAIRS ---")
    println(uniquePairs)

}