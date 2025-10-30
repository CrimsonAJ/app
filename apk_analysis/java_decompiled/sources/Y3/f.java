package Y3;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class f implements h, m3.c {

    /* renamed from: a, reason: collision with root package name */
    public final m3.i f8703a;

    /* renamed from: f, reason: collision with root package name */
    public final m3.g[] f8708f;

    /* renamed from: h, reason: collision with root package name */
    public int f8710h;

    /* renamed from: i, reason: collision with root package name */
    public m3.f f8711i;
    public i j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8712k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8713l;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8704b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f8705c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f8706d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final m3.f[] f8707e = new k[2];

    /* renamed from: g, reason: collision with root package name */
    public int f8709g = 2;

    public f() {
        d[] dVarArr = new d[2];
        int i9 = 0;
        while (true) {
            if (i9 >= this.f8709g) {
                break;
            }
            this.f8707e[i9] = new m3.f(1);
            i9++;
        }
        this.f8708f = dVarArr;
        this.f8710h = 2;
        for (int i10 = 0; i10 < this.f8710h; i10++) {
            this.f8708f[i10] = new d(this, 1);
        }
        m3.i iVar = new m3.i(this);
        this.f8703a = iVar;
        iVar.start();
        int i11 = this.f8709g;
        m3.f[] fVarArr = this.f8707e;
        AbstractC1566a.m(i11 == fVarArr.length);
        for (m3.f fVar : fVarArr) {
            fVar.t(1024);
        }
    }

    @Override // m3.c
    public final void a() {
        synchronized (this.f8704b) {
            this.f8713l = true;
            this.f8704b.notify();
        }
        try {
            this.f8703a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // m3.c
    public final void b(k kVar) {
        boolean z9;
        synchronized (this.f8704b) {
            try {
                i iVar = this.j;
                if (iVar == null) {
                    if (kVar == this.f8711i) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC1566a.h(z9);
                    this.f8705c.addLast(kVar);
                    if (!this.f8705c.isEmpty() && this.f8710h > 0) {
                        this.f8704b.notify();
                    }
                    this.f8711i = null;
                } else {
                    throw iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m3.c
    public final Object d() {
        synchronized (this.f8704b) {
            try {
                i iVar = this.j;
                if (iVar == null) {
                    if (this.f8706d.isEmpty()) {
                        return null;
                    }
                    return (m3.g) this.f8706d.removeFirst();
                }
                throw iVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m3.c
    public final Object e() {
        boolean z9;
        m3.f fVar;
        synchronized (this.f8704b) {
            try {
                i iVar = this.j;
                if (iVar == null) {
                    if (this.f8711i == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC1566a.m(z9);
                    int i9 = this.f8709g;
                    if (i9 == 0) {
                        fVar = null;
                    } else {
                        m3.f[] fVarArr = this.f8707e;
                        int i10 = i9 - 1;
                        this.f8709g = i10;
                        fVar = fVarArr[i10];
                    }
                    this.f8711i = fVar;
                } else {
                    throw iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public abstract g f(int i9, boolean z9, byte[] bArr);

    @Override // m3.c
    public final void flush() {
        synchronized (this.f8704b) {
            try {
                this.f8712k = true;
                m3.f fVar = this.f8711i;
                if (fVar != null) {
                    fVar.r();
                    int i9 = this.f8709g;
                    this.f8709g = i9 + 1;
                    this.f8707e[i9] = fVar;
                    this.f8711i = null;
                }
                while (!this.f8705c.isEmpty()) {
                    m3.f fVar2 = (m3.f) this.f8705c.removeFirst();
                    fVar2.r();
                    int i10 = this.f8709g;
                    this.f8709g = i10 + 1;
                    this.f8707e[i10] = fVar2;
                }
                while (!this.f8706d.isEmpty()) {
                    ((m3.g) this.f8706d.removeFirst()).r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i g(m3.f fVar, m3.g gVar, boolean z9) {
        k kVar = (k) fVar;
        d dVar = (d) gVar;
        try {
            ByteBuffer byteBuffer = kVar.f20704d;
            byteBuffer.getClass();
            dVar.s(kVar.f20706f, f(byteBuffer.limit(), z9, byteBuffer.array()), kVar.f8715i);
            dVar.f6039b &= Integer.MAX_VALUE;
            return null;
        } catch (i e8) {
            return e8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007a  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Exception] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8704b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f8713l     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.util.ArrayDeque r1 = r8.f8705c     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L17
            int r1 = r8.f8710h     // Catch: java.lang.Throwable -> L20
            if (r1 <= 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r2
        L18:
            if (r1 != 0) goto L23
            java.lang.Object r1 = r8.f8704b     // Catch: java.lang.Throwable -> L20
            r1.wait()     // Catch: java.lang.Throwable -> L20
            goto L3
        L20:
            r1 = move-exception
            goto Lb1
        L23:
            boolean r1 = r8.f8713l     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L29:
            java.util.ArrayDeque r1 = r8.f8705c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L20
            m3.f r1 = (m3.f) r1     // Catch: java.lang.Throwable -> L20
            m3.g[] r4 = r8.f8708f     // Catch: java.lang.Throwable -> L20
            int r5 = r8.f8710h     // Catch: java.lang.Throwable -> L20
            int r5 = r5 - r3
            r8.f8710h = r5     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            boolean r5 = r8.f8712k     // Catch: java.lang.Throwable -> L20
            r8.f8712k = r2     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = 4
            boolean r6 = r1.e(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L4c
            r4.b(r0)
            goto L84
        L4c:
            boolean r0 = r1.e(r7)
            if (r0 == 0) goto L55
            r4.b(r7)
        L55:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.e(r0)
            if (r6 == 0) goto L60
            r4.b(r0)
        L60:
            Y3.i r0 = r8.g(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L65 java.lang.RuntimeException -> L6f
            goto L78
        L65:
            r0 = move-exception
            Y3.i r5 = new Y3.i
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L6d:
            r0 = r5
            goto L78
        L6f:
            r0 = move-exception
            Y3.i r5 = new Y3.i
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L6d
        L78:
            if (r0 == 0) goto L84
            java.lang.Object r5 = r8.f8704b
            monitor-enter(r5)
            r8.j = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            return r2
        L81:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            java.lang.Object r2 = r8.f8704b
            monitor-enter(r2)
            boolean r0 = r8.f8712k     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L91
            r4.r()     // Catch: java.lang.Throwable -> L8f
            goto La0
        L8f:
            r0 = move-exception
            goto Laf
        L91:
            boolean r0 = r4.e(r7)     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L9b
            r4.r()     // Catch: java.lang.Throwable -> L8f
            goto La0
        L9b:
            java.util.ArrayDeque r0 = r8.f8706d     // Catch: java.lang.Throwable -> L8f
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L8f
        La0:
            r1.r()     // Catch: java.lang.Throwable -> L8f
            int r0 = r8.f8709g     // Catch: java.lang.Throwable -> L8f
            int r4 = r0 + 1
            r8.f8709g = r4     // Catch: java.lang.Throwable -> L8f
            m3.f[] r4 = r8.f8707e     // Catch: java.lang.Throwable -> L8f
            r4[r0] = r1     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8f
            return r3
        Laf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8f
            throw r0
        Lb1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.f.h():boolean");
    }

    @Override // Y3.h
    public final void c(long j) {
    }
}
