@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

// http4k is "server as a function": an HttpHandler is just (Request) -> Response.
// Bind the SAME path to different methods, then call the handler in-process
// (no port bound) and print the body of the real Response.
val app: HttpHandler = routes(
    "/item" bind Method.GET to { _: Request -> Response(Status.OK).body("get") },
    "/item" bind Method.POST to { _: Request -> Response(Status.OK).body("post") }
)

println(app(Request(Method.POST, "/item")).bodyString())
