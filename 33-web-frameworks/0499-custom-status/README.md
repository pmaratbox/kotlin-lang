# 0499 — Custom status

Returns a custom HTTP status code with [http4k](https://www.http4k.org/), the
server-as-a-function Kotlin framework. The route `POST /create` responds with
`Response(Status.CREATED)`, the 201 status. Because an http4k `HttpHandler` is
just a `(Request) -> Response` function, the route is exercised in-process by
calling the handler directly — no fixed port is bound. The printed value is the
real `status.code` read off the framework's `Response` (`201`).

## Run

    kotlin CustomStatus.main.kts
