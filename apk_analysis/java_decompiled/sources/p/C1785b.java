package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f21947a;

    public C1785b(ActionBarContainer actionBarContainer) {
        this.f21947a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f21947a;
        if (actionBarContainer.f9370g) {
            Drawable drawable = actionBarContainer.f9369f;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f9367d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f9368e;
        if (drawable3 != null && actionBarContainer.f9371h) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f21947a;
        if (actionBarContainer.f9370g) {
            if (actionBarContainer.f9369f != null) {
                actionBarContainer.f9367d.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f9367d;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
