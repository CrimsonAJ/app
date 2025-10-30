package I0;

import G0.J;
import G0.K;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class s implements K {

    /* renamed from: a, reason: collision with root package name */
    public final i f3263a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3264b;

    /* renamed from: c, reason: collision with root package name */
    public final B7.i f3265c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3266d;

    public s(i delegate, boolean z9) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f3263a = delegate;
        this.f3264b = z9;
        this.f3265c = new B7.i();
        this.f3266d = new AtomicBoolean(false);
    }

    @Override // G0.K
    public final Object a(O7.p pVar, G7.j jVar) {
        J j = J.f2672b;
        if (!this.f3266d.get()) {
            a aVar = (a) jVar.getContext().get(a.f3187b);
            if (aVar != null && aVar.f3188a == this) {
                return f(j, pVar, jVar);
            }
            s8.n.y(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        s8.n.y(21, "Connection is recycled");
        throw null;
    }

    @Override // G0.K
    public final Object b(G7.j jVar) {
        if (!this.f3266d.get()) {
            a aVar = (a) jVar.getContext().get(a.f3187b);
            if (aVar != null && aVar.f3188a == this) {
                return Boolean.valueOf(!this.f3265c.isEmpty());
            }
            s8.n.y(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        s8.n.y(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // G0.InterfaceC0154u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, O7.l r8, G7.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof I0.r
            if (r0 == 0) goto L13
            r0 = r9
            I0.r r0 = (I0.r) r0
            int r1 = r0.f3262x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3262x = r1
            goto L18
        L13:
            I0.r r0 = new I0.r
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f3260v
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f3262x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            I0.i r7 = r0.f3259u
            O7.l r8 = r0.f3258t
            O7.l r8 = (O7.l) r8
            java.lang.String r1 = r0.f3257s
            I0.s r0 = r0.f3256r
            a.AbstractC0485a.A(r9)
            r9 = r7
            r7 = r1
            goto L74
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            a.AbstractC0485a.A(r9)
            java.util.concurrent.atomic.AtomicBoolean r9 = r6.f3266d
            boolean r9 = r9.get()
            r2 = 21
            if (r9 != 0) goto L9c
            E7.i r9 = r0.getContext()
            F5.e r5 = I0.a.f3187b
            E7.g r9 = r9.get(r5)
            I0.a r9 = (I0.a) r9
            if (r9 == 0) goto L96
            I0.s r9 = r9.f3188a
            if (r9 != r6) goto L96
            r0.f3256r = r6
            r0.f3257s = r7
            r9 = r8
            O7.l r9 = (O7.l) r9
            r0.f3258t = r9
            I0.i r9 = r6.f3263a
            r0.f3259u = r9
            r0.f3262x = r4
            g8.a r2 = r9.f3217b
            java.lang.Object r0 = r2.d(r0)
            if (r0 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            I0.l r1 = new I0.l     // Catch: java.lang.Throwable -> L91
            I0.i r2 = r0.f3263a     // Catch: java.lang.Throwable -> L91
            P0.c r7 = r2.d0(r7)     // Catch: java.lang.Throwable -> L91
            r1.<init>(r0, r7)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r7 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.AbstractC1002u1.k(r1, r3)     // Catch: java.lang.Throwable -> L91
            r9.a(r3)
            return r7
        L8a:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L8c
        L8c:
            r8 = move-exception
            com.google.android.gms.internal.measurement.AbstractC1002u1.k(r1, r7)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r7 = move-exception
            r9.a(r3)
            throw r7
        L96:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            s8.n.y(r2, r7)
            throw r3
        L9c:
            java.lang.String r7 = "Connection is recycled"
            s8.n.y(r2, r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.s.c(java.lang.String, O7.l, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:15:0x005d, B:20:0x0068, B:21:0x0096, B:25:0x0070, B:26:0x0075, B:27:0x0076, B:28:0x007c, B:29:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:15:0x005d, B:20:0x0068, B:21:0x0096, B:25:0x0070, B:26:0x0075, B:27:0x0076, B:28:0x007c, B:29:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(G0.J r8, G7.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r9 instanceof I0.o
            if (r1 == 0) goto L15
            r1 = r9
            I0.o r1 = (I0.o) r1
            int r2 = r1.f3243w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f3243w = r2
            goto L1a
        L15:
            I0.o r1 = new I0.o
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.f3241u
            F7.a r2 = F7.a.f2587a
            int r3 = r1.f3243w
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 != r4) goto L31
            I0.i r8 = r1.f3240t
            G0.J r2 = r1.f3239s
            I0.s r1 = r1.f3238r
            a.AbstractC0485a.A(r9)
            r9 = r8
            r8 = r2
            goto L50
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            a.AbstractC0485a.A(r9)
            r1.f3238r = r7
            r1.f3239s = r8
            I0.i r9 = r7.f3263a
            r1.f3240t = r9
            r1.f3243w = r4
            g8.a r3 = r9.f3217b
            java.lang.Object r1 = r3.d(r1)
            if (r1 != r2) goto L4f
            return r2
        L4f:
            r1 = r7
        L50:
            r2 = 0
            B7.i r3 = r1.f3265c     // Catch: java.lang.Throwable -> L6e
            int r5 = r3.f1131c     // Catch: java.lang.Throwable -> L6e
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6e
            I0.i r1 = r1.f3263a
            if (r6 == 0) goto L82
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L7c
            if (r8 == r4) goto L76
            r0 = 2
            if (r8 != r0) goto L70
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            s8.n.m(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L6e:
            r8 = move-exception
            goto La4
        L70:
            A7.b r8 = new A7.b     // Catch: java.lang.Throwable -> L6e
            r8.<init>()     // Catch: java.lang.Throwable -> L6e
            throw r8     // Catch: java.lang.Throwable -> L6e
        L76:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            s8.n.m(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L7c:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            s8.n.m(r1, r8)     // Catch: java.lang.Throwable -> L6e
            goto L96
        L82:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            r8.append(r5)     // Catch: java.lang.Throwable -> L6e
            r0 = 39
            r8.append(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6e
            s8.n.m(r1, r8)     // Catch: java.lang.Throwable -> L6e
        L96:
            I0.n r8 = new I0.n     // Catch: java.lang.Throwable -> L6e
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            r3.addLast(r8)     // Catch: java.lang.Throwable -> L6e
            A7.n r8 = A7.n.f558a     // Catch: java.lang.Throwable -> L6e
            r9.a(r2)
            return r8
        La4:
            r9.a(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.s.d(G0.J, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:12:0x0052, B:14:0x005a, B:17:0x0066, B:19:0x006f, B:20:0x00ac, B:24:0x0077, B:25:0x008c, B:27:0x0092, B:28:0x0098, B:29:0x00b2, B:30:0x00b9), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #0 {all -> 0x0075, blocks: (B:12:0x0052, B:14:0x005a, B:17:0x0066, B:19:0x006f, B:20:0x00ac, B:24:0x0077, B:25:0x008c, B:27:0x0092, B:28:0x0098, B:29:0x00b2, B:30:0x00b9), top: B:11:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r8, G7.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r9 instanceof I0.p
            if (r2 == 0) goto L17
            r2 = r9
            I0.p r2 = (I0.p) r2
            int r3 = r2.f3249w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f3249w = r3
            goto L1c
        L17:
            I0.p r2 = new I0.p
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f3247u
            F7.a r3 = F7.a.f2587a
            int r4 = r2.f3249w
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            boolean r8 = r2.f3246t
            I0.i r3 = r2.f3245s
            I0.s r2 = r2.f3244r
            a.AbstractC0485a.A(r9)
            goto L51
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            a.AbstractC0485a.A(r9)
            r2.f3244r = r7
            I0.i r9 = r7.f3263a
            r2.f3245s = r9
            r2.f3246t = r8
            r2.f3249w = r5
            g8.a r4 = r9.f3217b
            java.lang.Object r2 = r4.d(r2)
            if (r2 != r3) goto L4f
            return r3
        L4f:
            r2 = r7
            r3 = r9
        L51:
            r9 = 0
            B7.i r4 = r2.f3265c     // Catch: java.lang.Throwable -> L75
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r5 != 0) goto Lb2
            java.lang.Object r5 = B7.q.k0(r4)     // Catch: java.lang.Throwable -> L75
            I0.n r5 = (I0.n) r5     // Catch: java.lang.Throwable -> L75
            r6 = 39
            I0.i r2 = r2.f3263a
            if (r8 == 0) goto L8c
            r5.getClass()     // Catch: java.lang.Throwable -> L75
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L77
            java.lang.String r8 = "END TRANSACTION"
            s8.n.m(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L75:
            r8 = move-exception
            goto Lba
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f3237a     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            s8.n.m(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L8c:
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r8 == 0) goto L98
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            s8.n.m(r2, r8)     // Catch: java.lang.Throwable -> L75
            goto Lac
        L98:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            int r0 = r5.f3237a     // Catch: java.lang.Throwable -> L75
            r8.append(r0)     // Catch: java.lang.Throwable -> L75
            r8.append(r6)     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            s8.n.m(r2, r8)     // Catch: java.lang.Throwable -> L75
        Lac:
            A7.n r8 = A7.n.f558a     // Catch: java.lang.Throwable -> L75
            r3.a(r9)
            return r8
        Lb2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r0 = "Not in a transaction"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L75
            throw r8     // Catch: java.lang.Throwable -> L75
        Lba:
            r3.a(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.s.e(boolean, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(G0.J r10, O7.p r11, G7.c r12) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.s.f(G0.J, O7.p, G7.c):java.lang.Object");
    }
}
