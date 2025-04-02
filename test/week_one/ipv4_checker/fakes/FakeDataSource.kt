package week_one.ipv4_checker.fakes

object FakeDataSource {

    val fakeValidIPv4Address = "192.168.1.1"
    val fakeValidWithZeroOnlyIPv4Address = "0.0.0.0"
    val fakeValidWithMaxNumberOnlyIPv4Address = "255.255.255.255"

    val fakeInvalidOutRangeNumbersIPv4Address = "192.300.1.-1"
    val fakeInvalidNotFourSegemntsIPv4Address = "193.255.1"
    val fakeInvalidLeadingZerosIPv4Address = "093.255.01.12"
    val fakeInvalidNonAllowedCharsIPv4Address = "1f3.43D.-@1.12"

    val fakeInvalidtionsIPv4Address = "f3e.43D.-@1.02.130"
}