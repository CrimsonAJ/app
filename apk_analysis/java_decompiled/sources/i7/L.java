package i7;

import X.InterfaceC0408h;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class L implements l7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18766a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f18767b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.c f18768c;

    public L(InterfaceC2251a interfaceC2251a, l7.c cVar) {
        this.f18767b = interfaceC2251a;
        this.f18768c = cVar;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        switch (this.f18766a) {
            case 0:
                return new K((E7.i) this.f18768c.f20611a, (InterfaceC0408h) this.f18767b.get());
            default:
                return new m7.g((C1387b) this.f18767b.get(), (E7.i) this.f18768c.f20611a);
        }
    }

    public L(l7.c cVar, InterfaceC2251a interfaceC2251a) {
        this.f18768c = cVar;
        this.f18767b = interfaceC2251a;
    }
}
