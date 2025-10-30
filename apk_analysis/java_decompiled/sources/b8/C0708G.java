package b8;

import a8.EnumC0509a;

/* renamed from: b8.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708G implements InterfaceC0710I, InterfaceC0725e, c8.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0706E f11421a;

    public C0708G(InterfaceC0706E interfaceC0706E) {
        this.f11421a = interfaceC0706E;
    }

    @Override // c8.v
    public final InterfaceC0725e a(E7.i iVar, int i9, EnumC0509a enumC0509a) {
        return AbstractC0714M.n(this, iVar, i9, enumC0509a);
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        return this.f11421a.collect(interfaceC0726f, dVar);
    }
}
