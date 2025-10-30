package p;

import o.InterfaceC1657B;

/* renamed from: p.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1738D extends AbstractViewOnTouchListenerC1818r0 {
    public final /* synthetic */ C1748I j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1754L f21802k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738D(C1754L c1754l, C1754L c1754l2, C1748I c1748i) {
        super(c1754l2);
        this.f21802k = c1754l;
        this.j = c1748i;
    }

    @Override // p.AbstractViewOnTouchListenerC1818r0
    public final InterfaceC1657B b() {
        return this.j;
    }

    @Override // p.AbstractViewOnTouchListenerC1818r0
    public final boolean c() {
        C1754L c1754l = this.f21802k;
        if (!c1754l.getInternalPopup().a()) {
            c1754l.f21846f.l(c1754l.getTextDirection(), c1754l.getTextAlignment());
            return true;
        }
        return true;
    }
}
