package Y0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import s.C1935e;

/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public r f8498a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f8499b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8500c;

    /* renamed from: d, reason: collision with root package name */
    public C1935e f8501d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
