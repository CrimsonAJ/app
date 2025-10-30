package C2;

import Y7.InterfaceC0484z;
import java.util.List;

/* renamed from: C2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public List f1336r;

    /* renamed from: s, reason: collision with root package name */
    public int f1337s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0059e f1338t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1339u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0058d(C0059e c0059e, String str, E7.d dVar) {
        super(2, dVar);
        this.f1338t = c0059e;
        this.f1339u = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0058d(this.f1338t, this.f1339u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0058d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            F7.a r1 = F7.a.f2587a
            int r2 = r11.f1337s
            r3 = 3
            r4 = 2
            r5 = 0
            C2.e r6 = r11.f1338t
            if (r2 == 0) goto L2b
            if (r2 == r0) goto L27
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            java.util.List r0 = r11.f1336r
            a.AbstractC0485a.A(r12)
            goto Lbf
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            java.util.List r0 = r11.f1336r
            a.AbstractC0485a.A(r12)
            goto L8e
        L27:
            a.AbstractC0485a.A(r12)
            goto L58
        L2b:
            a.AbstractC0485a.A(r12)
            A7.l r12 = r6.f1343a
            java.lang.Object r12 = r12.getValue()
            B2.a r12 = (B2.a) r12
            g6.o r2 = g6.o.f17761a
            java.lang.String r7 = r2.A0()
            java.lang.String r2 = r2.B0()
            java.lang.String r8 = r11.f1339u
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r10 = 0
            r9[r10] = r8
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r9, r0)
            java.lang.String r2 = java.lang.String.format(r2, r8)
            r11.f1337s = r0
            java.lang.Object r12 = r12.a(r7, r2, r11)
            if (r12 != r1) goto L58
            goto Lbe
        L58:
            com.anilab.data.model.response.MalResponse r12 = (com.anilab.data.model.response.MalResponse) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r2 = r12.f14224a
            r0.addAll(r2)
            com.anilab.data.model.response.MalPagingResponse r12 = r12.f14225b
            if (r12 == 0) goto L6b
            java.lang.String r12 = r12.f14221a
            goto L6c
        L6b:
            r12 = r5
        L6c:
            if (r12 == 0) goto Lc6
            boolean r2 = W7.d.U(r12)
            if (r2 == 0) goto L75
            goto Lc6
        L75:
            A7.l r2 = r6.f1343a
            java.lang.Object r2 = r2.getValue()
            B2.a r2 = (B2.a) r2
            g6.o r7 = g6.o.f17761a
            java.lang.String r7 = r7.A0()
            r11.f1336r = r0
            r11.f1337s = r4
            java.lang.Object r12 = r2.a(r7, r12, r11)
            if (r12 != r1) goto L8e
            goto Lbe
        L8e:
            com.anilab.data.model.response.MalResponse r12 = (com.anilab.data.model.response.MalResponse) r12
            java.util.List r2 = r12.f14224a
            r0.addAll(r2)
            com.anilab.data.model.response.MalPagingResponse r12 = r12.f14225b
            if (r12 == 0) goto L9c
            java.lang.String r12 = r12.f14221a
            goto L9d
        L9c:
            r12 = r5
        L9d:
            if (r12 == 0) goto Lc6
            boolean r2 = W7.d.U(r12)
            if (r2 == 0) goto La6
            goto Lc6
        La6:
            A7.l r2 = r6.f1343a
            java.lang.Object r2 = r2.getValue()
            B2.a r2 = (B2.a) r2
            g6.o r4 = g6.o.f17761a
            java.lang.String r4 = r4.A0()
            r11.f1336r = r0
            r11.f1337s = r3
            java.lang.Object r12 = r2.a(r4, r12, r11)
            if (r12 != r1) goto Lbf
        Lbe:
            return r1
        Lbf:
            com.anilab.data.model.response.MalResponse r12 = (com.anilab.data.model.response.MalResponse) r12
            java.util.List r12 = r12.f14224a
            r0.addAll(r12)
        Lc6:
            v2.b r12 = new v2.b
            com.anilab.data.model.response.MalResponse r1 = new com.anilab.data.model.response.MalResponse
            r1.<init>(r0, r5)
            r12.<init>(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0058d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
