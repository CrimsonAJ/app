package z;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import x.C2152g;

/* loaded from: classes.dex */
public abstract class q extends AbstractC2223c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f25360g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25361h;

    @Override // z.AbstractC2223c
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f25352b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 6) {
                    this.f25360g = true;
                } else if (index == 13) {
                    this.f25361h = true;
                }
            }
        }
    }

    public abstract void i(C2152g c2152g, int i9, int i10);

    @Override // z.AbstractC2223c, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f25360g || this.f25361h) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i9 = 0; i9 < this.f25189b; i9++) {
                View view = (View) constraintLayout.f9528a.get(this.f25188a[i9]);
                if (view != null) {
                    if (this.f25360g) {
                        view.setVisibility(visibility);
                    }
                    if (this.f25361h && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
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
