package x8;

/* loaded from: classes.dex */
public abstract class o implements G, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final G f24665a;

    public o(G delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f24665a = delegate;
    }

    @Override // x8.G
    public void G(C2187g source, long j) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f24665a.G(source, j);
    }

    @Override // x8.G
    public final K c() {
        return this.f24665a.c();
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24665a.close();
    }

    @Override // x8.G, java.io.Flushable
    public void flush() {
        this.f24665a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f24665a + ')';
    }
}
