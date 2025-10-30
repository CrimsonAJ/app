package J0;

import O7.p;
import o1.C1671f;

/* loaded from: classes.dex */
public final class b implements I0.b, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final C1671f f3584a;

    public b(C1671f c1671f) {
        this.f3584a = c1671f;
    }

    @Override // I0.b
    public final Object E(p pVar, G7.c cVar) {
        Q0.d dVar = (Q0.d) this.f3584a.f21473b;
        dVar.getClass();
        return pVar.invoke(new d(new a(dVar.Z())), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((Q0.d) this.f3584a.f21473b).close();
    }
}
