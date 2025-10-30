package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class uk extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f13304a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13305b;

    /* renamed from: c, reason: collision with root package name */
    public String f13306c;

    /* renamed from: d, reason: collision with root package name */
    public String f13307d;

    /* renamed from: e, reason: collision with root package name */
    public String f13308e;

    /* renamed from: f, reason: collision with root package name */
    public String f13309f;

    /* renamed from: g, reason: collision with root package name */
    public String f13310g;

    /* renamed from: h, reason: collision with root package name */
    public int f13311h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f13312i;
    public final /* synthetic */ vk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(vk vkVar, E7.d dVar) {
        super(2, dVar);
        this.j = vkVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        uk ukVar = new uk(this.j, dVar);
        ukVar.f13312i = obj;
        return ukVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((uk) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0168  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.uk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
