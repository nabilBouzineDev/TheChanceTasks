package week_one.ipv4_checker

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInValidFormatIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidEmptySegmentIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidExceedMaxNumberIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidExceedMinNumberIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidLeadingZerosIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidNonNumericValuesIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidWithLessSegmentsIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeInvalidWithMoreSegmentsIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeValidIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeValidWithMaxNumberOnlyIPv4Address
import week_one.ipv4_checker.fakes.FakeDataSource.fakeValidWithMinNumberOnlyIPv4Address

class IPv4CheckerTest {

    @Test
    fun `should return true, when IPv4 address is valid`() {
        val expectedResult = checkIpv4Address(fakeValidIPv4Address)
        assertTrue(expectedResult)
    }

    @Test
    fun `should return true, when IPv4 address contains only min value`() {
        val expectedResult = checkIpv4Address(fakeValidWithMinNumberOnlyIPv4Address)
        assertTrue(expectedResult)
    }

    @Test
    fun `should return true, when IPv4 address contains only max value`() {
        val expectedResult = checkIpv4Address(fakeValidWithMaxNumberOnlyIPv4Address)
        assertTrue(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address segment exceed min value`() {
        val expectedResult = checkIpv4Address(fakeInvalidExceedMinNumberIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address segment exceed max value`() {
        val expectedResult = checkIpv4Address(fakeInvalidExceedMaxNumberIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address is empty`() {
        val expectedResult = checkIpv4Address("")
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address has an empty segment`() {
        val expectedResult = checkIpv4Address(fakeInvalidEmptySegmentIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address is less than four segments`() {
        val expectedResult = checkIpv4Address(fakeInvalidWithLessSegmentsIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address is more than four segments`() {
        val expectedResult = checkIpv4Address(fakeInvalidWithMoreSegmentsIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address has segment with leading zero`() {
        val expectedResult = checkIpv4Address(fakeInvalidLeadingZerosIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address has non numeric values`() {
        val expectedResult = checkIpv4Address(fakeInvalidNonNumericValuesIPv4Address)
        assertFalse(expectedResult)
    }

    @Test
    fun `should return false, when IPv4 address segments not divided by dots`() {
        val expectedResult = checkIpv4Address(fakeInValidFormatIPv4Address)
        assertFalse(expectedResult)
    }

}