package c2;

import Y7.InterfaceC0484z;

/* renamed from: c2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f11637r;

    /* renamed from: s, reason: collision with root package name */
    public Object f11638s;

    /* renamed from: t, reason: collision with root package name */
    public Object f11639t;

    /* renamed from: u, reason: collision with root package name */
    public int f11640u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0772r f11641v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f11642w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0771q(C0772r c0772r, String str, E7.d dVar) {
        super(2, dVar);
        this.f11641v = c0772r;
        this.f11642w = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0771q(this.f11641v, this.f11642w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0771q) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0154, code lost:
    
        if (r3.f(r4, r17) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013e, code lost:
    
        if (r4.f(r8, r17) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r4.e(r10, r17) == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0069, code lost:
    
        if (r2 == r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C0771q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
