package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Z extends AbstractC1031b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Z f16331d;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f16332b;

    /* renamed from: c, reason: collision with root package name */
    public int f16333c;

    static {
        Z z9 = new Z(0, new Object[0]);
        f16331d = z9;
        z9.f16338a = false;
    }

    public Z(int i9, Object[] objArr) {
        this.f16332b = objArr;
        this.f16333c = i9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1031b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i9 = this.f16333c;
        Object[] objArr = this.f16332b;
        if (i9 == objArr.length) {
            this.f16332b = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16332b;
        int i10 = this.f16333c;
        this.f16333c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i9) {
        if (i9 >= 0 && i9 < this.f16333c) {
            return;
        }
        StringBuilder p9 = A0.a.p("Index:", i9, ", Size:");
        p9.append(this.f16333c);
        throw new IndexOutOfBoundsException(p9.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        c(i9);
        return this.f16332b[i9];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC1053y
    public final InterfaceC1053y h(int i9) {
        if (i9 >= this.f16333c) {
            return new Z(this.f16333c, Arrays.copyOf(this.f16332b, i9));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1031b, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        c(i9);
        Object[] objArr = this.f16332b;
        Object obj = objArr[i9];
        if (i9 < this.f16333c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f16333c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        c(i9);
        Object[] objArr = this.f16332b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16333c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f16333c)) {
            Object[] objArr = this.f16332b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(this.f16332b, i9, objArr2, i9 + 1, this.f16333c - i9);
                this.f16332b = objArr2;
            }
            this.f16332b[i9] = obj;
            this.f16333c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder p9 = A0.a.p("Index:", i9, ", Size:");
        p9.append(this.f16333c);
        throw new IndexOutOfBoundsException(p9.toString());
    }
}
