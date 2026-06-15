@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.path
import org.http4k.routing.routes

// `{id}` in the template is captured; req.path("id") reads the matched segment.
val app: HttpHandler = routes(
    "/users/{id}" bind Method.GET to { req: Request ->
        Response(Status.OK).body(req.path("id") ?: "")
    }
)

// In-process: call the HttpHandler directly, no port bound.
println(app(Request(Method.GET, "/users/42")).bodyString())
