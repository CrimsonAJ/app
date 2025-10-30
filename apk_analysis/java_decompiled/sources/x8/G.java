package x8;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface G extends Closeable, Flushable {
    void G(C2187g c2187g, long j);

    K c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
