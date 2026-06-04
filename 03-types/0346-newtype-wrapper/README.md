# 0346 — Newtype Wrapper

Wrap raw integers in distinct UserId and ProductId types so they cannot be confused, printing `user-1 prod-2`. A `@JvmInline value class` gives each a zero-overhead distinct type with its own `toString`.

## Run

    kotlinc NewtypeWrapper.kt -include-runtime -d newtypewrapper.jar && java -jar newtypewrapper.jar
