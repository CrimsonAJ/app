package b8;

import X.C0417q;
import X.C0419t;

/* renamed from: b8.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731k implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0419t f11486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0417q f11487b;

    public C0731k(C0419t c0419t, C0417q c0417q) {
        this.f11486a = c0419t;
        this.f11487b = c0417q;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // b8.InterfaceC0725e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(b8.InterfaceC0726f r9, E7.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b8.C0730j
            if (r0 == 0) goto L13
            r0 = r10
            b8.j r0 = (b8.C0730j) r0
            int r1 = r0.f11482s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11482s = r1
            goto L18
        L13:
            b8.j r0 = new b8.j
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11481r
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11482s
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f11484u
            c8.z r9 = (c8.z) r9
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f11484u
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            a.AbstractC0485a.A(r10)
            goto La0
        L44:
            b8.f r9 = r0.f11485v
            java.lang.Object r2 = r0.f11484u
            b8.k r2 = (b8.C0731k) r2
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            a.AbstractC0485a.A(r10)
            X.t r10 = r8.f11486a     // Catch: java.lang.Throwable -> L8a
            r0.f11484u = r8     // Catch: java.lang.Throwable -> L8a
            r0.f11485v = r9     // Catch: java.lang.Throwable -> L8a
            r0.f11482s = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            c8.z r10 = new c8.z
            E7.i r4 = r0.getContext()
            r10.<init>(r9, r4)
            X.q r9 = r2.f11487b     // Catch: java.lang.Throwable -> L82
            r0.f11484u = r10     // Catch: java.lang.Throwable -> L82
            r0.f11485v = r6     // Catch: java.lang.Throwable -> L82
            r0.f11482s = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            A7.n r9 = A7.n.f558a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            b8.T r10 = new b8.T
            r10.<init>(r9)
            X.q r2 = r2.f11487b
            r0.f11484u = r9
            r0.f11485v = r6
            r0.f11482s = r4
            java.lang.Object r10 = b8.AbstractC0714M.d(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0731k.collect(b8.f, E7.d):java.lang.Object");
    }
}
