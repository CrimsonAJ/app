package x8;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class s implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final C f24673a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f24674b;

    /* renamed from: c, reason: collision with root package name */
    public int f24675c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24676d;

    public s(C c3, Inflater inflater) {
        this.f24673a = c3;
        this.f24674b = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[SYNTHETIC] */
    @Override // x8.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0(x8.C2187g r11, long r12) {
        /*
            r10 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.h.e(r11, r0)
        L5:
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb5
            boolean r3 = r10.f24676d
            if (r3 != 0) goto Lad
            x8.C r3 = r10.f24673a
            java.util.zip.Inflater r4 = r10.f24674b
            if (r2 != 0) goto L17
        L15:
            r8 = r0
            goto L82
        L17:
            r2 = 1
            x8.D r2 = r11.s0(r2)     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = r2.f24607c     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> L70
            long r5 = java.lang.Math.min(r12, r5)     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> L70
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> L70
            if (r6 != 0) goto L2d
            goto L47
        L2d:
            boolean r6 = r3.a()     // Catch: java.util.zip.DataFormatException -> L70
            if (r6 == 0) goto L34
            goto L47
        L34:
            x8.g r6 = r3.f24603b     // Catch: java.util.zip.DataFormatException -> L70
            x8.D r6 = r6.f24643a     // Catch: java.util.zip.DataFormatException -> L70
            kotlin.jvm.internal.h.b(r6)     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r6.f24607c     // Catch: java.util.zip.DataFormatException -> L70
            int r8 = r6.f24606b     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r7 - r8
            r10.f24675c = r7     // Catch: java.util.zip.DataFormatException -> L70
            byte[] r6 = r6.f24605a     // Catch: java.util.zip.DataFormatException -> L70
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> L70
        L47:
            byte[] r6 = r2.f24605a     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r2.f24607c     // Catch: java.util.zip.DataFormatException -> L70
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r10.f24675c     // Catch: java.util.zip.DataFormatException -> L70
            if (r6 != 0) goto L54
            goto L62
        L54:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r6 - r7
            int r7 = r10.f24675c     // Catch: java.util.zip.DataFormatException -> L70
            int r7 = r7 - r6
            r10.f24675c = r7     // Catch: java.util.zip.DataFormatException -> L70
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> L70
            r3.n(r6)     // Catch: java.util.zip.DataFormatException -> L70
        L62:
            if (r5 <= 0) goto L72
            int r6 = r2.f24607c     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r6 + r5
            r2.f24607c = r6     // Catch: java.util.zip.DataFormatException -> L70
            long r6 = r11.f24644b     // Catch: java.util.zip.DataFormatException -> L70
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> L70
            long r6 = r6 + r8
            r11.f24644b = r6     // Catch: java.util.zip.DataFormatException -> L70
            goto L82
        L70:
            r11 = move-exception
            goto La7
        L72:
            int r5 = r2.f24606b     // Catch: java.util.zip.DataFormatException -> L70
            int r6 = r2.f24607c     // Catch: java.util.zip.DataFormatException -> L70
            if (r5 != r6) goto L15
            x8.D r5 = r2.a()     // Catch: java.util.zip.DataFormatException -> L70
            r11.f24643a = r5     // Catch: java.util.zip.DataFormatException -> L70
            x8.E.a(r2)     // Catch: java.util.zip.DataFormatException -> L70
            goto L15
        L82:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L87
            return r8
        L87:
            boolean r0 = r4.finished()
            if (r0 != 0) goto La4
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L94
            goto La4
        L94:
            boolean r0 = r3.a()
            if (r0 != 0) goto L9c
            goto L5
        L9c:
            java.io.EOFException r11 = new java.io.EOFException
            java.lang.String r12 = "source exhausted prematurely"
            r11.<init>(r12)
            throw r11
        La4:
            r11 = -1
            return r11
        La7:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r11)
            throw r12
        Lad:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        Lb5:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = com.google.android.gms.internal.measurement.AbstractC0953k1.k(r12, r11)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.s.b0(x8.g, long):long");
    }

    @Override // x8.I
    public final K c() {
        return this.f24673a.f24602a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f24676d) {
            return;
        }
        this.f24674b.end();
        this.f24676d = true;
        this.f24673a.close();
    }
}
