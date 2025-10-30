package com.google.android.gms.internal.cast;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839k0 extends AbstractC0807c0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f14899c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f14900d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f14901e;

    public C0839k0(Object[] objArr, int i9, int i10) {
        this.f14899c = objArr;
        this.f14900d = i9;
        this.f14901e = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        J.i(i9, this.f14901e);
        Object obj = this.f14899c[i9 + i9 + this.f14900d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14901e;
    }
}
