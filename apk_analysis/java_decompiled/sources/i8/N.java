package i8;

import java.io.Closeable;
import x8.InterfaceC2189i;

/* loaded from: classes.dex */
public abstract class N implements Closeable, AutoCloseable {
    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k8.c.d(g());
    }

    public abstract A d();

    public abstract InterfaceC2189i g();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String s() {
        /*
            r8 = this;
            x8.i r0 = r8.g()
            i8.A r1 = r8.d()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L37
            java.nio.charset.Charset r2 = W7.a.f7934a     // Catch: java.lang.Throwable -> L45
            java.lang.String[] r1 = r1.f18929c     // Catch: java.lang.Throwable -> L45
            int r3 = r1.length     // Catch: java.lang.Throwable -> L45
            int r3 = r3 + (-1)
            r4 = 0
            r5 = 2
            int r3 = v4.e.z(r4, r3, r5)     // Catch: java.lang.Throwable -> L45
            if (r3 < 0) goto L2d
        L19:
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L45
            java.lang.String r6 = "charset"
            r7 = 1
            boolean r5 = W7.l.H(r5, r6, r7)     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L28
            int r4 = r4 + r7
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L45
            goto L2e
        L28:
            if (r4 == r3) goto L2d
            int r4 = r4 + 2
            goto L19
        L2d:
            r1 = 0
        L2e:
            if (r1 != 0) goto L31
            goto L35
        L31:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L45
        L35:
            if (r2 != 0) goto L39
        L37:
            java.nio.charset.Charset r2 = W7.a.f7934a     // Catch: java.lang.Throwable -> L45
        L39:
            java.nio.charset.Charset r1 = k8.c.s(r0, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r0.c0(r1)     // Catch: java.lang.Throwable -> L45
            r0.close()
            return r1
        L45:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L47
        L47:
            r2 = move-exception
            com.google.android.gms.internal.measurement.D1.h(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.N.s():java.lang.String");
    }
}
