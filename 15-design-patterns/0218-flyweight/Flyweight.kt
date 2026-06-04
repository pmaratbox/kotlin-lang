class Glyph(val char: Char)

object GlyphFactory {
    private val cache = mutableMapOf<Char, Glyph>()
    var created = 0
        private set

    fun get(char: Char): Glyph =
        cache.getOrPut(char) {
            created++
            Glyph(char)
        }
}

fun main() {
    for (c in listOf('a', 'b', 'a')) {
        GlyphFactory.get(c)
    }
    println(GlyphFactory.created)
}
