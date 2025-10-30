package co.notix;

import O7.r;

/* loaded from: classes.dex */
public final class xk extends G7.j implements r {

    /* renamed from: a, reason: collision with root package name */
    public Integer f13543a;

    /* renamed from: b, reason: collision with root package name */
    public String f13544b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f13545c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13546d;

    /* renamed from: e, reason: collision with root package name */
    public long f13547e;

    /* renamed from: f, reason: collision with root package name */
    public int f13548f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f13549g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ xa f13550h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13551i;
    public final /* synthetic */ zk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk(zk zkVar, E7.d dVar) {
        super(4, dVar);
        this.j = zkVar;
    }

    @Override // O7.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        xk xkVar = new xk(this.j, (E7.d) obj4);
        xkVar.f13549g = booleanValue;
        xkVar.f13550h = (xa) obj2;
        xkVar.f13551i = (pp) obj3;
        return xkVar.invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0185, code lost:
    
        if (co.notix.zk.a(r2, r3, r9, r18) == r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
    
        if (co.notix.zk.a(r2, r3, r9, r18) == r1) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d1 A[RETURN] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.xk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
