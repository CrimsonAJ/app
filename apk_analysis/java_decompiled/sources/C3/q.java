package C3;

import android.content.ClipData;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ MediaMetricsManager e(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder j() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ ContentInfo.Builder n(ClipData clipData, int i9) {
        return new ContentInfo.Builder(clipData, i9);
    }

    public static /* bridge */ /* synthetic */ ContentInfo p(Object obj) {
        return (ContentInfo) obj;
    }
}
