package l3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class y {
    public static void a(AudioTrack audioTrack, k3.l lVar) {
        boolean equals;
        LogSessionId unused;
        k3.k kVar = lVar.f19980a;
        kVar.getClass();
        LogSessionId logSessionId = kVar.f19979a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId);
        }
    }
}
