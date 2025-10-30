package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.AbstractViewOnTouchListenerC1818r0;
import p.C1795g;
import p.C1797h;
import p.C1801j;
import p.C1805l;

/* renamed from: o.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661b extends AbstractViewOnTouchListenerC1818r0 {
    public final /* synthetic */ int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f21330k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1661b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f21330k = actionMenuItemView;
    }

    @Override // p.AbstractViewOnTouchListenerC1818r0
    public final InterfaceC1657B b() {
        C1795g c1795g;
        switch (this.j) {
            case 0:
                AbstractC1662c abstractC1662c = ((ActionMenuItemView) this.f21330k).f9340m;
                if (abstractC1662c != null && (c1795g = ((C1797h) abstractC1662c).f21995a.f22026u) != null) {
                    return c1795g.a();
                }
                return null;
            default:
                C1795g c1795g2 = ((C1801j) this.f21330k).f22001d.f22025t;
                if (c1795g2 == null) {
                    return null;
                }
                return c1795g2.a();
        }
    }

    @Override // p.AbstractViewOnTouchListenerC1818r0
    public final boolean c() {
        InterfaceC1657B b9;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f21330k;
                k kVar = actionMenuItemView.f9338k;
                if (kVar != null && kVar.c(actionMenuItemView.f9336h) && (b9 = b()) != null && b9.a()) {
                    return true;
                }
                return false;
            default:
                ((C1801j) this.f21330k).f22001d.n();
                return true;
        }
    }

    @Override // p.AbstractViewOnTouchListenerC1818r0
    public boolean d() {
        switch (this.j) {
            case 1:
                C1805l c1805l = ((C1801j) this.f21330k).f22001d;
                if (c1805l.f22027v != null) {
                    return false;
                }
                c1805l.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1661b(C1801j c1801j, C1801j c1801j2) {
        super(c1801j2);
        this.f21330k = c1801j;
    }
}
