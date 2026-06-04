# 0212 — Template Method

Run an algorithm skeleton whose middle step is overridden, printing `start work end` on one line. An abstract base fixes `run()` while subclasses supply the abstract `step()`.

## Run

    kotlinc TemplateMethod.kt -include-runtime -d templatemethod.jar && java -jar templatemethod.jar
