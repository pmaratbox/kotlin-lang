# 0493 — Hello route

http4k follows the "server as a function" model: an `HttpHandler` is just `(Request) -> Response`. We define a `GET /` route with `routes(...)` that returns the text `hello`, then exercise it in-process by calling the handler directly as a function (`app(Request(...))`) — no server is bound to any port. The response body is printed.

## Run

    kotlin HelloRoute.main.kts
