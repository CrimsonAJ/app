package co.notix;

import b8.InterfaceC0716O;
import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class se implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f13168a;

    public se(InterfaceC0716O interfaceC0716O) {
        this.f13168a = interfaceC0716O;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object collect = this.f13168a.collect(new re(interfaceC0726f), dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }
}
