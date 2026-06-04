# 0228 — Parse Quoted CSV

Parse the CSV row `a,"b,c",d`, respecting the quoted comma, into three fields joined by pipes `a|b,c|d`. A `when` over each character toggles an in-quotes flag so commas inside quotes are kept.

## Run

    kotlinc CsvQuotedParse.kt -include-runtime -d csvquotedparse.jar && java -jar csvquotedparse.jar
