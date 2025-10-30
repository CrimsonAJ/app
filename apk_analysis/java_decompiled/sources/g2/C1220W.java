package g2;

import Y7.InterfaceC0484z;

/* renamed from: g2.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220W extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f17611r;

    /* renamed from: s, reason: collision with root package name */
    public a0 f17612s;

    /* renamed from: t, reason: collision with root package name */
    public I2.a f17613t;

    /* renamed from: u, reason: collision with root package name */
    public int f17614u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17615v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f17616w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a0 f17617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220W(boolean z9, boolean z10, a0 a0Var, E7.d dVar) {
        super(2, dVar);
        this.f17615v = z9;
        this.f17616w = z10;
        this.f17617x = a0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1220W(this.f17615v, this.f17616w, this.f17617x, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1220W) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        if (r14 == r0) goto L58;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C1220W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
