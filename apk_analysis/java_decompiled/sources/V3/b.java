package V3;

import A4.r;
import U3.l;
import l3.AbstractC1552a;
import l3.C1553b;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f7673a;

    /* renamed from: c, reason: collision with root package name */
    public u f7675c;

    /* renamed from: d, reason: collision with root package name */
    public int f7676d;

    /* renamed from: f, reason: collision with root package name */
    public long f7678f;

    /* renamed from: g, reason: collision with root package name */
    public long f7679g;

    /* renamed from: b, reason: collision with root package name */
    public final Z3.f f7674b = new Z3.f();

    /* renamed from: e, reason: collision with root package name */
    public long f7677e = -9223372036854775807L;

    public b(l lVar) {
        this.f7673a = lVar;
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        this.f7677e = j;
        this.f7679g = j4;
    }

    @Override // V3.h
    public final void c(long j) {
        boolean z9;
        if (this.f7677e == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f7677e = j;
    }

    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        int x5 = rVar.x() & 3;
        int x9 = rVar.x() & 255;
        long w7 = AbstractC1570b.w(this.f7679g, j, this.f7677e, this.f7673a.f7399b);
        if (x5 != 0) {
            if (x5 != 1 && x5 != 2) {
                if (x5 != 3) {
                    throw new IllegalArgumentException(String.valueOf(x5));
                }
            } else {
                int i10 = this.f7676d;
                if (i10 > 0) {
                    u uVar = this.f7675c;
                    int i11 = y.f20553a;
                    uVar.d(this.f7678f, 1, i10, 0, null);
                    this.f7676d = 0;
                }
            }
            int e8 = rVar.e();
            u uVar2 = this.f7675c;
            uVar2.getClass();
            uVar2.c(e8, rVar);
            int i12 = this.f7676d + e8;
            this.f7676d = i12;
            this.f7678f = w7;
            if (z9 && x5 == 3) {
                u uVar3 = this.f7675c;
                int i13 = y.f20553a;
                uVar3.d(w7, 1, i12, 0, null);
                this.f7676d = 0;
                return;
            }
            return;
        }
        int i14 = this.f7676d;
        if (i14 > 0) {
            u uVar4 = this.f7675c;
            int i15 = y.f20553a;
            uVar4.d(this.f7678f, 1, i14, 0, null);
            this.f7676d = 0;
        }
        if (x9 == 1) {
            int e9 = rVar.e();
            u uVar5 = this.f7675c;
            uVar5.getClass();
            uVar5.c(e9, rVar);
            u uVar6 = this.f7675c;
            int i16 = y.f20553a;
            uVar6.d(w7, 1, e9, 0, null);
            return;
        }
        byte[] bArr = (byte[]) rVar.f384c;
        Z3.f fVar = this.f7674b;
        fVar.getClass();
        fVar.n(bArr.length, bArr);
        fVar.s(2);
        long j4 = w7;
        for (int i17 = 0; i17 < x9; i17++) {
            C1553b g9 = AbstractC1552a.g(fVar);
            u uVar7 = this.f7675c;
            uVar7.getClass();
            int i18 = g9.f20386c;
            uVar7.c(i18, rVar);
            u uVar8 = this.f7675c;
            int i19 = y.f20553a;
            uVar8.d(j4, 1, g9.f20386c, 0, null);
            j4 += (g9.f20387d / g9.f20384a) * 1000000;
            fVar.s(i18);
        }
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        u u9 = interfaceC1907l.u(i9, 1);
        this.f7675c = u9;
        u9.e(this.f7673a.f7400c);
    }
}
