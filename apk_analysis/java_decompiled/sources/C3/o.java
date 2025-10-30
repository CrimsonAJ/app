package C3;

import android.media.MediaCodecInfo;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d9) {
        List supportedPerformancePoints;
        boolean covers;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        B.a.m();
        MediaCodecInfo.VideoCapabilities.PerformancePoint d10 = B.a.d(i9, i10, (int) d9);
        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
            covers = B.a.e(supportedPerformancePoints.get(i11)).covers(d10);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
