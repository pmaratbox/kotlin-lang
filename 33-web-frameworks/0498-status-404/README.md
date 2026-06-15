# 0498 — 404 status

http4k follows the "server as a function" model: an `HttpHandler` is just `(Request) -> Response`. We define only a `GET /` route with `routes(...)`; any request to an undefined path falls through the router, which produces a `404 Not Found` response. We exercise this in-process by calling the handler directly as a function (`app(Request(Method.GET, "/missing"))`) — no server is bound to any port — and print the real response status code from the framework.

## Run

    kotlin StatusNotFound.main.kts
