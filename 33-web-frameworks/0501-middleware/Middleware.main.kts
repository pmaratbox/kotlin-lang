@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

// Route handler returns the plain body — the prefix is NOT added here.
val app: HttpHandler = routes(
    "/" bind Method.GET to { _: Request -> Response(Status.OK).body("hello") }
)

// Middleware (http4k Filter): runs the inner handler, then transforms the response
// by prefixing its body with "[mw] ".
val withPrefix: Filter = Filter { next ->
    { request ->
        val response = next(request)
        response.body("[mw] " + response.bodyString())
    }
}

// Compose filter + app, then call it directly in-process (no port bound).
val handler: HttpHandler = withPrefix.then(app)
println(handler(Request(Method.GET, "/")).bodyString())
