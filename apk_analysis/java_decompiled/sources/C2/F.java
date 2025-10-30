package C2;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O f1271s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1272t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(O o9, String str, E7.d dVar) {
        super(2, dVar);
        this.f1271s = o9;
        this.f1272t = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new F(this.f1271s, this.f1272t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00dc, code lost:
    
        if ((r0 instanceof A7.i) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0256, code lost:
    
        if (r0 == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        if (r0 == r2) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.F.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
