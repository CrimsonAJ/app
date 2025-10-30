package com.google.android.gms.internal.cast;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823g0 extends AbstractC0807c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C0823g0 f14850e = new C0823g0(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f14851c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f14852d;

    public C0823g0(int i9, Object[] objArr) {
        this.f14851c = objArr;
        this.f14852d = i9;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC0807c0, com.google.android.gms.internal.cast.Z
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f14851c;
        int i9 = this.f14852d;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int c() {
        return this.f14852d;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final Object[] e() {
        return this.f14851c;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        J.i(i9, this.f14852d);
        Object obj = this.f14851c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14852d;
    }
}
