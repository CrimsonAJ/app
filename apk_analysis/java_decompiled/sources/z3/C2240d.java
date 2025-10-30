package z3;

import A4.r;
import j3.j0;
import l4.y;
import l6.AbstractC1570b;
import q3.C1902g;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: z3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2240d implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1907l f25381a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC2245i f25382b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25383c;

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        AbstractC2245i abstractC2245i = this.f25382b;
        if (abstractC2245i != null) {
            C2241e c2241e = abstractC2245i.f25399a;
            C2242f c2242f = c2241e.f25384a;
            c2242f.f25389a = 0;
            c2242f.f25390b = 0L;
            c2242f.f25391c = 0;
            c2242f.f25392d = 0;
            c2242f.f25393e = 0;
            c2241e.f25385b.E(0);
            c2241e.f25386c = -1;
            c2241e.f25388e = false;
            if (j == 0) {
                abstractC2245i.d(!abstractC2245i.f25409l);
                return;
            }
            if (abstractC2245i.f25406h != 0) {
                long j9 = (abstractC2245i.f25407i * j4) / 1000000;
                abstractC2245i.f25403e = j9;
                InterfaceC2243g interfaceC2243g = abstractC2245i.f25402d;
                int i9 = y.f20553a;
                interfaceC2243g.t(j9);
                abstractC2245i.f25406h = 2;
            }
        }
    }

    public final boolean c(C1902g c1902g) {
        boolean z9;
        C2242f c2242f = new C2242f();
        if (c2242f.a(c1902g, true) && (c2242f.f25389a & 2) == 2) {
            int min = Math.min(c2242f.f25393e, 8);
            r rVar = new r(min);
            c1902g.t((byte[]) rVar.f384c, 0, min, false);
            rVar.H(0);
            if (rVar.e() >= 5 && rVar.x() == 127 && rVar.y() == 1179402563) {
                this.f25382b = new AbstractC2245i();
                return true;
            }
            rVar.H(0);
            try {
                z9 = AbstractC1570b.y(1, rVar, true);
            } catch (j0 unused) {
                z9 = false;
            }
            if (z9) {
                this.f25382b = new AbstractC2245i();
            } else {
                rVar.H(0);
                if (C2244h.e(rVar, C2244h.f25396o)) {
                    this.f25382b = new AbstractC2245i();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r20, c7.C0790j r21) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2240d.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f25381a = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        try {
            return c((C1902g) interfaceC1906k);
        } catch (j0 unused) {
            return false;
        }
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
