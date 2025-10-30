package I0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h implements b, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final k f3211a;

    /* renamed from: b, reason: collision with root package name */
    public final k f3212b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f3213c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3214d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3215e;

    public h(A1.g gVar) {
        this.f3213c = new ThreadLocal();
        this.f3214d = new AtomicBoolean(false);
        int i9 = X7.a.f8474d;
        this.f3215e = Z0.a.A(30, X7.c.SECONDS);
        k kVar = new k(1, new B2.i(3, gVar));
        this.f3211a = kVar;
        this.f3212b = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0198 A[Catch: all -> 0x01ae, TRY_LEAVE, TryCatch #9 {all -> 0x01ae, blocks: (B:17:0x0192, B:19:0x0198, B:25:0x01a4, B:22:0x01a7), top: B:16:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:62:0x0133, B:64:0x0139, B:65:0x0156, B:69:0x0160, B:73:0x01af, B:74:0x01b6, B:75:0x01b7, B:76:0x01b8, B:77:0x01bb), top: B:61:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8 A[Catch: all -> 0x0150, TryCatch #1 {all -> 0x0150, blocks: (B:62:0x0133, B:64:0x0139, B:65:0x0156, B:69:0x0160, B:73:0x01af, B:74:0x01b6, B:75:0x01b7, B:76:0x01b8, B:77:0x01bb), top: B:61:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(O7.p r19, G7.c r20) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.h.E(O7.p, G7.c):java.lang.Object");
    }

    public final void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a writer connection.");
        sb.append("\n\nWriter pool:\n");
        this.f3212b.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f3211a.c(sb);
        s8.n.y(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f3214d.compareAndSet(false, true)) {
            this.f3211a.b();
            this.f3212b.b();
        }
    }

    public h(final A1.g gVar, final String fileName, int i9) {
        final int i10 = 1;
        kotlin.jvm.internal.h.e(fileName, "fileName");
        this.f3213c = new ThreadLocal();
        final int i11 = 0;
        this.f3214d = new AtomicBoolean(false);
        int i12 = X7.a.f8474d;
        this.f3215e = Z0.a.A(30, X7.c.SECONDS);
        if (i9 > 0) {
            this.f3211a = new k(i9, new O7.a() { // from class: I0.c
                @Override // O7.a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            P0.a g9 = gVar.g(fileName);
                            s8.n.m(g9, "PRAGMA query_only = 1");
                            return g9;
                        default:
                            return gVar.g(fileName);
                    }
                }
            });
            this.f3212b = new k(1, new O7.a() { // from class: I0.c
                @Override // O7.a
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            P0.a g9 = gVar.g(fileName);
                            s8.n.m(g9, "PRAGMA query_only = 1");
                            return g9;
                        default:
                            return gVar.g(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
