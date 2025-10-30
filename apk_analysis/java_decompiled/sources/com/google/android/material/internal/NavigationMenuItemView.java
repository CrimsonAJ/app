package com.google.android.material.internal;

import G.l;
import I5.e;
import P.Q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.D1;
import java.util.WeakHashMap;
import o.n;
import o.y;
import p.C1820s0;
import w5.f;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements y {

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f16077h0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f16078A;

    /* renamed from: B, reason: collision with root package name */
    public n f16079B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f16080C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f16081D;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f16082f0;

    /* renamed from: g0, reason: collision with root package name */
    public final e f16083g0;

    /* renamed from: v, reason: collision with root package name */
    public int f16084v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16085w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16086x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16087y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f16088z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16087y = true;
        e eVar = new e(5, this);
        this.f16083g0 = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(co.notix.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(co.notix.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(co.notix.R.id.design_menu_item_text);
        this.f16088z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        Q.m(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f16078A == null) {
                this.f16078A = (FrameLayout) ((ViewStub) findViewById(co.notix.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f16078A.removeAllViews();
            this.f16078A.addView(view);
        }
    }

    @Override // o.y
    public final void a(n nVar) {
        int i9;
        StateListDrawable stateListDrawable;
        this.f16079B = nVar;
        int i10 = nVar.f21404a;
        if (i10 > 0) {
            setId(i10);
        }
        if (nVar.isVisible()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        setVisibility(i9);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(co.notix.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f16077h0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = Q.f5546a;
            setBackground(stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.f21408e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.f21419q);
        D1.J(this, nVar.f21420r);
        n nVar2 = this.f16079B;
        CharSequence charSequence = nVar2.f21408e;
        CheckedTextView checkedTextView = this.f16088z;
        if (charSequence == null && nVar2.getIcon() == null && this.f16079B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f16078A;
            if (frameLayout != null) {
                C1820s0 c1820s0 = (C1820s0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1820s0).width = -1;
                this.f16078A.setLayoutParams(c1820s0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f16078A;
        if (frameLayout2 != null) {
            C1820s0 c1820s02 = (C1820s0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1820s02).width = -2;
            this.f16078A.setLayoutParams(c1820s02);
        }
    }

    @Override // o.y
    public n getItemData() {
        return this.f16079B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        n nVar = this.f16079B;
        if (nVar != null && nVar.isCheckable() && this.f16079B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f16077h0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.f16086x != z9) {
            this.f16086x = z9;
            this.f16083g0.h(this.f16088z, 2048);
        }
    }

    public void setChecked(boolean z9) {
        int i9;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f16088z;
        checkedTextView.setChecked(z9);
        Typeface typeface = checkedTextView.getTypeface();
        if (z9 && this.f16087y) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        checkedTextView.setTypeface(typeface, i9);
    }

    public void setHorizontalPadding(int i9) {
        setPadding(i9, getPaddingTop(), i9, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f16081D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f16080C);
            }
            int i9 = this.f16084v;
            drawable.setBounds(0, 0, i9, i9);
        } else if (this.f16085w) {
            if (this.f16082f0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f2623a;
                Drawable drawable2 = resources.getDrawable(co.notix.R.drawable.navigation_empty_icon, theme);
                this.f16082f0 = drawable2;
                if (drawable2 != null) {
                    int i10 = this.f16084v;
                    drawable2.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.f16082f0;
        }
        this.f16088z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i9) {
        this.f16088z.setCompoundDrawablePadding(i9);
    }

    public void setIconSize(int i9) {
        this.f16084v = i9;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z9;
        this.f16080C = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f16081D = z9;
        n nVar = this.f16079B;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i9) {
        this.f16088z.setMaxLines(i9);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.f16085w = z9;
    }

    public void setTextAppearance(int i9) {
        this.f16088z.setTextAppearance(i9);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f16088z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f16088z.setText(charSequence);
    }
}
