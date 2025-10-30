package Y7;

import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;

/* renamed from: Y7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0450a extends r0 implements E7.d, InterfaceC0484z {

    /* renamed from: c, reason: collision with root package name */
    public final E7.i f8795c;

    public AbstractC0450a(E7.i iVar, boolean z9) {
        super(z9);
        H((InterfaceC0465h0) iVar.get(C0463g0.f8811a));
        this.f8795c = iVar.plus(this);
    }

    @Override // Y7.r0
    public final void G(A7.b bVar) {
        B.o(this.f8795c, bVar);
    }

    @Override // Y7.r0
    public final void T(Object obj) {
        boolean z9;
        if (obj instanceof C0476q) {
            C0476q c0476q = (C0476q) obj;
            Throwable th = c0476q.f8842a;
            if (C0476q.f8841b.get(c0476q) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Z(th, z9);
            return;
        }
        b0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(A a5, AbstractC0450a abstractC0450a, O7.p pVar) {
        int ordinal = a5.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            E7.i iVar = this.f8795c;
                            Object m9 = AbstractC1130a.m(iVar, null);
                            try {
                                kotlin.jvm.internal.r.c(2, pVar);
                                Object invoke = pVar.invoke(abstractC0450a, this);
                                if (invoke != F7.a.f2587a) {
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } finally {
                                AbstractC1130a.g(iVar, m9);
                            }
                        } catch (Throwable th) {
                            resumeWith(AbstractC0485a.h(th));
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                D1.A(((G7.a) pVar).create(abstractC0450a, this)).resumeWith(A7.n.f558a);
                return;
            }
            return;
        }
        AbstractC0485a.z(pVar, abstractC0450a, this);
    }

    @Override // Y7.InterfaceC0484z
    public final E7.i g() {
        return this.f8795c;
    }

    @Override // E7.d
    public final E7.i getContext() {
        return this.f8795c;
    }

    @Override // E7.d
    public final void resumeWith(Object obj) {
        Throwable a5 = A7.j.a(obj);
        if (a5 != null) {
            obj = new C0476q(a5, false);
        }
        Object M7 = M(obj);
        if (M7 == B.f8750e) {
            return;
        }
        n(M7);
    }

    @Override // Y7.r0
    public final String t() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void b0(Object obj) {
    }

    public void Z(Throwable th, boolean z9) {
    }
}
