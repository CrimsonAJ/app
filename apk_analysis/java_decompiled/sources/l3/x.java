package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class x {
    public static void a(AudioTrack audioTrack, z zVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zVar.f20472a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
