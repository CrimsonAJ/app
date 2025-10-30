package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Q extends AbstractC0516b implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final Q f9657d = new Q(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9658b;

    /* renamed from: c, reason: collision with root package name */
    public int f9659c;

    public Q(Object[] objArr, int i9, boolean z9) {
        this.f9688a = z9;
        this.f9658b = objArr;
        this.f9659c = i9;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i9 = this.f9659c;
        Object[] objArr = this.f9658b;
        if (i9 == objArr.length) {
            this.f9658b = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9658b;
        int i10 = this.f9659c;
        this.f9659c = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i9) {
        if (i9 >= 0 && i9 < this.f9659c) {
            return;
        }
        StringBuilder p9 = A0.a.p("Index:", i9, ", Size:");
        p9.append(this.f9659c);
        throw new IndexOutOfBoundsException(p9.toString());
    }

    public final Q d(int i9) {
        if (i9 >= this.f9659c) {
            return new Q(Arrays.copyOf(this.f9658b, i9), this.f9659c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        c(i9);
        return this.f9658b[i9];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0516b, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        c(i9);
        Object[] objArr = this.f9658b;
        Object obj = objArr[i9];
        if (i9 < this.f9659c - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f9659c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        c(i9);
        Object[] objArr = this.f9658b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9659c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f9659c)) {
            Object[] objArr = this.f9658b;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(this.f9658b, i9, objArr2, i9 + 1, this.f9659c - i9);
                this.f9658b = objArr2;
            }
            this.f9658b[i9] = obj;
            this.f9659c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder p9 = A0.a.p("Index:", i9, ", Size:");
        p9.append(this.f9659c);
        throw new IndexOutOfBoundsException(p9.toString());
    }
}
