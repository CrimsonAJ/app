package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import p.C1743F0;
import p.C1748I;
import p.C1754L;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1663d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21332b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1663d(int i9, Object obj) {
        this.f21331a = i9;
        this.f21332b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f21331a) {
            case 0:
                f fVar = (f) this.f21332b;
                if (fVar.a()) {
                    ArrayList arrayList = fVar.f21342h;
                    if (arrayList.size() > 0) {
                        int i9 = 0;
                        if (!((e) arrayList.get(0)).f21333a.f21794y) {
                            View view = fVar.f21348o;
                            if (view != null && view.isShown()) {
                                int size = arrayList.size();
                                while (i9 < size) {
                                    Object obj = arrayList.get(i9);
                                    i9++;
                                    ((e) obj).f21333a.d();
                                }
                                return;
                            }
                            fVar.dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC1658C viewOnKeyListenerC1658C = (ViewOnKeyListenerC1658C) this.f21332b;
                if (viewOnKeyListenerC1658C.a()) {
                    C1743F0 c1743f0 = viewOnKeyListenerC1658C.f21301h;
                    if (!c1743f0.f21794y) {
                        View view2 = viewOnKeyListenerC1658C.f21305m;
                        if (view2 != null && view2.isShown()) {
                            c1743f0.d();
                            return;
                        } else {
                            viewOnKeyListenerC1658C.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                C1754L c1754l = (C1754L) this.f21332b;
                if (!c1754l.getInternalPopup().a()) {
                    c1754l.f21846f.l(c1754l.getTextDirection(), c1754l.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1754l.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                C1748I c1748i = (C1748I) this.f21332b;
                C1754L c1754l2 = c1748i.f21821f0;
                c1748i.getClass();
                if (c1754l2.isAttachedToWindow() && c1754l2.getGlobalVisibleRect(c1748i.Y)) {
                    c1748i.s();
                    c1748i.d();
                    return;
                } else {
                    c1748i.dismiss();
                    return;
                }
        }
    }
}
