package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914c2 extends O1 implements RandomAccess, InterfaceC0929f2, InterfaceC1018x2 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f15450d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0914c2 f15451e;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15452b;

    /* renamed from: c, reason: collision with root package name */
    public int f15453c;

    static {
        int[] iArr = new int[0];
        f15450d = iArr;
        f15451e = new C0914c2(iArr, 0, false);
    }

    public C0914c2(int[] iArr, int i9, boolean z9) {
        super(z9);
        this.f15452b = iArr;
        this.f15453c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f15453c)) {
            int i11 = i9 + 1;
            int[] iArr = this.f15452b;
            int length = iArr.length;
            if (i10 < length) {
                System.arraycopy(iArr, i9, iArr, i11, i10 - i9);
            } else {
                int[] iArr2 = new int[A0.a.g(length, 3, 2, 1, 10)];
                System.arraycopy(this.f15452b, 0, iArr2, 0, i9);
                System.arraycopy(this.f15452b, i9, iArr2, i11, this.f15453c - i9);
                this.f15452b = iArr2;
            }
            this.f15452b[i9] = intValue;
            this.f15453c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f15453c, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0944i2.f15502a;
        collection.getClass();
        if (!(collection instanceof C0914c2)) {
            return super.addAll(collection);
        }
        C0914c2 c0914c2 = (C0914c2) collection;
        int i9 = c0914c2.f15453c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f15453c;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            int[] iArr = this.f15452b;
            if (i11 > iArr.length) {
                this.f15452b = Arrays.copyOf(iArr, i11);
            }
            System.arraycopy(c0914c2.f15452b, 0, this.f15452b, this.f15453c, c0914c2.f15453c);
            this.f15453c = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int c(int i9) {
        f(i9);
        return this.f15452b[i9];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0939h2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C0914c2 a(int i9) {
        int[] copyOf;
        if (i9 >= this.f15453c) {
            if (i9 == 0) {
                copyOf = f15450d;
            } else {
                copyOf = Arrays.copyOf(this.f15452b, i9);
            }
            return new C0914c2(copyOf, this.f15453c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i9) {
        b();
        int i10 = this.f15453c;
        int length = this.f15452b.length;
        if (i10 == length) {
            int[] iArr = new int[A0.a.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f15452b, 0, iArr, 0, this.f15453c);
            this.f15452b = iArr;
        }
        int[] iArr2 = this.f15452b;
        int i11 = this.f15453c;
        this.f15453c = i11 + 1;
        iArr2[i11] = i9;
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0914c2)) {
            return super.equals(obj);
        }
        C0914c2 c0914c2 = (C0914c2) obj;
        if (this.f15453c != c0914c2.f15453c) {
            return false;
        }
        int[] iArr = c0914c2.f15452b;
        for (int i9 = 0; i9 < this.f15453c; i9++) {
            if (this.f15452b[i9] != iArr[i9]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i9) {
        if (i9 >= 0 && i9 < this.f15453c) {
        } else {
            throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f15453c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        f(i9);
        return Integer.valueOf(this.f15452b[i9]);
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.f15453c; i10++) {
            i9 = (i9 * 31) + this.f15452b[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i9 = this.f15453c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f15452b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        b();
        f(i9);
        int[] iArr = this.f15452b;
        int i10 = iArr[i9];
        if (i9 < this.f15453c - 1) {
            System.arraycopy(iArr, i9 + 1, iArr, i9, (r2 - i9) - 1);
        }
        this.f15453c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        b();
        if (i10 >= i9) {
            int[] iArr = this.f15452b;
            System.arraycopy(iArr, i10, iArr, i9, this.f15453c - i10);
            this.f15453c -= i10 - i9;
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
        int[] iArr = this.f15452b;
        int i10 = iArr[i9];
        iArr[i9] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15453c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
