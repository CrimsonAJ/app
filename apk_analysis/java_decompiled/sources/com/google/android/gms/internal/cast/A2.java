package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class A2 extends AbstractC0849m2 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f14685k;

    public A2(Runnable runnable) {
        super(11);
        runnable.getClass();
        this.f14685k = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14685k.run();
        } catch (Throwable th) {
            if (AbstractC0868r2.j.r(this, null, new C0841k2(th))) {
                AbstractC0849m2.z(this);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC0849m2
    public final String v() {
        return A0.a.n("task=[", this.f14685k.toString(), "]");
    }
}
