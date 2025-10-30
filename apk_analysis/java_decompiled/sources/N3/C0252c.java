package N3;

/* renamed from: N3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f5044a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0253d f5046c;

    public C0252c(C0253d c0253d, d0 d0Var) {
        this.f5046c = c0253d;
        this.f5044a = d0Var;
    }

    @Override // N3.d0
    public final void b() {
        this.f5044a.b();
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        C0253d c0253d = this.f5046c;
        if (c0253d.b()) {
            return -3;
        }
        if (this.f5045b) {
            fVar.f6039b = 4;
            return -4;
        }
        int d9 = this.f5044a.d(cVar, fVar, i9);
        if (d9 == -5) {
            j3.M m9 = (j3.M) cVar.f5264c;
            m9.getClass();
            int i10 = m9.f19422C;
            int i11 = m9.f19421B;
            if (i11 == 0 && i10 == 0) {
                return -5;
            }
            if (c0253d.f5083e != 0) {
                i11 = 0;
            }
            if (c0253d.f5084f != Long.MIN_VALUE) {
                i10 = 0;
            }
            j3.L a5 = m9.a();
            a5.f19389A = i11;
            a5.f19390B = i10;
            cVar.f5264c = new j3.M(a5);
            return -5;
        }
        long j = c0253d.f5084f;
        if (j != Long.MIN_VALUE && ((d9 == -4 && fVar.f20706f >= j) || (d9 == -3 && c0253d.p() == Long.MIN_VALUE && !fVar.f20705e))) {
            fVar.r();
            fVar.f6039b = 4;
            this.f5045b = true;
            return -4;
        }
        return d9;
    }

    @Override // N3.d0
    public final boolean j() {
        if (!this.f5046c.b() && this.f5044a.j()) {
            return true;
        }
        return false;
    }

    @Override // N3.d0
    public final int m(long j) {
        if (this.f5046c.b()) {
            return -3;
        }
        return this.f5044a.m(j);
    }
}
