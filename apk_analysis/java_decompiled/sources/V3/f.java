package V3;

import A4.r;
import P5.X;
import U3.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.j0;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f7710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7711b;

    /* renamed from: c, reason: collision with root package name */
    public u f7712c;

    /* renamed from: d, reason: collision with root package name */
    public long f7713d;

    /* renamed from: e, reason: collision with root package name */
    public int f7714e;

    /* renamed from: f, reason: collision with root package name */
    public int f7715f;

    /* renamed from: g, reason: collision with root package name */
    public long f7716g;

    /* renamed from: h, reason: collision with root package name */
    public long f7717h;

    public f(l lVar) {
        this.f7710a = lVar;
        try {
            this.f7711b = a(lVar.f7401d);
            this.f7713d = -9223372036854775807L;
            this.f7714e = -1;
            this.f7715f = 0;
            this.f7716g = 0L;
            this.f7717h = -9223372036854775807L;
        } catch (j0 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static int a(X x5) {
        boolean z9;
        boolean z10;
        String str = (String) x5.get("config");
        int i9 = 0;
        boolean z11 = false;
        i9 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] p9 = y.p(str);
            Z3.f fVar = new Z3.f(p9.length, p9);
            int i10 = fVar.i(1);
            if (i10 == 0) {
                if (fVar.i(1) == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.g("Only supports allStreamsSameTimeFraming.", z9);
                int i11 = fVar.i(6);
                if (fVar.i(4) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.g("Only suppors one program.", z10);
                if (fVar.i(3) == 0) {
                    z11 = true;
                }
                AbstractC1566a.g("Only suppors one layer.", z11);
                i9 = i11;
            } else {
                throw new j0(AbstractC0953k1.j(i10, "unsupported audio mux version: "), null, true, 0);
            }
        }
        return i9 + 1;
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        this.f7713d = j;
        this.f7715f = 0;
        this.f7716g = j4;
    }

    @Override // V3.h
    public final void c(long j) {
        boolean z9;
        if (this.f7713d == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f7713d = j;
    }

    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        AbstractC1566a.n(this.f7712c);
        int a5 = U3.i.a(this.f7714e);
        if (this.f7715f > 0 && a5 < i9) {
            u uVar = this.f7712c;
            uVar.getClass();
            uVar.d(this.f7717h, 1, this.f7715f, 0, null);
            this.f7715f = 0;
            this.f7717h = -9223372036854775807L;
        }
        for (int i10 = 0; i10 < this.f7711b; i10++) {
            int i11 = 0;
            while (rVar.f382a < rVar.f383b) {
                int x5 = rVar.x();
                i11 += x5;
                if (x5 != 255) {
                    break;
                }
            }
            this.f7712c.c(i11, rVar);
            this.f7715f += i11;
        }
        this.f7717h = AbstractC1570b.w(this.f7716g, j, this.f7713d, this.f7710a.f7399b);
        if (z9) {
            u uVar2 = this.f7712c;
            uVar2.getClass();
            uVar2.d(this.f7717h, 1, this.f7715f, 0, null);
            this.f7715f = 0;
            this.f7717h = -9223372036854775807L;
        }
        this.f7714e = i9;
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        u u9 = interfaceC1907l.u(i9, 2);
        this.f7712c = u9;
        int i10 = y.f20553a;
        u9.e(this.f7710a.f7400c);
    }
}
