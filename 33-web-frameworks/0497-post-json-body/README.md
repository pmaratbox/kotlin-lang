# 0497 — POST JSON body

Uses the [http4k](https://www.http4k.org/) framework (server-as-a-function) to handle `POST /sum`. The handler reads the request's JSON body `{"a":2,"b":3}`, parses the two fields, and returns their sum. The route is exercised in-process by invoking the `HttpHandler` directly — `app(Request(...))` — so no port is bound and no startup/request logging leaks into stdout. The program prints the response body: `5`.

## Run

    kotlin PostJsonBody.main.kts
