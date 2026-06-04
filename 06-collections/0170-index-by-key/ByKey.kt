fun main() {
    val people = listOf(1 to "alice", 2 to "bob")
    val byId = people.associate { (id, name) -> id to name }
    println("id 2: ${byId[2]}")
}
