package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f15219a;

    public H2(Unsafe unsafe) {
        this.f15219a = unsafe;
    }

    public abstract double a(long j, Object obj);

    public abstract float b(long j, Object obj);

    public abstract void c(long j, Object obj, boolean z9);

    public abstract void d(Object obj, long j, byte b9);

    public abstract void e(Object obj, long j, double d9);

    public abstract void f(Object obj, long j, float f9);

    public abstract boolean g(long j, Object obj);
}
