package co.notix;

import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class iq implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f12498a;

    public iq(q7 q7Var) {
        this.f12498a = q7Var;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object collect = this.f12498a.collect(new hq(interfaceC0726f), dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }
}
