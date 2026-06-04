# 0399 — Progress Bar

Render a width-10 progress bar at 40% completion, printing `[####------]`. `String.repeat` builds the filled and empty segments concisely.

## Run

    kotlinc ProgressBar.kt -include-runtime -d progressbar.jar && java -jar progressbar.jar
