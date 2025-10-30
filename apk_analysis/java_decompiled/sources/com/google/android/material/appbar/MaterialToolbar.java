package com.google.android.material.appbar;

import P.H;
import P.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import g5.AbstractC1254a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import w5.p;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: x0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f15781x0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: s0, reason: collision with root package name */
    public Integer f15782s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f15783t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f15784u0;

    /* renamed from: v0, reason: collision with root package name */
    public ImageView.ScaleType f15785v0;

    /* renamed from: w0, reason: collision with root package name */
    public Boolean f15786w0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        ColorStateList u9;
        Context context2 = getContext();
        TypedArray i9 = p.i(context2, attributeSet, AbstractC1254a.f17719D, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (i9.hasValue(2)) {
            setNavigationIconTint(i9.getColor(2, -1));
        }
        this.f15783t0 = i9.getBoolean(4, false);
        this.f15784u0 = i9.getBoolean(3, false);
        int i10 = i9.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f15781x0;
            if (i10 < scaleTypeArr.length) {
                this.f15785v0 = scaleTypeArr[i10];
            }
        }
        if (i9.hasValue(0)) {
            this.f15786w0 = Boolean.valueOf(i9.getBoolean(0, false));
        }
        i9.recycle();
        Drawable background = getBackground();
        if (background == null) {
            u9 = ColorStateList.valueOf(0);
        } else {
            u9 = O4.h.u(background);
        }
        if (u9 != null) {
            F5.h hVar = new F5.h();
            hVar.k(u9);
            hVar.i(context2);
            WeakHashMap weakHashMap = Q.f5546a;
            hVar.j(H.e(this));
            setBackground(hVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f15785v0;
    }

    public Integer getNavigationIconTint() {
        return this.f15782s0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i9) {
        Menu menu = getMenu();
        boolean z9 = menu instanceof o.l;
        if (z9) {
            ((o.l) menu).w();
        }
        super.m(i9);
        if (z9) {
            ((o.l) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1002u1.c0(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z9, i9, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f15783t0 || this.f15784u0) {
            ArrayList g9 = p.g(this, getTitle());
            boolean isEmpty = g9.isEmpty();
            B.j jVar = p.f24314c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(g9, jVar);
            }
            ArrayList g10 = p.g(this, getSubtitle());
            if (g10.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(g10, jVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f15783t0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f15784u0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f15786w0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f15785v0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        AbstractC1002u1.a0(this, f9);
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.f15786w0;
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        this.f15786w0 = Boolean.valueOf(z9);
        requestLayout();
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f15785v0 != scaleType) {
            this.f15785v0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f15782s0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f15782s0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i9) {
        this.f15782s0 = Integer.valueOf(i9);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.f15784u0 != z9) {
            this.f15784u0 = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.f15783t0 != z9) {
            this.f15783t0 = z9;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i9 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i9;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i9, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i9 += max;
            i10 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i9, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i9, textView.getTop(), i10, textView.getBottom());
    }
}
