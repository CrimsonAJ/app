package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e3 extends F2 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f14832d;

    /* renamed from: e, reason: collision with root package name */
    public static final e3 f14833e;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14834b;

    /* renamed from: c, reason: collision with root package name */
    public int f14835c;

    static {
        Object[] objArr = new Object[0];
        f14832d = objArr;
        f14833e = new e3(objArr, 0, false);
    }

    public e3(Object[] objArr, int i9, boolean z9) {
        super(z9);
        this.f14834b = objArr;
        this.f14835c = i9;
    }

    @Override // com.google.android.gms.internal.cast.R2
    public final /* bridge */ /* synthetic */ R2 a(int i9) {
        Object[] copyOf;
        if (i9 >= this.f14835c) {
            if (i9 == 0) {
                copyOf = f14832d;
            } else {
                copyOf = Arrays.copyOf(this.f14834b, i9);
            }
            return new e3(copyOf, this.f14835c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f14835c)) {
            int i11 = i9 + 1;
            Object[] objArr = this.f14834b;
            int length = objArr.length;
            if (i10 < length) {
                System.arraycopy(objArr, i9, objArr, i11, i10 - i9);
            } else {
                Object[] objArr2 = new Object[A0.a.g(length, 3, 2, 1, 10)];
                System.arraycopy(this.f14834b, 0, objArr2, 0, i9);
                System.arraycopy(this.f14834b, i9, objArr2, i11, this.f14835c - i9);
                this.f14834b = objArr2;
            }
            this.f14834b[i9] = obj;
            this.f14835c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f14835c, ", Size:"));
    }

    public final void c(int i9) {
        if (i9 >= 0 && i9 < this.f14835c) {
        } else {
            throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f14835c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        c(i9);
        return this.f14834b[i9];
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        c(i9);
        Object[] objArr = this.f14834b;
        Object obj = objArr[i9];
        if (i9 < this.f14835c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f14835c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        c(i9);
        Object[] objArr = this.f14834b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14835c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i9 = this.f14835c;
        int length = this.f14834b.length;
        if (i9 == length) {
            this.f14834b = Arrays.copyOf(this.f14834b, A0.a.g(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f14834b;
        int i10 = this.f14835c;
        this.f14835c = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
