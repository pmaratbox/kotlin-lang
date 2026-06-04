# 0208 — Virtual Proxy

Use a lazy virtual proxy that loads the real subject only on first access, printing `loaded`. A nullable backing field plus the Elvis operator defers creation until the first `request()`.

## Run

    kotlinc Proxy.kt -include-runtime -d proxy.jar && java -jar proxy.jar
