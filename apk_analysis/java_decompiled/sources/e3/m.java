package e3;

import Y2.t;
import a3.InterfaceC0491b;
import java.util.concurrent.Executor;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class m implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2251a f17191a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f17192b;

    /* renamed from: c, reason: collision with root package name */
    public final t f17193c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2251a f17194d;

    public m(InterfaceC2251a interfaceC2251a, InterfaceC2251a interfaceC2251a2, t tVar, InterfaceC2251a interfaceC2251a3) {
        this.f17191a = interfaceC2251a;
        this.f17192b = interfaceC2251a2;
        this.f17193c = tVar;
        this.f17194d = interfaceC2251a3;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        return new l((Executor) this.f17191a.get(), (f3.d) this.f17192b.get(), (d) this.f17193c.get(), (g3.c) this.f17194d.get());
    }
}
