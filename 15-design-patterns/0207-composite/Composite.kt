interface Component {
    fun size(): Int
}

class Leaf(private val value: Int) : Component {
    override fun size() = value
}

class Composite(private val children: List<Component>) : Component {
    override fun size() = children.sumOf { it.size() }
}

fun main() {
    val tree = Composite(listOf(Leaf(1), Leaf(2), Leaf(3)))
    println(tree.size())
}
