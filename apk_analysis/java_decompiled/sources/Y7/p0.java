package Y7;

import d8.AbstractC1130a;
import d8.AbstractC1131b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p0 extends AbstractC1131b {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f8837b;

    /* renamed from: c, reason: collision with root package name */
    public t0 f8838c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0 f8839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0451a0 f8840e;

    public p0(l0 l0Var, r0 r0Var, InterfaceC0451a0 interfaceC0451a0) {
        this.f8839d = r0Var;
        this.f8840e = interfaceC0451a0;
        this.f8837b = l0Var;
    }

    @Override // d8.AbstractC1131b
    public final void b(Object obj, Object obj2) {
        boolean z9;
        InterfaceC0451a0 interfaceC0451a0;
        d8.k kVar = (d8.k) obj;
        if (obj2 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        l0 l0Var = this.f8837b;
        if (z9) {
            interfaceC0451a0 = l0Var;
        } else {
            interfaceC0451a0 = this.f8838c;
        }
        if (interfaceC0451a0 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d8.k.f16991a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, interfaceC0451a0)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z9) {
                t0 t0Var = this.f8838c;
                kotlin.jvm.internal.h.b(t0Var);
                l0Var.g(t0Var);
            }
        }
    }

    @Override // d8.AbstractC1131b
    public final G6.a c(Object obj) {
        if (this.f8839d.D() == this.f8840e) {
            return null;
        }
        return AbstractC1130a.f16970e;
    }
}
