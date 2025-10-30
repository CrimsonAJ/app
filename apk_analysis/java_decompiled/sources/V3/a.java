package V3;

import A4.r;
import B6.u0;
import U3.l;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final l f7664a;

    /* renamed from: b, reason: collision with root package name */
    public final Z3.f f7665b = new Z3.f();

    /* renamed from: c, reason: collision with root package name */
    public final int f7666c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7667d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7668e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7669f;

    /* renamed from: g, reason: collision with root package name */
    public long f7670g;

    /* renamed from: h, reason: collision with root package name */
    public u f7671h;

    /* renamed from: i, reason: collision with root package name */
    public long f7672i;

    public a(l lVar) {
        this.f7664a = lVar;
        this.f7666c = lVar.f7399b;
        String str = (String) lVar.f7401d.get("mode");
        str.getClass();
        if (u0.w(str, "AAC-hbr")) {
            this.f7667d = 13;
            this.f7668e = 3;
        } else if (u0.w(str, "AAC-lbr")) {
            this.f7667d = 6;
            this.f7668e = 2;
        } else {
            throw new UnsupportedOperationException("AAC mode not supported");
        }
        this.f7669f = this.f7668e + this.f7667d;
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        this.f7670g = j;
        this.f7672i = j4;
    }

    @Override // V3.h
    public final void c(long j) {
        this.f7670g = j;
    }

    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        this.f7671h.getClass();
        short u9 = rVar.u();
        int i10 = u9 / this.f7669f;
        long w7 = AbstractC1570b.w(this.f7672i, j, this.f7670g, this.f7666c);
        Z3.f fVar = this.f7665b;
        fVar.getClass();
        fVar.n(rVar.f383b, (byte[]) rVar.f384c);
        fVar.o(rVar.f382a * 8);
        int i11 = this.f7668e;
        int i12 = this.f7667d;
        if (i10 == 1) {
            int i13 = fVar.i(i12);
            fVar.r(i11);
            this.f7671h.c(rVar.e(), rVar);
            if (z9) {
                this.f7671h.d(w7, 1, i13, 0, null);
                return;
            }
            return;
        }
        rVar.I((u9 + 7) / 8);
        long j4 = w7;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = fVar.i(i12);
            fVar.r(i11);
            this.f7671h.c(i15, rVar);
            this.f7671h.d(j4, 1, i15, 0, null);
            j4 += y.O(i10, 1000000L, this.f7666c);
        }
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        u u9 = interfaceC1907l.u(i9, 1);
        this.f7671h = u9;
        u9.e(this.f7664a.f7400c);
    }
}
