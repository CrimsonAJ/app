package B5;

import android.R;
import android.content.res.ColorStateList;
import p.C1833z;
import s8.n;

/* loaded from: classes.dex */
public final class a extends C1833z {

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f734g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f736f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f735e == null) {
            int r5 = n.r(this, co.notix.R.attr.colorControlActivated);
            int r7 = n.r(this, co.notix.R.attr.colorOnSurface);
            int r9 = n.r(this, co.notix.R.attr.colorSurface);
            this.f735e = new ColorStateList(f734g, new int[]{n.t(r9, 1.0f, r5), n.t(r9, 0.54f, r7), n.t(r9, 0.38f, r7), n.t(r9, 0.38f, r7)});
        }
        return this.f735e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f736f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f736f = z9;
        if (z9) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
