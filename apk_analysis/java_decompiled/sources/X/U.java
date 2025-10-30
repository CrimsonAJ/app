package X;

import Y7.InterfaceC0484z;
import l1.C1535g;

/* loaded from: classes.dex */
public final class U extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public L f8033r;

    /* renamed from: s, reason: collision with root package name */
    public int f8034s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1535g f8035t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C1535g c1535g, E7.d dVar) {
        super(2, dVar);
        this.f8035t = c1535g;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new U(this.f8035t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        if (r3 == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
    
        if (r3 == a8.g.f9219n) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012a, code lost:
    
        r6.a();
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0137, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0168  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0159 -> B:6:0x015a). Please report as a decompilation issue!!! */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
