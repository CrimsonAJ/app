package C1;

import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0545f;
import androidx.lifecycle.InterfaceC0560v;

/* loaded from: classes.dex */
public final class g extends D.n {

    /* renamed from: b, reason: collision with root package name */
    public static final g f1175b = new D.n(1);

    /* renamed from: c, reason: collision with root package name */
    public static final f f1176c = new Object();

    @Override // D.n
    public final void V(InterfaceC0560v interfaceC0560v) {
        if (interfaceC0560v instanceof InterfaceC0545f) {
            InterfaceC0545f interfaceC0545f = (InterfaceC0545f) interfaceC0560v;
            f fVar = f1176c;
            interfaceC0545f.c(fVar);
            interfaceC0545f.i(fVar);
            interfaceC0545f.a(fVar);
            return;
        }
        throw new IllegalArgumentException((interfaceC0560v + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // D.n
    public final EnumC0555p a0() {
        return EnumC0555p.f9897e;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // D.n
    public final void g0(InterfaceC0560v interfaceC0560v) {
    }
}
