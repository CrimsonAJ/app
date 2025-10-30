package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class O2 extends F2 implements RandomAccess, P2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14752d;

    /* renamed from: e, reason: collision with root package name */
    public static final O2 f14753e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f14754b;

    /* renamed from: c, reason: collision with root package name */
    public int f14755c;

    static {
        int[] iArr = new int[0];
        f14752d = iArr;
        f14753e = new O2(iArr, 0, false);
    }

    public O2(int[] iArr, int i9, boolean z9) {
        super(z9);
        this.f14754b = iArr;
        this.f14755c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f14755c)) {
            int i11 = i9 + 1;
            int[] iArr = this.f14754b;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i9, iArr, i11, i10 - i9);
            } else {
                int[] iArr2 = new int[A0.a.g(length, 3, 2, 1, 10)];
                System.arraycopy(this.f14754b, 0, iArr2, 0, i9);
                System.arraycopy(this.f14754b, i9, iArr2, i11, this.f14755c - i9);
                this.f14754b = iArr2;
            }
            this.f14754b[i9] = intValue;
            this.f14755c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f14755c, ", Size:"));
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = S2.f14762a;
        collection.getClass();
        if (!(collection instanceof O2)) {
            return super.addAll(collection);
        }
        O2 o22 = (O2) collection;
        int i9 = o22.f14755c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f14755c;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            int[] iArr = this.f14754b;
            if (i11 > iArr.length) {
                this.f14754b = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(o22.f14754b, 0, this.f14754b, this.f14755c, o22.f14755c);
            this.f14755c = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int c(int i9) {
        f(i9);
        return this.f14754b[i9];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.R2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final O2 a(int i9) {
        int[] copyOf;
        if (i9 >= this.f14755c) {
            if (i9 == 0) {
                copyOf = f14752d;
            } else {
                copyOf = Arrays.copyOf(this.f14754b, i9);
            }
            return new O2(copyOf, this.f14755c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i9) {
        b();
        int i10 = this.f14755c;
        int length = this.f14754b.length;
        if (i10 == length) {
            int[] iArr = new int[A0.a.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14754b, 0, iArr, 0, this.f14755c);
            this.f14754b = iArr;
        }
        int[] iArr2 = this.f14754b;
        int i11 = this.f14755c;
        this.f14755c = i11 + 1;
        iArr2[i11] = i9;
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2)) {
            return super.equals(obj);
        }
        O2 o22 = (O2) obj;
        if (this.f14755c != o22.f14755c) {
            return false;
        }
        int[] iArr = o22.f14754b;
        for (int i9 = 0; i9 < this.f14755c; i9++) {
            if (this.f14754b[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i9) {
        if (i9 >= 0 && i9 < this.f14755c) {
        } else {
            throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f14755c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        f(i9);
        return Integer.valueOf(this.f14754b[i9]);
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.f14755c; i10++) {
            i9 = (i9 * 31) + this.f14754b[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i9 = this.f14755c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f14754b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        b();
        f(i9);
        int[] iArr = this.f14754b;
        int i10 = iArr[i9];
        if (i9 < this.f14755c - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.f14755c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        b();
        if (i10 >= i9) {
            int[] iArr = this.f14754b;
            System.arraycopy(iArr, i10, iArr, i9, this.f14755c - i10);
            this.f14755c -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        f(i9);
        int[] iArr = this.f14754b;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14755c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
