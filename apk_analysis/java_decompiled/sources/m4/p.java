package m4;

import android.view.Surface;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(Surface surface, float f9) {
        int i9;
        if (f9 == 0.0f) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        try {
            surface.setFrameRate(f9, i9);
        } catch (IllegalStateException e8) {
            AbstractC1566a.u("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e8);
        }
    }
}
