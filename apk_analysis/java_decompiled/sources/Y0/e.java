package Y0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f8502a;

    public e(Drawable.ConstantState constantState) {
        this.f8502a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f8502a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f8502a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f8502a.newDrawable();
        fVar.f8511a = newDrawable;
        newDrawable.setCallback(fVar.f8508f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f8502a.newDrawable(resources);
        fVar.f8511a = newDrawable;
        newDrawable.setCallback(fVar.f8508f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f8502a.newDrawable(resources, theme);
        fVar.f8511a = newDrawable;
        newDrawable.setCallback(fVar.f8508f);
        return fVar;
    }
}
