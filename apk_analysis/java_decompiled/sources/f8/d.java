package f8;

import Y7.AbstractC0480v;
import Y7.W;
import d8.AbstractC1130a;
import d8.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d extends W implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final d f17466b = new AbstractC0480v();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0480v f17467c;

    /* JADX WARN: Type inference failed for: r0v0, types: [f8.d, Y7.v] */
    static {
        l lVar = l.f17482b;
        int i9 = w.f17009a;
        if (64 >= i9) {
            i9 = 64;
        }
        f17467c = lVar.j0(AbstractC1130a.k("kotlinx.coroutines.io.parallelism", i9, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g0(E7.j.f1978a, runnable);
    }

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        f17467c.g0(iVar, runnable);
    }

    @Override // Y7.AbstractC0480v
    public final void h0(E7.i iVar, Runnable runnable) {
        f17467c.h0(iVar, runnable);
    }

    @Override // Y7.AbstractC0480v
    public final AbstractC0480v j0(int i9) {
        return l.f17482b.j0(1);
    }

    @Override // Y7.AbstractC0480v
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // Y7.W
    public final Executor k0() {
        return this;
    }
}
