package oop_132609_Raymond_Jacob_Apanov_Saragih.week10

class AnagramSolver(private val dictionary: List<String>) {


    private fun getCharCount(word: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (char in word.lowercase()) {
            map[char] = map.getOrDefault(char, 0) + 1
        }
        return map
    }

    fun findValidWords(letters: String): List<String> {
        val rackCount = getCharCount(letters)

        return dictionary.filter { word ->
            val wordCount = getCharCount(word)

            wordCount.all { (char, count) ->
                rackCount.getOrDefault(char, 0) >= count
            }
        }.sortedByDescending { it.length } // Optional: sort by length (longest words first)
    }
}

fun main() {

    val dictionary = listOf("cat", "act", "tac", "dog", "god", "at", "to", "cot", "coat", "dogcat")

    val solver = AnagramSolver(dictionary)

    val letters = "toca"
    val results = solver.findValidWords(letters)

    println("Valid words from '$letters': $results")
}