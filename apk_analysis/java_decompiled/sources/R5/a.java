package R5;

import O4.h;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import v4.e;

/* loaded from: classes.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f6662a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6664c;

    public a(int i9, int i10, int[] iArr) {
        this.f6662a = iArr;
        this.f6663b = i9;
        this.f6664c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (e.C(this.f6662a, ((Integer) obj).intValue(), this.f6663b, this.f6664c) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                if (this.f6662a[this.f6663b + i9] != aVar.f6662a[aVar.f6663b + i9]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        h.f(i9, size());
        return Integer.valueOf(this.f6662a[this.f6663b + i9]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i9 = 1;
        for (int i10 = this.f6663b; i10 < this.f6664c; i10++) {
            i9 = (i9 * 31) + this.f6662a[i10];
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int[] iArr = this.f6662a;
            int i9 = this.f6663b;
            int C8 = e.C(iArr, intValue, i9, this.f6664c);
            if (C8 >= 0) {
                return C8 - i9;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i9;
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.f6664c;
            while (true) {
                i10--;
                i9 = this.f6663b;
                if (i10 >= i9) {
                    if (this.f6662a[i10] == intValue) {
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        Integer num = (Integer) obj;
        h.f(i9, size());
        int i10 = this.f6663b + i9;
        int[] iArr = this.f6662a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6664c - this.f6663b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i9, int i10) {
        h.i(i9, i10, size());
        if (i9 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f6663b;
        return new a(i9 + i11, i11 + i10, this.f6662a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f6662a;
        int i9 = this.f6663b;
        sb.append(iArr[i9]);
        while (true) {
            i9++;
            if (i9 < this.f6664c) {
                sb.append(", ");
                sb.append(iArr[i9]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
