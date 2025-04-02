package week_one.sudoku_checker.fakes

object FakeDataSource {

    val fakeValidSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
    )

    val fakeEmptyFullyInvValidSudokuPuzzle = arrayOf(
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
    )

    val fakeEmptyPartiallyInvValidSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
    )

    val fakeInvalidRowSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '4', '9', '1', '2'), // invalid in first row with two 4s
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
    )

    val fakeInvalidColumnSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'), // invalid in the second column with two 7s
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('1', '7', '8', '3', '4', '2', '5', '6', '7'),
    )

    val fakeInvalidSubGridSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'), // invalid in the first subgrid with two 5s and 4s
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('4', '9', '5', '3', '4', '2', '5', '6', '7'),
    )

    val fakeInvalidationsSudokuPuzzle = arrayOf(
        charArrayOf('5', '3', '4', '6', '7', '4', '9', '1', '2'), // All the above invalidation.
        charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
        charArrayOf('4', '7', '5', '3', '4', '2', '5', '6', '7'),
    )
}