package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.cast.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818f {

    /* renamed from: a, reason: collision with root package name */
    public final long f14836a;

    /* renamed from: b, reason: collision with root package name */
    public long f14837b;

    /* renamed from: c, reason: collision with root package name */
    public long f14838c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f14839d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14840e;

    public C0818f(e1.q qVar) {
        this.f14840e = qVar.f17061a;
        long currentTimeMillis = System.currentTimeMillis();
        this.f14836a = currentTimeMillis;
        this.f14837b = currentTimeMillis;
        this.f14839d = new AtomicInteger(1);
    }
}
