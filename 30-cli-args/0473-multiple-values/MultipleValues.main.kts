@file:DependsOn("com.github.ajalt.clikt:clikt-jvm:5.0.1")
import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.main
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.multiple
import com.github.ajalt.clikt.parameters.types.int
class App : CliktCommand() {
    val num by option("--num").int().multiple()
    override fun run() { println(num.sum()) }
}
App().main(arrayOf("--num", "1", "--num", "2", "--num", "3"))
