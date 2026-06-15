@file:DependsOn("org.http4k:http4k-core:5.32.0.0")

import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

val app: HttpHandler = routes(
    "/" bind Method.GET to { _: Request -> Response(Status.OK).body("hello") }
)

println(app(Request(Method.GET, "/")).bodyString())
