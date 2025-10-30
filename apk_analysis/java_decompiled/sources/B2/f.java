package B2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import i8.G;

/* loaded from: classes.dex */
public final class f extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public G f621r;

    /* renamed from: s, reason: collision with root package name */
    public G f622s;

    /* renamed from: t, reason: collision with root package name */
    public int f623t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o8.d f624u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f625v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o8.d dVar, g gVar, E7.d dVar2) {
        super(2, dVar2);
        this.f624u = dVar;
        this.f625v = gVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new f(this.f624u, this.f625v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:5:0x005f). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f623t
            o8.d r2 = r9.f624u
            r3 = 1
            B2.g r4 = r9.f625v
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L16
            i8.G r1 = r9.f622s
            i8.G r5 = r9.f621r
            a.AbstractC0485a.A(r10)
            r10 = r5
            goto L5f
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            a.AbstractC0485a.A(r10)
            i8.G r10 = r2.f21756e
            Y2.r r1 = r10.b()
            g6.o r5 = g6.o.f17761a
            java.lang.String r5 = r5.U()
            i8.y r6 = r10.f19005a
            java.lang.String r6 = B2.g.b(r4, r6)
            r1.n(r5, r6)
            i8.G r1 = r1.o()
            i8.L r5 = r2.b(r1)
        L3e:
            int r6 = r4.f627b
            r7 = 5
            if (r6 >= r7) goto L87
            r6 = 408(0x198, float:5.72E-43)
            int r7 = r5.f19032d
            if (r7 != r6) goto L87
            r5.close()
            int r5 = r4.f627b
            long r5 = (long) r5
            r7 = 100
            long r5 = r5 * r7
            r9.f621r = r10
            r9.f622s = r1
            r9.f623t = r3
            java.lang.Object r5 = Y7.B.g(r5, r9)
            if (r5 != r0) goto L5f
            return r0
        L5f:
            int r5 = r4.f627b
            int r5 = r5 + r3
            r4.f627b = r5
            Y2.r r5 = r1.b()
            g6.o r6 = g6.o.f17761a
            java.lang.String r7 = r6.U()
            r5.K(r7)
            java.lang.String r6 = r6.U()
            i8.y r7 = r10.f19005a
            java.lang.String r7 = B2.g.b(r4, r7)
            r5.n(r6, r7)
            i8.G r5 = r5.o()
            i8.L r5 = r2.b(r5)
            goto L3e
        L87:
            r10 = 0
            r4.f627b = r10
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
