package androidx.lifecycle;

/* loaded from: classes.dex */
public final class C extends D implements InterfaceC0559u {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0561w f9784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E f9785f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(E e8, InterfaceC0561w interfaceC0561w, F f9) {
        super(e8, f9);
        this.f9785f = e8;
        this.f9784e = interfaceC0561w;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        InterfaceC0561w interfaceC0561w2 = this.f9784e;
        EnumC0555p a02 = interfaceC0561w2.x().a0();
        if (a02 == EnumC0555p.f9893a) {
            this.f9785f.h(this.f9786a);
            return;
        }
        EnumC0555p enumC0555p = null;
        while (enumC0555p != a02) {
            g(m());
            enumC0555p = a02;
            a02 = interfaceC0561w2.x().a0();
        }
    }

    @Override // androidx.lifecycle.D
    public final void k() {
        this.f9784e.x().g0(this);
    }

    @Override // androidx.lifecycle.D
    public final boolean l(InterfaceC0561w interfaceC0561w) {
        if (this.f9784e == interfaceC0561w) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.D
    public final boolean m() {
        if (this.f9784e.x().a0().compareTo(EnumC0555p.f9896d) >= 0) {
            return true;
        }
        return false;
    }
}
