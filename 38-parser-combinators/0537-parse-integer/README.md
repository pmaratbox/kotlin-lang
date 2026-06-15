# 0537 — Parse an integer

Using the **jparsec** parser-combinator library, we build a parser from the `Scanners.INTEGER` scanner, which matches a run of digits, and chain the `.map` combinator to convert the matched text into an `Int`. Calling `.parse("42")` runs the combinator parser over the fixed input and yields `42`.

## Run

    kotlin ParseInteger.main.kts
