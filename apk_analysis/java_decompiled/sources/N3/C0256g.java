package N3;

import j3.D0;
import j3.E0;
import java.util.ArrayList;
import k4.C1517q;
import l4.AbstractC1566a;

/* renamed from: N3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256g extends p0 {

    /* renamed from: l, reason: collision with root package name */
    public final long f5090l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5091m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5092n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5093o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5094p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f5095q;

    /* renamed from: r, reason: collision with root package name */
    public final D0 f5096r;

    /* renamed from: s, reason: collision with root package name */
    public C0254e f5097s;

    /* renamed from: t, reason: collision with root package name */
    public C0255f f5098t;

    /* renamed from: u, reason: collision with root package name */
    public long f5099u;

    /* renamed from: v, reason: collision with root package name */
    public long f5100v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0256g(AbstractC0250a abstractC0250a, long j, long j4, boolean z9, boolean z10, boolean z11) {
        super(abstractC0250a);
        boolean z12;
        abstractC0250a.getClass();
        if (j >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC1566a.h(z12);
        this.f5090l = j;
        this.f5091m = j4;
        this.f5092n = z9;
        this.f5093o = z10;
        this.f5094p = z11;
        this.f5095q = new ArrayList();
        this.f5096r = new D0();
    }

    @Override // N3.p0
    public final void B(E0 e02) {
        if (this.f5098t != null) {
            return;
        }
        D(e02);
    }

    public final void D(E0 e02) {
        long j;
        long j4;
        long j9;
        D0 d02 = this.f5096r;
        e02.n(0, d02);
        long j10 = d02.f19318q;
        C0254e c0254e = this.f5097s;
        ArrayList arrayList = this.f5095q;
        long j11 = this.f5091m;
        long j12 = Long.MIN_VALUE;
        if (c0254e != null && !arrayList.isEmpty() && !this.f5093o) {
            j = this.f5099u - j10;
            if (j11 != Long.MIN_VALUE) {
                j12 = this.f5100v - j10;
            }
            j9 = j12;
        } else {
            boolean z9 = this.f5094p;
            j = this.f5090l;
            if (z9) {
                long j13 = d02.f19314m;
                j += j13;
                j4 = j13 + j11;
            } else {
                j4 = j11;
            }
            this.f5099u = j10 + j;
            if (j11 != Long.MIN_VALUE) {
                j12 = j10 + j4;
            }
            this.f5100v = j12;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                C0253d c0253d = (C0253d) arrayList.get(i9);
                long j14 = this.f5099u;
                long j15 = this.f5100v;
                c0253d.f5083e = j14;
                c0253d.f5084f = j15;
            }
            j9 = j4;
        }
        try {
            C0254e c0254e2 = new C0254e(e02, j, j9);
            this.f5097s = c0254e2;
            o(c0254e2);
        } catch (C0255f e8) {
            this.f5098t = e8;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C0253d) arrayList.get(i10)).f5085g = this.f5098t;
            }
        }
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        C0253d c0253d = new C0253d(this.f5179k.b(a5, c1517q, j), this.f5092n, this.f5099u, this.f5100v);
        this.f5095q.add(c0253d);
        return c0253d;
    }

    @Override // N3.AbstractC0259j, N3.AbstractC0250a
    public final void l() {
        C0255f c0255f = this.f5098t;
        if (c0255f == null) {
            super.l();
            return;
        }
        throw c0255f;
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        ArrayList arrayList = this.f5095q;
        AbstractC1566a.m(arrayList.remove(interfaceC0272x));
        this.f5179k.p(((C0253d) interfaceC0272x).f5079a);
        if (arrayList.isEmpty() && !this.f5093o) {
            C0254e c0254e = this.f5097s;
            c0254e.getClass();
            D(c0254e.f5173b);
        }
    }

    @Override // N3.AbstractC0259j, N3.AbstractC0250a
    public final void r() {
        super.r();
        this.f5098t = null;
        this.f5097s = null;
    }
}
