package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028z2 extends O1 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f15710d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1028z2 f15711e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f15712b;

    /* renamed from: c, reason: collision with root package name */
    public int f15713c;

    static {
        Object[] objArr = new Object[0];
        f15710d = objArr;
        f15711e = new C1028z2(objArr, 0, false);
    }

    public C1028z2(Object[] objArr, int i9, boolean z9) {
        super(z9);
        this.f15712b = objArr;
        this.f15713c = i9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0939h2
    public final /* bridge */ /* synthetic */ InterfaceC0939h2 a(int i9) {
        Object[] copyOf;
        if (i9 >= this.f15713c) {
            if (i9 == 0) {
                copyOf = f15710d;
            } else {
                copyOf = Arrays.copyOf(this.f15712b, i9);
            }
            return new C1028z2(copyOf, this.f15713c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f15713c)) {
            int i11 = i9 + 1;
            Object[] objArr = this.f15712b;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i9, objArr, i11, i10 - i9);
            } else {
                Object[] objArr2 = new Object[A0.a.g(length, 3, 2, 1, 10)];
                System.arraycopy(this.f15712b, 0, objArr2, 0, i9);
                System.arraycopy(this.f15712b, i9, objArr2, i11, this.f15713c - i9);
                this.f15712b = objArr2;
            }
            this.f15712b[i9] = obj;
            this.f15713c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f15713c, ", Size:"));
    }

    public final void c(int i9) {
        if (i9 >= 0 && i9 < this.f15713c) {
        } else {
            throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f15713c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        c(i9);
        return this.f15712b[i9];
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        c(i9);
        Object[] objArr = this.f15712b;
        Object obj = objArr[i9];
        if (i9 < this.f15713c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f15713c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        c(i9);
        Object[] objArr = this.f15712b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15713c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i9 = this.f15713c;
        int length = this.f15712b.length;
        if (i9 == length) {
            this.f15712b = Arrays.copyOf(this.f15712b, A0.a.g(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f15712b;
        int i10 = this.f15713c;
        this.f15713c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
