package T4;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7208a;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 31) {
            i9 = 33554432;
        } else {
            i9 = 0;
        }
        f7208a = i9;
    }
}
