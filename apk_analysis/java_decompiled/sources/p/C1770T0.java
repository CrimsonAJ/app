package p;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import n.InterfaceC1596b;
import o.SubMenuC1659D;

/* renamed from: p.T0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1770T0 implements o.x {

    /* renamed from: a, reason: collision with root package name */
    public o.l f21917a;

    /* renamed from: b, reason: collision with root package name */
    public o.n f21918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f21919c;

    public C1770T0(Toolbar toolbar) {
        this.f21919c = toolbar;
    }

    @Override // o.x
    public final void f(boolean z9) {
        if (this.f21918b != null) {
            o.l lVar = this.f21917a;
            if (lVar != null) {
                int size = lVar.f21380f.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (this.f21917a.getItem(i9) == this.f21918b) {
                        return;
                    }
                }
            }
            m(this.f21918b);
        }
    }

    @Override // o.x
    public final boolean g(o.n nVar) {
        Toolbar toolbar = this.f21919c;
        toolbar.c();
        ViewParent parent = toolbar.f9495h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f9495h);
            }
            toolbar.addView(toolbar.f9495h);
        }
        View actionView = nVar.getActionView();
        toolbar.f9497i = actionView;
        this.f21918b = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f9497i);
            }
            C1772U0 h7 = Toolbar.h();
            h7.f21920a = (toolbar.f9506n & 112) | 8388611;
            h7.f21921b = 2;
            toolbar.f9497i.setLayoutParams(h7);
            toolbar.addView(toolbar.f9497i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1772U0) childAt.getLayoutParams()).f21921b != 2 && childAt != toolbar.f9486a) {
                toolbar.removeViewAt(childCount);
                toolbar.f9492f0.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f21403C = true;
        nVar.f21416n.p(false);
        KeyEvent.Callback callback = toolbar.f9497i;
        if (callback instanceof InterfaceC1596b) {
            ((o.p) ((InterfaceC1596b) callback)).f21432a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    @Override // o.x
    public final int getId() {
        return 0;
    }

    @Override // o.x
    public final void i(Context context, o.l lVar) {
        o.n nVar;
        o.l lVar2 = this.f21917a;
        if (lVar2 != null && (nVar = this.f21918b) != null) {
            lVar2.d(nVar);
        }
        this.f21917a = lVar;
    }

    @Override // o.x
    public final boolean j() {
        return false;
    }

    @Override // o.x
    public final Parcelable k() {
        return null;
    }

    @Override // o.x
    public final boolean l(SubMenuC1659D subMenuC1659D) {
        return false;
    }

    @Override // o.x
    public final boolean m(o.n nVar) {
        Toolbar toolbar = this.f21919c;
        KeyEvent.Callback callback = toolbar.f9497i;
        if (callback instanceof InterfaceC1596b) {
            ((o.p) ((InterfaceC1596b) callback)).f21432a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f9497i);
        toolbar.removeView(toolbar.f9495h);
        toolbar.f9497i = null;
        ArrayList arrayList = toolbar.f9492f0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f21918b = null;
        toolbar.requestLayout();
        nVar.f21403C = false;
        nVar.f21416n.p(false);
        toolbar.u();
        return true;
    }

    @Override // o.x
    public final void b(Parcelable parcelable) {
    }

    @Override // o.x
    public final void c(o.l lVar, boolean z9) {
    }
}
