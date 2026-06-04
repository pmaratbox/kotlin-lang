interface Button { fun label(): String }
interface Checkbox { fun label(): String }

interface ThemeFactory {
    fun button(): Button
    fun checkbox(): Checkbox
}

class DarkButton : Button {
    override fun label() = "dark-button"
}

class DarkCheckbox : Checkbox {
    override fun label() = "dark-checkbox"
}

class DarkFactory : ThemeFactory {
    override fun button(): Button = DarkButton()
    override fun checkbox(): Checkbox = DarkCheckbox()
}

fun main() {
    val factory: ThemeFactory = DarkFactory()
    val b = factory.button()
    val c = factory.checkbox()
    println("${b.label()} ${c.label()}")
}
