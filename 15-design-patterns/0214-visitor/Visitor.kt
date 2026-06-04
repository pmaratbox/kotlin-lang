interface Visitor {
    fun visit(leaf: Leaf)
    fun visit(node: Node)
}

interface Element {
    fun accept(visitor: Visitor)
}

class Leaf(val value: Int) : Element {
    override fun accept(visitor: Visitor) = visitor.visit(this)
}

class Node(val children: List<Element>) : Element {
    override fun accept(visitor: Visitor) = visitor.visit(this)
}

class SumVisitor : Visitor {
    var total = 0

    override fun visit(leaf: Leaf) {
        total += leaf.value
    }

    override fun visit(node: Node) {
        node.children.forEach { it.accept(this) }
    }
}

fun main() {
    val tree = Node(listOf(Leaf(1), Leaf(2), Leaf(3)))
    val visitor = SumVisitor()
    tree.accept(visitor)
    println(visitor.total)
}
