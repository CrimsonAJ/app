package w5;

import P.Q;
import android.view.View;
import android.view.ViewGroup;
import co.notix.R;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;

/* renamed from: w5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2145e extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f24284a;

    /* renamed from: b, reason: collision with root package name */
    public int f24285b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24286c;

    /* renamed from: d, reason: collision with root package name */
    public int f24287d;

    public int getItemSpacing() {
        return this.f24285b;
    }

    public int getLineSpacing() {
        return this.f24284a;
    }

    public int getRowCount() {
        return this.f24287d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        boolean z10;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        if (getChildCount() == 0) {
            this.f24287d = 0;
            return;
        }
        this.f24287d = 1;
        WeakHashMap weakHashMap = Q.f5546a;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i15 = (i11 - i9) - paddingRight;
        int i16 = paddingLeft;
        int i17 = paddingTop;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.getMarginStart();
                    i13 = marginLayoutParams.getMarginEnd();
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i16 + i14;
                if (!this.f24286c && measuredWidth > i15) {
                    i17 = this.f24284a + paddingTop;
                    this.f24287d++;
                    i16 = paddingLeft;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f24287d - 1));
                int i19 = i16 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i19;
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                if (z10) {
                    childAt.layout(i15 - measuredWidth2, i17, (i15 - i16) - i14, measuredHeight);
                } else {
                    childAt.layout(i19, i17, measuredWidth2, measuredHeight);
                }
                i16 += childAt.getMeasuredWidth() + i14 + i13 + this.f24285b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i9, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i18 = i13;
                if (childAt.getMeasuredWidth() + paddingLeft + i14 > paddingRight && !((ChipGroup) this).f24286c) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f24284a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i14 + i18 + this.f24285b + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i18;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i12 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i12 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != i12) {
                size2 = paddingBottom;
            }
        } else {
            size2 = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i9) {
        this.f24285b = i9;
    }

    public void setLineSpacing(int i9) {
        this.f24284a = i9;
    }

    public void setSingleLine(boolean z9) {
        this.f24286c = z9;
    }
}
