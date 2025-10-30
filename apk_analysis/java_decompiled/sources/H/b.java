package H;

import android.graphics.Insets;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class b {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static Insets b(int i9, int i10, int i11, int i12) {
        return Insets.of(i9, i10, i11, i12);
    }
}
