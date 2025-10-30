package b5;

import android.os.Handler;

/* renamed from: b5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0652o {

    /* renamed from: d, reason: collision with root package name */
    public static volatile T4.d f11249d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0676y0 f11250a;

    /* renamed from: b, reason: collision with root package name */
    public final S5.o f11251b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f11252c;

    public AbstractC0652o(InterfaceC0676y0 interfaceC0676y0) {
        F4.y.h(interfaceC0676y0);
        this.f11250a = interfaceC0676y0;
        this.f11251b = new S5.o(this, interfaceC0676y0, 15, false);
    }

    public final void a() {
        this.f11252c = 0L;
        d().removeCallbacks(this.f11251b);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            InterfaceC0676y0 interfaceC0676y0 = this.f11250a;
            interfaceC0676y0.S().getClass();
            this.f11252c = System.currentTimeMillis();
            if (!d().postDelayed(this.f11251b, j)) {
                interfaceC0676y0.A().f10971f.c(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }

    public final Handler d() {
        T4.d dVar;
        if (f11249d != null) {
            return f11249d;
        }
        synchronized (AbstractC0652o.class) {
            try {
                if (f11249d == null) {
                    f11249d = new T4.d(this.f11250a.G().getMainLooper(), 5);
                }
                dVar = f11249d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
