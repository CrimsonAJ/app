package s;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;
import t.AbstractC1964a;

/* renamed from: s.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1937g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f22652a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f22653b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f22654c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f22655d;

    public C1937g() {
        int i9;
        int i10 = 4;
        while (true) {
            i9 = 80;
            if (i10 >= 32) {
                break;
            }
            int i11 = (1 << i10) - 12;
            if (80 <= i11) {
                i9 = i11;
                break;
            }
            i10++;
        }
        int i12 = i9 / 8;
        this.f22653b = new long[i12];
        this.f22654c = new Object[i12];
    }

    public final void b(long j, Long l9) {
        int i9 = this.f22655d;
        if (i9 != 0 && j <= this.f22653b[i9 - 1]) {
            k(j, l9);
            return;
        }
        if (this.f22652a) {
            long[] jArr = this.f22653b;
            if (i9 >= jArr.length) {
                Object[] objArr = this.f22654c;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj = objArr[i11];
                    if (obj != AbstractC1938h.f22656a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f22652a = false;
                this.f22655d = i10;
            }
        }
        int i12 = this.f22655d;
        if (i12 >= this.f22653b.length) {
            int i13 = (i12 + 1) * 8;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 8;
            long[] copyOf = Arrays.copyOf(this.f22653b, i16);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
            this.f22653b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22654c, i16);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
            this.f22654c = copyOf2;
        }
        this.f22653b[i12] = j;
        this.f22654c[i12] = l9;
        this.f22655d = i12 + 1;
    }

    public final void c() {
        int i9 = this.f22655d;
        Object[] objArr = this.f22654c;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.f22655d = 0;
        this.f22652a = false;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C1937g clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.h.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1937g c1937g = (C1937g) clone;
        c1937g.f22653b = (long[]) this.f22653b.clone();
        c1937g.f22654c = (Object[]) this.f22654c.clone();
        return c1937g;
    }

    public final Object f(long j) {
        Object obj;
        int b9 = AbstractC1964a.b(this.f22653b, this.f22655d, j);
        if (b9 >= 0 && (obj = this.f22654c[b9]) != AbstractC1938h.f22656a) {
            return obj;
        }
        return null;
    }

    public final Object h(long j) {
        Object obj;
        int b9 = AbstractC1964a.b(this.f22653b, this.f22655d, j);
        if (b9 < 0 || (obj = this.f22654c[b9]) == AbstractC1938h.f22656a) {
            return -1L;
        }
        return obj;
    }

    public final int i(long j) {
        if (this.f22652a) {
            int i9 = this.f22655d;
            long[] jArr = this.f22653b;
            Object[] objArr = this.f22654c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC1938h.f22656a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f22652a = false;
            this.f22655d = i10;
        }
        return AbstractC1964a.b(this.f22653b, this.f22655d, j);
    }

    public final long j(int i9) {
        int i10;
        if (i9 >= 0 && i9 < (i10 = this.f22655d)) {
            if (this.f22652a) {
                long[] jArr = this.f22653b;
                Object[] objArr = this.f22654c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != AbstractC1938h.f22656a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f22652a = false;
                this.f22655d = i11;
            }
            return this.f22653b[i9];
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final void k(long j, Object obj) {
        int b9 = AbstractC1964a.b(this.f22653b, this.f22655d, j);
        if (b9 >= 0) {
            this.f22654c[b9] = obj;
            return;
        }
        int i9 = ~b9;
        int i10 = this.f22655d;
        Object obj2 = AbstractC1938h.f22656a;
        if (i9 < i10) {
            Object[] objArr = this.f22654c;
            if (objArr[i9] == obj2) {
                this.f22653b[i9] = j;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.f22652a) {
            long[] jArr = this.f22653b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f22654c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f22652a = false;
                this.f22655d = i11;
                i9 = ~AbstractC1964a.b(this.f22653b, i11, j);
            }
        }
        int i13 = this.f22655d;
        if (i13 >= this.f22653b.length) {
            int i14 = (i13 + 1) * 8;
            int i15 = 4;
            while (true) {
                if (i15 >= 32) {
                    break;
                }
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
                i15++;
            }
            int i17 = i14 / 8;
            long[] copyOf = Arrays.copyOf(this.f22653b, i17);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
            this.f22653b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22654c, i17);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
            this.f22654c = copyOf2;
        }
        int i18 = this.f22655d - i9;
        if (i18 != 0) {
            long[] jArr2 = this.f22653b;
            int i19 = i9 + 1;
            kotlin.jvm.internal.h.e(jArr2, "<this>");
            System.arraycopy(jArr2, i9, jArr2, i19, i18);
            Object[] objArr3 = this.f22654c;
            B7.j.e0(i19, i9, this.f22655d, objArr3, objArr3);
        }
        this.f22653b[i9] = j;
        this.f22654c[i9] = obj;
        this.f22655d++;
    }

    public final void l(long j) {
        int b9 = AbstractC1964a.b(this.f22653b, this.f22655d, j);
        if (b9 >= 0) {
            Object[] objArr = this.f22654c;
            Object obj = objArr[b9];
            Object obj2 = AbstractC1938h.f22656a;
            if (obj != obj2) {
                objArr[b9] = obj2;
                this.f22652a = true;
            }
        }
    }

    public final int m() {
        if (this.f22652a) {
            int i9 = this.f22655d;
            long[] jArr = this.f22653b;
            Object[] objArr = this.f22654c;
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                Object obj = objArr[i11];
                if (obj != AbstractC1938h.f22656a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f22652a = false;
            this.f22655d = i10;
        }
        return this.f22655d;
    }

    public final Object n(int i9) {
        int i10;
        if (i9 >= 0 && i9 < (i10 = this.f22655d)) {
            if (this.f22652a) {
                long[] jArr = this.f22653b;
                Object[] objArr = this.f22654c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj = objArr[i12];
                    if (obj != AbstractC1938h.f22656a) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr[i11] = obj;
                            objArr[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f22652a = false;
                this.f22655d = i11;
            }
            return this.f22654c[i9];
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public final String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22655d * 28);
        sb.append('{');
        int i9 = this.f22655d;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(j(i10));
            sb.append('=');
            Object n7 = n(i10);
            if (n7 != sb) {
                sb.append(n7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
