package com.adobe.phonegap.push

import android.media.RingtoneManager
import android.content.Context
import android.media.Ringtone

object RingtonePlayer {
    private var ringtone: Ringtone? = null

    fun play(context: Context) {
        if (ringtone == null) {
            val ringtoneUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
            ringtone = RingtoneManager.getRingtone(context.applicationContext, ringtoneUri)
        }
        if (!ringtone?.isPlaying!!) {
            ringtone?.play()
        }
    }

    fun stop() {
        if (ringtone?.isPlaying == true) {
            ringtone?.stop()
        }
        ringtone = null
    }
}
