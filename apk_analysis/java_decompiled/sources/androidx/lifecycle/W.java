package androidx.lifecycle;

/* loaded from: classes.dex */
public final class W implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final String f9848a;

    /* renamed from: b, reason: collision with root package name */
    public final V f9849b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9850c;

    public W(String str, V v8) {
        this.f9848a = str;
        this.f9849b = v8;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        if (enumC0554o == EnumC0554o.ON_DESTROY) {
            this.f9850c = false;
            interfaceC0561w.x().g0(this);
        }
    }

    public final void g(N0.f registry, D.n lifecycle) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        if (!this.f9850c) {
            this.f9850c = true;
            lifecycle.V(this);
            registry.f(this.f9848a, this.f9849b.f9847e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
