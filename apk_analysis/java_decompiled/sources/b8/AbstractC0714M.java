package b8;

import a8.EnumC0509a;
import c8.AbstractC0793c;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: b8.M */
/* loaded from: classes.dex */
public abstract class AbstractC0714M {

    /* renamed from: a */
    public static final G6.a f11441a = new G6.a("NO_VALUE", 3);

    /* renamed from: b */
    public static final G6.a f11442b = new G6.a("NONE", 3);

    /* renamed from: c */
    public static final G6.a f11443c = new G6.a("PENDING", 3);

    public static final C0713L a(int i9, EnumC0509a enumC0509a) {
        int i10;
        if (i9 >= 0) {
            if (i9 <= 0 && enumC0509a != EnumC0509a.f9184a) {
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC0509a).toString());
            }
            if (i9 < 0) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = i9;
            }
            return new C0713L(i9, i10, enumC0509a);
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "replay cannot be negative, but was ").toString());
    }

    public static /* synthetic */ C0713L b(int i9) {
        int i10;
        EnumC0509a enumC0509a = EnumC0509a.f9185b;
        if ((i9 & 1) != 0) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if ((i9 & 4) != 0) {
            enumC0509a = EnumC0509a.f9184a;
        }
        return a(i10, enumC0509a);
    }

    public static final C0718Q c(Object obj) {
        if (obj == null) {
            obj = AbstractC0793c.f11752b;
        }
        return new C0718Q(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(b8.C0720T r4, X.C0417q r5, java.lang.Throwable r6, G7.c r7) {
        /*
            boolean r0 = r7 instanceof b8.C0729i
            if (r0 == 0) goto L13
            r0 = r7
            b8.i r0 = (b8.C0729i) r0
            int r1 = r0.f11480t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11480t = r1
            goto L18
        L13:
            b8.i r0 = new b8.i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11479s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11480t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f11478r
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            a.AbstractC0485a.A(r7)
            r0.f11478r = r6     // Catch: java.lang.Throwable -> L29
            r0.f11480t = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            return r1
        L41:
            A7.n r4 = A7.n.f558a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            O4.h.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.AbstractC0714M.d(b8.T, X.q, java.lang.Throwable, G7.c):java.lang.Object");
    }

    public static final void e(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC0725e f(InterfaceC0725e interfaceC0725e, int i9) {
        EnumC0509a enumC0509a = EnumC0509a.f9184a;
        if (i9 < 0 && i9 != -2 && i9 != -1) {
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i9 == -1) {
            enumC0509a = EnumC0509a.f9185b;
            i9 = 0;
        }
        boolean z9 = interfaceC0725e instanceof c8.v;
        E7.j jVar = E7.j.f1978a;
        if (z9) {
            return ((c8.v) interfaceC0725e).a(jVar, i9, enumC0509a);
        }
        return new c8.h(interfaceC0725e, jVar, i9, enumC0509a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable g(b8.InterfaceC0725e r5, b8.InterfaceC0726f r6, G7.c r7) {
        /*
            boolean r0 = r7 instanceof b8.C0735o
            if (r0 == 0) goto L13
            r0 = r7
            b8.o r0 = (b8.C0735o) r0
            int r1 = r0.f11504t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11504t = r1
            goto L18
        L13:
            b8.o r0 = new b8.o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11503s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11504t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.o r5 = r0.f11502r
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            a.AbstractC0485a.A(r7)
            kotlin.jvm.internal.o r7 = new kotlin.jvm.internal.o
            r7.<init>()
            b8.q r2 = new b8.q     // Catch: java.lang.Throwable -> L4e
            r4 = 0
            r2.<init>(r6, r4, r7)     // Catch: java.lang.Throwable -> L4e
            r0.f11502r = r7     // Catch: java.lang.Throwable -> L4e
            r0.f11504t = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.collect(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            return r5
        L4e:
            r6 = move-exception
            r5 = r7
        L50:
            java.lang.Object r5 = r5.f20159a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            if (r5 == 0) goto L5c
            boolean r7 = r5.equals(r6)
            if (r7 != 0) goto L7e
        L5c:
            E7.i r7 = r0.getContext()
            Y7.g0 r0 = Y7.C0463g0.f8811a
            E7.g r7 = r7.get(r0)
            Y7.h0 r7 = (Y7.InterfaceC0465h0) r7
            if (r7 == 0) goto L7f
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L71
            goto L7f
        L71:
            java.util.concurrent.CancellationException r7 = r7.I()
            if (r7 == 0) goto L7f
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L7e
            goto L7f
        L7e:
            throw r6
        L7f:
            if (r5 != 0) goto L82
            return r6
        L82:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L8a
            O4.h.a(r5, r6)
            throw r5
        L8a:
            O4.h.a(r6, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.AbstractC0714M.g(b8.e, b8.f, G7.c):java.io.Serializable");
    }

    public static final Object h(InterfaceC0725e interfaceC0725e, E7.d dVar) {
        Object collect = interfaceC0725e.collect(c8.x.f11808a, dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }

    public static final Object i(InterfaceC0725e interfaceC0725e, O7.p pVar, E7.d dVar) {
        int i9 = AbstractC0743w.f11532a;
        Object h7 = h(f(new c8.n(new C0704C(pVar, (E7.d) null), interfaceC0725e, E7.j.f1978a, -2, EnumC0509a.f9184a), 0), dVar);
        if (h7 == F7.a.f2587a) {
            return h7;
        }
        return A7.n.f558a;
    }

    public static final InterfaceC0725e j(InterfaceC0725e interfaceC0725e) {
        if (interfaceC0725e instanceof InterfaceC0716O) {
            return interfaceC0725e;
        }
        if (interfaceC0725e instanceof C0724d) {
            return interfaceC0725e;
        }
        return new C0724d(interfaceC0725e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r11 == r1) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v2, types: [b8.g, E7.d] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [b8.f] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a8.b] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v4, types: [a8.t] */
    /* JADX WARN: Type inference failed for: r9v6, types: [a8.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(b8.InterfaceC0726f r8, a8.q r9, boolean r10, G7.c r11) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.AbstractC0714M.k(b8.f, a8.q, boolean, G7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(X.C0419t r6, co.notix.lc r7, G7.c r8) {
        /*
            boolean r0 = r8 instanceof b8.z
            if (r0 == 0) goto L13
            r0 = r8
            b8.z r0 = (b8.z) r0
            int r1 = r0.f11546v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11546v = r1
            goto L18
        L13:
            b8.z r0 = new b8.z
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f11545u
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11546v
            G6.a r3 = c8.AbstractC0793c.f11752b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            b8.q r6 = r0.f11544t
            kotlin.jvm.internal.o r7 = r0.f11543s
            O7.p r0 = r0.f11542r
            a.AbstractC0485a.A(r8)     // Catch: c8.C0791a -> L2f
            goto L64
        L2f:
            r8 = move-exception
            goto L60
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            a.AbstractC0485a.A(r8)
            kotlin.jvm.internal.o r8 = new kotlin.jvm.internal.o
            r8.<init>()
            r8.f20159a = r3
            b8.q r2 = new b8.q
            r5 = 3
            r2.<init>(r7, r5, r8)
            r0.f11542r = r7     // Catch: c8.C0791a -> L5b
            r0.f11543s = r8     // Catch: c8.C0791a -> L5b
            r0.f11544t = r2     // Catch: c8.C0791a -> L5b
            r0.f11546v = r4     // Catch: c8.C0791a -> L5b
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: c8.C0791a -> L5b
            if (r6 != r1) goto L58
            return r1
        L58:
            r0 = r7
            r7 = r8
            goto L64
        L5b:
            r6 = move-exception
            r0 = r7
            r7 = r8
            r8 = r6
            r6 = r2
        L60:
            b8.f r1 = r8.f11746a
            if (r1 != r6) goto L7d
        L64:
            java.lang.Object r6 = r7.f20159a
            if (r6 == r3) goto L69
            return r6
        L69:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Expected at least one element matching the predicate "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L7d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.AbstractC0714M.l(X.t, co.notix.lc, G7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(b8.InterfaceC0725e r6, G7.c r7) {
        /*
            boolean r0 = r7 instanceof b8.C0745y
            if (r0 == 0) goto L13
            r0 = r7
            b8.y r0 = (b8.C0745y) r0
            int r1 = r0.f11541u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11541u = r1
            goto L18
        L13:
            b8.y r0 = new b8.y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11540t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11541u
            G6.a r3 = c8.AbstractC0793c.f11752b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            N1.k r6 = r0.f11539s
            kotlin.jvm.internal.o r0 = r0.f11538r
            a.AbstractC0485a.A(r7)     // Catch: c8.C0791a -> L2d
            goto L5e
        L2d:
            r7 = move-exception
            goto L5a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            a.AbstractC0485a.A(r7)
            kotlin.jvm.internal.o r7 = new kotlin.jvm.internal.o
            r7.<init>()
            r7.f20159a = r3
            N1.k r2 = new N1.k
            r5 = 5
            r2.<init>(r5, r7)
            r0.f11538r = r7     // Catch: c8.C0791a -> L56
            r0.f11539s = r2     // Catch: c8.C0791a -> L56
            r0.f11541u = r4     // Catch: c8.C0791a -> L56
            java.lang.Object r6 = r6.collect(r2, r0)     // Catch: c8.C0791a -> L56
            if (r6 != r1) goto L54
            return r1
        L54:
            r0 = r7
            goto L5e
        L56:
            r6 = move-exception
            r0 = r7
            r7 = r6
            r6 = r2
        L5a:
            b8.f r1 = r7.f11746a
            if (r1 != r6) goto L6b
        L5e:
            java.lang.Object r6 = r0.f20159a
            if (r6 == r3) goto L63
            return r6
        L63:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            java.lang.String r7 = "Expected at least one element"
            r6.<init>(r7)
            throw r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.AbstractC0714M.m(b8.e, G7.c):java.lang.Object");
    }

    public static final InterfaceC0725e n(InterfaceC0710I interfaceC0710I, E7.i iVar, int i9, EnumC0509a enumC0509a) {
        if ((i9 == 0 || i9 == -3) && enumC0509a == EnumC0509a.f9184a) {
            return interfaceC0710I;
        }
        return new c8.h(interfaceC0710I, iVar, i9, enumC0509a);
    }
}
