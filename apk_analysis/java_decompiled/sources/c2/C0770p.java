package c2;

import Y7.InterfaceC0484z;

/* renamed from: c2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770p extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f11633r;

    /* renamed from: s, reason: collision with root package name */
    public int f11634s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0772r f11635t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J2.a f11636u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770p(C0772r c0772r, J2.a aVar, E7.d dVar) {
        super(2, dVar);
        this.f11635t = c0772r;
        this.f11636u = aVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0770p(this.f11635t, this.f11636u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0770p) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x018a, code lost:
    
        if (r3.f(r14, r13) == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x018c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0179, code lost:
    
        if (r3.e(r14, r13) == r0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003b, code lost:
    
        if (r14 == r0) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0182  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C0770p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
