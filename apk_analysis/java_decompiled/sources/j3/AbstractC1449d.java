package j3;

import l4.AbstractC1566a;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1449d implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19584a;

    /* renamed from: c, reason: collision with root package name */
    public w0 f19586c;

    /* renamed from: d, reason: collision with root package name */
    public int f19587d;

    /* renamed from: e, reason: collision with root package name */
    public k3.l f19588e;

    /* renamed from: f, reason: collision with root package name */
    public int f19589f;

    /* renamed from: g, reason: collision with root package name */
    public N3.d0 f19590g;

    /* renamed from: h, reason: collision with root package name */
    public M[] f19591h;

    /* renamed from: i, reason: collision with root package name */
    public long f19592i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19593k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19594l;

    /* renamed from: b, reason: collision with root package name */
    public final O0.c f19585b = new O0.c(28, false);
    public long j = Long.MIN_VALUE;

    public AbstractC1449d(int i9) {
        this.f19584a = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j3.C1462m e(java.lang.Exception r11, j3.M r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 4
            if (r12 == 0) goto L1a
            boolean r1 = r10.f19594l
            if (r1 != 0) goto L1a
            r1 = 1
            r10.f19594l = r1
            r1 = 0
            int r2 = r10.w(r12)     // Catch: java.lang.Throwable -> L14 j3.C1462m -> L18
            r2 = r2 & 7
            r10.f19594l = r1
            goto L1b
        L14:
            r0 = move-exception
            r10.f19594l = r1
            throw r0
        L18:
            r10.f19594l = r1
        L1a:
            r2 = r0
        L1b:
            java.lang.String r5 = r10.g()
            int r6 = r10.f19587d
            j3.m r1 = new j3.m
            if (r12 != 0) goto L27
            r8 = r0
            goto L28
        L27:
            r8 = r2
        L28:
            r2 = 1
            r3 = r11
            r7 = r12
            r9 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.AbstractC1449d.e(java.lang.Exception, j3.M, boolean, int):j3.m");
    }

    public l4.m f() {
        return null;
    }

    public abstract String g();

    public final boolean h() {
        if (this.j == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void m(long j, boolean z9);

    public abstract void q(M[] mArr, long j, long j4);

    public final int r(O0.c cVar, m3.f fVar, int i9) {
        N3.d0 d0Var = this.f19590g;
        d0Var.getClass();
        int d9 = d0Var.d(cVar, fVar, i9);
        if (d9 == -4) {
            if (fVar.e(4)) {
                this.j = Long.MIN_VALUE;
                if (this.f19593k) {
                    return -4;
                }
                return -3;
            }
            long j = fVar.f20706f + this.f19592i;
            fVar.f20706f = j;
            this.j = Math.max(this.j, j);
            return d9;
        }
        if (d9 == -5) {
            M m9 = (M) cVar.f5264c;
            m9.getClass();
            long j4 = m9.f19439p;
            if (j4 != Long.MAX_VALUE) {
                L a5 = m9.a();
                a5.f19406o = j4 + this.f19592i;
                cVar.f5264c = new M(a5);
            }
        }
        return d9;
    }

    public abstract void s(long j, long j4);

    public final void t(M[] mArr, N3.d0 d0Var, long j, long j4) {
        AbstractC1566a.m(!this.f19593k);
        this.f19590g = d0Var;
        if (this.j == Long.MIN_VALUE) {
            this.j = j;
        }
        this.f19591h = mArr;
        this.f19592i = j4;
        q(mArr, j, j4);
    }

    public final void u() {
        boolean z9;
        if (this.f19589f == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f19585b.j();
        n();
    }

    public void v(float f9, float f10) {
    }

    public abstract int w(M m9);

    public int x() {
        return 0;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    @Override // j3.s0
    public void d(int i9, Object obj) {
    }

    public void l(boolean z9, boolean z10) {
    }
}
