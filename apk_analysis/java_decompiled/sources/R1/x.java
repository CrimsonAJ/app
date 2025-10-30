package R1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class x extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f6558r;

    /* renamed from: s, reason: collision with root package name */
    public A f6559s;

    /* renamed from: t, reason: collision with root package name */
    public String f6560t;

    /* renamed from: u, reason: collision with root package name */
    public int f6561u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A f6562v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Long f6563w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(A a5, Long l9, E7.d dVar) {
        super(2, dVar);
        this.f6562v = a5;
        this.f6563w = l9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new x(this.f6562v, this.f6563w, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0117, code lost:
    
        if (r2.f(r1, r10) == r0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0049, code lost:
    
        if (r11 == r0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010b  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
