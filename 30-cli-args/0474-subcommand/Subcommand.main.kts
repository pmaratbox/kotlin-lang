@file:DependsOn("com.github.ajalt.clikt:clikt-jvm:5.0.1")
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.types.int

class App : CliktCommand() {
    override fun run() {}
}

class Add : CliktCommand() {
    val a by argument().int()
    val b by argument().int()
    override fun run() { println(a + b) }
}

App().subcommands(Add()).main(arrayOf("add", "2", "3"))
