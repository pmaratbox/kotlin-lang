# 0376 — Feature Flag

Branch on a boolean feature flag: on -> "enabled", off -> "disabled", printing `enabled disabled`. An `if` expression returns the label for each flag value.

## Run

    kotlinc FeatureFlag.kt -include-runtime -d featureflag.jar && java -jar featureflag.jar
