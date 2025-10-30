package V0;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f7615b;

    public /* synthetic */ g(SwipeRefreshLayout swipeRefreshLayout, int i9) {
        this.f7614a = i9;
        this.f7615b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f9, Transformation transformation) {
        switch (this.f7614a) {
            case 0:
                this.f7615b.setAnimationProgress(f9);
                return;
            case 1:
                this.f7615b.setAnimationProgress(1.0f - f9);
                return;
            case 2:
                SwipeRefreshLayout swipeRefreshLayout = this.f7615b;
                int abs = swipeRefreshLayout.f10388x - Math.abs(swipeRefreshLayout.f10387w);
                swipeRefreshLayout.setTargetOffsetTopAndBottom((swipeRefreshLayout.f10386v + ((int) ((abs - r1) * f9))) - swipeRefreshLayout.f10384t.getTop());
                e eVar = swipeRefreshLayout.f10390z;
                float f10 = 1.0f - f9;
                d dVar = eVar.f7606a;
                if (f10 != dVar.f7597p) {
                    dVar.f7597p = f10;
                }
                eVar.invalidateSelf();
                return;
            default:
                this.f7615b.k(f9);
                return;
        }
    }
}
