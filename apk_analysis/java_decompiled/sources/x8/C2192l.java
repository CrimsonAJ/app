package x8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: x8.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2192l implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final t f24652a;

    /* renamed from: b, reason: collision with root package name */
    public long f24653b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24654c;

    public C2192l(t fileHandle, long j) {
        kotlin.jvm.internal.h.e(fileHandle, "fileHandle");
        this.f24652a = fileHandle;
        this.f24653b = j;
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        long j4;
        long j9;
        int i9;
        kotlin.jvm.internal.h.e(sink, "sink");
        if (!this.f24654c) {
            t tVar = this.f24652a;
            long j10 = this.f24653b;
            tVar.getClass();
            if (j >= 0) {
                long j11 = j + j10;
                long j12 = j10;
                while (true) {
                    if (j12 < j11) {
                        D s02 = sink.s0(1);
                        byte[] array = s02.f24605a;
                        int i10 = s02.f24607c;
                        j4 = -1;
                        int min = (int) Math.min(j11 - j12, 8192 - i10);
                        synchronized (tVar) {
                            kotlin.jvm.internal.h.e(array, "array");
                            tVar.f24681e.seek(j12);
                            i9 = 0;
                            while (true) {
                                if (i9 >= min) {
                                    break;
                                }
                                int read = tVar.f24681e.read(array, i10, min - i9);
                                if (read == -1) {
                                    if (i9 == 0) {
                                        i9 = -1;
                                    }
                                } else {
                                    i9 += read;
                                }
                            }
                        }
                        if (i9 == -1) {
                            if (s02.f24606b == s02.f24607c) {
                                sink.f24643a = s02.a();
                                E.a(s02);
                            }
                            if (j10 == j12) {
                                j9 = -1;
                            }
                        } else {
                            s02.f24607c += i9;
                            long j13 = i9;
                            j12 += j13;
                            sink.f24644b += j13;
                        }
                    } else {
                        j4 = -1;
                        break;
                    }
                }
                j9 = j12 - j10;
                if (j9 != j4) {
                    this.f24653b += j9;
                }
                return j9;
            }
            throw new IllegalArgumentException(AbstractC0953k1.k(j, "byteCount < 0: ").toString());
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.I
    public final K c() {
        return K.f24618d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24654c) {
            return;
        }
        this.f24654c = true;
        t tVar = this.f24652a;
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
}
