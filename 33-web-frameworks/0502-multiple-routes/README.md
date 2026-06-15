# 0502 — Multiple routes

Uses the [http4k](https://www.http4k.org/) web framework, whose "server as a function" model makes an `HttpHandler` just a `(Request) -> Response` function. Two routes are registered with `routes(...)` (`GET /` -> `home`, `GET /about` -> `about`) and exercised in-process by invoking the handler directly (`app(Request(...))`) — no port is bound. Each route's real response body is printed on its own line.

## Run

    kotlin MultipleRoutes.main.kts
