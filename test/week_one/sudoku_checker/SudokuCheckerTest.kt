package week_one.sudoku_checker

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import week_one.sudoku_checker.fakes.FakeDataSource.fakeDuplicateInColumnSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeDuplicateInRowSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeDuplicateInSubGridSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeEmptyFullSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeEmptyPartiallySudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeNonAllowedCharsInSudokuPuzzle
import week_one.sudoku_checker.fakes.FakeDataSource.fakeValidSudokuPuzzle

class SudokuCheckerTest {

 @Test
 fun `should return true, when Sudoku puzzle is valid`() {
  val expectedResult = checkSudokuPuzzle(fakeValidSudokuPuzzle)
  assertTrue(expectedResult)
 }

 @Test
 fun `should return true, when Sudoku puzzle is fully empty`() {
  val expectedResult = checkSudokuPuzzle(fakeEmptyFullSudokuPuzzle)
  assertTrue(expectedResult)
 }

 @Test
 fun `should return true, when Sudoku puzzle is partially empty`() {
  val expectedResult = checkSudokuPuzzle(fakeEmptyPartiallySudokuPuzzle)
  assertTrue(expectedResult)
 }

 @Test
 fun `should return false, when Sudoku puzzle has non allowed chars`() {
  val expectedResult = checkSudokuPuzzle(fakeNonAllowedCharsInSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `should return false, when Sudoku puzzle has two or more duplicates in row`() {
  val expectedResult = checkSudokuPuzzle(fakeDuplicateInRowSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `should return false, when Sudoku puzzle has two or more duplicates in column`() {
  val expectedResult = checkSudokuPuzzle(fakeDuplicateInColumnSudokuPuzzle)
  assertFalse(expectedResult)
 }

 @Test
 fun `should return false, when Sudoku puzzle has two or more duplicates in subgrid`() {
  val expectedResult = checkSudokuPuzzle(fakeDuplicateInSubGridSudokuPuzzle)
  assertFalse(expectedResult)
 }

}