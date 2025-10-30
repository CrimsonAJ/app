package X;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class G extends G7.j implements O7.l {

    /* renamed from: r, reason: collision with root package name */
    public Serializable f7978r;

    /* renamed from: s, reason: collision with root package name */
    public int f7979s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f7980t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f7981u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f7982v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(kotlin.jvm.internal.o oVar, O o9, kotlin.jvm.internal.m mVar, E7.d dVar) {
        super(1, dVar);
        this.f7980t = oVar;
        this.f7981u = o9;
        this.f7982v = mVar;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new G(this.f7980t, this.f7981u, this.f7982v, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((G) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f7979s
            kotlin.jvm.internal.m r2 = r8.f7982v
            kotlin.jvm.internal.o r3 = r8.f7980t
            r4 = 3
            r5 = 2
            X.O r6 = r8.f7981u
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            java.io.Serializable r0 = r8.f7978r
            r2 = r0
            kotlin.jvm.internal.m r2 = (kotlin.jvm.internal.m) r2
            a.AbstractC0485a.A(r9)
            goto L6d
        L1e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L26:
            java.io.Serializable r1 = r8.f7978r
            kotlin.jvm.internal.m r1 = (kotlin.jvm.internal.m) r1
            a.AbstractC0485a.A(r9)     // Catch: X.C0402b -> L60
            goto L57
        L2e:
            java.io.Serializable r1 = r8.f7978r
            kotlin.jvm.internal.o r1 = (kotlin.jvm.internal.o) r1
            a.AbstractC0485a.A(r9)     // Catch: X.C0402b -> L60
            goto L45
        L36:
            a.AbstractC0485a.A(r9)
            r8.f7978r = r3     // Catch: X.C0402b -> L60
            r8.f7979s = r7     // Catch: X.C0402b -> L60
            java.lang.Object r9 = r6.j(r8)     // Catch: X.C0402b -> L60
            if (r9 != r0) goto L44
            goto L6c
        L44:
            r1 = r3
        L45:
            r1.f20159a = r9     // Catch: X.C0402b -> L60
            X.Y r9 = r6.h()     // Catch: X.C0402b -> L60
            r8.f7978r = r2     // Catch: X.C0402b -> L60
            r8.f7979s = r5     // Catch: X.C0402b -> L60
            java.lang.Integer r9 = r9.a()     // Catch: X.C0402b -> L60
            if (r9 != r0) goto L56
            goto L6c
        L56:
            r1 = r2
        L57:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: X.C0402b -> L60
            int r9 = r9.intValue()     // Catch: X.C0402b -> L60
            r1.f20157a = r9     // Catch: X.C0402b -> L60
            goto L75
        L60:
            java.lang.Object r9 = r3.f20159a
            r8.f7978r = r2
            r8.f7979s = r4
            java.lang.Object r9 = r6.k(r9, r7, r8)
            if (r9 != r0) goto L6d
        L6c:
            return r0
        L6d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r2.f20157a = r9
        L75:
            A7.n r9 = A7.n.f558a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
