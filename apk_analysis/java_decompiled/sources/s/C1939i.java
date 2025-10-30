package s;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import t.AbstractC1964a;

/* renamed from: s.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1939i {

    /* renamed from: a, reason: collision with root package name */
    public int[] f22658a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f22659b;

    /* renamed from: c, reason: collision with root package name */
    public int f22660c;

    public C1939i(int i9) {
        int[] iArr;
        Object[] objArr;
        if (i9 == 0) {
            iArr = AbstractC1964a.f22824a;
        } else {
            iArr = new int[i9];
        }
        this.f22658a = iArr;
        if (i9 == 0) {
            objArr = AbstractC1964a.f22825b;
        } else {
            objArr = new Object[i9 << 1];
        }
        this.f22659b = objArr;
    }

    public final int a(Object obj) {
        int i9 = this.f22660c * 2;
        Object[] objArr = this.f22659b;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i9) {
        int i10 = this.f22660c;
        int[] iArr = this.f22658a;
        if (iArr.length < i9) {
            int[] copyOf = Arrays.copyOf(iArr, i9);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
            this.f22658a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22659b, i9 * 2);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
            this.f22659b = copyOf2;
        }
        if (this.f22660c == i10) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i9, Object obj) {
        int i10 = this.f22660c;
        if (i10 == 0) {
            return -1;
        }
        int a5 = AbstractC1964a.a(i10, i9, this.f22658a);
        if (a5 < 0 || kotlin.jvm.internal.h.a(obj, this.f22659b[a5 << 1])) {
            return a5;
        }
        int i11 = a5 + 1;
        while (i11 < i10 && this.f22658a[i11] == i9) {
            if (kotlin.jvm.internal.h.a(obj, this.f22659b[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a5 - 1; i12 >= 0 && this.f22658a[i12] == i9; i12--) {
            if (kotlin.jvm.internal.h.a(obj, this.f22659b[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void clear() {
        if (this.f22660c > 0) {
            this.f22658a = AbstractC1964a.f22824a;
            this.f22659b = AbstractC1964a.f22825b;
            this.f22660c = 0;
        }
        if (this.f22660c <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i9 = this.f22660c;
        if (i9 == 0) {
            return -1;
        }
        int a5 = AbstractC1964a.a(i9, 0, this.f22658a);
        if (a5 < 0 || this.f22659b[a5 << 1] == null) {
            return a5;
        }
        int i10 = a5 + 1;
        while (i10 < i9 && this.f22658a[i10] == 0) {
            if (this.f22659b[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = a5 - 1; i11 >= 0 && this.f22658a[i11] == 0; i11--) {
            if (this.f22659b[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1939i) {
                int i9 = this.f22660c;
                if (i9 != ((C1939i) obj).f22660c) {
                    return false;
                }
                C1939i c1939i = (C1939i) obj;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object f9 = f(i10);
                    Object i11 = i(i10);
                    Object obj2 = c1939i.get(f9);
                    if (i11 == null) {
                        if (obj2 != null || !c1939i.containsKey(f9)) {
                            return false;
                        }
                    } else if (!i11.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f22660c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f22660c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object f10 = f(i13);
                Object i14 = i(i13);
                Object obj3 = ((Map) obj).get(f10);
                if (i14 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(f10)) {
                        return false;
                    }
                } else if (!i14.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i9) {
        if (i9 >= 0 && i9 < this.f22660c) {
            return this.f22659b[i9 << 1];
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final Object g(int i9) {
        int i10;
        if (i9 >= 0 && i9 < (i10 = this.f22660c)) {
            Object[] objArr = this.f22659b;
            int i11 = i9 << 1;
            Object obj = objArr[i11 + 1];
            if (i10 <= 1) {
                clear();
                return obj;
            }
            int i12 = i10 - 1;
            int[] iArr = this.f22658a;
            int i13 = 8;
            if (iArr.length > 8 && i10 < iArr.length / 3) {
                if (i10 > 8) {
                    i13 = i10 + (i10 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i13);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
                this.f22658a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f22659b, i13 << 1);
                kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
                this.f22659b = copyOf2;
                if (i10 == this.f22660c) {
                    if (i9 > 0) {
                        B7.j.d0(0, 0, i9, iArr, this.f22658a);
                        B7.j.e0(0, 0, i11, objArr, this.f22659b);
                    }
                    if (i9 < i12) {
                        int i14 = i9 + 1;
                        B7.j.d0(i9, i14, i10, iArr, this.f22658a);
                        B7.j.e0(i11, i14 << 1, i10 << 1, objArr, this.f22659b);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i9 < i12) {
                    int i15 = i9 + 1;
                    B7.j.d0(i9, i15, i10, iArr, iArr);
                    Object[] objArr2 = this.f22659b;
                    B7.j.e0(i11, i15 << 1, i10 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.f22659b;
                int i16 = i12 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            }
            if (i10 == this.f22660c) {
                this.f22660c = i12;
                return obj;
            }
            throw new ConcurrentModificationException();
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object get(Object obj) {
        int d9 = d(obj);
        if (d9 >= 0) {
            return this.f22659b[(d9 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d9 = d(obj);
        if (d9 >= 0) {
            return this.f22659b[(d9 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i9, Object obj) {
        if (i9 >= 0 && i9 < this.f22660c) {
            int i10 = (i9 << 1) + 1;
            Object[] objArr = this.f22659b;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final int hashCode() {
        int i9;
        int[] iArr = this.f22658a;
        Object[] objArr = this.f22659b;
        int i10 = this.f22660c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i13 += i9 ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public final Object i(int i9) {
        if (i9 >= 0 && i9 < this.f22660c) {
            return this.f22659b[(i9 << 1) + 1];
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final boolean isEmpty() {
        if (this.f22660c <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i9;
        int e8;
        int i10 = this.f22660c;
        if (obj != null) {
            i9 = obj.hashCode();
        } else {
            i9 = 0;
        }
        if (obj != null) {
            e8 = c(i9, obj);
        } else {
            e8 = e();
        }
        if (e8 >= 0) {
            int i11 = (e8 << 1) + 1;
            Object[] objArr = this.f22659b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~e8;
        int[] iArr = this.f22658a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i13);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
            this.f22658a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22659b, i13 << 1);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
            this.f22659b = copyOf2;
            if (i10 != this.f22660c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f22658a;
            int i14 = i12 + 1;
            B7.j.d0(i14, i12, i10, iArr2, iArr2);
            Object[] objArr2 = this.f22659b;
            B7.j.e0(i14 << 1, i12 << 1, this.f22660c << 1, objArr2, objArr2);
        }
        int i15 = this.f22660c;
        if (i10 == i15) {
            int[] iArr3 = this.f22658a;
            if (i12 < iArr3.length) {
                iArr3[i12] = i9;
                Object[] objArr3 = this.f22659b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f22660c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d9 = d(obj);
        if (d9 >= 0) {
            return g(d9);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d9 = d(obj);
        if (d9 >= 0) {
            return h(d9, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f22660c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22660c * 28);
        sb.append('{');
        int i9 = this.f22660c;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object f9 = f(i10);
            if (f9 != sb) {
                sb.append(f9);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i11 = i(i10);
            if (i11 != sb) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d9 = d(obj);
        if (d9 < 0 || !kotlin.jvm.internal.h.a(obj2, i(d9))) {
            return false;
        }
        g(d9);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d9 = d(obj);
        if (d9 < 0 || !kotlin.jvm.internal.h.a(obj2, i(d9))) {
            return false;
        }
        h(d9, obj3);
        return true;
    }
}
