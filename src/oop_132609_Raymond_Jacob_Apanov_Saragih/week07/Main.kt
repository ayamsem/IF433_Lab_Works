package oop_132609_Raymond_Jacob_Apanov_Saragih.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice",22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName,userAge) = data1
    println("Destructured: $userName berumur $userAge")


    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data Berhasil ditarik!")

    val uiMessage = when (response) {
        ApiResponse.Loading -> "Tampilkan Spinner"
        is ApiResponse.Success -> "Tampilkan ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }

    println("\n=== TEST GAME MANAGER ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== TEST RARITY & WEAPON FACTORY ===")
    println("Legendary drop chance: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()

    println("Nama senjata: ${starterWeapon.item.name}")
    println("Damage: ${starterWeapon.item.damage}")
    println("Rarity: ${starterWeapon.item.rarity}")
    println("Durability: ${starterWeapon.durability}")



    println("\n=== TEST UPGRADE WEAPON ===")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    println("Senjata awal: ${starterWeapon.item}")
    println("Senjata upgrade: $upgradedItem")

    println("\n=== TEST BATTLE EVENTS ===")

    processEvent(BattleState.SafeZone)

    processEvent(
        BattleState.MonsterEncounter("Goblin Nakal")
    )

    processEvent(
        BattleState.LootDropped(upgradedItem)
    )

    processEvent(
        BattleState.GameOver("Terkena jebakan racun")
    )


    println(uiMessage)
    println("App state: ${AppState.STARTING}")

}