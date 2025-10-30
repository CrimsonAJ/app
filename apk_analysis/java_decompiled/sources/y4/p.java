package y4;

import F4.y;
import android.os.Looper;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f24961i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final b f24962a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24963b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24964c;

    /* renamed from: g, reason: collision with root package name */
    public o f24968g;

    /* renamed from: h, reason: collision with root package name */
    public m5.c f24969h;

    /* renamed from: e, reason: collision with root package name */
    public long f24966e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f24967f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final T4.d f24965d = new T4.d(Looper.getMainLooper(), 4);

    public p(long j, String str) {
        this.f24963b = j;
        this.f24964c = str;
        this.f24962a = new b("RequestTracker", str);
    }

    public final void a(long j, o oVar) {
        o oVar2;
        long j4;
        long j9;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = f24961i;
        synchronized (obj) {
            oVar2 = this.f24968g;
            j4 = this.f24966e;
            j9 = this.f24967f;
            this.f24966e = j;
            this.f24968g = oVar;
            this.f24967f = currentTimeMillis;
        }
        if (oVar2 != null) {
            oVar2.m(this.f24964c, j4, j9, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                m5.c cVar = this.f24969h;
                if (cVar != null) {
                    this.f24965d.removeCallbacks(cVar);
                }
                m5.c cVar2 = new m5.c(8, this);
                this.f24969h = cVar2;
                this.f24965d.postDelayed(cVar2, this.f24963b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j, int i9, d0.w wVar) {
        synchronized (f24961i) {
            try {
                if (c(j)) {
                    Locale locale = Locale.ROOT;
                    e(i9, wVar, "request " + j + " completed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(long j) {
        boolean z9;
        synchronized (f24961i) {
            long j4 = this.f24966e;
            z9 = false;
            if (j4 != -1 && j4 == j) {
                z9 = true;
            }
        }
        return z9;
    }

    public final boolean d() {
        boolean z9;
        synchronized (f24961i) {
            if (this.f24966e != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void e(int i9, d0.w wVar, String str) {
        this.f24962a.b(str, new Object[0]);
        Object obj = f24961i;
        synchronized (obj) {
            try {
                if (this.f24968g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    o oVar = this.f24968g;
                    y.h(oVar);
                    oVar.h(this.f24964c, this.f24966e, i9, wVar, this.f24967f, currentTimeMillis);
                }
                this.f24966e = -1L;
                this.f24968g = null;
                synchronized (obj) {
                    m5.c cVar = this.f24969h;
                    if (cVar != null) {
                        this.f24965d.removeCallbacks(cVar);
                        this.f24969h = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public final boolean f(int i9) {
        synchronized (f24961i) {
            try {
                if (d()) {
                    Locale locale = Locale.ROOT;
                    e(i9, null, "clearing request " + this.f24966e);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
