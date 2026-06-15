# 0504 — Error handler

http4k follows the "server as a function" model: an `HttpHandler` is just `(Request) -> Response`. The `/boom` route's handler throws a real `RuntimeException`; we wrap the router with `ServerFilters.CatchAll()`, http4k's built-in error-handling filter, which catches any exception that bubbles out of a handler and turns it into a real `500 Internal Server Error` response. We exercise the route in-process by calling the handler directly as a function (`app(Request(Method.GET, "/boom"))`) — no server is bound to any port — and print the real response status code produced by the framework.

## Run

    kotlin ErrorHandler.main.kts
