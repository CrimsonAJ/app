package co.notix;

import b8.InterfaceC0707F;
import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class wb implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f13417a;

    public wb(InterfaceC0707F interfaceC0707F) {
        this.f13417a = interfaceC0707F;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object collect = this.f13417a.collect(new vb(interfaceC0726f), dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }
}
