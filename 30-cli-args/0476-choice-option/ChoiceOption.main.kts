@file:DependsOn("com.github.ajalt.clikt:clikt-jvm:5.0.1")
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.choice
class App : CliktCommand() {
    val color by option().choice("red", "green", "blue").required()
    override fun run() { println(color) }
}
App().main(arrayOf("--color", "green"))
