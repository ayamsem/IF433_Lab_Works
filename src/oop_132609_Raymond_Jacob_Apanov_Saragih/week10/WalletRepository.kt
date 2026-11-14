package oop_132609_Raymond_Jacob_Apanov_Saragih.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findItem(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}

