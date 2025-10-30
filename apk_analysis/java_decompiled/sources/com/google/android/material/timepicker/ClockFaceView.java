package com.google.android.material.timepicker;

import P.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.C2227g;
import z.C2228h;
import z.l;

/* loaded from: classes.dex */
class ClockFaceView extends e implements d {

    /* renamed from: A, reason: collision with root package name */
    public final int f16247A;

    /* renamed from: B, reason: collision with root package name */
    public final int f16248B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16249C;

    /* renamed from: D, reason: collision with root package name */
    public final int f16250D;

    /* renamed from: f0, reason: collision with root package name */
    public final String[] f16251f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f16252g0;

    /* renamed from: h0, reason: collision with root package name */
    public final ColorStateList f16253h0;

    /* renamed from: s, reason: collision with root package name */
    public final ClockHandView f16254s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f16255t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f16256u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f16257v;

    /* renamed from: w, reason: collision with root package name */
    public final SparseArray f16258w;

    /* renamed from: x, reason: collision with root package name */
    public final c f16259x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f16260y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f16261z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16255t = new Rect();
        this.f16256u = new RectF();
        this.f16257v = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f16258w = sparseArray;
        this.f16261z = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17745k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList p9 = D1.p(context, obtainStyledAttributes, 1);
        this.f16253h0 = p9;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f16254s = clockHandView;
        this.f16247A = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = p9.getColorForState(new int[]{android.R.attr.state_selected}, p9.getDefaultColor());
        this.f16260y = new int[]{colorForState, colorForState, p9.getDefaultColor()};
        clockHandView.f16264c.add(this);
        int defaultColor = E.d.c(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList p10 = D1.p(context, obtainStyledAttributes, 0);
        setBackgroundColor(p10 != null ? p10.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f16259x = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f16251f0 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < Math.max(this.f16251f0.length, size); i9++) {
            TextView textView = (TextView) sparseArray.get(i9);
            if (i9 >= this.f16251f0.length) {
                removeView(textView);
                sparseArray.remove(i9);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i9, textView);
                    addView(textView);
                }
                textView.setText(this.f16251f0[i9]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i9));
                int i10 = (i9 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i10));
                z9 = i10 > 1 ? true : z9;
                Q.m(textView, this.f16259x);
                textView.setTextColor(this.f16253h0);
            }
        }
        ClockHandView clockHandView2 = this.f16254s;
        if (clockHandView2.f16263b && !z9) {
            clockHandView2.f16273m = 1;
        }
        clockHandView2.f16263b = z9;
        clockHandView2.invalidate();
        this.f16248B = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f16249C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f16250D = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.e
    public final void f() {
        int i9;
        l lVar = new l();
        lVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i11 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i9 = Math.round(this.f16280q * 0.66f);
            } else {
                i9 = this.f16280q;
            }
            Iterator it = list.iterator();
            float f9 = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap hashMap2 = lVar.f25350c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C2227g());
                }
                C2228h c2228h = ((C2227g) hashMap2.get(Integer.valueOf(id))).f25263d;
                c2228h.f25321w = R.id.circle_center;
                c2228h.f25322x = i9;
                c2228h.f25323y = f9;
                f9 += 360.0f / list.size();
            }
        }
        lVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f16258w;
            if (i12 < sparseArray.size()) {
                ((TextView) sparseArray.get(i12)).setVisibility(0);
                i12++;
            } else {
                return;
            }
        }
    }

    public final void g() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z9;
        RadialGradient radialGradient;
        RectF rectF2 = this.f16254s.f16268g;
        float f9 = Float.MAX_VALUE;
        TextView textView = null;
        int i9 = 0;
        while (true) {
            sparseArray = this.f16258w;
            int size = sparseArray.size();
            rectF = this.f16256u;
            rect = this.f16255t;
            if (i9 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i9);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f9) {
                    textView = textView2;
                    f9 = height;
                }
            }
            i9++;
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            TextView textView3 = (TextView) sparseArray.get(i10);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                textView3.setSelected(z9);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f16257v);
                rectF.inset(r8.left, r8.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f16260y, this.f16261z, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) s4.i.L(1, this.f16251f0.length, 1).f22734a);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        g();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f16250D / Math.max(Math.max(this.f16248B / displayMetrics.heightPixels, this.f16249C / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
