package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import co.notix.R;

/* renamed from: p.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1734B extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C1736C f21796a;

    public C1734B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1761O0.a(this, getContext());
        C1736C c1736c = new C1736C(this);
        this.f21796a = c1736c;
        c1736c.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1736C c1736c = this.f21796a;
        Drawable drawable = c1736c.f21798f;
        if (drawable != null && drawable.isStateful()) {
            C1734B c1734b = c1736c.f21797e;
            if (drawable.setState(c1734b.getDrawableState())) {
                c1734b.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21796a.f21798f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f21796a.g(canvas);
    }
}
