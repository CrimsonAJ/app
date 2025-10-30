package T2;

import Q2.AbstractC0364g;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class d extends AbstractC0364g {

    /* renamed from: A0, reason: collision with root package name */
    public int f7061A0;

    /* renamed from: v0, reason: collision with root package name */
    public a f7062v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f7063w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f7064x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f7065y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f7066z0;

    public int getMax() {
        return this.f7064x0;
    }

    public int getProgress() {
        return this.f7063w0;
    }

    public int getScrubberColor() {
        return this.f7065y0;
    }

    public int getThumbOffset() {
        return this.f7061A0;
    }

    @Override // Q2.AbstractC0364g, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        a aVar = this.f7062v0;
        if (!aVar.f7056g && !isInEditMode()) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int i13 = this.f7066z0;
            FrameLayout frameLayout = null;
            if (i13 != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i14);
                    if (childAt.getId() == i13 && (childAt instanceof FrameLayout)) {
                        frameLayout = (FrameLayout) childAt;
                        break;
                    }
                    i14++;
                }
            }
            if (frameLayout != null) {
                aVar.f7050a = frameLayout;
                frameLayout.setVisibility(4);
                aVar.f7056g = true;
            }
        }
    }

    public void setAutoHidePreview(boolean z9) {
        this.f7062v0.j = z9;
    }

    @Override // Q2.AbstractC0364g
    public void setDuration(long j) {
        super.setDuration(j);
        int i9 = (int) j;
        if (i9 != this.f7064x0) {
            this.f7064x0 = i9;
            a aVar = this.f7062v0;
            int progress = getProgress();
            if (aVar.f7055f && !aVar.f7059k) {
                aVar.a(progress, false);
            }
        }
    }

    @Override // Q2.AbstractC0364g
    public void setPosition(long j) {
        super.setPosition(j);
        int i9 = (int) j;
        if (i9 != this.f7063w0) {
            this.f7063w0 = i9;
            a aVar = this.f7062v0;
            if (aVar.f7055f && !aVar.f7059k) {
                aVar.a(i9, false);
            }
        }
    }

    public void setPreviewAnimationEnabled(boolean z9) {
        this.f7062v0.f7058i = z9;
    }

    public void setPreviewAnimator(U2.a aVar) {
        this.f7062v0.f7051b = aVar;
    }

    public void setPreviewEnabled(boolean z9) {
        this.f7062v0.f7057h = z9;
    }

    public void setPreviewLoader(b bVar) {
        this.f7062v0.getClass();
    }

    public void setPreviewThumbTint(int i9) {
        setScrubberColor(i9);
        this.f7065y0 = i9;
    }

    public void setPreviewThumbTintResource(int i9) {
        setPreviewThumbTint(getContext().getColor(i9));
    }

    @Override // Q2.AbstractC0364g
    public void setScrubberColor(int i9) {
        super.setScrubberColor(i9);
        this.f7065y0 = i9;
    }
}
