package week_one.ipv4_checker

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidLeadingZerosIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidNonAllowedCharsIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidNotFourSegemntsIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidOutRangeNumbersIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidtionsIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeValidIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeValidWithMaxNumberOnlyIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeValidWithZeroOnlyIPv4Address

class IPv4CheckerTest {

    @Test
    fun `test success checkIpv4Address, returns True`() {
        val expectedResult = checkIpv4Address(fakeValidIPv4Address)
        assertTrue(expectedResult)
    }

    @Test
    fun `test success checkIpv4Address with zero as a digit, returns True`() {
        val expectedResult = checkIpv4Address(fakeValidWithZeroOnlyIPv4Address)
        assertTrue(expectedResult)
    }

    @Test
    fun `test success checkIpv4Address with 255 the max number, returns True`() {
        val expectedResult = checkIpv4Address(fakeValidWithMaxNumberOnlyIPv4Address)
        assertTrue(expectedResult)
    }

    @Test
    fun `test failure checkIpv4Address with number out of range, returns false`() {
        val expectedResult = checkIpv4Address(fakeInvalidOutRangeNumbersIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `test failure checkIpv4Address with empty input, returns false`() {
        val expectedResult = checkIpv4Address("")
        assertFalse(expectedResult)
    }

    // this test case cover the case of containing only three dots
    @Test
    fun `test failure checkIpv4Address with not four segment, returns false`() {
        val expectedResult = checkIpv4Address(fakeInvalidNotFourSegemntsIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `test failure checkIpv4Address with leading zeros, returns false`() {
        val expectedResult = checkIpv4Address(fakeInvalidLeadingZerosIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `test failure checkIpv4Address with non allowed characters, returns false`() {
        val expectedResult = checkIpv4Address(fakeInvalidNonAllowedCharsIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `test failure checkIpv4Address with non allowed format, returns false`() {
        val expectedResult = checkIpv4Address(fakeInvalidtionsIPv4Address)
        assertFalse(expectedResult)
    }

}