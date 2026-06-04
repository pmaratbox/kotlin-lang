class Trie {
    private class Node {
        val children = HashMap<Char, Node>()
        var end = false
    }

    private val root = Node()

    fun insert(word: String) {
        var node = root
        for (c in word) node = node.children.getOrPut(c) { Node() }
        node.end = true
    }

    fun search(word: String): Boolean {
        var node = root
        for (c in word) node = node.children[c] ?: return false
        return node.end
    }
}

fun main() {
    val trie = Trie()
    trie.insert("cat")
    trie.insert("car")
    val car = if (trie.search("car")) "yes" else "no"
    val can = if (trie.search("can")) "yes" else "no"
    println("$car $can")
}
