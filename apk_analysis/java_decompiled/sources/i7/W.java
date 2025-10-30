package i7;

import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class W implements l7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18808a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f18809b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2251a f18810c;

    public /* synthetic */ W(InterfaceC2251a interfaceC2251a, InterfaceC2251a interfaceC2251a2, int i9) {
        this.f18808a = i9;
        this.f18809b = interfaceC2251a;
        this.f18810c = interfaceC2251a2;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        switch (this.f18808a) {
            case 0:
                return new V((e0) this.f18809b.get(), (f0) this.f18810c.get());
            default:
                return new m7.j((m7.o) this.f18809b.get(), (m7.o) this.f18810c.get());
        }
    }
}
