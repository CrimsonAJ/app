package v1;

import java.io.Closeable;

/* renamed from: v1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2099g implements AutoCloseable, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C2095c f23758a;

    public C2099g(C2095c c2095c) {
        this.f23758a = c2095c;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.f23758a.close();
    }
}
