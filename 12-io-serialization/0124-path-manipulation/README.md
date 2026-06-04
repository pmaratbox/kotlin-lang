# 0124 — Path Manipulation

Join "/tmp" and "file.txt", then take the basename and extension, printing `/tmp/file.txt file.txt .txt`. A `File` joins the segments while `substringAfterLast` extracts the basename and extension.

## Run

    kotlinc Manipulation.kt -include-runtime -d manipulation.jar && java -jar manipulation.jar
