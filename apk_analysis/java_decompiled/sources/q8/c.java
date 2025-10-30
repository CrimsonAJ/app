package q8;

import java.io.IOException;
import java.util.ArrayList;
import x8.C;
import x8.C2190j;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final C f22458c;

    /* renamed from: f, reason: collision with root package name */
    public int f22461f;

    /* renamed from: g, reason: collision with root package name */
    public int f22462g;

    /* renamed from: a, reason: collision with root package name */
    public int f22456a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22457b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public b[] f22459d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f22460e = 7;

    public c(q qVar) {
        this.f22458c = v4.e.b(qVar);
    }

    public final int a(int i9) {
        int i10;
        int i11 = 0;
        if (i9 > 0) {
            int length = this.f22459d.length;
            while (true) {
                length--;
                i10 = this.f22460e;
                if (length < i10 || i9 <= 0) {
                    break;
                }
                b bVar = this.f22459d[length];
                kotlin.jvm.internal.h.b(bVar);
                int i12 = bVar.f22455c;
                i9 -= i12;
                this.f22462g -= i12;
                this.f22461f--;
                i11++;
            }
            b[] bVarArr = this.f22459d;
            System.arraycopy(bVarArr, i10 + 1, bVarArr, i10 + 1 + i11, this.f22461f);
            this.f22460e += i11;
        }
        return i11;
    }

    public final C2190j b(int i9) {
        if (i9 >= 0) {
            b[] bVarArr = e.f22471a;
            if (i9 <= bVarArr.length - 1) {
                return bVarArr[i9].f22453a;
            }
        }
        int length = this.f22460e + 1 + (i9 - e.f22471a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f22459d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                kotlin.jvm.internal.h.b(bVar);
                return bVar.f22453a;
            }
        }
        throw new IOException("Header index too large " + (i9 + 1));
    }

    public final void c(b bVar) {
        this.f22457b.add(bVar);
        int i9 = this.f22456a;
        int i10 = bVar.f22455c;
        if (i10 > i9) {
            B7.j.i0(r7, null, 0, this.f22459d.length);
            this.f22460e = this.f22459d.length - 1;
            this.f22461f = 0;
            this.f22462g = 0;
            return;
        }
        a((this.f22462g + i10) - i9);
        int i11 = this.f22461f + 1;
        b[] bVarArr = this.f22459d;
        if (i11 > bVarArr.length) {
            b[] bVarArr2 = new b[bVarArr.length * 2];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f22460e = this.f22459d.length - 1;
            this.f22459d = bVarArr2;
        }
        int i12 = this.f22460e;
        this.f22460e = i12 - 1;
        this.f22459d[i12] = bVar;
        this.f22461f++;
        this.f22462g += i10;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, x8.g] */
    public final C2190j d() {
        boolean z9;
        int i9;
        C source = this.f22458c;
        byte g9 = source.g();
        byte[] bArr = k8.c.f20141a;
        int i10 = g9 & 255;
        int i11 = 0;
        if ((g9 & 128) == 128) {
            z9 = true;
        } else {
            z9 = false;
        }
        long e8 = e(i10, 127);
        if (z9) {
            ?? obj = new Object();
            int[] iArr = x.f22568a;
            kotlin.jvm.internal.h.e(source, "source");
            A4.r rVar = x.f22570c;
            A4.r rVar2 = rVar;
            int i12 = 0;
            for (long j = 0; j < e8; j++) {
                byte g10 = source.g();
                byte[] bArr2 = k8.c.f20141a;
                i11 = (i11 << 8) | (g10 & 255);
                i12 += 8;
                while (i12 >= 8) {
                    A4.r[] rVarArr = (A4.r[]) rVar2.f384c;
                    kotlin.jvm.internal.h.b(rVarArr);
                    rVar2 = rVarArr[(i11 >>> (i12 - 8)) & 255];
                    kotlin.jvm.internal.h.b(rVar2);
                    if (((A4.r[]) rVar2.f384c) == null) {
                        obj.w0(rVar2.f382a);
                        i12 -= rVar2.f383b;
                        rVar2 = rVar;
                    } else {
                        i12 -= 8;
                    }
                }
            }
            while (i12 > 0) {
                A4.r[] rVarArr2 = (A4.r[]) rVar2.f384c;
                kotlin.jvm.internal.h.b(rVarArr2);
                A4.r rVar3 = rVarArr2[(i11 << (8 - i12)) & 255];
                kotlin.jvm.internal.h.b(rVar3);
                if (((A4.r[]) rVar3.f384c) != null || (i9 = rVar3.f383b) > i12) {
                    break;
                }
                obj.w0(rVar3.f382a);
                i12 -= i9;
                rVar2 = rVar;
            }
            return obj.j0(obj.f24644b);
        }
        return source.s(e8);
    }

    public final int e(int i9, int i10) {
        int i11 = i9 & i10;
        if (i11 < i10) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            byte g9 = this.f22458c.g();
            byte[] bArr = k8.c.f20141a;
            int i13 = g9 & 255;
            if ((g9 & 128) != 0) {
                i10 += (g9 & Byte.MAX_VALUE) << i12;
                i12 += 7;
            } else {
                return i10 + (i13 << i12);
            }
        }
    }
}
