@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

val app: HttpHandler = routes(
    "/create" bind Method.POST to { _: Request -> Response(Status.CREATED) }
)
println(app(Request(Method.POST, "/create")).status.code)
