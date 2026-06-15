# 0503 — Method routing

Uses the [http4k](https://www.http4k.org/) web framework ("server as a function") to bind the same path `/item` to two different HTTP methods: `GET` returns `get` and `POST` returns `post`. Because an http4k app is just an `HttpHandler` (a `(Request) -> Response` function), the route is exercised in-process by calling the handler directly with `app(Request(Method.POST, "/item"))` — no port is ever bound. The program prints the `bodyString()` of the real `Response`.

## Run

    kotlin MethodRouting.main.kts
