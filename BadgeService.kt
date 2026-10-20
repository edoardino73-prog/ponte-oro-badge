
package it.pontedoro.hce
import android.nfc.cardemulation.HostApduService
import android.os.Bundle
class BadgeService : HostApduService() {
    override fun processCommandApdu(apdu: ByteArray?, extras: Bundle?): ByteArray {
        val id = BuildConfig.BADGE_ID
        return id.toByteArray(Charsets.UTF_8) + byteArrayOf(0x90.toByte(), 0x00.toByte())
    }
    override fun onDeactivated(reason: Int) {}
}
