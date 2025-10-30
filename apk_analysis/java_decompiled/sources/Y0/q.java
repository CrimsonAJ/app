package Y0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class q extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f8561a;

    public q(Drawable.ConstantState constantState) {
        this.f8561a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f8561a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f8561a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        r rVar = new r();
        rVar.f8511a = (VectorDrawable) this.f8561a.newDrawable();
        return rVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        r rVar = new r();
        rVar.f8511a = (VectorDrawable) this.f8561a.newDrawable(resources);
        return rVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        r rVar = new r();
        rVar.f8511a = (VectorDrawable) this.f8561a.newDrawable(resources, theme);
        return rVar;
    }
}
