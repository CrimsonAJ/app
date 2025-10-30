package i8;

import x8.C2190j;
import x8.InterfaceC2188h;

/* loaded from: classes.dex */
public final class H extends J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19011a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final A f19012b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19013c;

    public H(A a5, C2190j c2190j) {
        this.f19012b = a5;
        this.f19013c = c2190j;
    }

    @Override // i8.J
    public final long a() {
        switch (this.f19011a) {
            case 0:
                return ((C2190j) this.f19013c).d();
            default:
                return ((J) this.f19013c).a();
        }
    }

    @Override // i8.J
    public final A b() {
        switch (this.f19011a) {
            case 0:
                return this.f19012b;
            default:
                return this.f19012b;
        }
    }

    @Override // i8.J
    public final void c(InterfaceC2188h interfaceC2188h) {
        switch (this.f19011a) {
            case 0:
                interfaceC2188h.A((C2190j) this.f19013c);
                return;
            default:
                ((J) this.f19013c).c(interfaceC2188h);
                return;
        }
    }

    public H(J j, A a5) {
        this.f19013c = j;
        this.f19012b = a5;
    }
}
