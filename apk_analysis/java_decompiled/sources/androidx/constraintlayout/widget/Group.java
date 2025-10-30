package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import z.AbstractC2223c;
import z.C2225e;

/* loaded from: classes.dex */
public class Group extends AbstractC2223c {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // z.AbstractC2223c
    public final void g() {
        C2225e c2225e = (C2225e) getLayoutParams();
        c2225e.f25239k0.y(0);
        c2225e.f25239k0.v(0);
    }

    @Override // z.AbstractC2223c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        c();
    }
}
