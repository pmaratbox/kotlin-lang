# 0282 — Boyer-Moore Search

Use the bad-character rule to find "abc" in "zzabc", printing the index `2`. A `HashMap<Char, Int>` stores each character's last position for the shift.

## Run

    kotlinc BoyerMooreSearch.kt -include-runtime -d boyermooresearch.jar && java -jar boyermooresearch.jar
