# 0494 — JSON response

Returns a JSON body with [http4k](https://www.http4k.org/), the
server-as-a-function framework where an `HttpHandler` is just a
`(Request) -> Response`. The `/user` route sets a `Content-Type:
application/json` header and a compact JSON body `{"name":"alice"}`. Because the
handler is a plain function, the route is exercised in-process by calling
`app(Request(...))` directly — no port is bound — and the resulting
`Response.bodyString()` is printed.

## Run

    kotlin JsonResponse.main.kts
