package i7;

import k7.InterfaceC1525a;
import l6.C1574f;
import l7.C1576a;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class U implements l7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18797a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.c f18798b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.c f18799c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2251a f18800d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2251a f18801e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2251a f18802f;

    public /* synthetic */ U(l7.c cVar, l7.c cVar2, InterfaceC2251a interfaceC2251a, InterfaceC2251a interfaceC2251a2, InterfaceC2251a interfaceC2251a3, int i9) {
        this.f18797a = i9;
        this.f18798b = cVar;
        this.f18799c = cVar2;
        this.f18800d = interfaceC2251a;
        this.f18801e = interfaceC2251a2;
        this.f18802f = interfaceC2251a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [k7.a] */
    @Override // z7.InterfaceC2251a
    public final Object get() {
        C1576a c1576a;
        switch (this.f18797a) {
            case 0:
                return new T((C1574f) this.f18798b.f20611a, (T6.e) this.f18799c.f20611a, (m7.j) this.f18800d.get(), (C1397l) this.f18801e.get(), (E7.i) ((l7.c) this.f18802f).f20611a);
            default:
                E7.i iVar = (E7.i) this.f18798b.f20611a;
                T6.e eVar = (T6.e) this.f18799c.f20611a;
                C1387b c1387b = (C1387b) this.f18800d.get();
                m7.g gVar = (m7.g) this.f18801e.get();
                InterfaceC2251a interfaceC2251a = this.f18802f;
                if (interfaceC2251a instanceof InterfaceC1525a) {
                    c1576a = (InterfaceC1525a) interfaceC2251a;
                } else {
                    c1576a = new C1576a(interfaceC2251a);
                }
                return new m7.e(iVar, eVar, c1387b, gVar, c1576a);
        }
    }
}
