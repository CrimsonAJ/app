package p2;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;

/* renamed from: p2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1854g extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public C1855h f22153r;

    /* renamed from: s, reason: collision with root package name */
    public int f22154s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1855h f22155t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f22156u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854g(C1855h c1855h, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f22155t = c1855h;
        this.f22156u = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1854g(this.f22155t, this.f22156u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1854g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        if (r12 != r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (r12 == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c5, code lost:
    
        if (r9.f22158g.a(r11) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0054, code lost:
    
        if (r12 == r0) goto L45;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C1854g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
