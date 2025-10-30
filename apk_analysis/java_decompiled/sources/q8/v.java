package q8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f22549a;

    /* renamed from: b, reason: collision with root package name */
    public final n f22550b;

    /* renamed from: c, reason: collision with root package name */
    public long f22551c;

    /* renamed from: d, reason: collision with root package name */
    public long f22552d;

    /* renamed from: e, reason: collision with root package name */
    public long f22553e;

    /* renamed from: f, reason: collision with root package name */
    public long f22554f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f22555g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22556h;

    /* renamed from: i, reason: collision with root package name */
    public final t f22557i;
    public final s j;

    /* renamed from: k, reason: collision with root package name */
    public final u f22558k;

    /* renamed from: l, reason: collision with root package name */
    public final u f22559l;

    /* renamed from: m, reason: collision with root package name */
    public int f22560m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f22561n;

    public v(int i9, n connection, boolean z9, boolean z10, i8.w wVar) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f22549a = i9;
        this.f22550b = connection;
        this.f22554f = connection.f22511q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22555g = arrayDeque;
        this.f22557i = new t(this, connection.f22510p.a(), z10);
        this.j = new s(this, z9);
        this.f22558k = new u(this);
        this.f22559l = new u(this);
        if (wVar != null) {
            if (!h()) {
                arrayDeque.add(wVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void a() {
        boolean z9;
        boolean i9;
        byte[] bArr = k8.c.f20141a;
        synchronized (this) {
            try {
                t tVar = this.f22557i;
                if (!tVar.f22543b && tVar.f22546e) {
                    s sVar = this.j;
                    if (sVar.f22538a || sVar.f22540c) {
                        z9 = true;
                        i9 = i();
                    }
                }
                z9 = false;
                i9 = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            c(9, null);
        } else if (!i9) {
            this.f22550b.s(this.f22549a);
        }
    }

    public final void b() {
        s sVar = this.j;
        if (!sVar.f22540c) {
            if (!sVar.f22538a) {
                if (this.f22560m != 0) {
                    IOException iOException = this.f22561n;
                    if (iOException == null) {
                        int i9 = this.f22560m;
                        AbstractC0953k1.s(i9);
                        throw new A(i9);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void c(int i9, IOException iOException) {
        AbstractC0953k1.t(i9, "rstStatusCode");
        if (!d(i9, iOException)) {
            return;
        }
        n nVar = this.f22550b;
        nVar.getClass();
        AbstractC0953k1.t(i9, "statusCode");
        nVar.f22517w.I(this.f22549a, i9);
    }

    public final boolean d(int i9, IOException iOException) {
        byte[] bArr = k8.c.f20141a;
        synchronized (this) {
            if (this.f22560m != 0) {
                return false;
            }
            this.f22560m = i9;
            this.f22561n = iOException;
            notifyAll();
            if (this.f22557i.f22543b) {
                if (this.j.f22538a) {
                    return false;
                }
            }
            this.f22550b.s(this.f22549a);
            return true;
        }
    }

    public final void e(int i9) {
        AbstractC0953k1.t(i9, "errorCode");
        if (!d(i9, null)) {
            return;
        }
        this.f22550b.N(this.f22549a, i9);
    }

    public final synchronized int f() {
        return this.f22560m;
    }

    public final s g() {
        synchronized (this) {
            if (!this.f22556h && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean h() {
        boolean z9;
        if ((this.f22549a & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f22550b.getClass();
        if (true == z9) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.f22560m != 0) {
            return false;
        }
        t tVar = this.f22557i;
        if (tVar.f22543b || tVar.f22546e) {
            s sVar = this.j;
            if (sVar.f22538a || sVar.f22540c) {
                if (this.f22556h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(i8.w r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.h.e(r3, r0)
            byte[] r0 = k8.c.f20141a
            monitor-enter(r2)
            boolean r0 = r2.f22556h     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            if (r4 != 0) goto L10
            goto L18
        L10:
            q8.t r3 = r2.f22557i     // Catch: java.lang.Throwable -> L16
            r3.getClass()     // Catch: java.lang.Throwable -> L16
            goto L1f
        L16:
            r3 = move-exception
            goto L37
        L18:
            r2.f22556h = r1     // Catch: java.lang.Throwable -> L16
            java.util.ArrayDeque r0 = r2.f22555g     // Catch: java.lang.Throwable -> L16
            r0.add(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r4 == 0) goto L25
            q8.t r3 = r2.f22557i     // Catch: java.lang.Throwable -> L16
            r3.f22543b = r1     // Catch: java.lang.Throwable -> L16
        L25:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L16
            r2.notifyAll()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            if (r3 != 0) goto L36
            q8.n r3 = r2.f22550b
            int r4 = r2.f22549a
            r3.s(r4)
        L36:
            return
        L37:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.v.j(i8.w, boolean):void");
    }

    public final synchronized void k(int i9) {
        AbstractC0953k1.t(i9, "errorCode");
        if (this.f22560m == 0) {
            this.f22560m = i9;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
