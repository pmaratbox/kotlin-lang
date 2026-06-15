@file:DependsOn("com.github.ajalt.clikt:clikt-jvm:5.0.1")
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
class App : CliktCommand() {
    val name by option().required()
    override fun run() { println(name) }
}
App().main(arrayOf("--name", "alice"))
