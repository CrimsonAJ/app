package n0;

import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0561w;
import s4.C1957d;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1601a extends E {

    /* renamed from: l, reason: collision with root package name */
    public final C1957d f21001l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0561w f21002m;

    /* renamed from: n, reason: collision with root package name */
    public C1602b f21003n;

    public C1601a(C1957d c1957d) {
        this.f21001l = c1957d;
        if (c1957d.f22719a == null) {
            c1957d.f22719a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override // androidx.lifecycle.E
    public final void e() {
        C1957d c1957d = this.f21001l;
        c1957d.f22720b = true;
        c1957d.f22722d = false;
        c1957d.f22721c = false;
        c1957d.f22727i.drainPermits();
        c1957d.c();
    }

    @Override // androidx.lifecycle.E
    public final void f() {
        this.f21001l.f22720b = false;
    }

    @Override // androidx.lifecycle.E
    public final void h(F f9) {
        super.h(f9);
        this.f21002m = null;
        this.f21003n = null;
    }

    public final void j() {
        InterfaceC0561w interfaceC0561w = this.f21002m;
        C1602b c1602b = this.f21003n;
        if (interfaceC0561w != null && c1602b != null) {
            super.h(c1602b);
            d(interfaceC0561w, c1602b);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f21001l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
