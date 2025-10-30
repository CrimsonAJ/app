package com.google.android.material.datepicker;

import F0.M;
import P.Q;
import Q2.U;
import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import z8.C2271u;

/* loaded from: classes.dex */
public final class j<S> extends r {

    /* renamed from: A0, reason: collision with root package name */
    public c f15995A0;

    /* renamed from: B0, reason: collision with root package name */
    public RecyclerView f15996B0;

    /* renamed from: C0, reason: collision with root package name */
    public RecyclerView f15997C0;

    /* renamed from: D0, reason: collision with root package name */
    public View f15998D0;

    /* renamed from: E0, reason: collision with root package name */
    public View f15999E0;

    /* renamed from: F0, reason: collision with root package name */
    public View f16000F0;

    /* renamed from: G0, reason: collision with root package name */
    public View f16001G0;

    /* renamed from: w0, reason: collision with root package name */
    public int f16002w0;

    /* renamed from: x0, reason: collision with root package name */
    public b f16003x0;

    /* renamed from: y0, reason: collision with root package name */
    public m f16004y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f16005z0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.f18390f;
        }
        this.f16002w0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.f16003x0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f16004y0 = (m) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i9;
        int i10;
        e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m(), this.f16002w0);
        this.f15995A0 = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        m mVar = this.f16003x0.f15972a;
        if (k.n0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i9 = co.notix.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i9 = co.notix.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i9, viewGroup, false);
        Resources resources = X().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(co.notix.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(co.notix.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(co.notix.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(co.notix.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = n.f16039d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(co.notix.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(co.notix.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(co.notix.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(co.notix.R.id.mtrl_calendar_days_of_week);
        Q.m(gridView, new S.e(1));
        int i12 = this.f16003x0.f15976e;
        if (i12 > 0) {
            eVar = new e(i12);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(mVar.f16035d);
        gridView.setEnabled(false);
        this.f15997C0 = (RecyclerView) inflate.findViewById(co.notix.R.id.mtrl_calendar_months);
        this.f15997C0.setLayoutManager(new g(this, i10, i10));
        this.f15997C0.setTag("MONTHS_VIEW_GROUP_TAG");
        q qVar = new q(contextThemeWrapper, this.f16003x0, new C2271u(this));
        this.f15997C0.setAdapter(qVar);
        int integer = contextThemeWrapper.getResources().getInteger(co.notix.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(co.notix.R.id.mtrl_calendar_year_selector_frame);
        this.f15996B0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f15996B0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f15996B0.setAdapter(new x(this));
            this.f15996B0.i(new h(this));
        }
        if (inflate.findViewById(co.notix.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(co.notix.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            Q.m(materialButton, new I5.e(1, this));
            View findViewById = inflate.findViewById(co.notix.R.id.month_navigation_previous);
            this.f15998D0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(co.notix.R.id.month_navigation_next);
            this.f15999E0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f16000F0 = inflate.findViewById(co.notix.R.id.mtrl_calendar_year_selector_frame);
            this.f16001G0 = inflate.findViewById(co.notix.R.id.mtrl_calendar_day_selector_frame);
            f0(1);
            materialButton.setText(this.f16004y0.f());
            this.f15997C0.j(new i(this, qVar, materialButton));
            int i13 = 1;
            materialButton.setOnClickListener(new U(i13, this));
            this.f15999E0.setOnClickListener(new f(this, qVar, i13));
            this.f15998D0.setOnClickListener(new f(this, qVar, 0));
        }
        if (!k.n0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new M().a(this.f15997C0);
        }
        this.f15997C0.h0(qVar.f16048d.f15972a.g(this.f16004y0));
        Q.m(this.f15997C0, new S.e(2));
        return inflate;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void P(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f16002w0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16003x0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f16004y0);
    }

    public final void e0(m mVar) {
        boolean z9;
        q qVar = (q) this.f15997C0.getAdapter();
        int g9 = qVar.f16048d.f15972a.g(mVar);
        int g10 = g9 - qVar.f16048d.f15972a.g(this.f16004y0);
        boolean z10 = false;
        if (Math.abs(g10) > 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (g10 > 0) {
            z10 = true;
        }
        this.f16004y0 = mVar;
        if (z9 && z10) {
            this.f15997C0.h0(g9 - 3);
            this.f15997C0.post(new D4.s(g9, 3, this));
        } else if (z9) {
            this.f15997C0.h0(g9 + 3);
            this.f15997C0.post(new D4.s(g9, 3, this));
        } else {
            this.f15997C0.post(new D4.s(g9, 3, this));
        }
    }

    public final void f0(int i9) {
        this.f16005z0 = i9;
        if (i9 == 2) {
            this.f15996B0.getLayoutManager().x0(this.f16004y0.f16034c - ((x) this.f15996B0.getAdapter()).f16054d.f16003x0.f15972a.f16034c);
            this.f16000F0.setVisibility(0);
            this.f16001G0.setVisibility(8);
            this.f15998D0.setVisibility(8);
            this.f15999E0.setVisibility(8);
            return;
        }
        if (i9 == 1) {
            this.f16000F0.setVisibility(8);
            this.f16001G0.setVisibility(0);
            this.f15998D0.setVisibility(0);
            this.f15999E0.setVisibility(0);
            e0(this.f16004y0);
        }
    }
}
