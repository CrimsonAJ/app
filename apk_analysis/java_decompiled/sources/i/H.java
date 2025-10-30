package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l1.C1535g;
import n.AbstractC1595a;
import p.C1805l;

/* loaded from: classes.dex */
public final class H extends AbstractC1595a implements o.j {

    /* renamed from: c, reason: collision with root package name */
    public final Context f17991c;

    /* renamed from: d, reason: collision with root package name */
    public final o.l f17992d;

    /* renamed from: e, reason: collision with root package name */
    public O0.c f17993e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f17994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ I f17995g;

    public H(I i9, Context context, O0.c cVar) {
        this.f17995g = i9;
        this.f17991c = context;
        this.f17993e = cVar;
        o.l lVar = new o.l(context);
        lVar.f21385l = 1;
        this.f17992d = lVar;
        lVar.f21379e = this;
    }

    @Override // n.AbstractC1595a
    public final void a() {
        I i9 = this.f17995g;
        if (i9.f18009o != this) {
            return;
        }
        if (i9.f18016v) {
            i9.f18010p = this;
            i9.f18011q = this.f17993e;
        } else {
            this.f17993e.G(this);
        }
        this.f17993e = null;
        i9.C(false);
        ActionBarContextView actionBarContextView = i9.f18006l;
        if (actionBarContextView.f9382k == null) {
            actionBarContextView.e();
        }
        i9.f18004i.setHideOnContentScrollEnabled(i9.f17998A);
        i9.f18009o = null;
    }

    @Override // n.AbstractC1595a
    public final View b() {
        WeakReference weakReference = this.f17994f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.AbstractC1595a
    public final o.l c() {
        return this.f17992d;
    }

    @Override // n.AbstractC1595a
    public final MenuInflater d() {
        return new n.h(this.f17991c);
    }

    @Override // n.AbstractC1595a
    public final CharSequence e() {
        return this.f17995g.f18006l.getSubtitle();
    }

    @Override // n.AbstractC1595a
    public final CharSequence f() {
        return this.f17995g.f18006l.getTitle();
    }

    @Override // n.AbstractC1595a
    public final void g() {
        if (this.f17995g.f18009o != this) {
            return;
        }
        o.l lVar = this.f17992d;
        lVar.w();
        try {
            this.f17993e.I(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // n.AbstractC1595a
    public final boolean h() {
        return this.f17995g.f18006l.f9390s;
    }

    @Override // n.AbstractC1595a
    public final void i(View view) {
        this.f17995g.f18006l.setCustomView(view);
        this.f17994f = new WeakReference(view);
    }

    @Override // n.AbstractC1595a
    public final void j(int i9) {
        k(this.f17995g.f18002g.getResources().getString(i9));
    }

    @Override // n.AbstractC1595a
    public final void k(CharSequence charSequence) {
        this.f17995g.f18006l.setSubtitle(charSequence);
    }

    @Override // o.j
    public final boolean l(o.l lVar, MenuItem menuItem) {
        O0.c cVar = this.f17993e;
        if (cVar != null) {
            return ((C1535g) cVar.f5263b).w(this, menuItem);
        }
        return false;
    }

    @Override // n.AbstractC1595a
    public final void m(int i9) {
        n(this.f17995g.f18002g.getResources().getString(i9));
    }

    @Override // n.AbstractC1595a
    public final void n(CharSequence charSequence) {
        this.f17995g.f18006l.setTitle(charSequence);
    }

    @Override // n.AbstractC1595a
    public final void o(boolean z9) {
        this.f20938b = z9;
        this.f17995g.f18006l.setTitleOptional(z9);
    }

    @Override // o.j
    public final void u(o.l lVar) {
        if (this.f17993e != null) {
            g();
            C1805l c1805l = this.f17995g.f18006l.f9376d;
            if (c1805l != null) {
                c1805l.n();
            }
        }
    }
}
