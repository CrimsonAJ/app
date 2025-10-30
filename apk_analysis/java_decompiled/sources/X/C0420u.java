package X;

import b8.InterfaceC0726f;

/* renamed from: X.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420u extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public C0403c f8112r;

    /* renamed from: s, reason: collision with root package name */
    public int f8113s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8114t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ O f8115u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0420u(O o9, E7.d dVar) {
        super(2, dVar);
        this.f8115u = o9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0420u c0420u = new C0420u(this.f8115u, dVar);
        c0420u.f8114t = obj;
        return c0420u;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0420u) create((InterfaceC0726f) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r4.emit(r12, r11) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r1 instanceof X.P) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Type inference failed for: r12v17, types: [G7.j, O7.p] */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0420u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
