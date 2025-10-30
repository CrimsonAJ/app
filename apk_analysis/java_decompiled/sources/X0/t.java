package X0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f8225a;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 28) {
            z9 = true;
        } else {
            z9 = false;
        }
        f8225a = z9;
    }
}
