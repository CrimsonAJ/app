package t1;

import android.content.Context;
import com.google.android.gms.internal.measurement.D1;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1992a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1992a f23056a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static C2004m f23057b;

    public static final C2004m a(Context context) {
        C2004m c2004m = f23057b;
        if (c2004m == null) {
            synchronized (f23056a) {
                C2004m c2004m2 = f23057b;
                if (c2004m2 != null) {
                    return c2004m2;
                }
                context.getApplicationContext();
                C2004m k5 = D1.k(context);
                f23057b = k5;
                return k5;
            }
        }
        return c2004m;
    }
}
