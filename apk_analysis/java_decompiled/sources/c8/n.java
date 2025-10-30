package c8;

import a8.EnumC0509a;
import b8.C0704C;
import b8.InterfaceC0725e;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: e, reason: collision with root package name */
    public final C0704C f11785e;

    public n(C0704C c0704c, InterfaceC0725e interfaceC0725e, E7.i iVar, int i9, EnumC0509a enumC0509a) {
        super(interfaceC0725e, iVar, i9, enumC0509a);
        this.f11785e = c0704c;
    }

    @Override // c8.h
    public final h b(E7.i iVar, int i9, EnumC0509a enumC0509a) {
        return new n(this.f11785e, this.f11767d, iVar, i9, enumC0509a);
    }

    @Override // c8.h
    public final Object c(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object f9 = Y7.B.f(new m(this, interfaceC0726f, null), dVar);
        if (f9 == F7.a.f2587a) {
            return f9;
        }
        return A7.n.f558a;
    }
}
