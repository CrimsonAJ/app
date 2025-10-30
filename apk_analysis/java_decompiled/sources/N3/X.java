package N3;

import android.os.Bundle;
import b5.C0621d1;
import b5.C0623e0;
import b5.C0650n0;
import b5.P1;
import b5.S0;
import b5.s1;
import b5.t1;
import k4.C1499E;
import k4.C1501a;
import l4.AbstractC1566a;
import q3.C1902g;
import q3.C1908m;
import q3.C1909n;
import z3.InterfaceC2243g;

/* loaded from: classes.dex */
public final class X implements InterfaceC2243g {

    /* renamed from: a, reason: collision with root package name */
    public long f5021a;

    /* renamed from: b, reason: collision with root package name */
    public long f5022b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5023c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5024d;

    public X(long j, int i9) {
        AbstractC1566a.m(((C1501a) this.f5023c) == null);
        this.f5021a = j;
        this.f5022b = j + i9;
    }

    public boolean a(long j, boolean z9, boolean z10) {
        t1 t1Var = (t1) this.f5024d;
        t1Var.l0();
        t1Var.m0();
        C0650n0 c0650n0 = (C0650n0) t1Var.f1707a;
        if (c0650n0.a()) {
            C0623e0 c0623e0 = c0650n0.f11228h;
            C0650n0.d(c0623e0);
            c0650n0.f11233n.getClass();
            c0623e0.f11097q.g(System.currentTimeMillis());
        }
        long j4 = j - this.f5021a;
        b5.V v8 = c0650n0.f11229i;
        if (!z9 && j4 < 1000) {
            C0650n0.f(v8);
            v8.f10978n.c(Long.valueOf(j4), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j4 = j - this.f5022b;
            this.f5022b = j;
        }
        C0650n0.f(v8);
        v8.f10978n.c(Long.valueOf(j4), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j4);
        boolean z11 = !c0650n0.f11227g.z0();
        C0621d1 c0621d1 = c0650n0.f11234o;
        C0650n0.e(c0621d1);
        P1.B0(c0621d1.s0(z11), bundle, true);
        if (!z10) {
            S0 s02 = c0650n0.f11235p;
            C0650n0.e(s02);
            s02.w0("auto", "_e", bundle);
        }
        this.f5021a = j;
        s1 s1Var = (s1) this.f5023c;
        s1Var.a();
        s1Var.c(((Long) b5.E.f10683q0.a(null)).longValue());
        return true;
    }

    @Override // z3.InterfaceC2243g
    public q3.r e() {
        boolean z9;
        if (this.f5021a != -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        return new C1908m(0, this.f5021a, (C1909n) this.f5023c);
    }

    @Override // z3.InterfaceC2243g
    public long o(C1902g c1902g) {
        long j = this.f5022b;
        if (j < 0) {
            return -1L;
        }
        long j4 = -(j + 2);
        this.f5022b = -1L;
        return j4;
    }

    @Override // z3.InterfaceC2243g
    public void t(long j) {
        long[] jArr = (long[]) ((C1499E) this.f5024d).f19985b;
        this.f5022b = jArr[l4.y.e(jArr, j, true)];
    }

    public X(String str, byte[] bArr, long j, long j4) {
        this.f5023c = str;
        this.f5024d = bArr;
        this.f5021a = j;
        this.f5022b = j4;
    }
}
