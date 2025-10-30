package B7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f1128d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f1129a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f1130b;

    /* renamed from: c, reason: collision with root package name */
    public int f1131c;

    public i() {
        this.f1130b = f1128d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        int i11 = this.f1131c;
        if (i9 < 0 || i9 > i11) {
            throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i11, ", size: "));
        }
        if (i9 == i11) {
            addLast(obj);
            return;
        }
        if (i9 == 0) {
            addFirst(obj);
            return;
        }
        p();
        e(this.f1131c + 1);
        int o9 = o(this.f1129a + i9);
        int i12 = this.f1131c;
        if (i9 < ((i12 + 1) >> 1)) {
            if (o9 == 0) {
                Object[] objArr = this.f1130b;
                kotlin.jvm.internal.h.e(objArr, "<this>");
                o9 = objArr.length;
            }
            int i13 = o9 - 1;
            int i14 = this.f1129a;
            if (i14 == 0) {
                Object[] objArr2 = this.f1130b;
                kotlin.jvm.internal.h.e(objArr2, "<this>");
                i10 = objArr2.length - 1;
            } else {
                i10 = i14 - 1;
            }
            int i15 = this.f1129a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f1130b;
                objArr3[i10] = objArr3[i15];
                j.e0(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f1130b;
                j.e0(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f1130b;
                objArr5[objArr5.length - 1] = objArr5[0];
                j.e0(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f1130b[i13] = obj;
            this.f1129a = i10;
        } else {
            int o10 = o(i12 + this.f1129a);
            if (o9 < o10) {
                Object[] objArr6 = this.f1130b;
                j.e0(o9 + 1, o9, o10, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f1130b;
                j.e0(1, 0, o10, objArr7, objArr7);
                Object[] objArr8 = this.f1130b;
                objArr8[0] = objArr8[objArr8.length - 1];
                j.e0(o9 + 1, o9, objArr8.length - 1, objArr8, objArr8);
            }
            this.f1130b[o9] = obj;
        }
        this.f1131c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        int i10 = this.f1131c;
        if (i9 >= 0 && i9 <= i10) {
            if (elements.isEmpty()) {
                return false;
            }
            if (i9 == this.f1131c) {
                return addAll(elements);
            }
            p();
            e(elements.size() + this.f1131c);
            int o9 = o(this.f1131c + this.f1129a);
            int o10 = o(this.f1129a + i9);
            int size = elements.size();
            if (i9 < ((this.f1131c + 1) >> 1)) {
                int i11 = this.f1129a;
                int i12 = i11 - size;
                if (o10 < i11) {
                    Object[] objArr = this.f1130b;
                    j.e0(i12, i11, objArr.length, objArr, objArr);
                    if (size >= o10) {
                        Object[] objArr2 = this.f1130b;
                        j.e0(objArr2.length - size, 0, o10, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f1130b;
                        j.e0(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f1130b;
                        j.e0(0, size, o10, objArr4, objArr4);
                    }
                } else if (i12 >= 0) {
                    Object[] objArr5 = this.f1130b;
                    j.e0(i12, i11, o10, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f1130b;
                    i12 += objArr6.length;
                    int i13 = o10 - i11;
                    int length = objArr6.length - i12;
                    if (length >= i13) {
                        j.e0(i12, i11, o10, objArr6, objArr6);
                    } else {
                        j.e0(i12, i11, i11 + length, objArr6, objArr6);
                        Object[] objArr7 = this.f1130b;
                        j.e0(0, this.f1129a + length, o10, objArr7, objArr7);
                    }
                }
                this.f1129a = i12;
                d(i(o10 - size), elements);
                return true;
            }
            int i14 = o10 + size;
            if (o10 < o9) {
                int i15 = size + o9;
                Object[] objArr8 = this.f1130b;
                if (i15 <= objArr8.length) {
                    j.e0(i14, o10, o9, objArr8, objArr8);
                } else if (i14 >= objArr8.length) {
                    j.e0(i14 - objArr8.length, o10, o9, objArr8, objArr8);
                } else {
                    int length2 = o9 - (i15 - objArr8.length);
                    j.e0(0, length2, o9, objArr8, objArr8);
                    Object[] objArr9 = this.f1130b;
                    j.e0(i14, o10, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f1130b;
                j.e0(size, 0, o9, objArr10, objArr10);
                Object[] objArr11 = this.f1130b;
                if (i14 >= objArr11.length) {
                    j.e0(i14 - objArr11.length, o10, objArr11.length, objArr11, objArr11);
                } else {
                    j.e0(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f1130b;
                    j.e0(i14, o10, objArr12.length - size, objArr12, objArr12);
                }
            }
            d(o10, elements);
            return true;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    public final void addFirst(Object obj) {
        p();
        e(this.f1131c + 1);
        int i9 = this.f1129a;
        if (i9 == 0) {
            Object[] objArr = this.f1130b;
            kotlin.jvm.internal.h.e(objArr, "<this>");
            i9 = objArr.length;
        }
        int i10 = i9 - 1;
        this.f1129a = i10;
        this.f1130b[i10] = obj;
        this.f1131c++;
    }

    public final void addLast(Object obj) {
        p();
        e(b() + 1);
        this.f1130b[o(b() + this.f1129a)] = obj;
        this.f1131c = b() + 1;
    }

    @Override // B7.f
    public final int b() {
        return this.f1131c;
    }

    @Override // B7.f
    public final Object c(int i9) {
        int i10 = this.f1131c;
        if (i9 >= 0 && i9 < i10) {
            if (i9 == l.a0(this)) {
                return removeLast();
            }
            if (i9 == 0) {
                return removeFirst();
            }
            p();
            int o9 = o(this.f1129a + i9);
            Object[] objArr = this.f1130b;
            Object obj = objArr[o9];
            if (i9 < (this.f1131c >> 1)) {
                int i11 = this.f1129a;
                if (o9 >= i11) {
                    j.e0(i11 + 1, i11, o9, objArr, objArr);
                } else {
                    j.e0(1, 0, o9, objArr, objArr);
                    Object[] objArr2 = this.f1130b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i12 = this.f1129a;
                    j.e0(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f1130b;
                int i13 = this.f1129a;
                objArr3[i13] = null;
                this.f1129a = f(i13);
            } else {
                int o10 = o(l.a0(this) + this.f1129a);
                if (o9 <= o10) {
                    Object[] objArr4 = this.f1130b;
                    j.e0(o9, o9 + 1, o10 + 1, objArr4, objArr4);
                } else {
                    Object[] objArr5 = this.f1130b;
                    j.e0(o9, o9 + 1, objArr5.length, objArr5, objArr5);
                    Object[] objArr6 = this.f1130b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    j.e0(0, 1, o10 + 1, objArr6, objArr6);
                }
                this.f1130b[o10] = null;
            }
            this.f1131c--;
            return obj;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            k(this.f1129a, o(b() + this.f1129a));
        }
        this.f1129a = 0;
        this.f1131c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i9, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1130b.length;
        while (i9 < length && it.hasNext()) {
            this.f1130b[i9] = it.next();
            i9++;
        }
        int i10 = this.f1129a;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f1130b[i11] = it.next();
        }
        this.f1131c = collection.size() + this.f1131c;
    }

    public final void e(int i9) {
        if (i9 >= 0) {
            Object[] objArr = this.f1130b;
            if (i9 <= objArr.length) {
                return;
            }
            if (objArr == f1128d) {
                if (i9 < 10) {
                    i9 = 10;
                }
                this.f1130b = new Object[i9];
                return;
            }
            int length = objArr.length;
            int i10 = length + (length >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                if (i9 > 2147483639) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i10];
            j.e0(0, this.f1129a, objArr.length, objArr, objArr2);
            Object[] objArr3 = this.f1130b;
            int length2 = objArr3.length;
            int i11 = this.f1129a;
            j.e0(length2 - i11, 0, i11, objArr3, objArr2);
            this.f1129a = 0;
            this.f1130b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int f(int i9) {
        kotlin.jvm.internal.h.e(this.f1130b, "<this>");
        if (i9 == r0.length - 1) {
            return 0;
        }
        return i9 + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f1130b[this.f1129a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f1130b[o(l.a0(this) + this.f1129a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        int b9 = b();
        if (i9 >= 0 && i9 < b9) {
            return this.f1130b[o(this.f1129a + i9)];
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, b9, ", size: "));
    }

    public final int i(int i9) {
        if (i9 < 0) {
            return i9 + this.f1130b.length;
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i9;
        int o9 = o(b() + this.f1129a);
        int i10 = this.f1129a;
        if (i10 < o9) {
            while (i10 < o9) {
                if (kotlin.jvm.internal.h.a(obj, this.f1130b[i10])) {
                    i9 = this.f1129a;
                } else {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 >= o9) {
            int length = this.f1130b.length;
            while (true) {
                if (i10 < length) {
                    if (kotlin.jvm.internal.h.a(obj, this.f1130b[i10])) {
                        i9 = this.f1129a;
                        break;
                    }
                    i10++;
                } else {
                    for (int i11 = 0; i11 < o9; i11++) {
                        if (kotlin.jvm.internal.h.a(obj, this.f1130b[i11])) {
                            i10 = i11 + this.f1130b.length;
                            i9 = this.f1129a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i10 - i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i9, int i10) {
        if (i9 < i10) {
            j.i0(this.f1130b, null, i9, i10);
            return;
        }
        Object[] objArr = this.f1130b;
        Arrays.fill(objArr, i9, objArr.length, (Object) null);
        j.i0(this.f1130b, null, 0, i10);
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f1130b[o(l.a0(this) + this.f1129a)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i9;
        int o9 = o(this.f1131c + this.f1129a);
        int i10 = this.f1129a;
        if (i10 < o9) {
            length = o9 - 1;
            if (i10 <= length) {
                while (!kotlin.jvm.internal.h.a(obj, this.f1130b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i9 = this.f1129a;
                return length - i9;
            }
            return -1;
        }
        if (i10 > o9) {
            int i11 = o9 - 1;
            while (true) {
                if (-1 < i11) {
                    if (kotlin.jvm.internal.h.a(obj, this.f1130b[i11])) {
                        length = i11 + this.f1130b.length;
                        i9 = this.f1129a;
                        break;
                    }
                    i11--;
                } else {
                    Object[] objArr = this.f1130b;
                    kotlin.jvm.internal.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i12 = this.f1129a;
                    if (i12 <= length) {
                        while (!kotlin.jvm.internal.h.a(obj, this.f1130b[length])) {
                            if (length != i12) {
                                length--;
                            }
                        }
                        i9 = this.f1129a;
                    }
                }
            }
        }
        return -1;
    }

    public final int o(int i9) {
        Object[] objArr = this.f1130b;
        if (i9 >= objArr.length) {
            return i9 - objArr.length;
        }
        return i9;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int o9;
        kotlin.jvm.internal.h.e(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f1130b.length != 0) {
            int o10 = o(this.f1131c + this.f1129a);
            int i9 = this.f1129a;
            if (i9 < o10) {
                o9 = i9;
                while (i9 < o10) {
                    Object obj = this.f1130b[i9];
                    if (!elements.contains(obj)) {
                        this.f1130b[o9] = obj;
                        o9++;
                    } else {
                        z9 = true;
                    }
                    i9++;
                }
                j.i0(this.f1130b, null, o9, o10);
            } else {
                int length = this.f1130b.length;
                boolean z10 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f1130b;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (!elements.contains(obj2)) {
                        this.f1130b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i9++;
                }
                o9 = o(i10);
                for (int i11 = 0; i11 < o10; i11++) {
                    Object[] objArr2 = this.f1130b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (!elements.contains(obj3)) {
                        this.f1130b[o9] = obj3;
                        o9 = f(o9);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                p();
                this.f1131c = i(o9 - this.f1129a);
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            p();
            Object[] objArr = this.f1130b;
            int i9 = this.f1129a;
            Object obj = objArr[i9];
            objArr[i9] = null;
            this.f1129a = f(i9);
            this.f1131c = b() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            p();
            int o9 = o(l.a0(this) + this.f1129a);
            Object[] objArr = this.f1130b;
            Object obj = objArr[o9];
            objArr[o9] = null;
            this.f1131c = b() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i9, int i10) {
        s8.n.g(i9, i10, this.f1131c);
        int i11 = i10 - i9;
        if (i11 == 0) {
            return;
        }
        if (i11 == this.f1131c) {
            clear();
            return;
        }
        if (i11 == 1) {
            c(i9);
            return;
        }
        p();
        if (i9 < this.f1131c - i10) {
            int o9 = o((i9 - 1) + this.f1129a);
            int o10 = o((i10 - 1) + this.f1129a);
            while (i9 > 0) {
                int i12 = o9 + 1;
                int min = Math.min(i9, Math.min(i12, o10 + 1));
                Object[] objArr = this.f1130b;
                int i13 = o10 - min;
                int i14 = o9 - min;
                j.e0(i13 + 1, i14 + 1, i12, objArr, objArr);
                o9 = i(i14);
                o10 = i(i13);
                i9 -= min;
            }
            int o11 = o(this.f1129a + i11);
            k(this.f1129a, o11);
            this.f1129a = o11;
        } else {
            int o12 = o(this.f1129a + i10);
            int o13 = o(this.f1129a + i9);
            int i15 = this.f1131c;
            while (true) {
                i15 -= i10;
                if (i15 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1130b;
                i10 = Math.min(i15, Math.min(objArr2.length - o12, objArr2.length - o13));
                Object[] objArr3 = this.f1130b;
                int i16 = o12 + i10;
                j.e0(o13, o12, i16, objArr3, objArr3);
                o12 = o(i16);
                o13 = o(o13 + i10);
            }
            int o14 = o(this.f1131c + this.f1129a);
            k(i(o14 - i11), o14);
        }
        this.f1131c -= i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int o9;
        kotlin.jvm.internal.h.e(elements, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f1130b.length != 0) {
            int o10 = o(this.f1131c + this.f1129a);
            int i9 = this.f1129a;
            if (i9 < o10) {
                o9 = i9;
                while (i9 < o10) {
                    Object obj = this.f1130b[i9];
                    if (elements.contains(obj)) {
                        this.f1130b[o9] = obj;
                        o9++;
                    } else {
                        z9 = true;
                    }
                    i9++;
                }
                j.i0(this.f1130b, null, o9, o10);
            } else {
                int length = this.f1130b.length;
                boolean z10 = false;
                int i10 = i9;
                while (i9 < length) {
                    Object[] objArr = this.f1130b;
                    Object obj2 = objArr[i9];
                    objArr[i9] = null;
                    if (elements.contains(obj2)) {
                        this.f1130b[i10] = obj2;
                        i10++;
                    } else {
                        z10 = true;
                    }
                    i9++;
                }
                o9 = o(i10);
                for (int i11 = 0; i11 < o10; i11++) {
                    Object[] objArr2 = this.f1130b;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f1130b[o9] = obj3;
                        o9 = f(o9);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                p();
                this.f1131c = i(o9 - this.f1129a);
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        int b9 = b();
        if (i9 >= 0 && i9 < b9) {
            int o9 = o(this.f1129a + i9);
            Object[] objArr = this.f1130b;
            Object obj2 = objArr[o9];
            objArr[o9] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, b9, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    public i(int i9) {
        Object[] objArr;
        if (i9 == 0) {
            objArr = f1128d;
        } else if (i9 > 0) {
            objArr = new Object[i9];
        } else {
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Illegal Capacity: "));
        }
        this.f1130b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.h.e(array, "array");
        int length = array.length;
        int i9 = this.f1131c;
        if (length < i9) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i9);
            kotlin.jvm.internal.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int o9 = o(this.f1131c + this.f1129a);
        int i10 = this.f1129a;
        if (i10 < o9) {
            j.f0(i10, o9, 2, this.f1130b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f1130b;
            j.e0(0, this.f1129a, objArr.length, objArr, array);
            Object[] objArr2 = this.f1130b;
            j.e0(objArr2.length - this.f1129a, 0, o9, objArr2, array);
        }
        int i11 = this.f1131c;
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        p();
        e(elements.size() + b());
        d(o(b() + this.f1129a), elements);
        return true;
    }
}
