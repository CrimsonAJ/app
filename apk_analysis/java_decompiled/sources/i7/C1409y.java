package i7;

import l6.C1574f;
import z7.InterfaceC2251a;

/* renamed from: i7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1409y implements l7.b {

    /* renamed from: a, reason: collision with root package name */
    public final l7.c f18917a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f18918b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.c f18919c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2251a f18920d;

    public C1409y(l7.c cVar, InterfaceC2251a interfaceC2251a, l7.c cVar2, InterfaceC2251a interfaceC2251a2) {
        this.f18917a = cVar;
        this.f18918b = interfaceC2251a;
        this.f18919c = cVar2;
        this.f18920d = interfaceC2251a2;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        return new C1401p((C1574f) this.f18917a.f20611a, (m7.j) this.f18918b.get(), (E7.i) this.f18919c.f20611a, (c0) this.f18920d.get());
    }
}
