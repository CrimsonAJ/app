package d2;

import Y7.InterfaceC0484z;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class G extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16730r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16731s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f16732t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Movie f16733u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K k5, Movie movie, E7.d dVar) {
        super(2, dVar);
        this.f16732t = k5;
        this.f16733u = movie;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        G g9 = new G(this.f16732t, this.f16733u, dVar);
        g9.f16731s = obj;
        return g9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r1.a0(r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r10.o(r9) == r0) goto L15;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f16730r
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            a.AbstractC0485a.A(r10)
            goto L5e
        L11:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L19:
            java.lang.Object r1 = r9.f16731s
            Y7.E r1 = (Y7.E) r1
            a.AbstractC0485a.A(r10)
            goto L53
        L21:
            a.AbstractC0485a.A(r10)
            java.lang.Object r10 = r9.f16731s
            Y7.z r10 = (Y7.InterfaceC0484z) r10
            d2.F r1 = new d2.F
            d2.K r5 = r9.f16732t
            com.anilab.domain.model.Movie r6 = r9.f16733u
            r1.<init>(r5, r6, r2)
            r7 = 3
            Y7.F r1 = Y7.B.c(r10, r2, r1, r7)
            d2.E r8 = new d2.E
            r8.<init>(r5, r6, r1, r2)
            Y7.F r1 = Y7.B.c(r10, r2, r8, r7)
            d2.D r8 = new d2.D
            r8.<init>(r5, r6, r2)
            Y7.F r10 = Y7.B.c(r10, r2, r8, r7)
            r9.f16731s = r1
            r9.f16730r = r4
            java.lang.Object r10 = r10.o(r9)
            if (r10 != r0) goto L53
            goto L5d
        L53:
            r9.f16731s = r2
            r9.f16730r = r3
            java.lang.Object r10 = r1.a0(r9)
            if (r10 != r0) goto L5e
        L5d:
            return r0
        L5e:
            A7.n r10 = A7.n.f558a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.G.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
