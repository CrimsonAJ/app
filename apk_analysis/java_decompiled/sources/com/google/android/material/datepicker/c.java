package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import b5.C0671w;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0671w f15979a;

    /* renamed from: b, reason: collision with root package name */
    public final C0671w f15980b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1002u1.Z(R.attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, AbstractC1254a.f17757w);
        C0671w.b(context, obtainStyledAttributes.getResourceId(4, 0));
        C0671w.b(context, obtainStyledAttributes.getResourceId(2, 0));
        C0671w.b(context, obtainStyledAttributes.getResourceId(3, 0));
        C0671w.b(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList p9 = D1.p(context, obtainStyledAttributes, 7);
        this.f15979a = C0671w.b(context, obtainStyledAttributes.getResourceId(9, 0));
        C0671w.b(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f15980b = C0671w.b(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(p9.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
