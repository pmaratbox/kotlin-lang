# 0223 — RPN Evaluator

Evaluate the postfix expression "3 4 + 5 *" and print `35`. A stack machine pushes numbers and folds operators by popping two operands.

## Run

    kotlinc RpnEval.kt -include-runtime -d rpneval.jar && java -jar rpneval.jar
