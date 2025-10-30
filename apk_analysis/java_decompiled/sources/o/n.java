package o;

import a.AbstractC0485a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n implements J.a {

    /* renamed from: A, reason: collision with root package name */
    public o f21401A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f21402B;

    /* renamed from: a, reason: collision with root package name */
    public final int f21404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21406c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21407d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f21408e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f21409f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f21410g;

    /* renamed from: h, reason: collision with root package name */
    public char f21411h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f21414l;

    /* renamed from: n, reason: collision with root package name */
    public final l f21416n;

    /* renamed from: o, reason: collision with root package name */
    public SubMenuC1659D f21417o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f21418p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f21419q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f21420r;

    /* renamed from: y, reason: collision with root package name */
    public int f21427y;

    /* renamed from: z, reason: collision with root package name */
    public View f21428z;

    /* renamed from: i, reason: collision with root package name */
    public int f21412i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f21413k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f21415m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f21421s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f21422t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21423u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21424v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21425w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f21426x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f21403C = false;

    public n(l lVar, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f21416n = lVar;
        this.f21404a = i10;
        this.f21405b = i9;
        this.f21406c = i11;
        this.f21407d = i12;
        this.f21408e = charSequence;
        this.f21427y = i13;
    }

    public static void c(StringBuilder sb, int i9, int i10, String str) {
        if ((i9 & i10) == i10) {
            sb.append(str);
        }
    }

    @Override // J.a
    public final o a() {
        return this.f21401A;
    }

    @Override // J.a
    public final J.a b(o oVar) {
        this.f21428z = null;
        this.f21401A = oVar;
        this.f21416n.p(true);
        o oVar2 = this.f21401A;
        if (oVar2 != null) {
            oVar2.f21429a = new com.google.firebase.messaging.u(this);
            oVar2.f21430b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f21427y & 8) == 0) {
            return false;
        }
        if (this.f21428z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f21402B;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f21416n.d(this);
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f21425w && (this.f21423u || this.f21424v)) {
            drawable = drawable.mutate();
            if (this.f21423u) {
                drawable.setTintList(this.f21421s);
            }
            if (this.f21424v) {
                drawable.setTintMode(this.f21422t);
            }
            this.f21425w = false;
        }
        return drawable;
    }

    public final boolean e() {
        o oVar;
        if ((this.f21427y & 8) != 0) {
            if (this.f21428z == null && (oVar = this.f21401A) != null) {
                this.f21428z = oVar.f21430b.onCreateActionView(this);
            }
            if (this.f21428z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f21402B;
            if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
                return false;
            }
            return this.f21416n.f(this);
        }
        return false;
    }

    public final void f(boolean z9) {
        int i9;
        int i10 = this.f21426x & (-5);
        if (z9) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        this.f21426x = i9 | i10;
    }

    public final void g(boolean z9) {
        if (z9) {
            this.f21426x |= 32;
        } else {
            this.f21426x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f21428z;
        if (view != null) {
            return view;
        }
        o oVar = this.f21401A;
        if (oVar != null) {
            View onCreateActionView = oVar.f21430b.onCreateActionView(this);
            this.f21428z = onCreateActionView;
            return onCreateActionView;
        }
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f21413k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f21419q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f21405b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f21414l;
        if (drawable != null) {
            return d(drawable);
        }
        int i9 = this.f21415m;
        if (i9 != 0) {
            Drawable q9 = AbstractC0485a.q(this.f21416n.f21375a, i9);
            this.f21415m = 0;
            this.f21414l = q9;
            return d(q9);
        }
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f21421s;
    }

    @Override // J.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f21422t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f21410g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f21404a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f21412i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f21411h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f21406c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f21417o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f21408e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21409f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f21408e;
    }

    @Override // J.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f21420r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f21417o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f21403C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f21426x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f21426x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f21426x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.f21401A;
        if (oVar != null && oVar.f21430b.overridesItemVisibility()) {
            if ((this.f21426x & 8) != 0 || !this.f21401A.f21430b.isVisible()) {
                return false;
            }
            return true;
        }
        if ((this.f21426x & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i9;
        this.f21428z = view;
        this.f21401A = null;
        if (view != null && view.getId() == -1 && (i9 = this.f21404a) > 0) {
            view.setId(i9);
        }
        l lVar = this.f21416n;
        lVar.f21384k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.j == c3) {
            return this;
        }
        this.j = Character.toLowerCase(c3);
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z9) {
        int i9 = this.f21426x;
        int i10 = (z9 ? 1 : 0) | (i9 & (-2));
        this.f21426x = i10;
        if (i9 != i10) {
            this.f21416n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z9) {
        boolean z10;
        int i9;
        int i10 = this.f21426x;
        int i11 = 2;
        if ((i10 & 4) != 0) {
            l lVar = this.f21416n;
            lVar.getClass();
            ArrayList arrayList = lVar.f21380f;
            int size = arrayList.size();
            lVar.w();
            for (int i12 = 0; i12 < size; i12++) {
                n nVar = (n) arrayList.get(i12);
                if (nVar.f21405b == this.f21405b && (nVar.f21426x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i13 = nVar.f21426x;
                    int i14 = i13 & (-3);
                    if (z10) {
                        i9 = 2;
                    } else {
                        i9 = 0;
                    }
                    int i15 = i9 | i14;
                    nVar.f21426x = i15;
                    if (i13 != i15) {
                        nVar.f21416n.p(false);
                    }
                }
            }
            lVar.v();
            return this;
        }
        int i16 = i10 & (-3);
        if (!z9) {
            i11 = 0;
        }
        int i17 = i16 | i11;
        this.f21426x = i17;
        if (i10 != i17) {
            this.f21416n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f21426x |= 16;
        } else {
            this.f21426x &= -17;
        }
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f21415m = 0;
        this.f21414l = drawable;
        this.f21425w = true;
        this.f21416n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21421s = colorStateList;
        this.f21423u = true;
        this.f21425w = true;
        this.f21416n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21422t = mode;
        this.f21424v = true;
        this.f21425w = true;
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f21410g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f21411h == c3) {
            return this;
        }
        this.f21411h = c3;
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f21402B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21418p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9) {
        this.f21411h = c3;
        this.j = Character.toLowerCase(c9);
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i9) {
        int i10 = i9 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f21427y = i9;
        l lVar = this.f21416n;
        lVar.f21384k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i9) {
        setShowAsAction(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f21408e = charSequence;
        this.f21416n.p(false);
        SubMenuC1659D subMenuC1659D = this.f21417o;
        if (subMenuC1659D != null) {
            subMenuC1659D.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21409f = charSequence;
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z9) {
        int i9;
        int i10 = this.f21426x;
        int i11 = i10 & (-9);
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        int i12 = i9 | i11;
        this.f21426x = i12;
        if (i10 != i12) {
            l lVar = this.f21416n;
            lVar.f21382h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f21408e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setContentDescription(CharSequence charSequence) {
        this.f21419q = charSequence;
        this.f21416n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final J.a setTooltipText(CharSequence charSequence) {
        this.f21420r = charSequence;
        this.f21416n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i9) {
        if (this.j == c3 && this.f21413k == i9) {
            return this;
        }
        this.j = Character.toLowerCase(c3);
        this.f21413k = KeyEvent.normalizeMetaState(i9);
        this.f21416n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i9) {
        if (this.f21411h == c3 && this.f21412i == i9) {
            return this;
        }
        this.f21411h = c3;
        this.f21412i = KeyEvent.normalizeMetaState(i9);
        this.f21416n.p(false);
        return this;
    }

    @Override // J.a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c9, int i9, int i10) {
        this.f21411h = c3;
        this.f21412i = KeyEvent.normalizeMetaState(i9);
        this.j = Character.toLowerCase(c9);
        this.f21413k = KeyEvent.normalizeMetaState(i10);
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i9) {
        this.f21414l = null;
        this.f21415m = i9;
        this.f21425w = true;
        this.f21416n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i9) {
        setTitle(this.f21416n.f21375a.getString(i9));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i9) {
        int i10;
        Context context = this.f21416n.f21375a;
        View inflate = LayoutInflater.from(context).inflate(i9, (ViewGroup) new LinearLayout(context), false);
        this.f21428z = inflate;
        this.f21401A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f21404a) > 0) {
            inflate.setId(i10);
        }
        l lVar = this.f21416n;
        lVar.f21384k = true;
        lVar.p(true);
        return this;
    }
}
