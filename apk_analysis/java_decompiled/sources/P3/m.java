package P3;

import N3.c0;
import j3.M;
import k4.C1516p;
import k4.InterfaceC1513m;
import k4.V;
import l4.AbstractC1566a;
import q3.C1902g;
import q3.u;
import s8.n;

/* loaded from: classes.dex */
public final class m extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f5884o;

    /* renamed from: p, reason: collision with root package name */
    public final M f5885p;

    /* renamed from: q, reason: collision with root package name */
    public long f5886q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5887r;

    public m(InterfaceC1513m interfaceC1513m, C1516p c1516p, M m9, int i9, Object obj, long j, long j4, long j9, int i10, M m10) {
        super(interfaceC1513m, c1516p, m9, i9, obj, j, j4, -9223372036854775807L, -9223372036854775807L, j9);
        this.f5884o = i10;
        this.f5885p = m10;
    }

    @Override // k4.J
    public final void a() {
        V v8 = this.f5846i;
        O0.c cVar = this.f5818m;
        AbstractC1566a.n(cVar);
        for (c0 c0Var : (c0[]) cVar.f5264c) {
            if (c0Var.f5052F != 0) {
                c0Var.f5052F = 0L;
                c0Var.f5078z = true;
            }
        }
        u Q7 = cVar.Q(this.f5884o);
        Q7.e(this.f5885p);
        try {
            long g9 = v8.g(this.f5839b.c(this.f5886q));
            if (g9 != -1) {
                g9 += this.f5886q;
            }
            C1902g c1902g = new C1902g(this.f5846i, this.f5886q, g9);
            for (int i9 = 0; i9 != -1; i9 = Q7.a(c1902g, Integer.MAX_VALUE, true)) {
                this.f5886q += i9;
            }
            Q7.d(this.f5844g, 1, (int) this.f5886q, 0, null);
            n.h(v8);
            this.f5887r = true;
        } catch (Throwable th) {
            n.h(v8);
            throw th;
        }
    }

    @Override // P3.k
    public final boolean d() {
        return this.f5887r;
    }

    @Override // k4.J
    public final void c() {
    }
}
