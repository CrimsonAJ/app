package Y7;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class I extends f8.i {

    /* renamed from: c, reason: collision with root package name */
    public int f8769c;

    public I(int i9) {
        super(0L, f8.k.f17480g);
        this.f8769c = i9;
    }

    public abstract void d(Object obj, CancellationException cancellationException);

    public abstract E7.d f();

    public Throwable g(Object obj) {
        C0476q c0476q;
        if (obj instanceof C0476q) {
            c0476q = (C0476q) obj;
        } else {
            c0476q = null;
        }
        if (c0476q == null) {
            return null;
        }
        return c0476q.f8842a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            O4.h.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.h.b(th);
        B.o(f().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (Y7.InterfaceC0465h0) r7.get(Y7.C0463g0.f8811a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            A7.n r0 = A7.n.f558a
            e1.q r1 = r13.f17472b
            E7.d r2 = r13.f()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.h.c(r2, r3)     // Catch: java.lang.Throwable -> L25
            d8.h r2 = (d8.h) r2     // Catch: java.lang.Throwable -> L25
            G7.c r3 = r2.f16981e     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.f16983g     // Catch: java.lang.Throwable -> L25
            E7.i r4 = r3.getContext()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = d8.AbstractC1130a.m(r4, r2)     // Catch: java.lang.Throwable -> L25
            G6.a r5 = d8.AbstractC1130a.f16971f     // Catch: java.lang.Throwable -> L25
            r6 = 0
            if (r2 == r5) goto L28
            Y7.G0 r5 = Y7.B.B(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            goto L9f
        L28:
            r5 = r6
        L29:
            E7.i r7 = r3.getContext()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.j()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.g(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.f8769c     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            Y7.g0 r10 = Y7.C0463g0.f8811a     // Catch: java.lang.Throwable -> L4c
            E7.g r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L4c
            Y7.h0 r7 = (Y7.InterfaceC0465h0) r7     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L93
        L4e:
            r7 = r6
        L4f:
            if (r7 == 0) goto L66
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L4c
            if (r10 != 0) goto L66
            java.util.concurrent.CancellationException r7 = r7.I()     // Catch: java.lang.Throwable -> L4c
            r13.d(r8, r7)     // Catch: java.lang.Throwable -> L4c
            A7.i r7 = a.AbstractC0485a.h(r7)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L66:
            if (r9 == 0) goto L70
            A7.i r7 = a.AbstractC0485a.h(r9)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
            goto L77
        L70:
            java.lang.Object r7 = r13.h(r8)     // Catch: java.lang.Throwable -> L4c
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L4c
        L77:
            if (r5 == 0) goto L7f
            boolean r3 = r5.d0()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L82
        L7f:
            d8.AbstractC1130a.g(r4, r2)     // Catch: java.lang.Throwable -> L25
        L82:
            r1.getClass()     // Catch: java.lang.Throwable -> L86
            goto L8b
        L86:
            r0 = move-exception
            A7.i r0 = a.AbstractC0485a.h(r0)
        L8b:
            java.lang.Throwable r0 = A7.j.a(r0)
            r13.i(r6, r0)
            goto Laf
        L93:
            if (r5 == 0) goto L9b
            boolean r5 = r5.d0()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L9e
        L9b:
            d8.AbstractC1130a.g(r4, r2)     // Catch: java.lang.Throwable -> L25
        L9e:
            throw r3     // Catch: java.lang.Throwable -> L25
        L9f:
            r1.getClass()     // Catch: java.lang.Throwable -> La3
            goto La8
        La3:
            r0 = move-exception
            A7.i r0 = a.AbstractC0485a.h(r0)
        La8:
            java.lang.Throwable r0 = A7.j.a(r0)
            r13.i(r2, r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.I.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
