package a8;

/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: k, reason: collision with root package name */
    public final EnumC0509a f9234k;

    public p(int i9, EnumC0509a enumC0509a) {
        super(i9);
        this.f9234k = enumC0509a;
        if (enumC0509a != EnumC0509a.f9184a) {
            if (i9 >= 1) {
            } else {
                throw new IllegalArgumentException(A0.a.m("Buffered channel capacity must be at least 1, but ", i9, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.p.a(e.class).c() + " instead").toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            a8.a r1 = a8.EnumC0509a.f9186c
            A7.n r8 = A7.n.f558a
            a8.a r2 = r15.f9234k
            if (r2 != r1) goto L17
            java.lang.Object r1 = super.j(r16)
            boolean r2 = r1 instanceof a8.k
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof a8.j
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            G6.a r6 = a8.g.f9210d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = a8.e.f9201f
            java.lang.Object r1 = r1.get(r15)
            a8.m r1 = (a8.m) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = a8.e.f9197b
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.u(r2, r7)
            int r9 = a8.g.f9208b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f17007c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            a8.m r2 = a8.e.a(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.r()
            a8.j r2 = new a8.j
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = a8.e.c(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = a8.e.f9198c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.r()
            a8.j r2 = new a8.j
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.h()
            java.lang.Throwable r1 = r15.r()
            a8.j r2 = new a8.j
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof Y7.I0
            if (r3 == 0) goto La6
            Y7.I0 r6 = (Y7.I0) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.f17007c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.m(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.p.I(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // a8.e, a8.u
    public final Object f(E7.d dVar, Object obj) {
        if (!(I(obj, true) instanceof j)) {
            return A7.n.f558a;
        }
        throw r();
    }

    @Override // a8.e, a8.u
    public final Object j(Object obj) {
        return I(obj, false);
    }

    @Override // a8.e
    public final boolean w() {
        if (this.f9234k == EnumC0509a.f9185b) {
            return true;
        }
        return false;
    }
}
