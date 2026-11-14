package oop_132609_Raymond_Jacob_Apanov_Saragih.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    val response = ApiResponse("200 OK", coinRepo.getAll())

    coinRepo.add(Coin("Bitcoin", 1.5))
    coinRepo.add(Coin("Ethereum", 10.0))
    coinRepo.add(Coin("USDT", 500.0))

    println("Status Respon: ${response.status}")
    println("Daftar Koin:")
    response.data.forEach { coin ->
        println("- ${coin.name}: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-001", 250.0))
    txRepo.add(Transaction("TX-002", 50.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }
}

