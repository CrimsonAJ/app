package o;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f21435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f21436b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21436b = sVar;
        this.f21435a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f21435a.onMenuItemClick(this.f21436b.k(menuItem));
    }
}
