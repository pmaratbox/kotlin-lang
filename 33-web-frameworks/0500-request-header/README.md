# 0500 — Request header

Reads a request header with [http4k](https://www.http4k.org/), the
server-as-a-function Kotlin web framework. The route `GET /whoami` is an
`HttpHandler` that pulls `req.header("X-Name")` and echoes it back as the
response body. Because an http4k app is just a `Request -> Response` function,
the route is exercised IN-PROCESS by calling `app(...)` directly with a
`Request` that carries the `X-Name: alice` header — no fixed port, no listening
server, and no framework logging to silence. The printed value comes from the
actual response body, which is `alice`.

## Run

    kotlin RequestHeader.main.kts
