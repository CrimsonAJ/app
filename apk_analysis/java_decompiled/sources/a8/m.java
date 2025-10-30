package a8;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class m extends d8.u {

    /* renamed from: e, reason: collision with root package name */
    public final e f9231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f9232f;

    public m(long j, m mVar, e eVar, int i9) {
        super(j, mVar, i9);
        this.f9231e = eVar;
        this.f9232f = new AtomicReferenceArray(g.f9208b * 2);
    }

    @Override // d8.u
    public final int f() {
        return g.f9208b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        m(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.h.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // d8.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r5, E7.i r6) {
        /*
            r4 = this;
            int r6 = a8.g.f9208b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r4.f9232f
            int r1 = r5 * 2
            r6.get(r1)
        L11:
            java.lang.Object r6 = r4.k(r5)
            boolean r1 = r6 instanceof Y7.I0
            a8.e r2 = r4.f9231e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof a8.v
            if (r1 == 0) goto L21
            goto L62
        L21:
            G6.a r1 = a8.g.j
            if (r6 == r1) goto L59
            G6.a r1 = a8.g.f9216k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            G6.a r1 = a8.g.f9213g
            if (r6 == r1) goto L11
            G6.a r1 = a8.g.f9212f
            if (r6 != r1) goto L33
            goto L11
        L33:
            G6.a r5 = a8.g.f9215i
            if (r6 == r5) goto L7c
            G6.a r5 = a8.g.f9210d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            G6.a r5 = a8.g.f9217l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.m(r5, r3)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.h.b(r2)
            return
        L62:
            if (r0 == 0) goto L67
            G6.a r1 = a8.g.j
            goto L69
        L67:
            G6.a r1 = a8.g.f9216k
        L69:
            boolean r6 = r4.j(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m(r5, r3)
            r6 = r0 ^ 1
            r4.l(r5, r6)
            if (r0 == 0) goto L7c
            kotlin.jvm.internal.h.b(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.m.g(int, E7.i):void");
    }

    public final boolean j(Object obj, int i9, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f9232f;
        int i10 = (i9 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i9) {
        return this.f9232f.get((i9 * 2) + 1);
    }

    public final void l(int i9, boolean z9) {
        if (z9) {
            e eVar = this.f9231e;
            kotlin.jvm.internal.h.b(eVar);
            eVar.H((this.f17007c * g.f9208b) + i9);
        }
        h();
    }

    public final void m(int i9, Object obj) {
        this.f9232f.set(i9 * 2, obj);
    }

    public final void n(int i9, G6.a aVar) {
        this.f9232f.set((i9 * 2) + 1, aVar);
    }
}
