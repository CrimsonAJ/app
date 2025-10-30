package d3;

import Y2.t;
import Z2.f;
import a3.InterfaceC0491b;
import e3.d;
import java.util.concurrent.Executor;
import z7.InterfaceC2251a;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120b implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2251a f16833a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f16834b;

    /* renamed from: c, reason: collision with root package name */
    public final t f16835c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2251a f16836d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2251a f16837e;

    public C1120b(InterfaceC2251a interfaceC2251a, InterfaceC2251a interfaceC2251a2, t tVar, InterfaceC2251a interfaceC2251a3, InterfaceC2251a interfaceC2251a4) {
        this.f16833a = interfaceC2251a;
        this.f16834b = interfaceC2251a2;
        this.f16835c = tVar;
        this.f16836d = interfaceC2251a3;
        this.f16837e = interfaceC2251a4;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        return new C1119a((Executor) this.f16833a.get(), (f) this.f16834b.get(), (d) this.f16835c.get(), (f3.d) this.f16836d.get(), (g3.c) this.f16837e.get());
    }
}
