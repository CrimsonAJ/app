package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0850n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0862q f14925b;

    public /* synthetic */ RunnableC0850n(C0862q c0862q, int i9) {
        this.f14924a = i9;
        this.f14925b = c0862q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14924a) {
            case 0:
                C0862q c0862q = this.f14925b;
                C0877u c0877u = c0862q.f14956e;
                if (c0877u.f15006b == null) {
                    c0877u.f15006b = t0.D.d(c0877u.f15005a);
                }
                t0.D d9 = c0877u.f15006b;
                if (d9 != null) {
                    d9.h(c0862q);
                    return;
                }
                return;
            default:
                this.f14925b.p();
                return;
        }
    }
}
