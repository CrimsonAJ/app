package i7;

import Y7.InterfaceC0484z;

/* renamed from: i7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f18900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1401p f18901s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E7.i f18902t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f18903u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400o(C1401p c1401p, E7.i iVar, c0 c0Var, E7.d dVar) {
        super(2, dVar);
        this.f18901s = c1401p;
        this.f18902t = iVar;
        this.f18903u = c0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1400o(this.f18901s, this.f18902t, this.f18903u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1400o) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        if (r10.b(r9) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002b, code lost:
    
        if (r10 == r0) goto L25;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.C1400o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
