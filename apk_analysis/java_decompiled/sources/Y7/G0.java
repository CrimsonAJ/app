package Y7;

import d8.AbstractC1130a;

/* loaded from: classes.dex */
public final class G0 extends d8.t {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f8766e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G0(E7.d r3, E7.i r4) {
        /*
            r2 = this;
            Y7.H0 r0 = Y7.H0.f8768a
            E7.g r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            E7.i r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8766e = r0
            E7.i r3 = r3.getContext()
            E7.e r0 = E7.e.f1977a
            E7.g r3 = r3.get(r0)
            boolean r3 = r3 instanceof Y7.AbstractC0480v
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = d8.AbstractC1130a.m(r4, r3)
            d8.AbstractC1130a.g(r4, r3)
            r2.e0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.G0.<init>(E7.d, E7.i):void");
    }

    public final boolean d0() {
        boolean z9;
        if (this.threadLocalIsSet && this.f8766e.get() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f8766e.remove();
        return !z9;
    }

    public final void e0(E7.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8766e.set(new A7.h(iVar, obj));
    }

    @Override // d8.t, Y7.r0
    public final void n(Object obj) {
        if (this.threadLocalIsSet) {
            A7.h hVar = (A7.h) this.f8766e.get();
            if (hVar != null) {
                AbstractC1130a.g((E7.i) hVar.f547a, hVar.f548b);
            }
            this.f8766e.remove();
        }
        Object t7 = B.t(obj);
        E7.d dVar = this.f17005d;
        E7.i context = dVar.getContext();
        G0 g02 = null;
        Object m9 = AbstractC1130a.m(context, null);
        if (m9 != AbstractC1130a.f16971f) {
            g02 = B.B(dVar, context, m9);
        }
        try {
            this.f17005d.resumeWith(t7);
            if (g02 != null && !g02.d0()) {
                return;
            }
            AbstractC1130a.g(context, m9);
        } catch (Throwable th) {
            if (g02 == null || g02.d0()) {
                AbstractC1130a.g(context, m9);
            }
            throw th;
        }
    }
}
