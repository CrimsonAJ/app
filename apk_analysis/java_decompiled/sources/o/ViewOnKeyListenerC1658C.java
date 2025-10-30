package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import co.notix.R;
import p.C1733A0;
import p.C1743F0;
import p.C1812o0;

/* renamed from: o.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1658C extends t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f21295b;

    /* renamed from: c, reason: collision with root package name */
    public final l f21296c;

    /* renamed from: d, reason: collision with root package name */
    public final i f21297d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21298e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21299f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21300g;

    /* renamed from: h, reason: collision with root package name */
    public final C1743F0 f21301h;

    /* renamed from: k, reason: collision with root package name */
    public u f21303k;

    /* renamed from: l, reason: collision with root package name */
    public View f21304l;

    /* renamed from: m, reason: collision with root package name */
    public View f21305m;

    /* renamed from: n, reason: collision with root package name */
    public w f21306n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f21307o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21308p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21309q;

    /* renamed from: r, reason: collision with root package name */
    public int f21310r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21312t;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC1663d f21302i = new ViewTreeObserverOnGlobalLayoutListenerC1663d(1, this);
    public final K5.o j = new K5.o(3, this);

    /* renamed from: s, reason: collision with root package name */
    public int f21311s = 0;

    /* JADX WARN: Type inference failed for: r6v1, types: [p.F0, p.A0] */
    public ViewOnKeyListenerC1658C(int i9, Context context, View view, l lVar, boolean z9) {
        this.f21295b = context;
        this.f21296c = lVar;
        this.f21298e = z9;
        this.f21297d = new i(lVar, LayoutInflater.from(context), z9, R.layout.abc_popup_menu_item_layout);
        this.f21300g = i9;
        Resources resources = context.getResources();
        this.f21299f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f21304l = view;
        this.f21301h = new C1733A0(context, null, i9);
        lVar.b(this, context);
    }

    @Override // o.InterfaceC1657B
    public final boolean a() {
        if (!this.f21308p && this.f21301h.f21795z.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // o.x
    public final void c(l lVar, boolean z9) {
        if (lVar == this.f21296c) {
            dismiss();
            w wVar = this.f21306n;
            if (wVar != null) {
                wVar.c(lVar, z9);
            }
        }
    }

    @Override // o.InterfaceC1657B
    public final void d() {
        View view;
        boolean z9;
        Rect rect;
        if (a()) {
            return;
        }
        if (!this.f21308p && (view = this.f21304l) != null) {
            this.f21305m = view;
            C1743F0 c1743f0 = this.f21301h;
            c1743f0.f21795z.setOnDismissListener(this);
            c1743f0.f21785p = this;
            c1743f0.f21794y = true;
            c1743f0.f21795z.setFocusable(true);
            View view2 = this.f21305m;
            if (this.f21307o == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f21307o = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f21302i);
            }
            view2.addOnAttachStateChangeListener(this.j);
            c1743f0.f21784o = view2;
            c1743f0.f21781l = this.f21311s;
            boolean z10 = this.f21309q;
            Context context = this.f21295b;
            i iVar = this.f21297d;
            if (!z10) {
                this.f21310r = t.o(iVar, context, this.f21299f);
                this.f21309q = true;
            }
            c1743f0.r(this.f21310r);
            c1743f0.f21795z.setInputMethodMode(2);
            Rect rect2 = this.f21439a;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            c1743f0.f21793x = rect;
            c1743f0.d();
            C1812o0 c1812o0 = c1743f0.f21773c;
            c1812o0.setOnKeyListener(this);
            if (this.f21312t) {
                l lVar = this.f21296c;
                if (lVar.f21386m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1812o0, false);
                    TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                    if (textView != null) {
                        textView.setText(lVar.f21386m);
                    }
                    frameLayout.setEnabled(false);
                    c1812o0.addHeaderView(frameLayout, null, false);
                }
            }
            c1743f0.p(iVar);
            c1743f0.d();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // o.InterfaceC1657B
    public final void dismiss() {
        if (a()) {
            this.f21301h.dismiss();
        }
    }

    @Override // o.InterfaceC1657B
    public final C1812o0 e() {
        return this.f21301h.f21773c;
    }

    @Override // o.x
    public final void f(boolean z9) {
        this.f21309q = false;
        i iVar = this.f21297d;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final void h(w wVar) {
        this.f21306n = wVar;
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
        if (subMenuC1659D.hasVisibleItems()) {
            View view = this.f21305m;
            v vVar = new v(this.f21300g, this.f21295b, view, subMenuC1659D, this.f21298e);
            w wVar = this.f21306n;
            vVar.f21448h = wVar;
            t tVar = vVar.f21449i;
            if (tVar != null) {
                tVar.h(wVar);
            }
            boolean w7 = t.w(subMenuC1659D);
            vVar.f21447g = w7;
            t tVar2 = vVar.f21449i;
            if (tVar2 != null) {
                tVar2.q(w7);
            }
            vVar.j = this.f21303k;
            this.f21303k = null;
            this.f21296c.c(false);
            C1743F0 c1743f0 = this.f21301h;
            int i9 = c1743f0.f21776f;
            int m9 = c1743f0.m();
            if ((Gravity.getAbsoluteGravity(this.f21311s, this.f21304l.getLayoutDirection()) & 7) == 5) {
                i9 += this.f21304l.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.f21445e != null) {
                    vVar.d(i9, m9, true, true);
                }
            }
            w wVar2 = this.f21306n;
            if (wVar2 != null) {
                wVar2.m(subMenuC1659D);
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f21308p = true;
        this.f21296c.c(true);
        ViewTreeObserver viewTreeObserver = this.f21307o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f21307o = this.f21305m.getViewTreeObserver();
            }
            this.f21307o.removeGlobalOnLayoutListener(this.f21302i);
            this.f21307o = null;
        }
        this.f21305m.removeOnAttachStateChangeListener(this.j);
        u uVar = this.f21303k;
        if (uVar != null) {
            uVar.onDismiss();
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
        this.f21304l = view;
    }

    @Override // o.t
    public final void q(boolean z9) {
        this.f21297d.f21370c = z9;
    }

    @Override // o.t
    public final void r(int i9) {
        this.f21311s = i9;
    }

    @Override // o.t
    public final void s(int i9) {
        this.f21301h.f21776f = i9;
    }

    @Override // o.t
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f21303k = (u) onDismissListener;
    }

    @Override // o.t
    public final void u(boolean z9) {
        this.f21312t = z9;
    }

    @Override // o.t
    public final void v(int i9) {
        this.f21301h.i(i9);
    }

    @Override // o.x
    public final void b(Parcelable parcelable) {
    }

    @Override // o.t
    public final void n(l lVar) {
    }
}
