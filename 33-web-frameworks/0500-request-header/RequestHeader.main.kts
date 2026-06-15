@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

val app: HttpHandler = routes(
    "/whoami" bind Method.GET to { req: Request -> Response(Status.OK).body(req.header("X-Name") ?: "") }
)

// Invoke the handler IN-PROCESS: build a request carrying the X-Name header
// and call the app function directly (no fixed port, no listening server).
println(app(Request(Method.GET, "/whoami").header("X-Name", "alice")).bodyString())
