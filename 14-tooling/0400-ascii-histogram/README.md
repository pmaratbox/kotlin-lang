# 0400 — ASCII Histogram

Render a histogram of [3,1,2] as rows of "#" characters, one bar per line. A simple loop with `String.repeat` prints each bar.

## Run

    kotlinc AsciiHistogram.kt -include-runtime -d asciihistogram.jar && java -jar asciihistogram.jar
