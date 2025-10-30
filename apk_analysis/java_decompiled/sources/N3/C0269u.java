package N3;

import j3.C0;
import j3.D0;
import j3.E0;
import k4.C1517q;
import l4.AbstractC1566a;

/* renamed from: N3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269u extends p0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5192l;

    /* renamed from: m, reason: collision with root package name */
    public final D0 f5193m;

    /* renamed from: n, reason: collision with root package name */
    public final C0 f5194n;

    /* renamed from: o, reason: collision with root package name */
    public C0267s f5195o;

    /* renamed from: p, reason: collision with root package name */
    public r f5196p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5197q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5198r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5199s;

    public C0269u(AbstractC0250a abstractC0250a, boolean z9) {
        super(abstractC0250a);
        boolean z10;
        if (z9 && abstractC0250a.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5192l = z10;
        this.f5193m = new D0();
        this.f5194n = new C0();
        E0 i9 = abstractC0250a.i();
        if (i9 != null) {
            this.f5195o = new C0267s(i9, null, null);
            this.f5199s = true;
        } else {
            this.f5195o = new C0267s(new C0268t(abstractC0250a.j()), D0.f19300r, C0267s.f5188e);
        }
    }

    @Override // N3.p0
    public final A A(A a5) {
        Object obj = a5.f5207a;
        Object obj2 = this.f5195o.f5190d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0267s.f5188e;
        }
        return a5.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c6  */
    @Override // N3.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(j3.E0 r13) {
        /*
            r12 = this;
            boolean r1 = r12.f5198r
            if (r1 == 0) goto L1c
            N3.s r1 = r12.f5195o
            N3.s r2 = new N3.s
            java.lang.Object r3 = r1.f5189c
            java.lang.Object r1 = r1.f5190d
            r2.<init>(r13, r3, r1)
            r12.f5195o = r2
            N3.r r0 = r12.f5196p
            if (r0 == 0) goto Lb9
            long r0 = r0.f5187g
            r12.E(r0)
            goto Lb9
        L1c:
            boolean r1 = r13.p()
            java.lang.Object r6 = N3.C0267s.f5188e
            if (r1 == 0) goto L3f
            boolean r1 = r12.f5199s
            if (r1 == 0) goto L34
            N3.s r1 = r12.f5195o
            N3.s r2 = new N3.s
            java.lang.Object r3 = r1.f5189c
            java.lang.Object r1 = r1.f5190d
            r2.<init>(r13, r3, r1)
            goto L3b
        L34:
            java.lang.Object r1 = j3.D0.f19300r
            N3.s r2 = new N3.s
            r2.<init>(r13, r1, r6)
        L3b:
            r12.f5195o = r2
            goto Lb9
        L3f:
            r1 = 0
            j3.D0 r2 = r12.f5193m
            r13.n(r1, r2)
            long r3 = r2.f19314m
            java.lang.Object r7 = r2.f19303a
            N3.r r5 = r12.f5196p
            if (r5 == 0) goto L6c
            N3.s r8 = r12.f5195o
            N3.A r9 = r5.f5181a
            java.lang.Object r9 = r9.f5207a
            j3.C0 r10 = r12.f5194n
            r8.g(r9, r10)
            long r8 = r10.f19239e
            long r10 = r5.f5182b
            long r8 = r8 + r10
            N3.s r5 = r12.f5195o
            r10 = 0
            r5.m(r1, r2, r10)
            long r1 = r2.f19314m
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L6c
            r4 = r8
            goto L6d
        L6c:
            r4 = r3
        L6d:
            r3 = 0
            j3.D0 r1 = r12.f5193m
            j3.C0 r2 = r12.f5194n
            r0 = r13
            android.util.Pair r1 = r0.i(r1, r2, r3, r4)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r12.f5199s
            if (r1 == 0) goto L91
            N3.s r1 = r12.f5195o
            N3.s r2 = new N3.s
            java.lang.Object r5 = r1.f5189c
            java.lang.Object r1 = r1.f5190d
            r2.<init>(r13, r5, r1)
            goto L97
        L91:
            N3.s r1 = new N3.s
            r1.<init>(r13, r7, r2)
            r2 = r1
        L97:
            r12.f5195o = r2
            N3.r r0 = r12.f5196p
            if (r0 == 0) goto Lb9
            r12.E(r3)
            N3.A r0 = r0.f5181a
            N3.s r1 = r12.f5195o
            java.lang.Object r1 = r1.f5190d
            java.lang.Object r2 = r0.f5207a
            if (r1 == 0) goto Lb4
            boolean r1 = r2.equals(r6)
            if (r1 == 0) goto Lb4
            N3.s r1 = r12.f5195o
            java.lang.Object r2 = r1.f5190d
        Lb4:
            N3.A r0 = r0.b(r2)
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            r1 = 1
            r12.f5199s = r1
            r12.f5198r = r1
            N3.s r1 = r12.f5195o
            r12.o(r1)
            if (r0 == 0) goto Lce
            N3.r r1 = r12.f5196p
            r1.getClass()
            r1.b(r0)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C0269u.B(j3.E0):void");
    }

    @Override // N3.p0
    public final void C() {
        if (!this.f5192l) {
            this.f5197q = true;
            z(null, this.f5179k);
        }
    }

    @Override // N3.AbstractC0250a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final r b(A a5, C1517q c1517q, long j) {
        boolean z9;
        r rVar = new r(a5, c1517q, j);
        if (rVar.f5184d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        AbstractC0250a abstractC0250a = this.f5179k;
        rVar.f5184d = abstractC0250a;
        if (this.f5198r) {
            Object obj = this.f5195o.f5190d;
            Object obj2 = a5.f5207a;
            if (obj != null && obj2.equals(C0267s.f5188e)) {
                obj2 = this.f5195o.f5190d;
            }
            rVar.b(a5.b(obj2));
            return rVar;
        }
        this.f5196p = rVar;
        if (!this.f5197q) {
            this.f5197q = true;
            z(null, abstractC0250a);
        }
        return rVar;
    }

    public final void E(long j) {
        r rVar = this.f5196p;
        int b9 = this.f5195o.b(rVar.f5181a.f5207a);
        if (b9 == -1) {
            return;
        }
        C0267s c0267s = this.f5195o;
        C0 c02 = this.f5194n;
        c0267s.f(b9, c02, false);
        long j4 = c02.f19238d;
        if (j4 != -9223372036854775807L && j >= j4) {
            j = Math.max(0L, j4 - 1);
        }
        rVar.f5187g = j;
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        r rVar = (r) interfaceC0272x;
        if (rVar.f5185e != null) {
            AbstractC0250a abstractC0250a = rVar.f5184d;
            abstractC0250a.getClass();
            abstractC0250a.p(rVar.f5185e);
        }
        if (interfaceC0272x == this.f5196p) {
            this.f5196p = null;
        }
    }

    @Override // N3.AbstractC0259j, N3.AbstractC0250a
    public final void r() {
        this.f5198r = false;
        this.f5197q = false;
        super.r();
    }

    @Override // N3.AbstractC0259j, N3.AbstractC0250a
    public final void l() {
    }
}
