package p1;

import S5.p;

/* renamed from: p1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1847j extends AbstractC1845h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = AbstractC1845h.f22130g;
        }
        if (AbstractC1845h.f22129f.f(this, null, obj)) {
            AbstractC1845h.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(Throwable th) {
        if (AbstractC1845h.f22129f.f(this, null, new C1839b(th))) {
            AbstractC1845h.c(this);
            return true;
        }
        return false;
    }

    public final boolean l(p pVar) {
        C1839b c1839b;
        pVar.getClass();
        Object obj = this.f22131a;
        if (obj == null) {
            if (pVar.isDone()) {
                if (AbstractC1845h.f22129f.f(this, null, AbstractC1845h.f(pVar))) {
                    AbstractC1845h.c(this);
                    return true;
                }
                return false;
            }
            RunnableC1842e runnableC1842e = new RunnableC1842e(this, pVar);
            if (AbstractC1845h.f22129f.f(this, null, runnableC1842e)) {
                try {
                    pVar.a(runnableC1842e, EnumC1846i.f22134a);
                    return true;
                } catch (Throwable th) {
                    try {
                        c1839b = new C1839b(th);
                    } catch (Throwable unused) {
                        c1839b = C1839b.f22111b;
                    }
                    AbstractC1845h.f22129f.f(this, runnableC1842e, c1839b);
                    return true;
                }
            }
            obj = this.f22131a;
        }
        if (obj instanceof C1838a) {
            pVar.cancel(((C1838a) obj).f22109a);
        }
        return false;
    }
}
