package p8;

import kotlin.jvm.internal.h;
import x8.B;
import x8.C2187g;
import x8.G;
import x8.K;
import x8.q;

/* loaded from: classes.dex */
public final class e implements G, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final q f22222a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U6.a f22224c;

    public e(U6.a aVar) {
        this.f22224c = aVar;
        this.f22222a = new q(((B) aVar.f7525e).f24599a.c());
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        h.e(source, "source");
        if (!this.f22223b) {
            k8.c.c(source.f24644b, 0L, j);
            ((B) this.f22224c.f7525e).G(source, j);
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.G
    public final K c() {
        return this.f22222a;
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22223b) {
            return;
        }
        this.f22223b = true;
        U6.a aVar = this.f22224c;
        aVar.getClass();
        q qVar = this.f22222a;
        K k5 = qVar.f24667e;
        qVar.f24667e = K.f24618d;
        k5.a();
        k5.b();
        aVar.f7521a = 3;
    }

    @Override // x8.G, java.io.Flushable
    public final void flush() {
        if (this.f22223b) {
            return;
        }
        ((B) this.f22224c.f7525e).flush();
    }
}
