package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import co.notix.R;
import p.AbstractC1761O0;
import p.C1831y;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C1831y f9446a;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1761O0.a(this, getContext());
        C1831y c1831y = new C1831y(this);
        this.f9446a = c1831y;
        c1831y.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Bitmap bitmap = (Bitmap) this.f9446a.f22094c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i9, 0), getMeasuredHeight());
        }
    }
}
