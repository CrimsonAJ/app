package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import l1.C1535g;
import p.C1805l;

/* renamed from: n.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598d extends AbstractC1595a implements o.j {

    /* renamed from: c, reason: collision with root package name */
    public Context f20945c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f20946d;

    /* renamed from: e, reason: collision with root package name */
    public O0.c f20947e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f20948f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20949g;

    /* renamed from: h, reason: collision with root package name */
    public o.l f20950h;

    @Override // n.AbstractC1595a
    public final void a() {
        if (this.f20949g) {
            return;
        }
        this.f20949g = true;
        this.f20947e.G(this);
    }

    @Override // n.AbstractC1595a
    public final View b() {
        WeakReference weakReference = this.f20948f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.AbstractC1595a
    public final o.l c() {
        return this.f20950h;
    }

    @Override // n.AbstractC1595a
    public final MenuInflater d() {
        return new h(this.f20946d.getContext());
    }

    @Override // n.AbstractC1595a
    public final CharSequence e() {
        return this.f20946d.getSubtitle();
    }

    @Override // n.AbstractC1595a
    public final CharSequence f() {
        return this.f20946d.getTitle();
    }

    @Override // n.AbstractC1595a
    public final void g() {
        this.f20947e.I(this, this.f20950h);
    }

    @Override // n.AbstractC1595a
    public final boolean h() {
        return this.f20946d.f9390s;
    }

    @Override // n.AbstractC1595a
    public final void i(View view) {
        WeakReference weakReference;
        this.f20946d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f20948f = weakReference;
    }

    @Override // n.AbstractC1595a
    public final void j(int i9) {
        k(this.f20945c.getString(i9));
    }

    @Override // n.AbstractC1595a
    public final void k(CharSequence charSequence) {
        this.f20946d.setSubtitle(charSequence);
    }

    @Override // o.j
    public final boolean l(o.l lVar, MenuItem menuItem) {
        return ((C1535g) this.f20947e.f5263b).w(this, menuItem);
    }

    @Override // n.AbstractC1595a
    public final void m(int i9) {
        n(this.f20945c.getString(i9));
    }

    @Override // n.AbstractC1595a
    public final void n(CharSequence charSequence) {
        this.f20946d.setTitle(charSequence);
    }

    @Override // n.AbstractC1595a
    public final void o(boolean z9) {
        this.f20938b = z9;
        this.f20946d.setTitleOptional(z9);
    }

    @Override // o.j
    public final void u(o.l lVar) {
        g();
        C1805l c1805l = this.f20946d.f9376d;
        if (c1805l != null) {
            c1805l.n();
        }
    }
}
