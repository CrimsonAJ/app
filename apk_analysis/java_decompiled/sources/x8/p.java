package x8;

/* loaded from: classes.dex */
public abstract class p implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final I f24666a;

    public p(I delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f24666a = delegate;
    }

    @Override // x8.I
    public long b0(C2187g sink, long j) {
        kotlin.jvm.internal.h.e(sink, "sink");
        return this.f24666a.b0(sink, j);
    }

    @Override // x8.I
    public final K c() {
        return this.f24666a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24666a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f24666a + ')';
    }
}
