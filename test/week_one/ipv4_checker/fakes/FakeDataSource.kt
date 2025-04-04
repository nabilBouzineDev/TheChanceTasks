package week_one.ipv4_checker.fakes

object FakeDataSource {

    val fakeValidIPv4Address = "192.168.1.1"
    val fakeValidWithMinNumberOnlyIPv4Address = "0.0.0.0"
    val fakeValidWithMaxNumberOnlyIPv4Address = "255.255.255.255"

    val fakeInvalidExceedMaxNumberIPv4Address = "192.256.1.1"
    val fakeInvalidExceedMinNumberIPv4Address = "192.255.-1.1"
    val fakeInvalidWithLessSegmentsIPv4Address = "193.255.1"
    val fakeInvalidWithMoreSegmentsIPv4Address = "192.168.1.1.8"
    val fakeInvalidLeadingZerosIPv4Address = "093.255.01.12"
    val fakeInvalidNonNumericValuesIPv4Address = "1f3.13D.1.12"
    val fakeInvalidEmptySegmentIPv4Address = "163..1.12"
    val fakeInValidFormatIPv4Address = "192,168;1;1"
}