package P3;

import N3.G;
import N3.c0;
import N3.d0;

/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f5847a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f5848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5849c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f5851e;

    public f(g gVar, g gVar2, c0 c0Var, int i9) {
        this.f5851e = gVar;
        this.f5847a = gVar2;
        this.f5848b = c0Var;
        this.f5849c = i9;
    }

    public final void a() {
        if (!this.f5850d) {
            g gVar = this.f5851e;
            G g9 = gVar.f5858g;
            int[] iArr = gVar.f5853b;
            int i9 = this.f5849c;
            g9.b(iArr[i9], gVar.f5854c[i9], 0, null, gVar.f5870t);
            this.f5850d = true;
        }
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        g gVar = this.f5851e;
        if (!gVar.t()) {
            a aVar = gVar.f5872v;
            c0 c0Var = this.f5848b;
            if (aVar != null && aVar.e(this.f5849c + 1) <= c0Var.q()) {
                return -3;
            }
            a();
            return c0Var.z(cVar, fVar, i9, gVar.f5873w);
        }
        return -3;
    }

    @Override // N3.d0
    public final boolean j() {
        g gVar = this.f5851e;
        if (!gVar.t() && this.f5848b.u(gVar.f5873w)) {
            return true;
        }
        return false;
    }

    @Override // N3.d0
    public final int m(long j) {
        g gVar = this.f5851e;
        if (gVar.t()) {
            return 0;
        }
        boolean z9 = gVar.f5873w;
        c0 c0Var = this.f5848b;
        int s9 = c0Var.s(j, z9);
        a aVar = gVar.f5872v;
        if (aVar != null) {
            s9 = Math.min(s9, aVar.e(this.f5849c + 1) - c0Var.q());
        }
        c0Var.F(s9);
        if (s9 > 0) {
            a();
        }
        return s9;
    }

    @Override // N3.d0
    public final void b() {
    }
}
