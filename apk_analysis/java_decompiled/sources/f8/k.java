package f8;

import d8.AbstractC1130a;
import d8.w;
import e1.q;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17474a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f17475b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f17476c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f17477d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f17478e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f17479f;

    /* renamed from: g, reason: collision with root package name */
    public static final q f17480g;

    /* renamed from: h, reason: collision with root package name */
    public static final q f17481h;

    static {
        String str;
        int i9 = w.f17009a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f17474a = str;
        f17475b = AbstractC1130a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = w.f17009a;
        if (i10 < 2) {
            i10 = 2;
        }
        f17476c = AbstractC1130a.k("kotlinx.coroutines.scheduler.core.pool.size", i10, 8);
        f17477d = AbstractC1130a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f17478e = TimeUnit.SECONDS.toNanos(AbstractC1130a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f17479f = g.f17469a;
        f17480g = new q(0);
        f17481h = new q(1);
    }
}
