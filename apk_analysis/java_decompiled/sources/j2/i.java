package j2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class i extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public Object f19215r;

    /* renamed from: s, reason: collision with root package name */
    public int f19216s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f19217t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f19218u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f19219v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f19220w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f19221x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, j jVar, String str3, String str4, E7.d dVar) {
        super(2, dVar);
        this.f19217t = str;
        this.f19218u = str2;
        this.f19219v = jVar;
        this.f19220w = str3;
        this.f19221x = str4;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new i(this.f19217t, this.f19218u, this.f19219v, this.f19220w, this.f19221x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r10 == r0) goto L25;
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
            int r1 = r9.f19216s
            A7.n r2 = A7.n.f558a
            j2.j r3 = r9.f19219v
            r4 = 0
            r5 = 2
            r6 = 1
            b8.Q r7 = r3.f19225i
            if (r1 == 0) goto L27
            if (r1 == r6) goto L1f
            if (r1 != r5) goto L17
            a.AbstractC0485a.A(r10)
            return r2
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            a.AbstractC0485a.A(r10)
            A7.j r10 = (A7.j) r10
            java.lang.Object r10 = r10.f550a
            goto L79
        L27:
            a.AbstractC0485a.A(r10)
            java.lang.String r10 = r9.f19217t
            java.lang.CharSequence r1 = W7.d.j0(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = r9.f19218u
            java.lang.CharSequence r8 = W7.d.j0(r8)
            java.lang.String r8 = r8.toString()
            boolean r1 = kotlin.jvm.internal.h.a(r1, r8)
            if (r1 != 0) goto L52
            M1.t r10 = new M1.t
            j2.g r0 = j2.g.f19208b
            r10.<init>(r0)
            r7.getClass()
            r7.j(r4, r10)
            return r2
        L52:
            java.lang.String r1 = r9.f19220w
            java.lang.CharSequence r1 = W7.d.j0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r8 = r9.f19221x
            java.lang.CharSequence r8 = W7.d.j0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.CharSequence r10 = W7.d.j0(r10)
            java.lang.String r10 = r10.toString()
            r9.f19216s = r6
            P2.u r6 = r3.f19222f
            java.lang.Object r10 = r6.a(r1, r8, r10, r9)
            if (r10 != r0) goto L79
            goto L9d
        L79:
            boolean r1 = r10 instanceof A7.i
            if (r1 != 0) goto L8d
            r1 = r10
            H2.y r1 = (H2.y) r1
            M1.t r1 = new M1.t
            j2.g r6 = j2.g.f19209c
            r1.<init>(r6)
            r7.getClass()
            r7.j(r4, r1)
        L8d:
            java.lang.Throwable r1 = A7.j.a(r10)
            if (r1 == 0) goto L9e
            r9.f19215r = r10
            r9.f19216s = r5
            java.lang.Object r10 = r3.f(r1, r9)
            if (r10 != r0) goto L9e
        L9d:
            return r0
        L9e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
