package b8;

import a8.EnumC0509a;

/* renamed from: b8.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709H implements InterfaceC0716O, InterfaceC0725e, c8.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0707F f11422a;

    public C0709H(InterfaceC0707F interfaceC0707F) {
        this.f11422a = interfaceC0707F;
    }

    @Override // c8.v
    public final InterfaceC0725e a(E7.i iVar, int i9, EnumC0509a enumC0509a) {
        if (((i9 >= 0 && i9 < 2) || i9 == -2) && enumC0509a == EnumC0509a.f9185b) {
            return this;
        }
        return AbstractC0714M.n(this, iVar, i9, enumC0509a);
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        ((C0718Q) this.f11422a).collect(interfaceC0726f, dVar);
        return F7.a.f2587a;
    }
}
