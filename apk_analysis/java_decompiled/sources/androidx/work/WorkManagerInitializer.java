package androidx.work;

import T0.b;
import e1.q;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10411a = q.j("WrkMgrInitializer");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r2 = r7.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (f1.k.f17297r != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        f1.k.f17297r = new f1.k(r2, r1, new b5.G1(r1.f17023b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        f1.k.f17296q = f1.k.f17297r;
     */
    @Override // T0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object create(android.content.Context r7) {
        /*
            r6 = this;
            e1.q r0 = e1.q.d()
            r1 = 0
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            java.lang.String r2 = androidx.work.WorkManagerInitializer.f10411a
            java.lang.String r3 = "Initializing WorkManager with default configuration."
            r0.a(r2, r3, r1)
            d0.o r0 = new d0.o
            r1 = 1
            r0.<init>(r1)
            e1.b r1 = new e1.b
            r1.<init>(r0)
            java.lang.Object r0 = f1.k.f17298s
            monitor-enter(r0)
            f1.k r2 = f1.k.f17296q     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            f1.k r3 = f1.k.f17297r     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L25
            goto L2f
        L25:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L2d
            throw r7     // Catch: java.lang.Throwable -> L2d
        L2d:
            r7 = move-exception
            goto L51
        L2f:
            if (r2 != 0) goto L4b
            android.content.Context r2 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> L2d
            f1.k r3 = f1.k.f17297r     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L47
            f1.k r3 = new f1.k     // Catch: java.lang.Throwable -> L2d
            b5.G1 r4 = new b5.G1     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.ExecutorService r5 = r1.f17023b     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L2d
            f1.k.f17297r = r3     // Catch: java.lang.Throwable -> L2d
        L47:
            f1.k r1 = f1.k.f17297r     // Catch: java.lang.Throwable -> L2d
            f1.k.f17296q = r1     // Catch: java.lang.Throwable -> L2d
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            f1.k r7 = f1.k.b0(r7)
            return r7
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkManagerInitializer.create(android.content.Context):java.lang.Object");
    }

    @Override // T0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
