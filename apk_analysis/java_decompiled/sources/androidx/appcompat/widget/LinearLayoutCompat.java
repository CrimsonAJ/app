package androidx.appcompat.widget;

import P.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import b5.G1;
import h.AbstractC1260a;
import p.C1820s0;
import p.g1;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9465a;

    /* renamed from: b, reason: collision with root package name */
    public int f9466b;

    /* renamed from: c, reason: collision with root package name */
    public int f9467c;

    /* renamed from: d, reason: collision with root package name */
    public int f9468d;

    /* renamed from: e, reason: collision with root package name */
    public int f9469e;

    /* renamed from: f, reason: collision with root package name */
    public int f9470f;

    /* renamed from: g, reason: collision with root package name */
    public float f9471g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9472h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f9473i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f9474k;

    /* renamed from: l, reason: collision with root package name */
    public int f9475l;

    /* renamed from: m, reason: collision with root package name */
    public int f9476m;

    /* renamed from: n, reason: collision with root package name */
    public int f9477n;

    /* renamed from: o, reason: collision with root package name */
    public int f9478o;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1820s0;
    }

    public final void d(Canvas canvas, int i9) {
        this.f9474k.setBounds(getPaddingLeft() + this.f9478o, i9, (getWidth() - getPaddingRight()) - this.f9478o, this.f9476m + i9);
        this.f9474k.draw(canvas);
    }

    public final void e(Canvas canvas, int i9) {
        this.f9474k.setBounds(i9, getPaddingTop() + this.f9478o, this.f9475l + i9, (getHeight() - getPaddingBottom()) - this.f9478o);
        this.f9474k.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1820s0 generateDefaultLayoutParams() {
        int i9 = this.f9468d;
        if (i9 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i9 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1820s0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i9;
        if (this.f9466b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f9466b;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f9466b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f9467c;
            if (this.f9468d == 1 && (i9 = this.f9469e & 112) != 48) {
                if (i9 != 16) {
                    if (i9 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9470f;
                    }
                } else {
                    i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9470f) / 2;
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((C1820s0) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9466b;
    }

    public Drawable getDividerDrawable() {
        return this.f9474k;
    }

    public int getDividerPadding() {
        return this.f9478o;
    }

    public int getDividerWidth() {
        return this.f9475l;
    }

    public int getGravity() {
        return this.f9469e;
    }

    public int getOrientation() {
        return this.f9468d;
    }

    public int getShowDividers() {
        return this.f9477n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9471g;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.s0, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1820s0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1820s0) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i9) {
        if (i9 == 0) {
            if ((this.f9477n & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i9 == getChildCount()) {
            if ((this.f9477n & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f9477n & 2) != 0) {
            for (int i10 = i9 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9;
        int right;
        int left;
        int i9;
        int left2;
        int bottom;
        if (this.f9474k != null) {
            int i10 = 0;
            if (this.f9468d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                        d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1820s0) childAt.getLayoutParams())).topMargin) - this.f9476m);
                    }
                    i10++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.f9476m;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1820s0) childAt2.getLayoutParams())).bottomMargin;
                    }
                    d(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z10 = g1.f21992a;
            if (getLayoutDirection() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                    C1820s0 c1820s0 = (C1820s0) childAt3.getLayoutParams();
                    if (z9) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c1820s0).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1820s0).leftMargin) - this.f9475l;
                    }
                    e(canvas, left2);
                }
                i10++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z9) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i9 = this.f9475l;
                        right = left - i9;
                    }
                } else {
                    C1820s0 c1820s02 = (C1820s0) childAt4.getLayoutParams();
                    if (z9) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1820s02).leftMargin;
                        i9 = this.f9475l;
                        right = left - i9;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1820s02).rightMargin;
                    }
                }
                e(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z9) {
        this.f9465a = z9;
    }

    public void setBaselineAlignedChildIndex(int i9) {
        if (i9 >= 0 && i9 < getChildCount()) {
            this.f9466b = i9;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f9474k) {
            return;
        }
        this.f9474k = drawable;
        boolean z9 = false;
        if (drawable != null) {
            this.f9475l = drawable.getIntrinsicWidth();
            this.f9476m = drawable.getIntrinsicHeight();
        } else {
            this.f9475l = 0;
            this.f9476m = 0;
        }
        if (drawable == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        requestLayout();
    }

    public void setDividerPadding(int i9) {
        this.f9478o = i9;
    }

    public void setGravity(int i9) {
        if (this.f9469e != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f9469e = i9;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i9) {
        int i10 = i9 & 8388615;
        int i11 = this.f9469e;
        if ((8388615 & i11) != i10) {
            this.f9469e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z9) {
        this.f9472h = z9;
    }

    public void setOrientation(int i9) {
        if (this.f9468d != i9) {
            this.f9468d = i9;
            requestLayout();
        }
    }

    public void setShowDividers(int i9) {
        if (i9 != this.f9477n) {
            requestLayout();
        }
        this.f9477n = i9;
    }

    public void setVerticalGravity(int i9) {
        int i10 = i9 & 112;
        int i11 = this.f9469e;
        if ((i11 & 112) != i10) {
            this.f9469e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f9) {
        this.f9471g = Math.max(0.0f, f9);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, 0);
        this.f9465a = true;
        this.f9466b = -1;
        this.f9467c = 0;
        this.f9469e = 8388659;
        int[] iArr = AbstractC1260a.f17817n;
        G1 w7 = G1.w(context, attributeSet, iArr, 0);
        Q.l(this, context, iArr, attributeSet, (TypedArray) w7.f10718c, 0);
        TypedArray typedArray = (TypedArray) w7.f10718c;
        int i10 = typedArray.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = typedArray.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z9 = typedArray.getBoolean(2, true);
        if (!z9) {
            setBaselineAligned(z9);
        }
        this.f9471g = typedArray.getFloat(4, -1.0f);
        this.f9466b = typedArray.getInt(3, -1);
        this.f9472h = typedArray.getBoolean(7, false);
        setDividerDrawable(w7.o(5));
        this.f9477n = typedArray.getInt(8, 0);
        this.f9478o = typedArray.getDimensionPixelSize(6, 0);
        w7.y();
    }
}
