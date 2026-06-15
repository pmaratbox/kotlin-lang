@file:DependsOn("com.github.ajalt.clikt:clikt-jvm:5.0.1")
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.arguments.argument
class App : CliktCommand() {
    val name by argument()
    override fun run() { println(name) }
}
App().main(arrayOf("alice"))
