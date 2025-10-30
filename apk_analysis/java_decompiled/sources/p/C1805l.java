package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import co.notix.R;
import java.util.ArrayList;
import o.SubMenuC1659D;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1805l implements o.x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22007a;

    /* renamed from: b, reason: collision with root package name */
    public Context f22008b;

    /* renamed from: c, reason: collision with root package name */
    public o.l f22009c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f22010d;

    /* renamed from: e, reason: collision with root package name */
    public o.w f22011e;

    /* renamed from: h, reason: collision with root package name */
    public o.z f22014h;

    /* renamed from: i, reason: collision with root package name */
    public int f22015i;
    public C1801j j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f22016k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22019n;

    /* renamed from: o, reason: collision with root package name */
    public int f22020o;

    /* renamed from: p, reason: collision with root package name */
    public int f22021p;

    /* renamed from: q, reason: collision with root package name */
    public int f22022q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22023r;

    /* renamed from: t, reason: collision with root package name */
    public C1795g f22025t;

    /* renamed from: u, reason: collision with root package name */
    public C1795g f22026u;

    /* renamed from: v, reason: collision with root package name */
    public RunnableC1799i f22027v;

    /* renamed from: w, reason: collision with root package name */
    public C1797h f22028w;

    /* renamed from: y, reason: collision with root package name */
    public int f22030y;

    /* renamed from: f, reason: collision with root package name */
    public final int f22012f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f22013g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f22024s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final i.G f22029x = new i.G(10, this);

    public C1805l(Context context) {
        this.f22007a = context;
        this.f22010d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(o.n nVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = nVar.getActionView();
        int i9 = 0;
        if (actionView == null || nVar.e()) {
            if (view instanceof o.y) {
                actionMenuItemView = (o.y) view;
            } else {
                actionMenuItemView = (o.y) this.f22010d.inflate(this.f22013g, viewGroup, false);
            }
            actionMenuItemView.a(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f22014h);
            if (this.f22028w == null) {
                this.f22028w = new C1797h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f22028w);
            actionView = actionMenuItemView;
        }
        if (nVar.f21403C) {
            i9 = 8;
        }
        actionView.setVisibility(i9);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C1809n)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // o.x
    public final void b(Parcelable parcelable) {
        int i9;
        MenuItem findItem;
        if ((parcelable instanceof C1803k) && (i9 = ((C1803k) parcelable).f22002a) > 0 && (findItem = this.f22009c.findItem(i9)) != null) {
            l((SubMenuC1659D) findItem.getSubMenu());
        }
    }

    @Override // o.x
    public final void c(o.l lVar, boolean z9) {
        d();
        C1795g c1795g = this.f22026u;
        if (c1795g != null && c1795g.b()) {
            c1795g.f21449i.dismiss();
        }
        o.w wVar = this.f22011e;
        if (wVar != null) {
            wVar.c(lVar, z9);
        }
    }

    public final boolean d() {
        Object obj;
        RunnableC1799i runnableC1799i = this.f22027v;
        if (runnableC1799i != null && (obj = this.f22014h) != null) {
            ((View) obj).removeCallbacks(runnableC1799i);
            this.f22027v = null;
            return true;
        }
        C1795g c1795g = this.f22025t;
        if (c1795g != null) {
            if (c1795g.b()) {
                c1795g.f21449i.dismiss();
            }
            return true;
        }
        return false;
    }

    public final boolean e() {
        C1795g c1795g = this.f22025t;
        if (c1795g != null && c1795g.b()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.x
    public final void f(boolean z9) {
        int i9;
        o.n nVar;
        ViewGroup viewGroup = (ViewGroup) this.f22014h;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            o.l lVar = this.f22009c;
            if (lVar != null) {
                lVar.i();
                ArrayList l9 = this.f22009c.l();
                int size = l9.size();
                i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    o.n nVar2 = (o.n) l9.get(i10);
                    if ((nVar2.f21426x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i9);
                        if (childAt instanceof o.y) {
                            nVar = ((o.y) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View a5 = a(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            a5.setPressed(false);
                            a5.jumpDrawablesToCurrentState();
                        }
                        if (a5 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a5.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a5);
                            }
                            ((ViewGroup) this.f22014h).addView(a5, i9);
                        }
                        i9++;
                    }
                }
            } else {
                i9 = 0;
            }
            while (i9 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i9) == this.j) {
                    i9++;
                } else {
                    viewGroup.removeViewAt(i9);
                }
            }
        }
        ((View) this.f22014h).requestLayout();
        o.l lVar2 = this.f22009c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.f21383i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                o.o oVar = ((o.n) arrayList2.get(i11)).f21401A;
            }
        }
        o.l lVar3 = this.f22009c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.f22018m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((o.n) arrayList.get(0)).f21403C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.j == null) {
                this.j = new C1801j(this, this.f22007a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.f22014h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f22014h;
                C1801j c1801j = this.j;
                actionMenuView.getClass();
                C1809n j = ActionMenuView.j();
                j.f22033a = true;
                actionMenuView.addView(c1801j, j);
            }
        } else {
            C1801j c1801j2 = this.j;
            if (c1801j2 != null) {
                Object parent = c1801j2.getParent();
                Object obj = this.f22014h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j);
                }
            }
        }
        ((ActionMenuView) this.f22014h).setOverflowReserved(this.f22018m);
    }

    @Override // o.x
    public final boolean g(o.n nVar) {
        return false;
    }

    @Override // o.x
    public final int getId() {
        return this.f22015i;
    }

    @Override // o.x
    public final void h(o.w wVar) {
        throw null;
    }

    @Override // o.x
    public final void i(Context context, o.l lVar) {
        this.f22008b = context;
        LayoutInflater.from(context);
        this.f22009c = lVar;
        Resources resources = context.getResources();
        if (!this.f22019n) {
            this.f22018m = true;
        }
        int i9 = 2;
        this.f22020o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i10 <= 600 && ((i10 <= 960 || i11 <= 720) && (i10 <= 720 || i11 <= 960))) {
            if (i10 < 500 && ((i10 <= 640 || i11 <= 480) && (i10 <= 480 || i11 <= 640))) {
                if (i10 >= 360) {
                    i9 = 3;
                }
            } else {
                i9 = 4;
            }
        } else {
            i9 = 5;
        }
        this.f22022q = i9;
        int i12 = this.f22020o;
        if (this.f22018m) {
            if (this.j == null) {
                C1801j c1801j = new C1801j(this, this.f22007a);
                this.j = c1801j;
                if (this.f22017l) {
                    c1801j.setImageDrawable(this.f22016k);
                    this.f22016k = null;
                    this.f22017l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.f22021p = i12;
        float f9 = resources.getDisplayMetrics().density;
    }

    @Override // o.x
    public final boolean j() {
        int i9;
        ArrayList arrayList;
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        C1805l c1805l = this;
        o.l lVar = c1805l.f22009c;
        if (lVar != null) {
            arrayList = lVar.l();
            i9 = arrayList.size();
        } else {
            i9 = 0;
            arrayList = null;
        }
        int i11 = c1805l.f22022q;
        int i12 = c1805l.f22021p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1805l.f22014h;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z9 = true;
            if (i13 >= i9) {
                break;
            }
            o.n nVar = (o.n) arrayList.get(i13);
            int i16 = nVar.f21427y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z13 = true;
            }
            if (c1805l.f22023r && nVar.f21403C) {
                i11 = 0;
            }
            i13++;
        }
        if (c1805l.f22018m && (z13 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = c1805l.f22024s;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i9) {
            o.n nVar2 = (o.n) arrayList.get(i18);
            int i20 = nVar2.f21427y;
            if ((i20 & 2) == i10) {
                z10 = z9;
            } else {
                z10 = false;
            }
            int i21 = nVar2.f21405b;
            if (z10) {
                View a5 = c1805l.a(nVar2, null, viewGroup);
                a5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a5.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z9);
                }
                nVar2.g(z9);
            } else if ((i20 & 1) == z9) {
                boolean z14 = sparseBooleanArray.get(i21);
                if ((i17 > 0 || z14) && i12 > 0) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11) {
                    View a9 = c1805l.a(nVar2, null, viewGroup);
                    a9.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a9.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    if (i12 + i19 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 &= z12;
                }
                if (z11 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z14) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        o.n nVar3 = (o.n) arrayList.get(i22);
                        if (nVar3.f21405b == i21) {
                            if ((nVar3.f21426x & 32) == 32) {
                                i17++;
                            }
                            nVar3.g(false);
                        }
                    }
                }
                if (z11) {
                    i17--;
                }
                nVar2.g(z11);
            } else {
                nVar2.g(false);
                i18++;
                i10 = 2;
                c1805l = this;
                z9 = true;
            }
            i18++;
            i10 = 2;
            c1805l = this;
            z9 = true;
        }
        return z9;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, p.k] */
    @Override // o.x
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f22002a = this.f22030y;
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.x
    public final boolean l(SubMenuC1659D subMenuC1659D) {
        boolean z9;
        if (subMenuC1659D.hasVisibleItems()) {
            SubMenuC1659D subMenuC1659D2 = subMenuC1659D;
            while (true) {
                o.l lVar = subMenuC1659D2.f21314z;
                if (lVar == this.f22009c) {
                    break;
                }
                subMenuC1659D2 = (SubMenuC1659D) lVar;
            }
            ViewGroup viewGroup = (ViewGroup) this.f22014h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i9);
                    if ((childAt instanceof o.y) && ((o.y) childAt).getItemData() == subMenuC1659D2.f21313A) {
                        view = childAt;
                        break;
                    }
                    i9++;
                }
            }
            if (view != null) {
                this.f22030y = subMenuC1659D.f21313A.f21404a;
                int size = subMenuC1659D.f21380f.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        MenuItem item = subMenuC1659D.getItem(i10);
                        if (item.isVisible() && item.getIcon() != null) {
                            z9 = true;
                            break;
                        }
                        i10++;
                    } else {
                        z9 = false;
                        break;
                    }
                }
                C1795g c1795g = new C1795g(this, this.f22008b, subMenuC1659D, view);
                this.f22026u = c1795g;
                c1795g.f21447g = z9;
                o.t tVar = c1795g.f21449i;
                if (tVar != null) {
                    tVar.q(z9);
                }
                C1795g c1795g2 = this.f22026u;
                if (!c1795g2.b()) {
                    if (c1795g2.f21445e != null) {
                        c1795g2.d(0, 0, false, false);
                    } else {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
                o.w wVar = this.f22011e;
                if (wVar != null) {
                    wVar.m(subMenuC1659D);
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.x
    public final boolean m(o.n nVar) {
        return false;
    }

    public final boolean n() {
        o.l lVar;
        if (this.f22018m && !e() && (lVar = this.f22009c) != null && this.f22014h != null && this.f22027v == null) {
            lVar.i();
            if (!lVar.j.isEmpty()) {
                RunnableC1799i runnableC1799i = new RunnableC1799i(this, new C1795g(this, this.f22008b, this.f22009c, this.j));
                this.f22027v = runnableC1799i;
                ((View) this.f22014h).post(runnableC1799i);
                return true;
            }
            return false;
        }
        return false;
    }
}
