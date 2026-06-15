# 0473 — Multiple values

Collect a repeated option into a list using the real `clikt` library: declaring `option("--num").int().multiple()` lets `--num` appear any number of times, gathering every occurrence into a `List<Int>`. The program parses a fixed hardcoded argv (`["--num","1","--num","2","--num","3"]`) instead of the real process arguments so the output is deterministic, then sums the collected values and prints `6`.

## Run

    kotlin MultipleValues.main.kts
