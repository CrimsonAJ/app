package com.google.android.material.datepicker;

import F0.r0;
import P.D;
import P.Q;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.notix.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p extends r0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f16046u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f16047v;

    public p(LinearLayout linearLayout, boolean z9) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f16046u = textView;
        WeakHashMap weakHashMap = Q.f5546a;
        new D(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f16047v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z9) {
            textView.setVisibility(8);
        }
    }
}
