# 0324 — Either Monad

Chain Either computations: a successful divide chain yields 2, and a divide-by-zero yields an error, printing `2 err`. A sealed `Either` with `bind` short-circuits on the first `Left`.

## Run

    kotlinc EitherMonad.kt -include-runtime -d eithermonad.jar && java -jar eithermonad.jar
