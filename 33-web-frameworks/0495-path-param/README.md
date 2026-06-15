# 0495 — Path parameter

Uses the [http4k](https://www.http4k.org/) web framework (server-as-a-function) to capture a path parameter. The route template `"/users/{id}"` binds a handler that reads the matched segment with `req.path("id")` and echoes it as the response body. The route is exercised IN-PROCESS by calling the `HttpHandler` directly — `app(Request(Method.GET, "/users/42"))` — so no port is ever bound. Requesting `/users/42` prints `42`.

## Run

    kotlin PathParam.main.kts
