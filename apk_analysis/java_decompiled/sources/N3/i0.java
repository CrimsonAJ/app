package N3;

/* loaded from: classes.dex */
public final class i0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5121a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f5123c;

    public i0(k0 k0Var) {
        this.f5123c = k0Var;
    }

    public final void a() {
        if (!this.f5122b) {
            k0 k0Var = this.f5123c;
            k0Var.f5136e.b(l4.n.h(k0Var.j.f19435l), k0Var.j, 0, null, 0L);
            this.f5122b = true;
        }
    }

    @Override // N3.d0
    public final void b() {
        k0 k0Var = this.f5123c;
        if (!k0Var.f5141k) {
            k0Var.f5140i.b();
        }
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        a();
        k0 k0Var = this.f5123c;
        boolean z9 = k0Var.f5142l;
        if (z9 && k0Var.f5143m == null) {
            this.f5121a = 2;
        }
        int i10 = this.f5121a;
        if (i10 == 2) {
            fVar.b(4);
            return -4;
        }
        if ((i9 & 2) == 0 && i10 != 0) {
            if (!z9) {
                return -3;
            }
            k0Var.f5143m.getClass();
            fVar.b(1);
            fVar.f20706f = 0L;
            if ((i9 & 4) == 0) {
                fVar.t(k0Var.f5144n);
                fVar.f20704d.put(k0Var.f5143m, 0, k0Var.f5144n);
            }
            if ((i9 & 1) == 0) {
                this.f5121a = 2;
            }
            return -4;
        }
        cVar.f5264c = k0Var.j;
        this.f5121a = 1;
        return -5;
    }

    @Override // N3.d0
    public final boolean j() {
        return this.f5123c.f5142l;
    }

    @Override // N3.d0
    public final int m(long j) {
        a();
        if (j > 0 && this.f5121a != 2) {
            this.f5121a = 2;
            return 1;
        }
        return 0;
    }
}
