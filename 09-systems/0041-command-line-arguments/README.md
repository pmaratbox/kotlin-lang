# 0041 — Command-line Arguments

Read the first command-line argument and greet it, so running with `Ada` prints `hello, Ada`. `main(args: Array<String>)` receives the arguments (without the program name), so `args[0]` is the first. Declaring the parameter is optional; here it is needed to read it.

## Run

    kotlinc CommandLineArgs.kt -include-runtime -d args.jar && java -jar args.jar Ada
