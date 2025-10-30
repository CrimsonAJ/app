package N3;

/* loaded from: classes.dex */
public final class K implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f4930a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4931b;

    public K(d0 d0Var, long j) {
        this.f4930a = d0Var;
        this.f4931b = j;
    }

    @Override // N3.d0
    public final void b() {
        this.f4930a.b();
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        int d9 = this.f4930a.d(cVar, fVar, i9);
        if (d9 == -4) {
            fVar.f20706f = Math.max(0L, fVar.f20706f + this.f4931b);
        }
        return d9;
    }

    @Override // N3.d0
    public final boolean j() {
        return this.f4930a.j();
    }

    @Override // N3.d0
    public final int m(long j) {
        return this.f4930a.m(j - this.f4931b);
    }
}
