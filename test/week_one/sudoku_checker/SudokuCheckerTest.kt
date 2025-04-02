package week_one.sudoku_checker

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import week_one.sudoku_checker.fakes.FakeDataSource.fakeEmptyFullyInvValidSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeEmptyPartiallyInvValidSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeInvalidColumnSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeInvalidRowSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeInvalidSubGridSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeInvalidationsSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeValidSudokuPuzzle

class SudokuCheckerTest {

 @Test
 fun `test success checkSudokuPuzzle, returns true`() {
  val expectedResult = checkSudokuPuzzle(fakeValidSudokuPuzzle)
  assertTrue(expectedResult)
 }

 @Test
 fun `test failure checkSudokuPuzzle fully empty puzzle, returns false`() {
  val expectedResult = checkSudokuPuzzle(fakeEmptyFullyInvValidSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `test failure checkSudokuPuzzle partially empty puzzle, returns false`() {
  val expectedResult = checkSudokuPuzzle(fakeEmptyPartiallyInvValidSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `test failure checkSudokuPuzzle with repeated row, returns false`() {
  val expectedResult = checkSudokuPuzzle(fakeInvalidRowSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `test failure checkSudokuPuzzle with repeated column, returns false`() {
  val expectedResult = checkSudokuPuzzle(fakeInvalidColumnSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `test failure checkSudokuPuzzle with repeated subgrid, returns false`() {
  val expectedResult = checkSudokuPuzzle(fakeInvalidSubGridSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `test failure checkSudokuPuzzle with multiple invalidations, returns false`() {
  val expectedResult = checkSudokuPuzzle(fakeInvalidationsSudokuPuzzle)
  assertFalse(expectedResult)
 }

}