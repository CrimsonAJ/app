package x8;

/* loaded from: classes.dex */
public final class z implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2189i f24687a;

    /* renamed from: b, reason: collision with root package name */
    public final C2187g f24688b;

    /* renamed from: c, reason: collision with root package name */
    public D f24689c;

    /* renamed from: d, reason: collision with root package name */
    public int f24690d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24691e;

    /* renamed from: f, reason: collision with root package name */
    public long f24692f;

    public z(InterfaceC2189i interfaceC2189i) {
        int i9;
        this.f24687a = interfaceC2189i;
        C2187g b9 = interfaceC2189i.b();
        this.f24688b = b9;
        D d9 = b9.f24643a;
        this.f24689c = d9;
        if (d9 != null) {
            i9 = d9.f24606b;
        } else {
            i9 = -1;
        }
        this.f24690d = i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r3 == r5.f24606b) goto L15;
     */
    @Override // x8.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b0(x8.C2187g r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.h.e(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.f24691e
            if (r3 != 0) goto L63
            x8.D r3 = r8.f24689c
            x8.g r4 = r8.f24688b
            if (r3 == 0) goto L2b
            x8.D r5 = r4.f24643a
            if (r3 != r5) goto L23
            int r3 = r8.f24690d
            kotlin.jvm.internal.h.b(r5)
            int r5 = r5.f24606b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f24692f
            r2 = 1
            long r0 = r0 + r2
            x8.i r2 = r8.f24687a
            boolean r0 = r2.o(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            x8.D r0 = r8.f24689c
            if (r0 != 0) goto L4c
            x8.D r0 = r4.f24643a
            if (r0 == 0) goto L4c
            r8.f24689c = r0
            int r0 = r0.f24606b
            r8.f24690d = r0
        L4c:
            long r0 = r4.f24644b
            long r2 = r8.f24692f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            x8.g r2 = r8.f24688b
            long r4 = r8.f24692f
            r3 = r9
            r2.I(r3, r4, r6)
            long r9 = r8.f24692f
            long r9 = r9 + r6
            r8.f24692f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = com.google.android.gms.internal.measurement.AbstractC0953k1.k(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.z.b0(x8.g, long):long");
    }

    @Override // x8.I
    public final K c() {
        return this.f24687a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24691e = true;
    }
}
