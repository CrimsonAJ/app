package q8;

import java.util.ArrayList;
import java.util.Arrays;
import x8.C2187g;
import x8.C2190j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C2187g f22463a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22465c;

    /* renamed from: g, reason: collision with root package name */
    public int f22469g;

    /* renamed from: h, reason: collision with root package name */
    public int f22470h;

    /* renamed from: b, reason: collision with root package name */
    public int f22464b = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f22466d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public b[] f22467e = new b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f22468f = 7;

    public d(C2187g c2187g) {
        this.f22463a = c2187g;
    }

    public final void a(int i9) {
        int i10;
        if (i9 > 0) {
            int length = this.f22467e.length - 1;
            int i11 = 0;
            while (true) {
                i10 = this.f22468f;
                if (length < i10 || i9 <= 0) {
                    break;
                }
                b bVar = this.f22467e[length];
                kotlin.jvm.internal.h.b(bVar);
                i9 -= bVar.f22455c;
                int i12 = this.f22470h;
                b bVar2 = this.f22467e[length];
                kotlin.jvm.internal.h.b(bVar2);
                this.f22470h = i12 - bVar2.f22455c;
                this.f22469g--;
                i11++;
                length--;
            }
            b[] bVarArr = this.f22467e;
            int i13 = i10 + 1;
            System.arraycopy(bVarArr, i13, bVarArr, i13 + i11, this.f22469g);
            b[] bVarArr2 = this.f22467e;
            int i14 = this.f22468f + 1;
            Arrays.fill(bVarArr2, i14, i14 + i11, (Object) null);
            this.f22468f += i11;
        }
    }

    public final void b(b bVar) {
        int i9 = this.f22466d;
        int i10 = bVar.f22455c;
        if (i10 > i9) {
            b[] bVarArr = this.f22467e;
            B7.j.i0(bVarArr, null, 0, bVarArr.length);
            this.f22468f = this.f22467e.length - 1;
            this.f22469g = 0;
            this.f22470h = 0;
            return;
        }
        a((this.f22470h + i10) - i9);
        int i11 = this.f22469g + 1;
        b[] bVarArr2 = this.f22467e;
        if (i11 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f22468f = this.f22467e.length - 1;
            this.f22467e = bVarArr3;
        }
        int i12 = this.f22468f;
        this.f22468f = i12 - 1;
        this.f22467e[i12] = bVar;
        this.f22469g++;
        this.f22470h += i10;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, x8.g] */
    public final void c(C2190j data) {
        kotlin.jvm.internal.h.e(data, "data");
        C2187g c2187g = this.f22463a;
        int[] iArr = x.f22568a;
        int d9 = data.d();
        long j = 0;
        for (int i9 = 0; i9 < d9; i9++) {
            byte i10 = data.i(i9);
            byte[] bArr = k8.c.f20141a;
            j += x.f22569b[i10 & 255];
        }
        if (((int) ((j + 7) >> 3)) < data.d()) {
            ?? obj = new Object();
            int[] iArr2 = x.f22568a;
            int d10 = data.d();
            long j4 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < d10; i12++) {
                byte i13 = data.i(i12);
                byte[] bArr2 = k8.c.f20141a;
                int i14 = i13 & 255;
                int i15 = x.f22568a[i14];
                byte b9 = x.f22569b[i14];
                j4 = (j4 << b9) | i15;
                i11 += b9;
                while (i11 >= 8) {
                    i11 -= 8;
                    obj.w0((int) (j4 >> i11));
                }
            }
            if (i11 > 0) {
                obj.w0((int) ((255 >>> i11) | (j4 << (8 - i11))));
            }
            C2190j j02 = obj.j0(obj.f24644b);
            e(j02.d(), 127, 128);
            c2187g.t0(j02);
            return;
        }
        e(data.d(), 127, 0);
        c2187g.t0(data);
    }

    public final void d(ArrayList arrayList) {
        int i9;
        int i10;
        if (this.f22465c) {
            int i11 = this.f22464b;
            if (i11 < this.f22466d) {
                e(i11, 31, 32);
            }
            this.f22465c = false;
            this.f22464b = Integer.MAX_VALUE;
            e(this.f22466d, 31, 32);
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            C2190j p9 = bVar.f22453a.p();
            Integer num = (Integer) e.f22472b.get(p9);
            C2190j c2190j = bVar.f22454b;
            if (num != null) {
                int intValue = num.intValue();
                i10 = intValue + 1;
                if (2 <= i10 && i10 < 8) {
                    b[] bVarArr = e.f22471a;
                    if (kotlin.jvm.internal.h.a(bVarArr[intValue].f22454b, c2190j)) {
                        i9 = i10;
                    } else if (kotlin.jvm.internal.h.a(bVarArr[i10].f22454b, c2190j)) {
                        i10 = intValue + 2;
                        i9 = i10;
                    }
                }
                i9 = i10;
                i10 = -1;
            } else {
                i9 = -1;
                i10 = -1;
            }
            if (i10 == -1) {
                int i13 = this.f22468f + 1;
                int length = this.f22467e.length;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    b bVar2 = this.f22467e[i13];
                    kotlin.jvm.internal.h.b(bVar2);
                    if (kotlin.jvm.internal.h.a(bVar2.f22453a, p9)) {
                        b bVar3 = this.f22467e[i13];
                        kotlin.jvm.internal.h.b(bVar3);
                        if (kotlin.jvm.internal.h.a(bVar3.f22454b, c2190j)) {
                            i10 = e.f22471a.length + (i13 - this.f22468f);
                            break;
                        } else if (i9 == -1) {
                            i9 = (i13 - this.f22468f) + e.f22471a.length;
                        }
                    }
                    i13++;
                }
            }
            if (i10 != -1) {
                e(i10, 127, 128);
            } else if (i9 == -1) {
                this.f22463a.w0(64);
                c(p9);
                c(c2190j);
                b(bVar);
            } else {
                C2190j prefix = b.f22447d;
                p9.getClass();
                kotlin.jvm.internal.h.e(prefix, "prefix");
                if (p9.m(0, prefix, prefix.d()) && !kotlin.jvm.internal.h.a(b.f22452i, p9)) {
                    e(i9, 15, 0);
                    c(c2190j);
                } else {
                    e(i9, 63, 64);
                    c(c2190j);
                    b(bVar);
                }
            }
        }
    }

    public final void e(int i9, int i10, int i11) {
        C2187g c2187g = this.f22463a;
        if (i9 < i10) {
            c2187g.w0(i9 | i11);
            return;
        }
        c2187g.w0(i11 | i10);
        int i12 = i9 - i10;
        while (i12 >= 128) {
            c2187g.w0(128 | (i12 & 127));
            i12 >>>= 7;
        }
        c2187g.w0(i12);
    }
}
