fun main() {
    val grid = arrayOf(
        booleanArrayOf(false, true, false),
        booleanArrayOf(false, true, false),
        booleanArrayOf(false, true, false),
    )
    val next = Array(3) { BooleanArray(3) }
    for (r in 0..2) {
        for (c in 0..2) {
            var live = 0
            for (dr in -1..1) {
                for (dc in -1..1) {
                    if (dr == 0 && dc == 0) continue
                    val nr = r + dr
                    val nc = c + dc
                    if (nr in 0..2 && nc in 0..2 && grid[nr][nc]) live++
                }
            }
            next[r][c] = if (grid[r][c]) live == 2 || live == 3 else live == 3
        }
    }
    for (row in next) {
        println(row.joinToString("") { if (it) "#" else "." })
    }
}
