package C2;

import Y7.InterfaceC0484z;

/* renamed from: C2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1356r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f1357s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1358t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061g(E e8, long j, E7.d dVar) {
        super(2, dVar);
        this.f1357s = e8;
        this.f1358t = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0061g(this.f1357s, this.f1358t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0061g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        if ((r11 instanceof A7.i) != false) goto L41;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0061g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
