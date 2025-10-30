package N3;

import android.net.Uri;
import j3.C1446b0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k4.C1516p;
import k4.C1517q;
import k4.InterfaceC1512l;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class l0 extends AbstractC0250a {

    /* renamed from: h, reason: collision with root package name */
    public final C1516p f5147h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1512l f5148i;
    public final j3.M j;

    /* renamed from: l, reason: collision with root package name */
    public final e1.q f5150l;

    /* renamed from: n, reason: collision with root package name */
    public final h0 f5152n;

    /* renamed from: o, reason: collision with root package name */
    public final j3.Y f5153o;

    /* renamed from: p, reason: collision with root package name */
    public k4.W f5154p;

    /* renamed from: k, reason: collision with root package name */
    public final long f5149k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5151m = true;

    /* JADX WARN: Type inference failed for: r15v1, types: [j3.P, j3.Q] */
    public l0(j3.X x5, InterfaceC1512l interfaceC1512l, e1.q qVar) {
        j3.U u9;
        j3.S s9;
        this.f5148i = interfaceC1512l;
        this.f5150l = qVar;
        boolean z9 = true;
        j3.O o9 = new j3.O();
        Y2.r rVar = new Y2.r(6);
        List list = Collections.EMPTY_LIST;
        P5.S s10 = P5.S.f5926e;
        j3.V v8 = j3.V.f19480c;
        Uri uri = Uri.EMPTY;
        String uri2 = x5.f19484a.toString();
        uri2.getClass();
        P5.F o10 = P5.F.o(P5.F.s(x5));
        if (((Uri) rVar.f8648b) != null && ((UUID) rVar.f8647a) == null) {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        if (uri != null) {
            if (((UUID) rVar.f8647a) != null) {
                s9 = new j3.S(rVar);
            } else {
                s9 = null;
            }
            u9 = new j3.U(uri, null, s9, list, o10);
        } else {
            u9 = null;
        }
        j3.Y y9 = new j3.Y(uri2, new j3.P(o9), u9, new j3.T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1446b0.f19533Z, v8);
        this.f5153o = y9;
        j3.L l9 = new j3.L();
        String str = x5.f19485b;
        l9.f19402k = str == null ? "text/x-unknown" : str;
        l9.f19395c = null;
        l9.f19396d = x5.f19486c;
        l9.f19397e = 0;
        l9.f19394b = x5.f19487d;
        String str2 = x5.f19488e;
        l9.f19393a = str2 != null ? str2 : null;
        this.j = new j3.M(l9);
        Map map = Collections.EMPTY_MAP;
        Uri uri3 = x5.f19484a;
        AbstractC1566a.o(uri3, "The uri must be set.");
        this.f5147h = new C1516p(uri3, 1, null, map, 0L, -1L, null, 1);
        this.f5152n = new h0(-9223372036854775807L, true, false, y9);
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        k4.W w7 = this.f5154p;
        G a9 = a(a5);
        return new k0(this.f5147h, this.f5148i, w7, this.j, this.f5149k, this.f5150l, a9, this.f5151m);
    }

    @Override // N3.AbstractC0250a
    public final j3.Y j() {
        return this.f5153o;
    }

    @Override // N3.AbstractC0250a
    public final void n(k4.W w7) {
        this.f5154p = w7;
        o(this.f5152n);
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        ((k0) interfaceC0272x).f5140i.e(null);
    }

    @Override // N3.AbstractC0250a
    public final void l() {
    }

    @Override // N3.AbstractC0250a
    public final void r() {
    }
}
