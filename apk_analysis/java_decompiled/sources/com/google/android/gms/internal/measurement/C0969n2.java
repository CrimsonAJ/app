package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969n2 extends O1 implements RandomAccess, InterfaceC0934g2, InterfaceC1018x2 {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f15551d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0969n2 f15552e;

    /* renamed from: b, reason: collision with root package name */
    public long[] f15553b;

    /* renamed from: c, reason: collision with root package name */
    public int f15554c;

    static {
        long[] jArr = new long[0];
        f15551d = jArr;
        f15552e = new C0969n2(jArr, 0, false);
    }

    public C0969n2(long[] jArr, int i9, boolean z9) {
        super(z9);
        this.f15553b = jArr;
        this.f15554c = i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        long longValue = ((Long) obj).longValue();
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f15554c)) {
            int i11 = i9 + 1;
            long[] jArr = this.f15553b;
            int length = jArr.length;
            if (i10 < length) {
                System.arraycopy(jArr, i9, jArr, i11, i10 - i9);
            } else {
                long[] jArr2 = new long[A0.a.g(length, 3, 2, 1, 10)];
                System.arraycopy(this.f15553b, 0, jArr2, 0, i9);
                System.arraycopy(this.f15553b, i9, jArr2, i11, this.f15554c - i9);
                this.f15553b = jArr2;
            }
            this.f15553b[i9] = longValue;
            this.f15554c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f15554c, ", Size:"));
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = AbstractC0944i2.f15502a;
        collection.getClass();
        if (!(collection instanceof C0969n2)) {
            return super.addAll(collection);
        }
        C0969n2 c0969n2 = (C0969n2) collection;
        int i9 = c0969n2.f15554c;
        if (i9 == 0) {
            return false;
        }
        int i10 = this.f15554c;
        if (Integer.MAX_VALUE - i10 >= i9) {
            int i11 = i10 + i9;
            long[] jArr = this.f15553b;
            if (i11 > jArr.length) {
                this.f15553b = Arrays.copyOf(jArr, i11);
            }
            System.arraycopy(c0969n2.f15553b, 0, this.f15553b, this.f15554c, c0969n2.f15554c);
            this.f15554c = i11;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long c(int i9) {
        f(i9);
        return this.f15553b[i9];
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
    public final C0969n2 a(int i9) {
        long[] copyOf;
        if (i9 >= this.f15554c) {
            if (i9 == 0) {
                copyOf = f15551d;
            } else {
                copyOf = Arrays.copyOf(this.f15553b, i9);
            }
            return new C0969n2(copyOf, this.f15554c, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(long j) {
        b();
        int i9 = this.f15554c;
        int length = this.f15553b.length;
        if (i9 == length) {
            long[] jArr = new long[A0.a.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.f15553b, 0, jArr, 0, this.f15554c);
            this.f15553b = jArr;
        }
        long[] jArr2 = this.f15553b;
        int i10 = this.f15554c;
        this.f15554c = i10 + 1;
        jArr2[i10] = j;
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0969n2)) {
            return super.equals(obj);
        }
        C0969n2 c0969n2 = (C0969n2) obj;
        if (this.f15554c != c0969n2.f15554c) {
            return false;
        }
        long[] jArr = c0969n2.f15553b;
        for (int i9 = 0; i9 < this.f15554c; i9++) {
            if (this.f15553b[i9] != jArr[i9]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i9) {
        if (i9 >= 0 && i9 < this.f15554c) {
        } else {
            throw new IndexOutOfBoundsException(A0.a.l("Index:", i9, this.f15554c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        f(i9);
        return Long.valueOf(this.f15553b[i9]);
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = 0; i10 < this.f15554c; i10++) {
            long j = this.f15553b[i10];
            Charset charset = AbstractC0944i2.f15502a;
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
        int i9 = this.f15554c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f15553b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.O1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        b();
        f(i9);
        long[] jArr = this.f15553b;
        long j = jArr[i9];
        if (i9 < this.f15554c - 1) {
            System.arraycopy(jArr, i9 + 1, jArr, i9, (r3 - i9) - 1);
        }
        this.f15554c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        b();
        if (i10 >= i9) {
            long[] jArr = this.f15553b;
            System.arraycopy(jArr, i10, jArr, i9, this.f15554c - i10);
            this.f15554c -= i10 - i9;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        f(i9);
        long[] jArr = this.f15553b;
        long j = jArr[i9];
        jArr[i9] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15554c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
