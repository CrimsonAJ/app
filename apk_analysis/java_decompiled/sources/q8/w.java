package q8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import w.AbstractC2128h;
import x8.B;
import x8.C2187g;

/* loaded from: classes.dex */
public final class w implements Closeable, AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f22562f = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final B f22563a;

    /* renamed from: b, reason: collision with root package name */
    public final C2187g f22564b;

    /* renamed from: c, reason: collision with root package name */
    public int f22565c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22566d;

    /* renamed from: e, reason: collision with root package name */
    public final d f22567e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, x8.g] */
    public w(B sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f22563a = sink;
        ?? obj = new Object();
        this.f22564b = obj;
        this.f22565c = 16384;
        this.f22567e = new d(obj);
    }

    public final synchronized void F(int i9, int i10, boolean z9) {
        if (!this.f22566d) {
            g(0, 8, 6, z9 ? 1 : 0);
            this.f22563a.d(i9);
            this.f22563a.d(i10);
            this.f22563a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void I(int i9, int i10) {
        AbstractC0953k1.t(i10, "errorCode");
        if (!this.f22566d) {
            if (AbstractC2128h.b(i10) != -1) {
                g(i9, 4, 3, 0);
                this.f22563a.d(AbstractC2128h.b(i10));
                this.f22563a.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void N(z settings) {
        int i9;
        try {
            kotlin.jvm.internal.h.e(settings, "settings");
            if (!this.f22566d) {
                g(0, Integer.bitCount(settings.f22572a) * 6, 4, 0);
                for (int i10 = 0; i10 < 10; i10++) {
                    boolean z9 = true;
                    if (((1 << i10) & settings.f22572a) == 0) {
                        z9 = false;
                    }
                    if (z9) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                i9 = i10;
                            } else {
                                i9 = 4;
                            }
                        } else {
                            i9 = 3;
                        }
                        B b9 = this.f22563a;
                        if (!b9.f24601c) {
                            b9.f24600b.A0(i9);
                            b9.a();
                            this.f22563a.d(settings.f22573b[i10]);
                        } else {
                            throw new IllegalStateException("closed");
                        }
                    }
                }
                this.f22563a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void O(long j, int i9) {
        if (!this.f22566d) {
            if (j != 0 && j <= 2147483647L) {
                g(i9, 4, 8, 0);
                this.f22563a.d((int) j);
                this.f22563a.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(z peerSettings) {
        int i9;
        try {
            kotlin.jvm.internal.h.e(peerSettings, "peerSettings");
            if (!this.f22566d) {
                int i10 = this.f22565c;
                int i11 = peerSettings.f22572a;
                if ((i11 & 32) != 0) {
                    i10 = peerSettings.f22573b[5];
                }
                this.f22565c = i10;
                int i12 = -1;
                if ((i11 & 2) != 0) {
                    i9 = peerSettings.f22573b[1];
                } else {
                    i9 = -1;
                }
                if (i9 != -1) {
                    d dVar = this.f22567e;
                    if ((i11 & 2) != 0) {
                        i12 = peerSettings.f22573b[1];
                    }
                    dVar.getClass();
                    int min = Math.min(i12, 16384);
                    int i13 = dVar.f22466d;
                    if (i13 != min) {
                        if (min < i13) {
                            dVar.f22464b = Math.min(dVar.f22464b, min);
                        }
                        dVar.f22465c = true;
                        dVar.f22466d = min;
                        int i14 = dVar.f22470h;
                        if (min < i14) {
                            if (min == 0) {
                                b[] bVarArr = dVar.f22467e;
                                B7.j.i0(bVarArr, null, 0, bVarArr.length);
                                dVar.f22468f = dVar.f22467e.length - 1;
                                dVar.f22469g = 0;
                                dVar.f22470h = 0;
                            } else {
                                dVar.a(i14 - min);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.f22563a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22566d = true;
        this.f22563a.close();
    }

    public final synchronized void d(boolean z9, int i9, C2187g c2187g, int i10) {
        if (!this.f22566d) {
            g(i9, i10, 0, z9 ? 1 : 0);
            if (i10 > 0) {
                kotlin.jvm.internal.h.b(c2187g);
                this.f22563a.G(c2187g, i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() {
        if (!this.f22566d) {
            this.f22563a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void g(int i9, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f22562f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i9, i10, i11, i12));
        }
        if (i10 <= this.f22565c) {
            if ((Integer.MIN_VALUE & i9) == 0) {
                byte[] bArr = k8.c.f20141a;
                B b9 = this.f22563a;
                kotlin.jvm.internal.h.e(b9, "<this>");
                b9.y((i10 >>> 16) & 255);
                b9.y((i10 >>> 8) & 255);
                b9.y(i10 & 255);
                b9.y(i11 & 255);
                b9.y(i12 & 255);
                b9.d(i9 & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "reserved bit set: ").toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f22565c + ": " + i10).toString());
    }

    public final synchronized void s(byte[] bArr, int i9, int i10) {
        AbstractC0953k1.t(i10, "errorCode");
        if (!this.f22566d) {
            if (AbstractC2128h.b(i10) != -1) {
                g(0, bArr.length + 8, 7, 0);
                this.f22563a.d(i9);
                this.f22563a.d(AbstractC2128h.b(i10));
                if (bArr.length != 0) {
                    this.f22563a.D(bArr);
                }
                this.f22563a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void x(boolean z9, int i9, ArrayList arrayList) {
        int i10;
        int i11;
        if (!this.f22566d) {
            this.f22567e.d(arrayList);
            long j = this.f22564b.f24644b;
            long min = Math.min(this.f22565c, j);
            if (j == min) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            if (z9) {
                i10 |= 1;
            }
            g(i9, (int) min, 1, i10);
            this.f22563a.G(this.f22564b, min);
            if (j > min) {
                long j4 = j - min;
                while (j4 > 0) {
                    long min2 = Math.min(this.f22565c, j4);
                    j4 -= min2;
                    int i12 = (int) min2;
                    if (j4 == 0) {
                        i11 = 4;
                    } else {
                        i11 = 0;
                    }
                    g(i9, i12, 9, i11);
                    this.f22563a.G(this.f22564b, min2);
                }
            }
        } else {
            throw new IOException("closed");
        }
    }
}
