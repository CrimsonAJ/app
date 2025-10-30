package X;

import b7.C0701c;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final g8.d f8046a = g8.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final C0701c f8047b = new C0701c(20);

    /* renamed from: c, reason: collision with root package name */
    public final C0419t f8048c = new C0419t(new G7.j(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [G7.j, O7.p] */
    public Y(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f8047b.f11404b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.d(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(O7.l r8, G7.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.V
            if (r0 == 0) goto L13
            r0 = r9
            X.V r0 = (X.V) r0
            int r1 = r0.f8040v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8040v = r1
            goto L18
        L13:
            X.V r0 = new X.V
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f8038t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8040v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f8036r
            g8.a r8 = (g8.a) r8
            a.AbstractC0485a.A(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            g8.d r8 = r0.f8037s
            java.lang.Object r2 = r0.f8036r
            O7.l r2 = (O7.l) r2
            a.AbstractC0485a.A(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            a.AbstractC0485a.A(r9)
            r0.f8036r = r8
            g8.d r9 = r7.f8046a
            r0.f8037s = r9
            r0.f8040v = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.f8036r = r9     // Catch: java.lang.Throwable -> L6b
            r0.f8037s = r5     // Catch: java.lang.Throwable -> L6b
            r0.f8040v = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            r8.a(r5)
            return r9
        L6b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            r8.a(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y.b(O7.l, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(O7.p r7, G7.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.W
            if (r0 == 0) goto L13
            r0 = r8
            X.W r0 = (X.W) r0
            int r1 = r0.f8045v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8045v = r1
            goto L18
        L13:
            X.W r0 = new X.W
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f8043t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8045v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f8042s
            g8.d r0 = r0.f8041r
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            a.AbstractC0485a.A(r8)
            g8.d r8 = r6.f8046a
            boolean r2 = r8.g()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f8041r = r8     // Catch: java.lang.Throwable -> L59
            r0.f8042s = r2     // Catch: java.lang.Throwable -> L59
            r0.f8045v = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.a(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.a(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Y.c(O7.p, G7.c):java.lang.Object");
    }
}
