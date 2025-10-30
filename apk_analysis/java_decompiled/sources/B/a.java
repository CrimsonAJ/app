package B;

import android.media.MediaCodecInfo;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(int i9, int i10, int i11) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i9, i10, i11);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void m() {
    }
}
