@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

val app: HttpHandler = routes(
    "/greet" bind Method.GET to { req: Request ->
        val name = req.query("name") ?: ""
        Response(Status.OK).body("hello $name")
    }
)

println(app(Request(Method.GET, "/greet").query("name", "alice")).bodyString())
