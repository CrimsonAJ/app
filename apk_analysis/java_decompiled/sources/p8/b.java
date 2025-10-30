package p8;

import kotlin.jvm.internal.h;
import x8.B;
import x8.C2187g;
import x8.G;
import x8.K;
import x8.q;

/* loaded from: classes.dex */
public final class b implements G, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final q f22213a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U6.a f22215c;

    public b(U6.a aVar) {
        this.f22215c = aVar;
        this.f22213a = new q(((B) aVar.f7525e).f24599a.c());
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        h.e(source, "source");
        if (!this.f22214b) {
            if (j == 0) {
                return;
            }
            U6.a aVar = this.f22215c;
            B b9 = (B) aVar.f7525e;
            if (!b9.f24601c) {
                b9.f24600b.y0(j);
                b9.a();
                B b10 = (B) aVar.f7525e;
                b10.X("\r\n");
                b10.G(source, j);
                b10.X("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.G
    public final K c() {
        return this.f22213a;
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f22214b) {
            return;
        }
        this.f22214b = true;
        ((B) this.f22215c.f7525e).X("0\r\n\r\n");
        U6.a aVar = this.f22215c;
        q qVar = this.f22213a;
        aVar.getClass();
        K k5 = qVar.f24667e;
        qVar.f24667e = K.f24618d;
        k5.a();
        k5.b();
        this.f22215c.f7521a = 3;
    }

    @Override // x8.G, java.io.Flushable
    public final synchronized void flush() {
        if (this.f22214b) {
            return;
        }
        ((B) this.f22215c.f7525e).flush();
    }
}
