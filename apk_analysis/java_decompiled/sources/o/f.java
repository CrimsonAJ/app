package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import co.notix.R;
import f5.C1183o;
import java.util.ArrayList;
import p.AbstractC1737C0;
import p.C1743F0;
import p.C1812o0;

/* loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f21336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21337c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21338d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21339e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f21340f;

    /* renamed from: n, reason: collision with root package name */
    public View f21347n;

    /* renamed from: o, reason: collision with root package name */
    public View f21348o;

    /* renamed from: p, reason: collision with root package name */
    public int f21349p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21350q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21351r;

    /* renamed from: s, reason: collision with root package name */
    public int f21352s;

    /* renamed from: t, reason: collision with root package name */
    public int f21353t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21355v;

    /* renamed from: w, reason: collision with root package name */
    public w f21356w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f21357x;

    /* renamed from: y, reason: collision with root package name */
    public u f21358y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f21359z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21341g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f21342h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1663d f21343i = new ViewTreeObserverOnGlobalLayoutListenerC1663d(0, this);
    public final K5.o j = new K5.o(2, this);

    /* renamed from: k, reason: collision with root package name */
    public final C1183o f21344k = new C1183o(11, this);

    /* renamed from: l, reason: collision with root package name */
    public int f21345l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f21346m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21354u = false;

    public f(Context context, View view, int i9, boolean z9) {
        this.f21336b = context;
        this.f21347n = view;
        this.f21338d = i9;
        this.f21339e = z9;
        this.f21349p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f21337c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f21340f = new Handler();
    }

    @Override // o.InterfaceC1657B
    public final boolean a() {
        ArrayList arrayList = this.f21342h;
        if (arrayList.size() <= 0 || !((e) arrayList.get(0)).f21333a.f21795z.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // o.x
    public final void c(l lVar, boolean z9) {
        int i9;
        ArrayList arrayList = this.f21342h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((e) arrayList.get(i10)).f21334b) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            int i11 = i10 + 1;
            if (i11 < arrayList.size()) {
                ((e) arrayList.get(i11)).f21334b.c(false);
            }
            e eVar = (e) arrayList.remove(i10);
            eVar.f21334b.r(this);
            boolean z10 = this.f21359z;
            C1743F0 c1743f0 = eVar.f21333a;
            if (z10) {
                AbstractC1737C0.b(c1743f0.f21795z, null);
                c1743f0.f21795z.setAnimationStyle(0);
            }
            c1743f0.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f21349p = ((e) arrayList.get(size2 - 1)).f21335c;
            } else {
                if (this.f21347n.getLayoutDirection() == 1) {
                    i9 = 0;
                } else {
                    i9 = 1;
                }
                this.f21349p = i9;
            }
            if (size2 == 0) {
                dismiss();
                w wVar = this.f21356w;
                if (wVar != null) {
                    wVar.c(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f21357x;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f21357x.removeGlobalOnLayoutListener(this.f21343i);
                    }
                    this.f21357x = null;
                }
                this.f21348o.removeOnAttachStateChangeListener(this.j);
                this.f21358y.onDismiss();
                return;
            }
            if (z9) {
                ((e) arrayList.get(0)).f21334b.c(false);
            }
        }
    }

    @Override // o.InterfaceC1657B
    public final void d() {
        if (!a()) {
            ArrayList arrayList = this.f21341g;
            int size = arrayList.size();
            boolean z9 = false;
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                x((l) obj);
            }
            arrayList.clear();
            View view = this.f21347n;
            this.f21348o = view;
            if (view != null) {
                if (this.f21357x == null) {
                    z9 = true;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f21357x = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f21343i);
                }
                this.f21348o.addOnAttachStateChangeListener(this.j);
            }
        }
    }

    @Override // o.InterfaceC1657B
    public final void dismiss() {
        ArrayList arrayList = this.f21342h;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i9 = size - 1; i9 >= 0; i9--) {
                e eVar = eVarArr[i9];
                if (eVar.f21333a.f21795z.isShowing()) {
                    eVar.f21333a.dismiss();
                }
            }
        }
    }

    @Override // o.InterfaceC1657B
    public final C1812o0 e() {
        ArrayList arrayList = this.f21342h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) arrayList.get(arrayList.size() - 1)).f21333a.f21773c;
    }

    @Override // o.x
    public final void f(boolean z9) {
        ArrayList arrayList = this.f21342h;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ListAdapter adapter = ((e) obj).f21333a.f21773c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final void h(w wVar) {
        this.f21356w = wVar;
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
        ArrayList arrayList = this.f21342h;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            e eVar = (e) obj;
            if (subMenuC1659D == eVar.f21334b) {
                eVar.f21333a.f21773c.requestFocus();
                return true;
            }
        }
        if (!subMenuC1659D.hasVisibleItems()) {
            return false;
        }
        n(subMenuC1659D);
        w wVar = this.f21356w;
        if (wVar != null) {
            wVar.m(subMenuC1659D);
        }
        return true;
    }

    @Override // o.t
    public final void n(l lVar) {
        lVar.b(this, this.f21336b);
        if (a()) {
            x(lVar);
        } else {
            this.f21341g.add(lVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.f21342h;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                eVar = (e) arrayList.get(i9);
                if (!eVar.f21333a.f21795z.isShowing()) {
                    break;
                } else {
                    i9++;
                }
            } else {
                eVar = null;
                break;
            }
        }
        if (eVar != null) {
            eVar.f21334b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i9 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // o.t
    public final void p(View view) {
        if (this.f21347n != view) {
            this.f21347n = view;
            this.f21346m = Gravity.getAbsoluteGravity(this.f21345l, view.getLayoutDirection());
        }
    }

    @Override // o.t
    public final void q(boolean z9) {
        this.f21354u = z9;
    }

    @Override // o.t
    public final void r(int i9) {
        if (this.f21345l != i9) {
            this.f21345l = i9;
            this.f21346m = Gravity.getAbsoluteGravity(i9, this.f21347n.getLayoutDirection());
        }
    }

    @Override // o.t
    public final void s(int i9) {
        this.f21350q = true;
        this.f21352s = i9;
    }

    @Override // o.t
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f21358y = (u) onDismissListener;
    }

    @Override // o.t
    public final void u(boolean z9) {
        this.f21355v = z9;
    }

    @Override // o.t
    public final void v(int i9) {
        this.f21351r = true;
        this.f21353t = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.F0, p.A0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(o.l r20) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.x(o.l):void");
    }

    @Override // o.x
    public final void b(Parcelable parcelable) {
    }
}
