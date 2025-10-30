package f5;

import F4.y;

/* renamed from: f5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177i {

    /* renamed from: a, reason: collision with root package name */
    public final C1185q f17413a = new C1185q();

    public C1177i() {
    }

    public final void a(Exception exc) {
        this.f17413a.n(exc);
    }

    public final void b(Object obj) {
        this.f17413a.o(obj);
    }

    public final boolean c(Exception exc) {
        C1185q c1185q = this.f17413a;
        c1185q.getClass();
        y.i(exc, "Exception must not be null");
        synchronized (c1185q.f17435a) {
            try {
                if (c1185q.f17437c) {
                    return false;
                }
                c1185q.f17437c = true;
                c1185q.f17440f = exc;
                c1185q.f17436b.g(c1185q);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.f17413a.q(obj);
    }

    public C1177i(s4.i iVar) {
        C1183o c1183o = new C1183o(0, this);
        iVar.getClass();
        s4.i iVar2 = new s4.i(c1183o);
        ((C1185q) iVar.f22734a).d(AbstractC1178j.f17414a, iVar2);
    }
}
