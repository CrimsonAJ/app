package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class G {
    public static void a(q qVar, Object obj) {
        z zVar;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        D d9 = (D) qVar;
        if (audioDeviceInfo == null) {
            zVar = null;
        } else {
            d9.getClass();
            zVar = new z(audioDeviceInfo);
        }
        d9.Y = zVar;
        AudioTrack audioTrack = d9.f20288u;
        if (audioTrack != null) {
            x.a(audioTrack, zVar);
        }
    }
}
