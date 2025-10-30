package i0;

import f5.C1183o;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362r extends AbstractC1364t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1183o f18362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v4.e f18364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f.b f18365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M1.n f18366e;

    public C1362r(M1.n nVar, C1183o c1183o, AtomicReference atomicReference, v4.e eVar, f.b bVar) {
        this.f18366e = nVar;
        this.f18362a = c1183o;
        this.f18363b = atomicReference;
        this.f18364c = eVar;
        this.f18365d = bVar;
    }

    @Override // i0.AbstractC1364t
    public final void a() {
        AbstractActivityC1369y W6;
        StringBuilder sb = new StringBuilder("fragment_");
        M1.n nVar = this.f18366e;
        sb.append(nVar.f18389e);
        sb.append("_rq#");
        sb.append(nVar.r0.getAndIncrement());
        String sb2 = sb.toString();
        M1.n nVar2 = (M1.n) this.f18362a.f17433b;
        C1368x c1368x = nVar2.f18416t;
        if (c1368x != null) {
            W6 = c1368x.f18430r;
        } else {
            W6 = nVar2.W();
        }
        this.f18363b.set(W6.f16595l.c(sb2, nVar, this.f18364c, this.f18365d));
    }
}
