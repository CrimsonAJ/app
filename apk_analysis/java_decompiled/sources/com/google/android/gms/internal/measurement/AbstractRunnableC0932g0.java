package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.measurement.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0932g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f15488a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15489b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f15491d;

    public AbstractRunnableC0932g0(C0952k0 c0952k0, boolean z9) {
        this.f15491d = c0952k0;
        c0952k0.f15514b.getClass();
        this.f15488a = System.currentTimeMillis();
        c0952k0.f15514b.getClass();
        this.f15489b = SystemClock.elapsedRealtime();
        this.f15490c = z9;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0952k0 c0952k0 = this.f15491d;
        if (c0952k0.f15519g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e8) {
            c0952k0.a(e8, false, this.f15490c);
            b();
        }
    }
}
