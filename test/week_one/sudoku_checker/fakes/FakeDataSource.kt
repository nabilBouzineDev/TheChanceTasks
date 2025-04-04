package week_one.sudoku_checker.fakes

object FakeDataSource {

    val fakeValidSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
        charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
        charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
        charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
        charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
        charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
        charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
    )

    val fakeEmptyFullSudokuPuzzle = arrayOf(
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
    )

    val fakeEmptyPartiallySudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )

    val fakeNonAllowedCharsInSudokuPuzzle = arrayOf(
        charArrayOf('@', '3', '-', '-', '7', '-', '-', '-', '-'), // invalid character in this row '@'
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '0', '-'), // invalid char in this row '0'
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    val fakeDuplicateInRowSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '5', '-', '-'), // invalid in first row with two 5s
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )

    val fakeDuplicateInColumnSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '4', '-', '-'),  // invalid in the second column with two 9s
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '9', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )

    val fakeDuplicateInSubGridSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '4', '-', '-'), // invalid in the first subgrid with two 5s
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '5', '8', '-', '-', '-', '-', '6', '-'),
        charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        charArrayOf('-', '9', '-', '-', '-', '-', '2', '8', '-'),
        charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
}