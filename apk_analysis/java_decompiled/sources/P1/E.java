package P1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class E extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f5678r;

    /* renamed from: s, reason: collision with root package name */
    public H2.c f5679s;

    /* renamed from: t, reason: collision with root package name */
    public G f5680t;

    /* renamed from: u, reason: collision with root package name */
    public int f5681u;

    /* renamed from: v, reason: collision with root package name */
    public int f5682v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f5683w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ G f5684x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String str, G g9, E7.d dVar) {
        super(2, dVar);
        this.f5683w = str;
        this.f5684x = g9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new E(this.f5683w, this.f5684x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x020e, code lost:
    
        if (r3.f(r2, r16) == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a7, code lost:
    
        if (r3.f(r2, r16) == r1) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
