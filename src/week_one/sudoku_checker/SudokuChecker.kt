package week_one.sudoku_checker

/**
 * A valid sudoku puzzle must follow these conditions:
 * 1. No repeating values in the row.
 * 2. No repeating values in the column.
 * 3. No repeating values in subgrid of 3x3.
 * 4. Only numbers from 1 to 9 are allowed and '-' for empty cell.
 *
 * Otherwise, it's invalid.
 */
fun checkSudokuPuzzle(puzzle: Array<CharArray>): Boolean {

    val validChars = listOf('1', '2', '3', '4', '5', '6', '7', '8', '9')

    if (!containsOnlyValidChars(puzzle, validChars)) {
        return false
    }

    if (!hasValidRows(puzzle)) {
        return false
    }

    if (!hasValidColumns(puzzle)) {
        return false
    }

    if (!hasValidSubgrids(puzzle)) {
        return false
    }

    return true
}

private fun hasValidSubgrids(puzzle: Array<CharArray>): Boolean {
    var rowIndex = 0
    while (rowIndex < puzzle.size) {
        var colIndex = 0
        while (colIndex < puzzle.size) {
            val see = mutableListOf<Char>()
            // process a single subgrid
            for (i in rowIndex until rowIndex + 3) {
                for (j in colIndex until colIndex + 3) {
                    val char = puzzle[i][j]
                    if (char == '-') continue
                    if (char in see) return false
                    see.add(char)
                }
            }
            colIndex += 3
        }
        rowIndex += 3
    }

    return true
}

private fun hasValidColumns(puzzle: Array<CharArray>): Boolean {
    for (i in puzzle.indices) {
        val see = mutableListOf<Char>()
        for (j in puzzle.indices) {
            val char = puzzle[j][i]
            if (char == '-') continue
            if (char in see) return false
            see.add(char)
        }
    }
    return true
}

private fun hasValidRows(puzzle: Array<CharArray>): Boolean {
    for (row in puzzle) {
        val see = mutableListOf<Char>()
        for (char in row) {
            if (char == '-') continue
            if (char in see) return false
            see.add(char)
        }
    }
    return true
}

private fun containsOnlyValidChars(puzzle: Array<CharArray>, validChars: List<Char>): Boolean {
    for (row in puzzle) {
        for (char in row) {
            if (char != '-' && char !in validChars) {
                return false
            }
        }
    }
    return true
}