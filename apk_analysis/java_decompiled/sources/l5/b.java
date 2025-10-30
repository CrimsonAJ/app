package l5;

import P.Q;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import co.notix.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.l;
import z5.e;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: i0, reason: collision with root package name */
    public final int f20566i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int f20567j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int f20568k0;

    /* renamed from: l0, reason: collision with root package name */
    public final int f20569l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f20570m0;

    /* renamed from: n0, reason: collision with root package name */
    public final ArrayList f20571n0;

    public b(Context context) {
        super(context);
        this.f20571n0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f20566i0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f20567j0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f20568k0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.f20569l0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                WeakHashMap weakHashMap = Q.f5546a;
                if (getLayoutDirection() == 1) {
                    int i17 = i13 - i15;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i14);
                } else {
                    childAt.layout(i15, 0, childAt.getMeasuredWidth() + i15, i14);
                }
                i15 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        l menu = getMenu();
        int size = View.MeasureSpec.getSize(i9);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        ArrayList arrayList = this.f20571n0;
        arrayList.clear();
        int size3 = View.MeasureSpec.getSize(i10);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int labelVisibilityMode = getLabelVisibilityMode();
        int i14 = 1;
        if (labelVisibilityMode != -1 ? labelVisibilityMode == 0 : size2 > 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i15 = this.f20568k0;
        if (z9 && this.f20570m0) {
            View childAt = getChildAt(getSelectedItemPosition());
            int visibility = childAt.getVisibility();
            int i16 = this.f20569l0;
            if (visibility != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, Integer.MIN_VALUE), makeMeasureSpec);
                i16 = Math.max(i16, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i17 = size2 - i12;
            int min = Math.min(size - (this.f20567j0 * i17), Math.min(i16, i15));
            int i18 = size - min;
            if (i17 != 0) {
                i14 = i17;
            }
            int min2 = Math.min(i18 / i14, this.f20566i0);
            int i19 = i18 - (i17 * min2);
            for (int i20 = 0; i20 < childCount; i20++) {
                if (getChildAt(i20).getVisibility() != 8) {
                    if (i20 == getSelectedItemPosition()) {
                        i13 = min;
                    } else {
                        i13 = min2;
                    }
                    if (i19 > 0) {
                        i13++;
                        i19--;
                    }
                } else {
                    i13 = 0;
                }
                arrayList.add(Integer.valueOf(i13));
            }
        } else {
            if (size2 != 0) {
                i14 = size2;
            }
            int min3 = Math.min(size / i14, i15);
            int i21 = size - (size2 * min3);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() != 8) {
                    if (i21 > 0) {
                        i11 = min3 + 1;
                        i21--;
                    } else {
                        i11 = min3;
                    }
                } else {
                    i11 = 0;
                }
                arrayList.add(Integer.valueOf(i11));
            }
        }
        int i23 = 0;
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt2 = getChildAt(i24);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i24)).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i23 = childAt2.getMeasuredWidth() + i23;
            }
        }
        setMeasuredDimension(i23, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z9) {
        this.f20570m0 = z9;
    }
}
