@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

val app: HttpHandler = routes(
    "/" bind Method.GET to { _: Request -> Response(Status.OK).body("home") },
    "/about" bind Method.GET to { _: Request -> Response(Status.OK).body("about") }
)

// http4k is "server as a function": call the handler directly in-process, no port.
println(app(Request(Method.GET, "/")).bodyString())
println(app(Request(Method.GET, "/about")).bodyString())
