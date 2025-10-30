package A8;

import i8.N;
import o7.AbstractC1719k;
import o7.C1723o;
import x8.C2190j;
import x8.InterfaceC2189i;
import z8.InterfaceC2262k;

/* loaded from: classes.dex */
public final class c implements InterfaceC2262k {

    /* renamed from: b, reason: collision with root package name */
    public static final C2190j f564b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1719k f565a;

    static {
        C2190j c2190j = C2190j.f24645d;
        f564b = e0.c.C("EFBBBF");
    }

    public c(AbstractC1719k abstractC1719k) {
        this.f565a = abstractC1719k;
    }

    @Override // z8.InterfaceC2262k
    public final Object b(Object obj) {
        N n7 = (N) obj;
        InterfaceC2189i g9 = n7.g();
        try {
            if (g9.f0(f564b)) {
                g9.n(r1.f24646a.length);
            }
            C1723o c1723o = new C1723o(g9);
            Object b9 = this.f565a.b(c1723o);
            if (c1723o.a0() == 10) {
                n7.close();
                return b9;
            }
            throw new RuntimeException("JSON document was not fully consumed.");
        } catch (Throwable th) {
            n7.close();
            throw th;
        }
    }
}
