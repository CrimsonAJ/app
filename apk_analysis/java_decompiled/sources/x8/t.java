package x8;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class t implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24677a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24678b;

    /* renamed from: c, reason: collision with root package name */
    public int f24679c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f24680d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f24681e;

    public t(boolean z9, RandomAccessFile randomAccessFile) {
        this.f24677a = z9;
        this.f24681e = randomAccessFile;
    }

    public static C2191k a(t tVar) {
        if (tVar.f24677a) {
            ReentrantLock reentrantLock = tVar.f24680d;
            reentrantLock.lock();
            try {
                if (!tVar.f24678b) {
                    tVar.f24679c++;
                    reentrantLock.unlock();
                    return new C2191k(tVar);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f24680d;
        reentrantLock.lock();
        try {
            if (this.f24678b) {
                return;
            }
            this.f24678b = true;
            if (this.f24679c != 0) {
                return;
            }
            synchronized (this) {
                this.f24681e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long d() {
        long length;
        ReentrantLock reentrantLock = this.f24680d;
        reentrantLock.lock();
        try {
            if (!this.f24678b) {
                synchronized (this) {
                    length = this.f24681e.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (this.f24677a) {
            ReentrantLock reentrantLock = this.f24680d;
            reentrantLock.lock();
            try {
                if (!this.f24678b) {
                    synchronized (this) {
                        this.f24681e.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final C2192l g(long j) {
        ReentrantLock reentrantLock = this.f24680d;
        reentrantLock.lock();
        try {
            if (!this.f24678b) {
                this.f24679c++;
                reentrantLock.unlock();
                return new C2192l(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
