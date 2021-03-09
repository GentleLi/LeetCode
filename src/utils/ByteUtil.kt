package utils

object ByteUtil {

    fun hex2String(b: Byte): String {
        val toInt = b.toInt()
        val toHexString = Integer.toHexString(toInt)
        if (toHexString.length < 2) {
            return "0$toHexString"
        }
        return toHexString
    }

}