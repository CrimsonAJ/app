package V1;

import Y7.InterfaceC0484z;
import com.anilab.domain.model.FilterConfig;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f7636r;

    /* renamed from: s, reason: collision with root package name */
    public int f7637s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f7638t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7639u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ FilterConfig f7640v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FilterConfig f7641w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FilterConfig f7642x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f7643y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, int i9, FilterConfig filterConfig, FilterConfig filterConfig2, FilterConfig filterConfig3, List list, E7.d dVar) {
        super(2, dVar);
        this.f7638t = nVar;
        this.f7639u = i9;
        this.f7640v = filterConfig;
        this.f7641w = filterConfig2;
        this.f7642x = filterConfig3;
        this.f7643y = list;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new m(this.f7638t, this.f7639u, this.f7640v, this.f7641w, this.f7642x, this.f7643y, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r3.f(r1, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r13 == r0) goto L25;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r12.f7637s
            r2 = 2
            V1.n r3 = r12.f7638t
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            a.AbstractC0485a.A(r13)
            r11 = r12
            goto L91
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            a.AbstractC0485a.A(r13)
            A7.j r13 = (A7.j) r13
            java.lang.Object r13 = r13.f550a
            r11 = r12
            goto L3e
        L25:
            a.AbstractC0485a.A(r13)
            O2.l r5 = r3.f7644f
            r12.f7637s = r4
            com.anilab.domain.model.FilterConfig r7 = r12.f7640v
            com.anilab.domain.model.FilterConfig r8 = r12.f7641w
            com.anilab.domain.model.FilterConfig r9 = r12.f7642x
            java.util.List r10 = r12.f7643y
            int r6 = r12.f7639u
            r11 = r12
            java.io.Serializable r13 = r5.a(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L3e
            goto L90
        L3e:
            boolean r1 = r13 instanceof A7.i
            r5 = 0
            if (r1 != 0) goto L71
            r1 = r13
            java.util.List r1 = (java.util.List) r1
            int r6 = r11.f7639u
            if (r6 <= r4) goto L6c
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L71
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            b8.Q r6 = r3.f7645g
            java.lang.Object r6 = r6.h()
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
            r4.addAll(r1)
            b8.Q r1 = r3.f7645g
            r1.getClass()
            r1.j(r5, r4)
            goto L71
        L6c:
            b8.Q r4 = r3.f7645g
            r4.i(r1)
        L71:
            java.lang.Throwable r1 = A7.j.a(r13)
            if (r1 == 0) goto L91
            b8.Q r4 = r3.f7647i
            M1.t r6 = new M1.t
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.<init>(r7)
            r4.getClass()
            r4.j(r5, r6)
            r11.f7636r = r13
            r11.f7637s = r2
            java.lang.Object r13 = r3.f(r1, r12)
            if (r13 != r0) goto L91
        L90:
            return r0
        L91:
            A7.n r13 = A7.n.f558a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
