package i8;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import l6.AbstractC1570b;

/* renamed from: i8.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417g implements Closeable, Flushable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final l8.g f19085a;

    public C1417g(File file) {
        this.f19085a = new l8.g(file, m8.c.f20928h);
    }

    public final void a(G request) {
        kotlin.jvm.internal.h.e(request, "request");
        l8.g gVar = this.f19085a;
        String key = AbstractC1570b.o(request.f19005a);
        synchronized (gVar) {
            kotlin.jvm.internal.h.e(key, "key");
            gVar.x();
            gVar.a();
            l8.g.i0(key);
            l8.d dVar = (l8.d) gVar.f20646g.get(key);
            if (dVar == null) {
                return;
            }
            gVar.g0(dVar);
            if (gVar.f20644e <= 5242880) {
                gVar.f20651m = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19085a.close();
    }

    public final synchronized void d() {
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f19085a.flush();
    }
}
