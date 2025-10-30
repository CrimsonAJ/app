package R1;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f6564r;

    /* renamed from: s, reason: collision with root package name */
    public A f6565s;

    /* renamed from: t, reason: collision with root package name */
    public String f6566t;

    /* renamed from: u, reason: collision with root package name */
    public int f6567u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ A f6568v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f6569w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f6570x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a5, long j, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f6568v = a5;
        this.f6569w = j;
        this.f6570x = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new y(this.f6568v, this.f6569w, this.f6570x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0058, code lost:
    
        if (r14 == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
