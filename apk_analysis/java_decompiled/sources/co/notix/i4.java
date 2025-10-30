package co.notix;

import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class i4 implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f12430a;

    public i4(InterfaceC0725e interfaceC0725e) {
        this.f12430a = interfaceC0725e;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object collect = this.f12430a.collect(new h4(interfaceC0726f), dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }
}
