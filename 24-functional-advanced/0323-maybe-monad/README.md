# 0323 — Maybe Monad

Chain Maybe operations: Some(2) then +3 then *2 gives 10, and a None chain yields the fallback, printing `10 none`. A sealed class with `bind` models the monad over Some/None.

## Run

    kotlinc MaybeMonad.kt -include-runtime -d maybemonad.jar && java -jar maybemonad.jar
