# 0496 — Query parameter

Reads a query-string parameter with [http4k](https://www.http4k.org/), the
server-as-a-function Kotlin framework where an `HttpHandler` is just a
`(Request) -> Response`. The `/greet` route pulls `name` off the request with
`req.query("name")` and returns `hello ` + that value. The route is exercised
in-process by calling the handler directly — `app(Request(...).query("name",
"alice"))` — with no server bound to any port, so nothing is logged and only the
response body is printed: `hello alice`.

## Run

    kotlin QueryParam.main.kts
