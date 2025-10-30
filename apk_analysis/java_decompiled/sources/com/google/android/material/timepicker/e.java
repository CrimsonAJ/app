package com.google.android.material.timepicker;

import A6.s;
import F5.j;
import F5.l;
import P.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.notix.R;
import g5.AbstractC1254a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: p, reason: collision with root package name */
    public final s f16279p;

    /* renamed from: q, reason: collision with root package name */
    public int f16280q;

    /* renamed from: r, reason: collision with root package name */
    public final F5.h f16281r;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        F5.h hVar = new F5.h();
        this.f16281r = hVar;
        j jVar = new j(0.5f);
        l e8 = hVar.f2483a.f2466a.e();
        e8.f2512e = jVar;
        e8.f2513f = jVar;
        e8.f2514g = jVar;
        e8.f2515h = jVar;
        hVar.setShapeAppearanceModel(e8.a());
        this.f16281r.k(ColorStateList.valueOf(-1));
        F5.h hVar2 = this.f16281r;
        WeakHashMap weakHashMap = Q.f5546a;
        setBackground(hVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17722G, R.attr.materialClockStyle, 0);
        this.f16280q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f16279p = new s(14, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = Q.f5546a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            s sVar = this.f16279p;
            handler.removeCallbacks(sVar);
            handler.post(sVar);
        }
    }

    public abstract void f();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            s sVar = this.f16279p;
            handler.removeCallbacks(sVar);
            handler.post(sVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i9) {
        this.f16281r.k(ColorStateList.valueOf(i9));
    }
}
