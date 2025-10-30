package C2;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class B extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1257r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1258s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1259t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e8, long j, E7.d dVar) {
        super(2, dVar);
        this.f1258s = e8;
        this.f1259t = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new B(this.f1258s, this.f1259t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if ((r12 instanceof A7.i) != false) goto L41;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
