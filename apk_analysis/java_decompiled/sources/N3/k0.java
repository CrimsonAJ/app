package N3;

import android.net.Uri;
import j3.x0;
import java.util.ArrayList;
import k4.C1516p;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC0272x, k4.H {

    /* renamed from: a, reason: collision with root package name */
    public final C1516p f5132a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1512l f5133b;

    /* renamed from: c, reason: collision with root package name */
    public final k4.W f5134c;

    /* renamed from: d, reason: collision with root package name */
    public final e1.q f5135d;

    /* renamed from: e, reason: collision with root package name */
    public final G f5136e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f5137f;

    /* renamed from: h, reason: collision with root package name */
    public final long f5139h;
    public final j3.M j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5141k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5142l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f5143m;

    /* renamed from: n, reason: collision with root package name */
    public int f5144n;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5138g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final k4.M f5140i = new k4.M("SingleSampleMediaPeriod");

    public k0(C1516p c1516p, InterfaceC1512l interfaceC1512l, k4.W w7, j3.M m9, long j, e1.q qVar, G g9, boolean z9) {
        this.f5132a = c1516p;
        this.f5133b = interfaceC1512l;
        this.f5134c = w7;
        this.j = m9;
        this.f5139h = j;
        this.f5135d = qVar;
        this.f5136e = g9;
        this.f5141k = z9;
        this.f5137f = new n0(new m0("", m9));
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f5140i.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B3.f e(k4.J r14, java.io.IOException r15, int r16) {
        /*
            r13 = this;
            r0 = r16
            r1 = 0
            r2 = 1
            N3.j0 r14 = (N3.j0) r14
            k4.V r14 = r14.f5127b
            N3.q r3 = new N3.q
            android.net.Uri r14 = r14.f20034c
            r3.<init>()
            int r14 = l4.y.f20553a
            e1.q r14 = r13.f5135d
            r14.getClass()
            boolean r4 = r15 instanceof j3.j0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L4f
            boolean r4 = r15 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L4f
            boolean r4 = r15 instanceof k4.C1495A
            if (r4 != 0) goto L4f
            boolean r4 = r15 instanceof k4.L
            if (r4 != 0) goto L4f
            int r4 = k4.C1514n.f20070b
            r4 = r15
        L2e:
            if (r4 == 0) goto L43
            boolean r7 = r4 instanceof k4.C1514n
            if (r7 == 0) goto L3e
            r7 = r4
            k4.n r7 = (k4.C1514n) r7
            int r7 = r7.f20071a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L3e
            goto L4f
        L3e:
            java.lang.Throwable r4 = r4.getCause()
            goto L2e
        L43:
            int r4 = r0 + (-1)
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L50
        L4f:
            r7 = r5
        L50:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L5d
            int r14 = r14.f(r2)
            if (r0 < r14) goto L5b
            goto L5d
        L5b:
            r14 = r1
            goto L5e
        L5d:
            r14 = r2
        L5e:
            boolean r0 = r13.f5141k
            if (r0 == 0) goto L70
            if (r14 == 0) goto L70
            java.lang.String r14 = "SingleSampleMediaPeriod"
            java.lang.String r0 = "Loading failed, treating as end-of-stream."
            l4.AbstractC1566a.Q(r14, r0, r15)
            r13.f5142l = r2
            B3.f r14 = k4.M.f20003e
            goto L7a
        L70:
            if (r4 == 0) goto L78
            B3.f r14 = new B3.f
            r14.<init>(r1, r7, r1)
            goto L7a
        L78:
            B3.f r14 = k4.M.f20004f
        L7a:
            boolean r0 = r14.a()
            r12 = r0 ^ 1
            N3.G r0 = r13.f5136e
            r7 = 0
            long r9 = r13.f5139h
            r2 = 1
            r1 = r3
            r3 = -1
            j3.M r4 = r13.j
            r5 = 0
            r6 = 0
            r11 = r15
            r0.i(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.k0.e(k4.J, java.io.IOException, int):B3.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(k4.J j, long j4, long j9) {
        j0 j0Var = (j0) j;
        this.f5144n = (int) j0Var.f5127b.f20033b;
        byte[] bArr = j0Var.f5128c;
        bArr.getClass();
        this.f5143m = bArr;
        this.f5142l = true;
        Uri uri = j0Var.f5127b.f20034c;
        ?? obj = new Object();
        this.f5135d.getClass();
        this.f5136e.g(obj, 1, -1, this.j, 0, null, 0L, this.f5139h);
    }

    @Override // N3.f0
    public final long h() {
        if (!this.f5142l && !this.f5140i.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        return this.f5137f;
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final long p() {
        if (this.f5142l) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(k4.J j, long j4, long j9, boolean z9) {
        Uri uri = ((j0) j).f5127b.f20034c;
        ?? obj = new Object();
        this.f5135d.getClass();
        this.f5136e.d(obj, 1, -1, null, 0, null, 0L, this.f5139h);
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f5138g;
            if (i9 < arrayList.size()) {
                i0 i0Var = (i0) arrayList.get(i9);
                if (i0Var.f5121a == 2) {
                    i0Var.f5121a = 1;
                }
                i9++;
            } else {
                return j;
            }
        }
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        for (int i9 = 0; i9 < qVarArr.length; i9++) {
            d0 d0Var = d0VarArr[i9];
            ArrayList arrayList = this.f5138g;
            if (d0Var != null && (qVarArr[i9] == null || !zArr[i9])) {
                arrayList.remove(d0Var);
                d0VarArr[i9] = null;
            }
            if (d0VarArr[i9] == null && qVarArr[i9] != null) {
                i0 i0Var = new i0(this);
                arrayList.add(i0Var);
                d0VarArr[i9] = i0Var;
                zArr2[i9] = true;
            }
        }
        return j;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        if (!this.f5142l) {
            k4.M m9 = this.f5140i;
            if (!m9.d() && !m9.c()) {
                InterfaceC1513m c3 = this.f5133b.c();
                k4.W w7 = this.f5134c;
                if (w7 != null) {
                    c3.a(w7);
                }
                C1516p c1516p = this.f5132a;
                m9.f(new j0(c3, c1516p), this, this.f5135d.f(1));
                this.f5136e.l(new C0266q(c1516p), 1, -1, this.j, 0, null, 0L, this.f5139h);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
    }

    @Override // N3.f0
    public final void B(long j) {
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        return j;
    }
}
