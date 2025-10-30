package C3;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class r {
    public static void a(k kVar, k3.l lVar) {
        boolean equals;
        String stringId;
        LogSessionId unused;
        k3.k kVar2 = lVar.f19980a;
        kVar2.getClass();
        LogSessionId logSessionId = kVar2.f19979a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (!equals) {
            MediaFormat mediaFormat = kVar.f1474b;
            stringId = logSessionId.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
