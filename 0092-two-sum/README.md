# 0092 — Two Sum

Find the two indices in `2, 7, 11, 15` whose values sum to `9` and print them: `0 1`. A `HashMap` maps value to index; looking up `target - nums[i]` finds a previously seen complement in one pass.

## Run

    kotlinc TwoSum.kt -include-runtime -d twosum.jar && java -jar twosum.jar
