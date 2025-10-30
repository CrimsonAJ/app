package q8;

import x8.C2187g;
import x8.I;
import x8.K;

/* loaded from: classes.dex */
public final class t implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final long f22542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22543b;

    /* renamed from: c, reason: collision with root package name */
    public final C2187g f22544c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C2187g f22545d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f22546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f22547f;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, x8.g] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, x8.g] */
    public t(v vVar, long j, boolean z9) {
        this.f22547f = vVar;
        this.f22542a = j;
        this.f22543b = z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    @Override // x8.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0(x8.C2187g r15, long r16) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            java.lang.String r3 = "sink"
            kotlin.jvm.internal.h.e(r15, r3)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto La1
        Le:
            q8.v r5 = r14.f22547f
            monitor-enter(r5)
            q8.u r6 = r5.f22558k     // Catch: java.lang.Throwable -> L8f
            r6.h()     // Catch: java.lang.Throwable -> L8f
            int r6 = r5.f()     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L33
            boolean r6 = r14.f22543b     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L33
            java.io.IOException r6 = r5.f22561n     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L34
            q8.A r6 = new q8.A     // Catch: java.lang.Throwable -> L31
            int r7 = r5.f()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.measurement.AbstractC0953k1.s(r7)     // Catch: java.lang.Throwable -> L31
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r0 = move-exception
            goto L99
        L33:
            r6 = 0
        L34:
            boolean r7 = r14.f22546e     // Catch: java.lang.Throwable -> L31
            if (r7 != 0) goto L91
            x8.g r7 = r14.f22545d     // Catch: java.lang.Throwable -> L31
            long r8 = r7.f24644b     // Catch: java.lang.Throwable -> L31
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r11 = -1
            r13 = 0
            if (r10 <= 0) goto L70
            long r8 = java.lang.Math.min(r1, r8)     // Catch: java.lang.Throwable -> L31
            long r7 = r7.b0(r15, r8)     // Catch: java.lang.Throwable -> L31
            long r9 = r5.f22551c     // Catch: java.lang.Throwable -> L31
            long r9 = r9 + r7
            r5.f22551c = r9     // Catch: java.lang.Throwable -> L31
            long r3 = r5.f22552d     // Catch: java.lang.Throwable -> L31
            long r9 = r9 - r3
            if (r6 != 0) goto L7b
            q8.n r3 = r5.f22550b     // Catch: java.lang.Throwable -> L31
            q8.z r3 = r3.f22510p     // Catch: java.lang.Throwable -> L31
            int r3 = r3.a()     // Catch: java.lang.Throwable -> L31
            int r3 = r3 / 2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L31
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            q8.n r3 = r5.f22550b     // Catch: java.lang.Throwable -> L31
            int r4 = r5.f22549a     // Catch: java.lang.Throwable -> L31
            r3.O(r9, r4)     // Catch: java.lang.Throwable -> L31
            long r3 = r5.f22551c     // Catch: java.lang.Throwable -> L31
            r5.f22552d = r3     // Catch: java.lang.Throwable -> L31
            goto L7b
        L70:
            boolean r3 = r14.f22543b     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L7a
            if (r6 != 0) goto L7a
            r5.l()     // Catch: java.lang.Throwable -> L31
            r13 = 1
        L7a:
            r7 = r11
        L7b:
            q8.u r3 = r5.f22558k     // Catch: java.lang.Throwable -> L8f
            r3.k()     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r5)
            if (r13 == 0) goto L86
            r3 = 0
            goto Le
        L86:
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L8b
            return r7
        L8b:
            if (r6 != 0) goto L8e
            return r11
        L8e:
            throw r6
        L8f:
            r0 = move-exception
            goto L9f
        L91:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L99:
            q8.u r1 = r5.f22558k     // Catch: java.lang.Throwable -> L8f
            r1.k()     // Catch: java.lang.Throwable -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8f
        L9f:
            monitor-exit(r5)
            throw r0
        La1:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.k(r1, r0)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q8.t.b0(x8.g, long):long");
    }

    @Override // x8.I
    public final K c() {
        return this.f22547f.f22558k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        v vVar = this.f22547f;
        synchronized (vVar) {
            this.f22546e = true;
            C2187g c2187g = this.f22545d;
            j = c2187g.f24644b;
            c2187g.x();
            vVar.notifyAll();
        }
        if (j > 0) {
            byte[] bArr = k8.c.f20141a;
            this.f22547f.f22550b.F(j);
        }
        this.f22547f.a();
    }
}
