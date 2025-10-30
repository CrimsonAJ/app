package o;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f21433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f21434b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21434b = sVar;
        this.f21433a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f21433a.onMenuItemActionCollapse(this.f21434b.k(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f21433a.onMenuItemActionExpand(this.f21434b.k(menuItem));
    }
}
