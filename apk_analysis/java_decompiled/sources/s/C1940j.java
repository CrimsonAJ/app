package s;

import java.util.Arrays;
import t.AbstractC1964a;

/* renamed from: s.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1940j implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f22661a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ int[] f22662b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f22663c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f22664d;

    public C1940j(int i9) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f22662b = new int[i13];
        this.f22663c = new Object[i13];
    }

    public final void b(int i9, Object obj) {
        int i10 = this.f22664d;
        if (i10 != 0 && i9 <= this.f22662b[i10 - 1]) {
            h(i9, obj);
            return;
        }
        if (this.f22661a && i10 >= this.f22662b.length) {
            AbstractC1938h.a(this);
        }
        int i11 = this.f22664d;
        if (i11 >= this.f22662b.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] copyOf = Arrays.copyOf(this.f22662b, i15);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
            this.f22662b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22663c, i15);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
            this.f22663c = copyOf2;
        }
        this.f22662b[i11] = i9;
        this.f22663c[i11] = obj;
        this.f22664d = i11 + 1;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C1940j clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.h.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C1940j c1940j = (C1940j) clone;
        c1940j.f22662b = (int[]) this.f22662b.clone();
        c1940j.f22663c = (Object[]) this.f22663c.clone();
        return c1940j;
    }

    public final Object e(int i9) {
        Object obj;
        int a5 = AbstractC1964a.a(this.f22664d, i9, this.f22662b);
        if (a5 >= 0 && (obj = this.f22663c[a5]) != AbstractC1938h.f22657b) {
            return obj;
        }
        return null;
    }

    public final int f(int i9) {
        if (this.f22661a) {
            AbstractC1938h.a(this);
        }
        return this.f22662b[i9];
    }

    public final void h(int i9, Object obj) {
        int a5 = AbstractC1964a.a(this.f22664d, i9, this.f22662b);
        if (a5 >= 0) {
            this.f22663c[a5] = obj;
            return;
        }
        int i10 = ~a5;
        int i11 = this.f22664d;
        if (i10 < i11) {
            Object[] objArr = this.f22663c;
            if (objArr[i10] == AbstractC1938h.f22657b) {
                this.f22662b[i10] = i9;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f22661a && i11 >= this.f22662b.length) {
            AbstractC1938h.a(this);
            i10 = ~AbstractC1964a.a(this.f22664d, i9, this.f22662b);
        }
        int i12 = this.f22664d;
        if (i12 >= this.f22662b.length) {
            int i13 = (i12 + 1) * 4;
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
            int i16 = i13 / 4;
            int[] copyOf = Arrays.copyOf(this.f22662b, i16);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
            this.f22662b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f22663c, i16);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(this, newSize)");
            this.f22663c = copyOf2;
        }
        int i17 = this.f22664d;
        if (i17 - i10 != 0) {
            int[] iArr = this.f22662b;
            int i18 = i10 + 1;
            B7.j.d0(i18, i10, i17, iArr, iArr);
            Object[] objArr2 = this.f22663c;
            B7.j.e0(i18, i10, this.f22664d, objArr2, objArr2);
        }
        this.f22662b[i10] = i9;
        this.f22663c[i10] = obj;
        this.f22664d++;
    }

    public final int i() {
        if (this.f22661a) {
            AbstractC1938h.a(this);
        }
        return this.f22664d;
    }

    public final Object j(int i9) {
        if (this.f22661a) {
            AbstractC1938h.a(this);
        }
        return this.f22663c[i9];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f22664d * 28);
        sb.append('{');
        int i9 = this.f22664d;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(f(i10));
            sb.append('=');
            Object j = j(i10);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "buffer.toString()");
        return sb2;
    }
}
