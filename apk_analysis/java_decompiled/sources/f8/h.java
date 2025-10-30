package f8;

import Y7.W;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h extends W {

    /* renamed from: b, reason: collision with root package name */
    public c f17470b;

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        c.g(this.f17470b, runnable, 6);
    }

    @Override // Y7.AbstractC0480v
    public final void h0(E7.i iVar, Runnable runnable) {
        c.g(this.f17470b, runnable, 2);
    }

    @Override // Y7.W
    public final Executor k0() {
        return this.f17470b;
    }
}
