package j3;

import N3.C0253d;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import k4.C1517q;
import l4.AbstractC1566a;

/* renamed from: j3.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1448c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19570a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19571b;

    /* renamed from: c, reason: collision with root package name */
    public final N3.d0[] f19572c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19573d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19574e;

    /* renamed from: f, reason: collision with root package name */
    public C1450d0 f19575f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19576g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f19577h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1449d[] f19578i;
    public final i4.s j;

    /* renamed from: k, reason: collision with root package name */
    public final F5.o f19579k;

    /* renamed from: l, reason: collision with root package name */
    public C1448c0 f19580l;

    /* renamed from: m, reason: collision with root package name */
    public N3.n0 f19581m;

    /* renamed from: n, reason: collision with root package name */
    public i4.w f19582n;

    /* renamed from: o, reason: collision with root package name */
    public long f19583o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [N3.d] */
    public C1448c0(AbstractC1449d[] abstractC1449dArr, long j, i4.s sVar, C1517q c1517q, F5.o oVar, C1450d0 c1450d0, i4.w wVar) {
        this.f19578i = abstractC1449dArr;
        this.f19583o = j;
        this.j = sVar;
        this.f19579k = oVar;
        N3.A a5 = c1450d0.f19595a;
        this.f19571b = a5.f5207a;
        this.f19575f = c1450d0;
        this.f19581m = N3.n0.f5169d;
        this.f19582n = wVar;
        this.f19572c = new N3.d0[abstractC1449dArr.length];
        this.f19577h = new boolean[abstractC1449dArr.length];
        oVar.getClass();
        Pair pair = (Pair) a5.f5207a;
        Object obj = pair.first;
        N3.A b9 = a5.b(pair.second);
        i0 i0Var = (i0) ((HashMap) oVar.f2535e).get(obj);
        i0Var.getClass();
        ((HashSet) oVar.j).add(i0Var);
        h0 h0Var = (h0) ((HashMap) oVar.f2539i).get(i0Var);
        if (h0Var != null) {
            h0Var.f19635a.g(h0Var.f19636b);
        }
        i0Var.f19649c.add(b9);
        N3.r b10 = i0Var.f19647a.b(b9, c1517q, c1450d0.f19596b);
        ((IdentityHashMap) oVar.f2534d).put(b10, i0Var);
        oVar.d();
        long j4 = c1450d0.f19598d;
        this.f19570a = j4 != -9223372036854775807L ? new C0253d(b10, true, 0L, j4) : b10;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, N3.x] */
    public final long a(i4.w wVar, long j, boolean z9, boolean[] zArr) {
        AbstractC1449d[] abstractC1449dArr;
        Object[] objArr;
        boolean z10;
        int i9 = 0;
        while (true) {
            boolean z11 = true;
            if (i9 >= wVar.f18650a) {
                break;
            }
            if (z9 || !wVar.a(this.f19582n, i9)) {
                z11 = false;
            }
            this.f19577h[i9] = z11;
            i9++;
        }
        int i10 = 0;
        while (true) {
            abstractC1449dArr = this.f19578i;
            int length = abstractC1449dArr.length;
            objArr = this.f19572c;
            if (i10 >= length) {
                break;
            }
            if (abstractC1449dArr[i10].f19584a == -2) {
                objArr[i10] = null;
            }
            i10++;
        }
        b();
        this.f19582n = wVar;
        c();
        long y9 = this.f19570a.y(wVar.f18652c, this.f19577h, this.f19572c, zArr, j);
        for (int i11 = 0; i11 < abstractC1449dArr.length; i11++) {
            if (abstractC1449dArr[i11].f19584a == -2 && this.f19582n.b(i11)) {
                objArr[i11] = new Object();
            }
        }
        this.f19574e = false;
        for (int i12 = 0; i12 < objArr.length; i12++) {
            if (objArr[i12] != null) {
                AbstractC1566a.m(wVar.b(i12));
                if (abstractC1449dArr[i12].f19584a != -2) {
                    this.f19574e = true;
                }
            } else {
                if (wVar.f18652c[i12] == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.m(z10);
            }
        }
        return y9;
    }

    public final void b() {
        if (this.f19580l == null) {
            int i9 = 0;
            while (true) {
                i4.w wVar = this.f19582n;
                if (i9 < wVar.f18650a) {
                    boolean b9 = wVar.b(i9);
                    i4.q qVar = this.f19582n.f18652c[i9];
                    if (b9 && qVar != null) {
                        qVar.i();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.f19580l == null) {
            int i9 = 0;
            while (true) {
                i4.w wVar = this.f19582n;
                if (i9 < wVar.f18650a) {
                    boolean b9 = wVar.b(i9);
                    i4.q qVar = this.f19582n.f18652c[i9];
                    if (b9 && qVar != null) {
                        qVar.d();
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [N3.f0, java.lang.Object] */
    public final long d() {
        long j;
        if (!this.f19573d) {
            return this.f19575f.f19596b;
        }
        if (this.f19574e) {
            j = this.f19570a.p();
        } else {
            j = Long.MIN_VALUE;
        }
        if (j == Long.MIN_VALUE) {
            return this.f19575f.f19599e;
        }
        return j;
    }

    public final long e() {
        return this.f19575f.f19596b + this.f19583o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, N3.x] */
    public final void f() {
        b();
        ?? r0 = this.f19570a;
        try {
            boolean z9 = r0 instanceof C0253d;
            F5.o oVar = this.f19579k;
            if (z9) {
                oVar.h(((C0253d) r0).f5079a);
            } else {
                oVar.h(r0);
            }
        } catch (RuntimeException e8) {
            AbstractC1566a.u("MediaPeriodHolder", "Period release failed.", e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0280, code lost:
    
        if (P5.AbstractC0356y.f6012a.c(r1.f18529b, r5.f18529b).c(r1.f18528a, r5.f18528a).e() > 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0660, code lost:
    
        if (r4 != 2) goto L289;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [P5.O, P5.o, java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i4.w g(float r35, j3.E0 r36) {
        /*
            Method dump skipped, instructions count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1448c0.g(float, j3.E0):i4.w");
    }

    public final void h() {
        Object obj = this.f19570a;
        if (obj instanceof C0253d) {
            long j = this.f19575f.f19598d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0253d c0253d = (C0253d) obj;
            c0253d.f5083e = 0L;
            c0253d.f5084f = j;
        }
    }
}
