package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import b5.G1;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f16123a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f16124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16125c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G1 v8 = G1.v(context, attributeSet, AbstractC1254a.f17729O);
        TypedArray typedArray = (TypedArray) v8.f10718c;
        this.f16123a = typedArray.getText(2);
        this.f16124b = v8.o(0);
        this.f16125c = typedArray.getResourceId(1, 0);
        v8.y();
    }
}
