package Q2;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import co.notix.R;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: Q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0371n implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6286b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0371n(int i9, Object obj) {
        this.f6285a = i9;
        this.f6286b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        int height;
        int i18;
        int height2;
        boolean z9;
        switch (this.f6285a) {
            case 0:
                D d9 = (D) this.f6286b;
                Resources resources = d9.f6054C0;
                int i19 = resources.getConfiguration().orientation;
                PopupWindow popupWindow = d9.f6061I0;
                if (i19 != 1) {
                    popupWindow.setHeight(-1);
                    return;
                } else {
                    popupWindow.setHeight(resources.getDimensionPixelSize(R.dimen.mini_player_height));
                    return;
                }
            case 1:
                I i20 = (I) this.f6286b;
                D d10 = i20.f6131a;
                int width = (d10.getWidth() - d10.getPaddingLeft()) - d10.getPaddingRight();
                int height3 = (d10.getHeight() - d10.getPaddingBottom()) - d10.getPaddingTop();
                ViewGroup viewGroup = i20.f6133c;
                int c3 = I.c(viewGroup);
                boolean z10 = false;
                if (viewGroup != null) {
                    i17 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i17 = 0;
                }
                int i21 = c3 - i17;
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                if (viewGroup != null) {
                    i18 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
                } else {
                    i18 = 0;
                }
                int i22 = height - i18;
                int max = Math.max(i21, I.c(i20.f6140k) + I.c(i20.f6139i));
                ViewGroup viewGroup2 = i20.f6134d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i23 = (height2 * 2) + i22;
                if (width > max && height3 > i23) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (i20.f6128A != z9) {
                    i20.f6128A = z9;
                    view.post(new E(i20, 1));
                }
                if (i11 - i9 != i15 - i13) {
                    z10 = true;
                }
                if (!i20.f6128A && z10) {
                    view.post(new E(i20, 2));
                    return;
                }
                return;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f6286b;
                if (i9 != i13 || i10 != i14 || i11 != i15 || i12 != i16) {
                    view.post(new A6.s(29, carouselLayoutManager));
                    return;
                }
                return;
        }
    }
}
