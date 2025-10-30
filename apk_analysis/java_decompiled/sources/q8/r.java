package q8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import w.AbstractC2128h;
import x8.C;
import x8.C2187g;
import x8.C2190j;

/* loaded from: classes.dex */
public final class r implements Closeable, AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f22534d;

    /* renamed from: a, reason: collision with root package name */
    public final C f22535a;

    /* renamed from: b, reason: collision with root package name */
    public final q f22536b;

    /* renamed from: c, reason: collision with root package name */
    public final c f22537c;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        kotlin.jvm.internal.h.d(logger, "getLogger(Http2::class.java.name)");
        f22534d = logger;
    }

    public r(C source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f22535a = source;
        q qVar = new q(source);
        this.f22536b = qVar;
        this.f22537c = new c(qVar);
    }

    public final void F(M1.w wVar, int i9, int i10, int i11) {
        if (i9 == 8) {
            if (i11 == 0) {
                int x5 = this.f22535a.x();
                int x9 = this.f22535a.x();
                if ((i10 & 1) != 0) {
                    n nVar = (n) wVar.f4759c;
                    synchronized (nVar) {
                        try {
                            if (x5 != 1) {
                                if (x5 != 2) {
                                    if (x5 == 3) {
                                        nVar.notifyAll();
                                    }
                                } else {
                                    nVar.f22508n++;
                                }
                            } else {
                                nVar.f22506l++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                ((n) wVar.f4759c).f22503h.c(new j(AbstractC0953k1.q(new StringBuilder(), ((n) wVar.f4759c).f22498c, " ping"), (n) wVar.f4759c, x5, x9, 0), 0L);
                return;
            }
            throw new IOException("TYPE_PING streamId != 0");
        }
        throw new IOException(AbstractC0953k1.j(i9, "TYPE_PING length != 8: "));
    }

    public final void I(M1.w wVar, int i9, int i10, int i11) {
        int i12;
        if (i11 != 0) {
            if ((i10 & 8) != 0) {
                byte g9 = this.f22535a.g();
                byte[] bArr = k8.c.f20141a;
                i12 = g9 & 255;
            } else {
                i12 = 0;
            }
            int x5 = this.f22535a.x() & Integer.MAX_VALUE;
            List s9 = s(p.a(i9 - 4, i10, i12), i12, i10, i11);
            n nVar = (n) wVar.f4759c;
            nVar.getClass();
            synchronized (nVar) {
                if (nVar.f22519y.contains(Integer.valueOf(x5))) {
                    nVar.N(x5, 2);
                    return;
                }
                nVar.f22519y.add(Integer.valueOf(x5));
                nVar.f22504i.c(new l(nVar.f22498c + '[' + x5 + "] onRequest", nVar, x5, s9), 0L);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0144, code lost:
    
        throw new java.io.IOException(com.google.android.gms.internal.measurement.AbstractC0953k1.j(r10, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r20, M1.w r21) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.r.a(boolean, M1.w):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22535a.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, x8.g] */
    public final void d(M1.w wVar, int i9, int i10, int i11) {
        boolean z9;
        int i12;
        boolean z10;
        v vVar;
        boolean z11;
        long j;
        boolean z12;
        boolean z13;
        if (i11 != 0) {
            if ((i10 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i10 & 32) == 0) {
                if ((i10 & 8) != 0) {
                    byte g9 = this.f22535a.g();
                    byte[] bArr = k8.c.f20141a;
                    i12 = g9 & 255;
                } else {
                    i12 = 0;
                }
                int a5 = p.a(i9, i10, i12);
                C source = this.f22535a;
                kotlin.jvm.internal.h.e(source, "source");
                ((n) wVar.f4759c).getClass();
                if (i11 != 0 && (i11 & 1) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                long j4 = 0;
                if (z10) {
                    n nVar = (n) wVar.f4759c;
                    nVar.getClass();
                    ?? obj = new Object();
                    long j9 = a5;
                    source.g0(j9);
                    source.b0(obj, j9);
                    nVar.f22504i.c(new k(nVar.f22498c + '[' + i11 + "] onData", nVar, i11, obj, a5, z9), 0L);
                } else {
                    v d9 = ((n) wVar.f4759c).d(i11);
                    if (d9 == null) {
                        ((n) wVar.f4759c).N(i11, 2);
                        long j10 = a5;
                        ((n) wVar.f4759c).F(j10);
                        source.n(j10);
                    } else {
                        byte[] bArr2 = k8.c.f20141a;
                        t tVar = d9.f22557i;
                        long j11 = a5;
                        tVar.getClass();
                        long j12 = j11;
                        while (true) {
                            if (j12 > j4) {
                                synchronized (tVar.f22547f) {
                                    z11 = tVar.f22543b;
                                    j = j4;
                                    vVar = d9;
                                    if (tVar.f22545d.f24644b + j12 > tVar.f22542a) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                if (z12) {
                                    source.n(j12);
                                    tVar.f22547f.e(4);
                                    break;
                                }
                                if (z11) {
                                    source.n(j12);
                                    break;
                                }
                                long b02 = source.b0(tVar.f22544c, j12);
                                if (b02 != -1) {
                                    j12 -= b02;
                                    v vVar2 = tVar.f22547f;
                                    synchronized (vVar2) {
                                        try {
                                            if (tVar.f22546e) {
                                                tVar.f22544c.x();
                                            } else {
                                                C2187g c2187g = tVar.f22545d;
                                                if (c2187g.f24644b == j) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                c2187g.v0(tVar.f22544c);
                                                if (z13) {
                                                    vVar2.notifyAll();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    j4 = j;
                                    d9 = vVar;
                                } else {
                                    throw new EOFException();
                                }
                            } else {
                                vVar = d9;
                                byte[] bArr3 = k8.c.f20141a;
                                tVar.f22547f.f22550b.F(j11);
                                break;
                            }
                        }
                        if (z9) {
                            vVar.j(k8.c.f20142b, true);
                        }
                    }
                }
                this.f22535a.n(i12);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    public final void g(M1.w wVar, int i9, int i10) {
        int i11;
        Object[] array;
        if (i9 >= 8) {
            if (i10 == 0) {
                int x5 = this.f22535a.x();
                int x9 = this.f22535a.x();
                int i12 = i9 - 8;
                int[] c3 = AbstractC2128h.c(14);
                int length = c3.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        i11 = c3[i13];
                        if (AbstractC2128h.b(i11) == x9) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        i11 = 0;
                        break;
                    }
                }
                if (i11 != 0) {
                    C2190j debugData = C2190j.f24645d;
                    if (i12 > 0) {
                        debugData = this.f22535a.s(i12);
                    }
                    kotlin.jvm.internal.h.e(debugData, "debugData");
                    debugData.d();
                    n nVar = (n) wVar.f4759c;
                    synchronized (nVar) {
                        array = nVar.f22497b.values().toArray(new v[0]);
                        nVar.f22501f = true;
                    }
                    for (v vVar : (v[]) array) {
                        if (vVar.f22549a > x5 && vVar.h()) {
                            vVar.k(8);
                            ((n) wVar.f4759c).s(vVar.f22549a);
                        }
                    }
                    return;
                }
                throw new IOException(AbstractC0953k1.j(x9, "TYPE_GOAWAY unexpected error code: "));
            }
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        throw new IOException(AbstractC0953k1.j(i9, "TYPE_GOAWAY length < 8: "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r6.f22456a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List s(int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.r.s(int, int, int, int):java.util.List");
    }

    public final void x(M1.w wVar, int i9, int i10, int i11) {
        boolean z9;
        int i12;
        int i13 = 1;
        if (i11 != 0) {
            boolean z10 = false;
            if ((i10 & 1) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i10 & 8) != 0) {
                byte g9 = this.f22535a.g();
                byte[] bArr = k8.c.f20141a;
                i12 = g9 & 255;
            } else {
                i12 = 0;
            }
            if ((i10 & 32) != 0) {
                C c3 = this.f22535a;
                c3.x();
                c3.g();
                byte[] bArr2 = k8.c.f20141a;
                i9 -= 5;
            }
            List s9 = s(p.a(i9, i10, i12), i12, i10, i11);
            ((n) wVar.f4759c).getClass();
            if (i11 != 0 && (i11 & 1) == 0) {
                z10 = true;
            }
            if (z10) {
                n nVar = (n) wVar.f4759c;
                nVar.getClass();
                nVar.f22504i.c(new l(nVar.f22498c + '[' + i11 + "] onHeaders", nVar, i11, s9, z9), 0L);
                return;
            }
            n nVar2 = (n) wVar.f4759c;
            synchronized (nVar2) {
                v d9 = nVar2.d(i11);
                if (d9 == null) {
                    if (nVar2.f22501f) {
                        return;
                    }
                    if (i11 <= nVar2.f22499d) {
                        return;
                    }
                    if (i11 % 2 == nVar2.f22500e % 2) {
                        return;
                    }
                    v vVar = new v(i11, nVar2, false, z9, k8.c.v(s9));
                    nVar2.f22499d = i11;
                    nVar2.f22497b.put(Integer.valueOf(i11), vVar);
                    nVar2.f22502g.e().c(new i(nVar2.f22498c + '[' + i11 + "] onStream", nVar2, vVar, i13), 0L);
                    return;
                }
                d9.j(k8.c.v(s9), z9);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }
}
