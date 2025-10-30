package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class n extends View {
    public n(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i9) {
        C2225e c2225e = (C2225e) getLayoutParams();
        c2225e.f25219a = i9;
        setLayoutParams(c2225e);
    }

    public void setGuidelineEnd(int i9) {
        C2225e c2225e = (C2225e) getLayoutParams();
        c2225e.f25221b = i9;
        setLayoutParams(c2225e);
    }

    public void setGuidelinePercent(float f9) {
        C2225e c2225e = (C2225e) getLayoutParams();
        c2225e.f25223c = f9;
        setLayoutParams(c2225e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
    }
}
