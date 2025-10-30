package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: o.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SubMenuC1659D extends l implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final n f21313A;

    /* renamed from: z, reason: collision with root package name */
    public final l f21314z;

    public SubMenuC1659D(Context context, l lVar, n nVar) {
        super(context);
        this.f21314z = lVar;
        this.f21313A = nVar;
    }

    @Override // o.l
    public final boolean d(n nVar) {
        return this.f21314z.d(nVar);
    }

    @Override // o.l
    public final boolean e(l lVar, MenuItem menuItem) {
        if (!super.e(lVar, menuItem) && !this.f21314z.e(lVar, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // o.l
    public final boolean f(n nVar) {
        return this.f21314z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f21313A;
    }

    @Override // o.l
    public final String j() {
        int i9;
        n nVar = this.f21313A;
        if (nVar != null) {
            i9 = nVar.f21404a;
        } else {
            i9 = 0;
        }
        if (i9 == 0) {
            return null;
        }
        return AbstractC0953k1.j(i9, "android:menu:actionviewstates:");
    }

    @Override // o.l
    public final l k() {
        return this.f21314z.k();
    }

    @Override // o.l
    public final boolean m() {
        return this.f21314z.m();
    }

    @Override // o.l
    public final boolean n() {
        return this.f21314z.n();
    }

    @Override // o.l
    public final boolean o() {
        return this.f21314z.o();
    }

    @Override // o.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z9) {
        this.f21314z.setGroupDividerEnabled(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f21313A.setIcon(drawable);
        return this;
    }

    @Override // o.l, android.view.Menu
    public final void setQwertyMode(boolean z9) {
        this.f21314z.setQwertyMode(z9);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i9) {
        u(0, null, i9, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i9) {
        u(i9, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i9) {
        this.f21313A.setIcon(i9);
        return this;
    }
}
