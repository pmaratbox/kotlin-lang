fun groupAnagrams(words: List<String>): Map<String, List<String>> =
    words.groupBy { it.toCharArray().sorted().joinToString("") }

fun main() {
    val groups = groupAnagrams(listOf("eat", "tea", "tan", "ate", "nat"))
    println(groups.size)
}
