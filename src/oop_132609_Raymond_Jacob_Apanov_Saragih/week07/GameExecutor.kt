package oop_132609_Raymond_Jacob_Apanov_Saragih.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Loot diperoleh: ${event.item.name}")
            println("Rarity: ${event.item.rarity}")
            println("Damage: ${event.item.damage}")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain memasuki zona aman.")
        }
    }
}
