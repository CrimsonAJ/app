package J0;

import G0.J;
import G0.K;
import G7.j;
import O7.l;
import O7.p;
import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* loaded from: classes.dex */
public final class d implements K {

    /* renamed from: a, reason: collision with root package name */
    public final a f3590a;

    public d(a aVar) {
        this.f3590a = aVar;
    }

    @Override // G0.K
    public final Object a(p pVar, j jVar) {
        return d(J.f2672b, pVar, jVar);
    }

    @Override // G0.K
    public final Object b(j jVar) {
        return Boolean.valueOf(this.f3590a.f3583a.B());
    }

    @Override // G0.InterfaceC0154u
    public final Object c(String str, l lVar, G7.c cVar) {
        g d02 = this.f3590a.d0(str);
        try {
            Object invoke = lVar.invoke(d02);
            AbstractC1002u1.k(d02, null);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(G0.J r5, O7.p r6, G7.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof J0.c
            if (r0 == 0) goto L13
            r0 = r7
            J0.c r0 = (J0.c) r0
            int r1 = r0.f3589v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3589v = r1
            goto L18
        L13:
            J0.c r0 = new J0.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f3587t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f3589v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Q0.a r5 = r0.f3586s
            J0.d r6 = r0.f3585r
            a.AbstractC0485a.A(r7)     // Catch: java.lang.Throwable -> L2b
            goto L72
        L2b:
            r7 = move-exception
            goto L87
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0485a.A(r7)
            J0.a r7 = r4.f3590a
            Q0.a r7 = r7.f3583a
            r7.B()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L58
            if (r5 == r3) goto L54
            r2 = 2
            if (r5 != r2) goto L4e
            r7.f()
            goto L5b
        L4e:
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        L54:
            r7.P()
            goto L5b
        L58:
            r7.w()
        L5b:
            I0.m r5 = new I0.m     // Catch: java.lang.Throwable -> L82
            r2 = 1
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L82
            r0.f3585r = r4     // Catch: java.lang.Throwable -> L82
            r0.f3586s = r7     // Catch: java.lang.Throwable -> L82
            r0.f3589v = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r5 != r1) goto L6e
            return r1
        L6e:
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L72:
            r5.M()     // Catch: java.lang.Throwable -> L2b
            r5.e()
            boolean r5 = r5.B()
            if (r5 != 0) goto L81
            r6.getClass()
        L81:
            return r7
        L82:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r6
            r6 = r4
        L87:
            r5.e()
            boolean r5 = r5.B()
            if (r5 != 0) goto L93
            r6.getClass()
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.d.d(G0.J, O7.p, G7.c):java.lang.Object");
    }
}
