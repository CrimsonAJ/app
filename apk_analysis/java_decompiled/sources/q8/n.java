package q8;

import b6.C0693o;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import x8.B;
import x8.C;

/* loaded from: classes.dex */
public final class n implements Closeable, AutoCloseable {

    /* renamed from: z, reason: collision with root package name */
    public static final z f22495z;

    /* renamed from: a, reason: collision with root package name */
    public final h f22496a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f22497b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f22498c;

    /* renamed from: d, reason: collision with root package name */
    public int f22499d;

    /* renamed from: e, reason: collision with root package name */
    public int f22500e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22501f;

    /* renamed from: g, reason: collision with root package name */
    public final m8.c f22502g;

    /* renamed from: h, reason: collision with root package name */
    public final m8.b f22503h;

    /* renamed from: i, reason: collision with root package name */
    public final m8.b f22504i;
    public final m8.b j;

    /* renamed from: k, reason: collision with root package name */
    public final y f22505k;

    /* renamed from: l, reason: collision with root package name */
    public long f22506l;

    /* renamed from: m, reason: collision with root package name */
    public long f22507m;

    /* renamed from: n, reason: collision with root package name */
    public long f22508n;

    /* renamed from: o, reason: collision with root package name */
    public long f22509o;

    /* renamed from: p, reason: collision with root package name */
    public final z f22510p;

    /* renamed from: q, reason: collision with root package name */
    public z f22511q;

    /* renamed from: r, reason: collision with root package name */
    public long f22512r;

    /* renamed from: s, reason: collision with root package name */
    public long f22513s;

    /* renamed from: t, reason: collision with root package name */
    public long f22514t;

    /* renamed from: u, reason: collision with root package name */
    public long f22515u;

    /* renamed from: v, reason: collision with root package name */
    public final Socket f22516v;

    /* renamed from: w, reason: collision with root package name */
    public final w f22517w;

    /* renamed from: x, reason: collision with root package name */
    public final M1.w f22518x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f22519y;

    static {
        z zVar = new z();
        zVar.c(7, 65535);
        zVar.c(5, 16384);
        f22495z = zVar;
    }

    public n(C0693o c0693o) {
        this.f22496a = (h) c0693o.f11387f;
        String str = (String) c0693o.f11382a;
        if (str != null) {
            this.f22498c = str;
            this.f22500e = 3;
            m8.c cVar = (m8.c) c0693o.f11383b;
            this.f22502g = cVar;
            this.f22503h = cVar.e();
            this.f22504i = cVar.e();
            this.j = cVar.e();
            this.f22505k = y.f22571a;
            z zVar = new z();
            zVar.c(7, 16777216);
            this.f22510p = zVar;
            this.f22511q = f22495z;
            this.f22515u = r0.a();
            Socket socket = (Socket) c0693o.f11384c;
            if (socket != null) {
                this.f22516v = socket;
                B b9 = (B) c0693o.f11386e;
                if (b9 != null) {
                    this.f22517w = new w(b9);
                    C c3 = (C) c0693o.f11385d;
                    if (c3 != null) {
                        this.f22518x = new M1.w(this, new r(c3));
                        this.f22519y = new LinkedHashSet();
                        return;
                    } else {
                        kotlin.jvm.internal.h.h("source");
                        throw null;
                    }
                }
                kotlin.jvm.internal.h.h("sink");
                throw null;
            }
            kotlin.jvm.internal.h.h("socket");
            throw null;
        }
        kotlin.jvm.internal.h.h("connectionName");
        throw null;
    }

    public final synchronized void F(long j) {
        long j4 = this.f22512r + j;
        this.f22512r = j4;
        long j9 = j4 - this.f22513s;
        if (j9 >= this.f22510p.a() / 2) {
            O(j9, 0);
            this.f22513s += j9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f22517w.f22565c);
        r6 = r2;
        r8.f22514t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(int r9, boolean r10, x8.C2187g r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            q8.w r12 = r8.f22517w
            r12.d(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.f22514t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.f22515u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.f22497b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            q8.w r4 = r8.f22517w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.f22565c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.f22514t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.f22514t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            q8.w r4 = r8.f22517w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.d(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.n.I(int, boolean, x8.g, long):void");
    }

    public final void N(int i9, int i10) {
        AbstractC0953k1.t(i10, "errorCode");
        this.f22503h.c(new j(this.f22498c + '[' + i9 + "] writeSynReset", this, i9, i10, 2), 0L);
    }

    public final void O(long j, int i9) {
        this.f22503h.c(new m(this.f22498c + '[' + i9 + "] windowUpdate", this, i9, j), 0L);
    }

    public final void a(int i9, int i10, IOException iOException) {
        int i11;
        Object[] objArr;
        AbstractC0953k1.t(i9, "connectionCode");
        AbstractC0953k1.t(i10, "streamCode");
        byte[] bArr = k8.c.f20141a;
        try {
            x(i9);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f22497b.isEmpty()) {
                objArr = this.f22497b.values().toArray(new v[0]);
                this.f22497b.clear();
            } else {
                objArr = null;
            }
        }
        v[] vVarArr = (v[]) objArr;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(i10, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f22517w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f22516v.close();
        } catch (IOException unused4) {
        }
        this.f22503h.f();
        this.f22504i.f();
        this.j.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final synchronized v d(int i9) {
        return (v) this.f22497b.get(Integer.valueOf(i9));
    }

    public final void flush() {
        this.f22517w.flush();
    }

    public final synchronized boolean g(long j) {
        if (this.f22501f) {
            return false;
        }
        if (this.f22508n < this.f22507m) {
            if (j >= this.f22509o) {
                return false;
            }
        }
        return true;
    }

    public final synchronized v s(int i9) {
        v vVar;
        vVar = (v) this.f22497b.remove(Integer.valueOf(i9));
        notifyAll();
        return vVar;
    }

    public final void x(int i9) {
        AbstractC0953k1.t(i9, "statusCode");
        synchronized (this.f22517w) {
            synchronized (this) {
                if (this.f22501f) {
                    return;
                }
                this.f22501f = true;
                this.f22517w.s(k8.c.f20141a, this.f22499d, i9);
            }
        }
    }
}
