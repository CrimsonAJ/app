package y5;

import P.Q;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import co.notix.R;
import h5.AbstractC1281a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h extends AbstractC2217a {

    /* renamed from: g, reason: collision with root package name */
    public final float f25019g;

    /* renamed from: h, reason: collision with root package name */
    public final float f25020h;

    /* renamed from: i, reason: collision with root package name */
    public final float f25021i;

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f25019g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f25020h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f25021i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f9, boolean z9, int i9) {
        boolean z10;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float interpolation = this.f25005a.getInterpolation(f9);
        WeakHashMap weakHashMap = Q.f5546a;
        View view = this.f25006b;
        if ((Gravity.getAbsoluteGravity(i9, view.getLayoutDirection()) & 3) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float f13 = width;
        if (f13 > 0.0f) {
            float f14 = height;
            if (f14 > 0.0f) {
                float f15 = this.f25019g / f13;
                float f16 = this.f25020h / f13;
                float f17 = this.f25021i / f14;
                if (z10) {
                    f13 = 0.0f;
                }
                view.setPivotX(f13);
                if (!z11) {
                    f16 = -f15;
                }
                float a5 = AbstractC1281a.a(0.0f, f16, interpolation);
                float f18 = a5 + 1.0f;
                view.setScaleX(f18);
                float a9 = 1.0f - AbstractC1281a.a(0.0f, f17, interpolation);
                view.setScaleY(a9);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (z10) {
                            f10 = childAt.getWidth() + (width - childAt.getRight());
                        } else {
                            f10 = -childAt.getLeft();
                        }
                        childAt.setPivotX(f10);
                        childAt.setPivotY(-childAt.getTop());
                        if (z11) {
                            f11 = 1.0f - a5;
                        } else {
                            f11 = 1.0f;
                        }
                        if (a9 != 0.0f) {
                            f12 = (f18 / a9) * f11;
                        } else {
                            f12 = 1.0f;
                        }
                        childAt.setScaleX(f11);
                        childAt.setScaleY(f12);
                    }
                }
            }
        }
    }
}
