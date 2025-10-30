package z3;

import A4.r;
import java.io.EOFException;
import l4.AbstractC1566a;
import q3.C1902g;

/* renamed from: z3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2241e {

    /* renamed from: a, reason: collision with root package name */
    public final C2242f f25384a = new C2242f();

    /* renamed from: b, reason: collision with root package name */
    public final r f25385b = new r(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    public int f25386c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f25387d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25388e;

    public final int a(int i9) {
        int i10;
        int i11 = 0;
        this.f25387d = 0;
        do {
            int i12 = this.f25387d;
            int i13 = i9 + i12;
            C2242f c2242f = this.f25384a;
            if (i13 >= c2242f.f25391c) {
                break;
            }
            int[] iArr = c2242f.f25394f;
            this.f25387d = i12 + 1;
            i10 = iArr[i12 + i9];
            i11 += i10;
        } while (i10 == 255);
        return i11;
    }

    public final boolean b(C1902g c1902g) {
        boolean z9;
        boolean z10;
        int i9;
        if (c1902g != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        boolean z11 = this.f25388e;
        r rVar = this.f25385b;
        if (z11) {
            this.f25388e = false;
            rVar.E(0);
        }
        while (!this.f25388e) {
            int i10 = this.f25386c;
            C2242f c2242f = this.f25384a;
            if (i10 < 0) {
                if (c2242f.b(c1902g, -1L) && c2242f.a(c1902g, true)) {
                    int i11 = c2242f.f25392d;
                    if ((c2242f.f25389a & 1) == 1 && rVar.f383b == 0) {
                        i11 += a(0);
                        i9 = this.f25387d;
                    } else {
                        i9 = 0;
                    }
                    try {
                        c1902g.n(i11);
                        this.f25386c = i9;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a5 = a(this.f25386c);
            int i12 = this.f25386c + this.f25387d;
            if (a5 > 0) {
                rVar.f(rVar.f383b + a5);
                c1902g.e((byte[]) rVar.f384c, rVar.f383b, a5, false);
                rVar.G(rVar.f383b + a5);
                if (c2242f.f25394f[i12 - 1] != 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f25388e = z10;
            }
            if (i12 == c2242f.f25391c) {
                i12 = -1;
            }
            this.f25386c = i12;
        }
        return true;
    }
}
