@file:DependsOn("org.http4k:http4k-core:5.32.0.0")
import org.http4k.core.*
import org.http4k.routing.bind
import org.http4k.routing.routes

// Tiny parser for the flat JSON object {"a":2,"b":3} (avoids extra deps).
fun parseField(json: String, key: String): Int =
    Regex("\"$key\"\\s*:\\s*(-?\\d+)").find(json)!!.groupValues[1].toInt()

val app: HttpHandler = routes(
    "/sum" bind Method.POST to { req: Request ->
        val body = req.bodyString()
        val sum = parseField(body, "a") + parseField(body, "b")
        Response(Status.OK).body(sum.toString())
    }
)

// Exercise the route in-process: call the HttpHandler directly (no port bound).
val response = app(Request(Method.POST, "/sum").body("""{"a":2,"b":3}"""))
println(response.bodyString())
