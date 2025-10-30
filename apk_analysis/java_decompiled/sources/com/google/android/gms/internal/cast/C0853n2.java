package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.cast.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853n2 extends J {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14927d = AtomicReferenceFieldUpdater.newUpdater(C0865q2.class, Thread.class, "a");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14928e = AtomicReferenceFieldUpdater.newUpdater(C0865q2.class, C0865q2.class, "b");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14929f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0868r2.class, C0865q2.class, "f");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14930g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0868r2.class, C0845l2.class, "e");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14931h = AtomicReferenceFieldUpdater.newUpdater(AbstractC0868r2.class, Object.class, "d");

    @Override // com.google.android.gms.internal.cast.J
    public final C0845l2 d(AbstractC0849m2 abstractC0849m2) {
        return (C0845l2) f14930g.getAndSet(abstractC0849m2, C0845l2.f14910d);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final C0865q2 k(AbstractC0849m2 abstractC0849m2) {
        return (C0865q2) f14929f.getAndSet(abstractC0849m2, C0865q2.f14957c);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final void m(C0865q2 c0865q2, C0865q2 c0865q22) {
        f14928e.lazySet(c0865q2, c0865q22);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final void o(C0865q2 c0865q2, Thread thread) {
        f14927d.lazySet(c0865q2, thread);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean q(AbstractC0849m2 abstractC0849m2, C0845l2 c0845l2, C0845l2 c0845l22) {
        return J.j(f14930g, abstractC0849m2, c0845l2, c0845l22);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean r(AbstractC0868r2 abstractC0868r2, Object obj, Object obj2) {
        return J.j(f14931h, abstractC0868r2, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean s(AbstractC0868r2 abstractC0868r2, C0865q2 c0865q2, C0865q2 c0865q22) {
        return J.j(f14929f, abstractC0868r2, c0865q2, c0865q22);
    }
}
