package co.notix;

import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class h5 implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e f12355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o4 f12356b;

    public h5(InterfaceC0725e interfaceC0725e, o4 o4Var) {
        this.f12355a = interfaceC0725e;
        this.f12356b = o4Var;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object collect = this.f12355a.collect(new g5(interfaceC0726f, this.f12356b), dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }
}
