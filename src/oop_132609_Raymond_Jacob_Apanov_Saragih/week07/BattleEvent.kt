package oop_132609_Raymond_Jacob_Apanov_Saragih.week07

sealed class BattleState {
    data class MonsterEncounter(
        val monsterName: String
    ) : BattleState()

    data class LootDropped(
        val item: GameItem
    ) : BattleState()

    data class GameOver(
        val reason: String
    ) : BattleState()

    object SafeZone : BattleState()
}
