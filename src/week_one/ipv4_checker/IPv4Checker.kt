package week_one.ipv4_checker

/**
 * A valid IPv4 address must follow these conditions:
 * 1. Consist of four numeric segments separated by dots (.).
 * 2. Contains exactly three dots
 * 3. Each segments must be a number from 0 to 255 inclusive.
 * 4. No leading zeros unless if it's within the segment as a digit.
 * 5. No extra characters.
 *
 * @param: ipAddress the string to check
 * @return true if it's a valid IPv4 ipAddress, false otherwise.
 */
fun checkIpv4Address(ipAddress: String): Boolean {
    if (ipAddress.isEmpty()) {
        return false
    }
    val segments = ipAddress.split(".")
    if (segments.size != 4) {
        return false
    }
    if (!hasValidSegments(segments)) {
        return false
    }
    return true
}

private fun hasValidSegments(segments: List<String>): Boolean {
    for (segment in segments) {
        if (segment.isEmpty()) return false
        if (segment.length > 1 && segment.startsWith('0')) return false
        if (!isValidNumericSegment(segment)) return false
    }
    return true
}

fun isValidNumericSegment(segment: String): Boolean {
    return try {
        val numericSegment = segment.toInt()
        if (numericSegment !in 0..255) return false
        true
    } catch (e: NumberFormatException) {
        // if conversion failed then it includes non-numeric values and should be false
        false
    }
}

fun main() {
    println(checkIpv4Address("193;168;1;34"))
}