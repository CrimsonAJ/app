package b5;

import android.os.Looper;
import android.os.SystemClock;
import o1.C1671f;

/* loaded from: classes.dex */
public final class t1 extends B {

    /* renamed from: c, reason: collision with root package name */
    public T4.d f11316c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11317d;

    /* renamed from: e, reason: collision with root package name */
    public final C1671f f11318e;

    /* renamed from: f, reason: collision with root package name */
    public final N3.X f11319f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.c f11320g;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, N3.X] */
    public t1(C0650n0 c0650n0) {
        super(c0650n0);
        this.f11317d = true;
        this.f11318e = new C1671f(28, this);
        ?? obj = new Object();
        obj.f5024d = this;
        obj.f5023c = new s1(obj, (C0650n0) this.f1707a, 0);
        ((C0650n0) this.f1707a).f11233n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        obj.f5021a = elapsedRealtime;
        obj.f5022b = elapsedRealtime;
        this.f11319f = obj;
        this.f11320g = new O0.c(14, this);
    }

    @Override // b5.B
    public final boolean o0() {
        return false;
    }

    public final void p0() {
        l0();
        if (this.f11316c == null) {
            this.f11316c = new T4.d(Looper.getMainLooper(), 5);
        }
    }
}
