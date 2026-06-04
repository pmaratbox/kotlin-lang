class TrieNode {
    val children = sortedMapOf<Char, TrieNode>()
    var isWord = false
}

class Trie {
    private val root = TrieNode()

    fun insert(word: String) {
        var node = root
        for (c in word) {
            node = node.children.getOrPut(c) { TrieNode() }
        }
        node.isWord = true
    }

    fun autocomplete(prefix: String): List<String> {
        var node = root
        for (c in prefix) {
            node = node.children[c] ?: return emptyList()
        }
        val results = mutableListOf<String>()
        collect(node, StringBuilder(prefix), results)
        return results
    }

    private fun collect(node: TrieNode, path: StringBuilder, out: MutableList<String>) {
        if (node.isWord) out.add(path.toString())
        for ((c, child) in node.children) {
            path.append(c)
            collect(child, path, out)
            path.deleteCharAt(path.length - 1)
        }
    }
}

fun main() {
    val trie = Trie()
    listOf("car", "card", "dog").forEach { trie.insert(it) }
    println(trie.autocomplete("car").joinToString(" "))
}
