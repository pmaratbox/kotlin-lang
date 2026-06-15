@file:DependsOn("org.http4k:http4k-core:5.32.0.0")

import org.http4k.core.*
import org.http4k.filter.ServerFilters
import org.http4k.routing.bind
import org.http4k.routing.routes

// A route whose handler throws a real exception.
val routesApp: HttpHandler = routes(
    "/boom" bind Method.GET to { _: Request -> throw RuntimeException("kaboom") }
)

// ServerFilters.CatchAll is http4k's error handler: it catches any thrown
// exception bubbling out of the handler and converts it into a 500 response.
val app: HttpHandler = ServerFilters.CatchAll().then(routesApp)

// Exercise the failing route in-process by calling the handler directly as a
// function (no port is bound); the framework turns the thrown error into 500.
println(app(Request(Method.GET, "/boom")).status.code)
