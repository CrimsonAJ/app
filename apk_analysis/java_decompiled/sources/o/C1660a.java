package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1660a implements J.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f21315a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f21316b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f21317c;

    /* renamed from: d, reason: collision with root package name */
    public char f21318d;

    /* renamed from: e, reason: collision with root package name */
    public int f21319e;

    /* renamed from: f, reason: collision with root package name */
    public char f21320f;

    /* renamed from: g, reason: collision with root package name */
    public int f21321g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f21322h;

    /* renamed from: i, reason: collision with root package name */
    public Context f21323i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f21324k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f21325l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f21326m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21327n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21328o;

    /* renamed from: p, reason: collision with root package name */
    public int f21329p;

    @Override // J.a
    public final o a() {
        return null;
    }

    @Override // J.a
    public final J.a b(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f21322h;
        if (drawable != null) {
            if (this.f21327n || this.f21328o) {
                this.f21322h = drawable;
                Drawable mutate = drawable.mutate();
                this.f21322h = mutate;
                if (this.f21327n) {
                    mutate.setTintList(this.f21325l);
                }
                if (this.f21328o) {
                    this.f21322h.setTintMode(this.f21326m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21321g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f21320f;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f21322h;
    }

    @Override // J.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21325l;
    }

    @Override // J.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21326m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21317c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21319e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21318d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f21315a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21316b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f21315a;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21324k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f21329p & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f21329p & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f21329p & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f21329p & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f21320f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        this.f21329p = (z9 ? 1 : 0) | (this.f21329p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        int i9;
        int i10 = this.f21329p & (-3);
        if (z9) {
            i9 = 2;
        } else {
            i9 = 0;
        }
        this.f21329p = i9 | i10;
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        int i9;
        int i10 = this.f21329p & (-17);
        if (z9) {
            i9 = 16;
        } else {
            i9 = 0;
        }
        this.f21329p = i9 | i10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f21322h = drawable;
        c();
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21325l = colorStateList;
        this.f21327n = true;
        c();
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21326m = mode;
        this.f21328o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21317c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f21318d = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9) {
        this.f21318d = c3;
        this.f21320f = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21315a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21316b = charSequence;
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setTooltipText(CharSequence charSequence) {
        this.f21324k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        int i9 = 8;
        int i10 = this.f21329p & 8;
        if (z9) {
            i9 = 0;
        }
        this.f21329p = i10 | i9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i9) {
        this.f21320f = Character.toLowerCase(c3);
        this.f21321g = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i9) {
        this.f21318d = c3;
        this.f21319e = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i9) {
        this.f21315a = this.f21323i.getResources().getString(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f21324k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i9) {
        this.f21322h = this.f21323i.getDrawable(i9);
        c();
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9, int i9, int i10) {
        this.f21318d = c3;
        this.f21319e = KeyEvent.normalizeMetaState(i9);
        this.f21320f = Character.toLowerCase(c9);
        this.f21321g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i9) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i9) {
        return this;
    }
}
