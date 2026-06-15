# 0501 — Middleware

Uses the [http4k](https://www.http4k.org/) web framework (server-as-a-function) and its `Filter` middleware to transform the HTTP response. The `GET /` route handler returns the plain body `hello`; a `Filter` wraps the handler and prefixes the response body with `[mw] `, producing `[mw] hello`. The composed handler is invoked directly in-process (`handler(Request(...))`) with no fixed port bound, and the resulting response body is printed.

## Run

    kotlin Middleware.main.kts
