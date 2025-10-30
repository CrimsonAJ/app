package j3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import k3.C1489e;
import k3.C1494j;
import l4.AbstractC1566a;

/* renamed from: j3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1472x {
    public static k3.l a(Context context, C1441D c1441d, boolean z9) {
        PlaybackSession createPlaybackSession;
        C1494j c1494j;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager e8 = C3.q.e(context.getSystemService("media_metrics"));
        if (e8 != null) {
            createPlaybackSession = e8.createPlaybackSession();
            c1494j = new C1494j(context, createPlaybackSession);
        } else {
            c1494j = null;
        }
        if (c1494j == null) {
            AbstractC1566a.P("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new k3.l(logSessionId);
        }
        if (z9) {
            c1441d.getClass();
            C1489e c1489e = c1441d.f19283r;
            c1489e.getClass();
            c1489e.f19933f.a(c1494j);
        }
        sessionId = c1494j.f19955c.getSessionId();
        return new k3.l(sessionId);
    }
}
