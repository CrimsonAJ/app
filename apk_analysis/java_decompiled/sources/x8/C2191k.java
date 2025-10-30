package x8;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: x8.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2191k implements G, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final t f24649a;

    /* renamed from: b, reason: collision with root package name */
    public long f24650b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24651c;

    public C2191k(t fileHandle) {
        kotlin.jvm.internal.h.e(fileHandle, "fileHandle");
        this.f24649a = fileHandle;
        this.f24650b = 0L;
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        kotlin.jvm.internal.h.e(source, "source");
        if (!this.f24651c) {
            t tVar = this.f24649a;
            long j4 = this.f24650b;
            tVar.getClass();
            s8.n.f(source.f24644b, 0L, j);
            long j9 = j4 + j;
            while (j4 < j9) {
                D d9 = source.f24643a;
                kotlin.jvm.internal.h.b(d9);
                int min = (int) Math.min(j9 - j4, d9.f24607c - d9.f24606b);
                byte[] array = d9.f24605a;
                int i9 = d9.f24606b;
                synchronized (tVar) {
                    kotlin.jvm.internal.h.e(array, "array");
                    tVar.f24681e.seek(j4);
                    tVar.f24681e.write(array, i9, min);
                }
                int i10 = d9.f24606b + min;
                d9.f24606b = i10;
                long j10 = min;
                j4 += j10;
                source.f24644b -= j10;
                if (i10 == d9.f24607c) {
                    source.f24643a = d9.a();
                    E.a(d9);
                }
            }
            this.f24650b += j;
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.G
    public final K c() {
        return K.f24618d;
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24651c) {
            return;
        }
        this.f24651c = true;
        t tVar = this.f24649a;
        ReentrantLock reentrantLock = tVar.f24680d;
        reentrantLock.lock();
        try {
            int i9 = tVar.f24679c - 1;
            tVar.f24679c = i9;
            if (i9 == 0) {
                if (tVar.f24678b) {
                    synchronized (tVar) {
                        tVar.f24681e.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // x8.G, java.io.Flushable
    public final void flush() {
        if (!this.f24651c) {
            t tVar = this.f24649a;
            synchronized (tVar) {
                tVar.f24681e.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
