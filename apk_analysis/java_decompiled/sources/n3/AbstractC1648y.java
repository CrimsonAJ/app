package n3;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import k3.AbstractC1493i;

/* renamed from: n3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1648y {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, k3.l lVar) {
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        LogSessionId unused;
        k3.k kVar = lVar.f19980a;
        kVar.getClass();
        LogSessionId logSessionId = kVar.f19979a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            AbstractC1493i.d(playbackComponent).setLogSessionId(logSessionId);
        }
    }
}
