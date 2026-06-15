@file:DependsOn("com.github.ajalt.clikt:clikt-jvm:5.0.1")
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
class App : CliktCommand() {
    val verbose by option("--verbose").flag()
    override fun run() { println(verbose) }
}
App().main(arrayOf("--verbose"))
