package J5;

import P.Q;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import w5.p;

/* loaded from: classes.dex */
public final class e extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4195c = 0;

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f4196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout f4197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TabLayout tabLayout, Context context) {
        super(context);
        this.f4197b = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i9) {
        TabLayout tabLayout = this.f4197b;
        if (tabLayout.f16154o0 != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i9);
        Q6.f fVar = tabLayout.f16144j0;
        Drawable drawable = tabLayout.f16153o;
        fVar.getClass();
        RectF j = Q6.f.j(tabLayout, childAt);
        drawable.setBounds((int) j.left, drawable.getBounds().top, (int) j.right, drawable.getBounds().bottom);
        tabLayout.f16131a = i9;
    }

    public final void b(int i9) {
        TabLayout tabLayout = this.f4197b;
        Rect bounds = tabLayout.f16153o.getBounds();
        tabLayout.f16153o.setBounds(bounds.left, 0, bounds.right, i9);
        requestLayout();
    }

    public final void c(View view, View view2, float f9) {
        TabLayout tabLayout = this.f4197b;
        if (view != null && view.getWidth() > 0) {
            tabLayout.f16144j0.v(tabLayout, view, view2, f9, tabLayout.f16153o);
        } else {
            Drawable drawable = tabLayout.f16153o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f16153o.getBounds().bottom);
        }
        WeakHashMap weakHashMap = Q.f5546a;
        postInvalidateOnAnimation();
    }

    public final void d(int i9, int i10, boolean z9) {
        TabLayout tabLayout = this.f4197b;
        if (tabLayout.f16131a == i9) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i9);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f16131a = i9;
        d dVar = new d(this, childAt, childAt2);
        if (z9) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f4196a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.f16146k0);
            valueAnimator.setDuration(i10);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(dVar);
            valueAnimator.start();
            return;
        }
        this.f4196a.removeAllUpdateListeners();
        this.f4196a.addUpdateListener(dVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f4197b;
        int height2 = tabLayout.f16153o.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f16153o.getIntrinsicHeight();
        }
        int i9 = tabLayout.f16128B;
        if (i9 != 0) {
            if (i9 != 1) {
                height = 0;
                if (i9 != 2) {
                    if (i9 != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (tabLayout.f16153o.getBounds().width() > 0) {
            Rect bounds = tabLayout.f16153o.getBounds();
            tabLayout.f16153o.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f16153o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        ValueAnimator valueAnimator = this.f4196a;
        TabLayout tabLayout = this.f4197b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f16131a == -1) {
            tabLayout.f16131a = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f16131a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (View.MeasureSpec.getMode(i9) == 1073741824) {
            TabLayout tabLayout = this.f4197b;
            boolean z9 = true;
            if (tabLayout.f16166z == 1 || tabLayout.f16129C == 2) {
                int childCount = getChildCount();
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        i11 = Math.max(i11, childAt.getMeasuredWidth());
                    }
                }
                if (i11 > 0) {
                    if (i11 * childCount <= getMeasuredWidth() - (((int) p.e(getContext(), 16)) * 2)) {
                        boolean z10 = false;
                        for (int i13 = 0; i13 < childCount; i13++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                            if (layoutParams.width != i11 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i11;
                                layoutParams.weight = 0.0f;
                                z10 = true;
                            }
                        }
                        z9 = z10;
                    } else {
                        tabLayout.f16166z = 0;
                        tabLayout.m(false);
                    }
                    if (z9) {
                        super.onMeasure(i9, i10);
                    }
                }
            }
        }
    }
}
