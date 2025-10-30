package g8;

import Y7.B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends i implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17786h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z9) {
        super(1, z9 ? 1 : 0);
        G6.a aVar;
        if (z9) {
            aVar = null;
        } else {
            aVar = e.f17787a;
        }
        this.owner$volatile = aVar;
    }

    @Override // g8.a
    public final void a(Object obj) {
        while (f()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17786h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            G6.a aVar = e.f17787a;
            if (obj2 != aVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                e();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r2 = g8.d.f17786h;
        r3 = r0.f17785b;
        r2.set(r3, null);
        r0.f17784a.b(r1, new g8.b(r3, r0, 0));
     */
    @Override // g8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(G7.c r6) {
        /*
            r5 = this;
            boolean r0 = r5.g()
            A7.n r1 = A7.n.f558a
            if (r0 == 0) goto L9
            goto L49
        L9:
            E7.d r6 = com.google.android.gms.internal.measurement.D1.A(r6)
            Y7.h r6 = Y7.B.n(r6)
            g8.c r0 = new g8.c     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = g8.i.f17794g     // Catch: java.lang.Throwable -> L4a
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L4a
            int r3 = r5.f17795a     // Catch: java.lang.Throwable -> L4a
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L36
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = g8.d.f17786h     // Catch: java.lang.Throwable -> L4a
            g8.d r3 = r0.f17785b     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            r2.set(r3, r4)     // Catch: java.lang.Throwable -> L4a
            g8.b r2 = new g8.b     // Catch: java.lang.Throwable -> L4a
            r4 = 0
            r2.<init>(r3, r0, r4)     // Catch: java.lang.Throwable -> L4a
            Y7.h r0 = r0.f17784a     // Catch: java.lang.Throwable -> L4a
            r0.b(r1, r2)     // Catch: java.lang.Throwable -> L4a
            goto L3c
        L36:
            boolean r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L16
        L3c:
            java.lang.Object r6 = r6.r()
            F7.a r0 = F7.a.f2587a
            if (r6 != r0) goto L45
            goto L46
        L45:
            r6 = r1
        L46:
            if (r6 != r0) goto L49
            return r6
        L49:
            return r1
        L4a:
            r0 = move-exception
            r6.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.d.d(G7.c):java.lang.Object");
    }

    public final boolean f() {
        if (Math.max(i.f17794g.get(this), 0) != 0) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        int i9;
        char c3;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f17794g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f17795a;
            if (i10 > i11) {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, i11));
            } else {
                if (i10 <= 0) {
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f17786h.set(this, null);
                    c3 = 0;
                    break;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final String toString() {
        return "Mutex@" + B.l(this) + "[isLocked=" + f() + ",owner=" + f17786h.get(this) + ']';
    }
}
