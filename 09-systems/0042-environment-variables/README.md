# 0042 — Environment Variables

Read the environment variable `LESSON_ENV_VAR`, falling back to `default` when it is unset, and print `value: default`. `System.getenv(name)` returns a nullable `String?`, and the Elvis operator `?:` provides the default when it is `null`. This calls straight through to the JVM.

## Run

    kotlinc EnvVars.kt -include-runtime -d env.jar && java -jar env.jar
