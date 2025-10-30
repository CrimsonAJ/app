package I0;

import Y7.C0473n;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class t extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f3267r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f3268s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0473n f3269t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G7.j f3270u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(C0473n c0473n, O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f3269t = c0473n;
        this.f3270u = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        t tVar = new t(this.f3269t, this.f3270u, dVar);
        tVar.f3268s = obj;
        return tVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    /* JADX WARN: Type inference failed for: r3v0, types: [G7.j, O7.p] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r4.f3267r
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r4.f3268s
            Y7.m r0 = (Y7.InterfaceC0472m) r0
            a.AbstractC0485a.A(r5)     // Catch: java.lang.Throwable -> L11
            goto L39
        L11:
            r5 = move-exception
            goto L35
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            a.AbstractC0485a.A(r5)
            java.lang.Object r5 = r4.f3268s
            Y7.z r5 = (Y7.InterfaceC0484z) r5
            Y7.n r1 = r4.f3269t
            G7.j r3 = r4.f3270u
            r4.f3268s = r1     // Catch: java.lang.Throwable -> L33
            r4.f3267r = r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r5 = r3.invoke(r5, r4)     // Catch: java.lang.Throwable -> L33
            if (r5 != r0) goto L31
            return r0
        L31:
            r0 = r1
            goto L39
        L33:
            r5 = move-exception
            r0 = r1
        L35:
            A7.i r5 = a.AbstractC0485a.h(r5)
        L39:
            java.lang.Throwable r1 = A7.j.a(r5)
            Y7.n r0 = (Y7.C0473n) r0
            if (r1 != 0) goto L45
            r0.L(r5)
            goto L51
        L45:
            r0.getClass()
            Y7.q r5 = new Y7.q
            r2 = 0
            r5.<init>(r1, r2)
            r0.L(r5)
        L51:
            A7.n r5 = A7.n.f558a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
