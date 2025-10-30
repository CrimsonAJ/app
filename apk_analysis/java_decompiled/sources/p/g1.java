package p;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21992a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f21993b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f21994c;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 27) {
            z9 = true;
        } else {
            z9 = false;
        }
        f21994c = z9;
    }
}
