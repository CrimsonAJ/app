package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847m0 extends AbstractC0815e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f14918i;
    public static final C0847m0 j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f14919d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f14920e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f14921f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f14922g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f14923h;

    static {
        Object[] objArr = new Object[0];
        f14918i = objArr;
        j = new C0847m0(0, 0, 0, objArr, objArr);
    }

    public C0847m0(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f14919d = objArr;
        this.f14920e = i9;
        this.f14921f = objArr2;
        this.f14922g = i10;
        this.f14923h = i11;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f14919d;
        int i9 = this.f14923h;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int c() {
        return this.f14923h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f14921f;
            if (objArr.length != 0) {
                int b9 = J.b(obj.hashCode());
                while (true) {
                    int i9 = b9 & this.f14922g;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    b9 = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final Object[] e() {
        return this.f14919d;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC0815e0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14920e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0807c0 abstractC0807c0 = this.f14827b;
        if (abstractC0807c0 == null) {
            abstractC0807c0 = AbstractC0807c0.g(this.f14923h, this.f14919d);
            this.f14827b = abstractC0807c0;
        }
        return abstractC0807c0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14923h;
    }
}
