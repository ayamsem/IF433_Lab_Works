package oop_132609_Raymond_Jacob_Apanov_Saragih.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    val response = ApiResponse("200 OK", coinRepo.getAll())

    coinRepo.add(Coin("Bitcoin", 1.5))
    coinRepo.add(Coin("Ethereum", 10.0))
    coinRepo.add(Coin("USDT", 500.0))

}

