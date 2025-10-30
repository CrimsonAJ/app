package e3;

import Y2.t;
import a3.InterfaceC0491b;
import android.content.Context;
import d0.o;
import java.util.concurrent.Executor;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class k implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final Z2.e f17180a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f17181b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2251a f17182c;

    /* renamed from: d, reason: collision with root package name */
    public final t f17183d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2251a f17184e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2251a f17185f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2251a f17186g;

    public k(Z2.e eVar, InterfaceC2251a interfaceC2251a, InterfaceC2251a interfaceC2251a2, t tVar, InterfaceC2251a interfaceC2251a3, InterfaceC2251a interfaceC2251a4, InterfaceC2251a interfaceC2251a5) {
        this.f17180a = eVar;
        this.f17181b = interfaceC2251a;
        this.f17182c = interfaceC2251a2;
        this.f17183d = tVar;
        this.f17184e = interfaceC2251a3;
        this.f17185f = interfaceC2251a4;
        this.f17186g = interfaceC2251a5;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        return new j((Context) this.f17180a.f8958b, (Z2.f) this.f17181b.get(), (f3.d) this.f17182c.get(), (d) this.f17183d.get(), (Executor) this.f17184e.get(), (g3.c) this.f17185f.get(), new o(3), new e0.c(2), (f3.c) this.f17186g.get());
    }
}
