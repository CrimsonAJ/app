package co.notix;

import Y7.InterfaceC0484z;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class jg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12550b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg(NotixBannerView notixBannerView, E7.d dVar) {
        super(2, dVar);
        this.f12550b = notixBannerView;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new jg(this.f12550b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((jg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        if (b8.AbstractC0714M.h(r1, r7) == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.jg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
