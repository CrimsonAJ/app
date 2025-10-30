package F0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class L extends G {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2044q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2045r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(Object obj, Context context, int i9) {
        super(context);
        this.f2044q = i9;
        this.f2045r = obj;
    }

    @Override // F0.G
    public int b(View view, int i9) {
        switch (this.f2044q) {
            case 1:
                ((CarouselLayoutManager) this.f2045r).getClass();
                return 0;
            default:
                return super.b(view, i9);
        }
    }

    @Override // F0.G
    public int c(View view, int i9) {
        switch (this.f2044q) {
            case 1:
                ((CarouselLayoutManager) this.f2045r).getClass();
                return 0;
            default:
                return super.c(view, i9);
        }
    }

    @Override // F0.G
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f2044q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // F0.G
    public int e(int i9) {
        switch (this.f2044q) {
            case 0:
                return Math.min(100, super.e(i9));
            default:
                return super.e(i9);
        }
    }

    @Override // F0.G
    public PointF f(int i9) {
        switch (this.f2044q) {
            case 1:
                ((CarouselLayoutManager) this.f2045r).getClass();
                return null;
            default:
                return super.f(i9);
        }
    }

    @Override // F0.G
    public void h(View view, l0 l0Var) {
        switch (this.f2044q) {
            case 0:
                M m9 = (M) this.f2045r;
                int[] b9 = m9.b(m9.f2046a.getLayoutManager(), view);
                int i9 = b9[0];
                int i10 = b9[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i9), Math.abs(i10))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.j;
                    l0Var.f2146a = i9;
                    l0Var.f2147b = i10;
                    l0Var.f2148c = ceil;
                    l0Var.f2150e = decelerateInterpolator;
                    l0Var.f2151f = true;
                    return;
                }
                return;
            default:
                super.h(view, l0Var);
                return;
        }
    }
}
