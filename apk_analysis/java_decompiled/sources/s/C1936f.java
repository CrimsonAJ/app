package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import t.AbstractC1964a;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1936f implements Collection, Set, P7.b {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22649a = AbstractC1964a.f22824a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f22650b = AbstractC1964a.f22825b;

    /* renamed from: c, reason: collision with root package name */
    public int f22651c;

    public C1936f(int i9) {
        if (i9 > 0) {
            AbstractC1938h.b(this, i9);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i9;
        int c3;
        int i10 = this.f22651c;
        if (obj == null) {
            c3 = AbstractC1938h.c(this, null, 0);
            i9 = 0;
        } else {
            int hashCode = obj.hashCode();
            i9 = hashCode;
            c3 = AbstractC1938h.c(this, obj, hashCode);
        }
        if (c3 >= 0) {
            return false;
        }
        int i11 = ~c3;
        int[] iArr = this.f22649a;
        if (i10 >= iArr.length) {
            int i12 = 8;
            if (i10 >= 8) {
                i12 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i12 = 4;
            }
            Object[] objArr = this.f22650b;
            AbstractC1938h.b(this, i12);
            if (i10 == this.f22651c) {
                int[] iArr2 = this.f22649a;
                if (iArr2.length != 0) {
                    B7.j.d0(0, 0, iArr.length, iArr, iArr2);
                    B7.j.f0(0, objArr.length, 6, objArr, this.f22650b);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i10) {
            int[] iArr3 = this.f22649a;
            int i13 = i11 + 1;
            B7.j.d0(i13, i11, i10, iArr3, iArr3);
            Object[] objArr2 = this.f22650b;
            B7.j.e0(i13, i11, i10, objArr2, objArr2);
        }
        int i14 = this.f22651c;
        if (i10 == i14) {
            int[] iArr4 = this.f22649a;
            if (i11 < iArr4.length) {
                iArr4[i11] = i9;
                this.f22650b[i11] = obj;
                this.f22651c = i14 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        int size = elements.size() + this.f22651c;
        int i9 = this.f22651c;
        int[] iArr = this.f22649a;
        boolean z9 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f22650b;
            AbstractC1938h.b(this, size);
            int i10 = this.f22651c;
            if (i10 > 0) {
                B7.j.d0(0, 0, i10, iArr, this.f22649a);
                B7.j.f0(0, this.f22651c, 6, objArr, this.f22650b);
            }
        }
        if (this.f22651c == i9) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                z9 |= add(it.next());
            }
            return z9;
        }
        throw new ConcurrentModificationException();
    }

    public final Object b(int i9) {
        int i10 = this.f22651c;
        Object[] objArr = this.f22650b;
        Object obj = objArr[i9];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i11 = i10 - 1;
        int[] iArr = this.f22649a;
        int i12 = 8;
        if (iArr.length > 8 && i10 < iArr.length / 3) {
            if (i10 > 8) {
                i12 = i10 + (i10 >> 1);
            }
            AbstractC1938h.b(this, i12);
            if (i9 > 0) {
                B7.j.d0(0, 0, i9, iArr, this.f22649a);
                B7.j.f0(0, i9, 6, objArr, this.f22650b);
            }
            if (i9 < i11) {
                int i13 = i9 + 1;
                B7.j.d0(i9, i13, i10, iArr, this.f22649a);
                B7.j.e0(i9, i13, i10, objArr, this.f22650b);
            }
        } else {
            if (i9 < i11) {
                int i14 = i9 + 1;
                B7.j.d0(i9, i14, i10, iArr, iArr);
                Object[] objArr2 = this.f22650b;
                B7.j.e0(i9, i14, i10, objArr2, objArr2);
            }
            this.f22650b[i11] = null;
        }
        if (i10 == this.f22651c) {
            this.f22651c = i11;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f22651c != 0) {
            this.f22649a = AbstractC1964a.f22824a;
            this.f22650b = AbstractC1964a.f22825b;
            this.f22651c = 0;
        }
        if (this.f22651c == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c3;
        if (obj == null) {
            c3 = AbstractC1938h.c(this, null, 0);
        } else {
            c3 = AbstractC1938h.c(this, obj, obj.hashCode());
        }
        if (c3 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f22651c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i9 = this.f22651c;
            for (int i10 = 0; i10 < i9; i10++) {
                if (!((Set) obj).contains(this.f22650b[i10])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f22649a;
        int i9 = this.f22651c;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += iArr[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f22651c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1931a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c3;
        if (obj == null) {
            c3 = AbstractC1938h.c(this, null, 0);
        } else {
            c3 = AbstractC1938h.c(this, obj, obj.hashCode());
        }
        if (c3 < 0) {
            return false;
        }
        b(c3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= remove(it.next());
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        boolean z9 = false;
        for (int i9 = this.f22651c - 1; -1 < i9; i9--) {
            if (!B7.k.l0(elements, this.f22650b[i9])) {
                b(i9);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f22651c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return B7.j.h0(this.f22650b, 0, this.f22651c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22651c * 14);
        sb.append('{');
        int i9 = this.f22651c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f22650b[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int i9 = this.f22651c;
        if (array.length < i9) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i9);
        } else if (array.length > i9) {
            array[i9] = null;
        }
        B7.j.e0(0, 0, this.f22651c, this.f22650b, array);
        return array;
    }
}
