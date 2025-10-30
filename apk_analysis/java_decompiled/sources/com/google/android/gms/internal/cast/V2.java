package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class V2 extends F2 implements RandomAccess, Q2 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f14777d;

    /* renamed from: e, reason: collision with root package name */
    public static final V2 f14778e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f14779b;

    /* renamed from: c, reason: collision with root package name */
    public int f14780c;

    static {
        long[] jArr = new long[0];
        f14777d = jArr;
        f14778e = new V2(jArr, 0, false);
    }

    public V2(long[] jArr, int i9, boolean z9) {
        super(z9);
        this.f14779b = jArr;
        this.f14780c = i9;
    }

    @Override // com.google.android.gms.internal.cast.R2
    public final /* bridge */ /* synthetic */ R2 a(int i9) {
        long[] copyOf;
        if (i9 >= this.f14780c) {
            if (i9 == 0) {
                copyOf = f14777d;
            } else {
                copyOf = Arrays.copyOf(this.f14779b, i9);
            }
            return new V2(copyOf, this.f14780c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f14780c)) {
            int i11 = i9 + 1;
            long[] jArr = this.f14779b;
            int length = jArr.length;
            if (i10 < length) {
                System.arraycopy(jArr, i9, jArr, i11, i10 - i9);
            } else {
                long[] jArr2 = new long[A0.a.g(length, 3, 2, 1, 10)];
                System.arraycopy(this.f14779b, 0, jArr2, 0, i9);
                System.arraycopy(this.f14779b, i9, jArr2, i11, this.f14780c - i9);
                this.f14779b = jArr2;
            }
            this.f14779b[i9] = longValue;
            this.f14780c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f14780c, ", Size:"));
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = S2.f14762a;
        collection.getClass();
        if (!(collection instanceof V2)) {
            return super.addAll(collection);
        }
        V2 v22 = (V2) collection;
        int i9 = v22.f14780c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f14780c;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            long[] jArr = this.f14779b;
            if (i11 > jArr.length) {
                this.f14779b = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(v22.f14779b, 0, this.f14779b, this.f14780c, v22.f14780c);
            this.f14780c = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int i9) {
        d(i9);
        return this.f14779b[i9];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i9) {
        if (i9 >= 0 && i9 < this.f14780c) {
        } else {
            throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f14780c, ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V2)) {
            return super.equals(obj);
        }
        V2 v22 = (V2) obj;
        if (this.f14780c != v22.f14780c) {
            return false;
        }
        long[] jArr = v22.f14779b;
        for (int i9 = 0; i9 < this.f14780c; i9++) {
            if (this.f14779b[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        d(i9);
        return Long.valueOf(this.f14779b[i9]);
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.f14780c; i10++) {
            long j = this.f14779b[i10];
            Charset charset = S2.f14762a;
            i9 = (i9 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i9 = this.f14780c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f14779b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.cast.F2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        b();
        d(i9);
        long[] jArr = this.f14779b;
        long j = jArr[i9];
        if (i9 < this.f14780c - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.f14780c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        b();
        if (i10 >= i9) {
            long[] jArr = this.f14779b;
            System.arraycopy(jArr, i10, jArr, i9, this.f14780c - i10);
            this.f14780c -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        d(i9);
        long[] jArr = this.f14779b;
        long j = jArr[i9];
        jArr[i9] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14780c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        int i9 = this.f14780c;
        int length = this.f14779b.length;
        if (i9 == length) {
            long[] jArr = new long[A0.a.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f14779b, 0, jArr, 0, this.f14780c);
            this.f14779b = jArr;
        }
        long[] jArr2 = this.f14779b;
        int i10 = this.f14780c;
        this.f14780c = i10 + 1;
        jArr2[i10] = longValue;
        return true;
    }
}
