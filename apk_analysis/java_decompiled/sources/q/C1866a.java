package q;

import C0.e;
import android.os.Looper;
import s8.n;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866a extends n {

    /* renamed from: n, reason: collision with root package name */
    public static volatile C1866a f22226n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f22227o = new e(1);

    /* renamed from: m, reason: collision with root package name */
    public final C1868c f22228m = new C1868c();

    public static C1866a f0() {
        if (f22226n != null) {
            return f22226n;
        }
        synchronized (C1866a.class) {
            try {
                if (f22226n == null) {
                    f22226n = new C1866a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f22226n;
    }

    public final void g0(Runnable runnable) {
        C1868c c1868c = this.f22228m;
        if (c1868c.f22233o == null) {
            synchronized (c1868c.f22231m) {
                try {
                    if (c1868c.f22233o == null) {
                        c1868c.f22233o = C1868c.f0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c1868c.f22233o.post(runnable);
    }
}
