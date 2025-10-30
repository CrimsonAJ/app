package z8;

import java.lang.reflect.InvocationHandler;

/* loaded from: classes.dex */
public final class P implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f25590a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f25591b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f25592c;

    public P(Q q9, Class cls) {
        this.f25592c = q9;
        this.f25591b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r0 = z8.r.b(r9, r1, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r9.f25593a.put(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006c, code lost:
    
        r0 = (z8.r) r0;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) {
        /*
            r6 = this;
            java.lang.Class r0 = r8.getDeclaringClass()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 != r1) goto Ld
            java.lang.Object r7 = r8.invoke(r6, r9)
            return r7
        Ld:
            if (r9 == 0) goto L11
        Lf:
            r3 = r9
            goto L14
        L11:
            java.lang.Object[] r9 = r6.f25590a
            goto Lf
        L14:
            z8.a r9 = z8.J.f25536b
            boolean r0 = r9.f(r8)
            java.lang.Class r1 = r6.f25591b
            if (r0 == 0) goto L23
            java.lang.Object r7 = r9.e(r8, r1, r7, r3)
            return r7
        L23:
            z8.Q r9 = r6.f25592c
        L25:
            java.util.concurrent.ConcurrentHashMap r0 = r9.f25593a
            java.lang.Object r0 = r0.get(r8)
            boolean r2 = r0 instanceof z8.r
            if (r2 == 0) goto L33
            z8.r r0 = (z8.r) r0
        L31:
            r8 = r0
            goto L70
        L33:
            if (r0 != 0) goto L5a
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r9.f25593a     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r0.putIfAbsent(r8, r2)     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L59
            z8.r r0 = z8.r.b(r9, r1, r8)     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.ConcurrentHashMap r9 = r9.f25593a     // Catch: java.lang.Throwable -> L4e
            r9.put(r8, r0)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            goto L31
        L4e:
            r0 = move-exception
            r7 = r0
            goto L5c
        L51:
            r0 = move-exception
            r7 = r0
            java.util.concurrent.ConcurrentHashMap r9 = r9.f25593a     // Catch: java.lang.Throwable -> L4e
            r9.remove(r8)     // Catch: java.lang.Throwable -> L4e
            throw r7     // Catch: java.lang.Throwable -> L4e
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
        L5a:
            r2 = r0
            goto L5e
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r7
        L5e:
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r9.f25593a     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L6c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L25
        L69:
            r0 = move-exception
            r7 = r0
            goto L81
        L6c:
            z8.r r0 = (z8.r) r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L31
        L70:
            z8.y r0 = new z8.y
            i8.i r4 = r8.f25627b
            z8.k r5 = r8.f25628c
            z8.N r1 = r8.f25626a
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r7 = r8.a(r0, r3)
            return r7
        L81:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.P.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
