package com.google.android.material.datepicker;

import F0.C0099c0;
import F0.S;
import F0.r0;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import co.notix.R;
import java.util.Calendar;
import z8.C2271u;

/* loaded from: classes.dex */
public final class q extends S {

    /* renamed from: d, reason: collision with root package name */
    public final b f16048d;

    /* renamed from: e, reason: collision with root package name */
    public final C2271u f16049e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16050f;

    public q(ContextThemeWrapper contextThemeWrapper, b bVar, C2271u c2271u) {
        int i9;
        m mVar = bVar.f15972a;
        m mVar2 = bVar.f15975d;
        if (mVar.f16032a.compareTo(mVar2.f16032a) <= 0) {
            if (mVar2.f16032a.compareTo(bVar.f15973b.f16032a) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * n.f16039d;
                if (k.n0(contextThemeWrapper, android.R.attr.windowFullscreen)) {
                    i9 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i9 = 0;
                }
                this.f16050f = dimensionPixelSize + i9;
                this.f16048d = bVar;
                this.f16049e = c2271u;
                if (!this.f2055a.a()) {
                    this.f2056b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // F0.S
    public final int a() {
        return this.f16048d.f15978g;
    }

    @Override // F0.S
    public final long b(int i9) {
        Calendar a5 = v.a(this.f16048d.f15972a.f16032a);
        a5.add(2, i9);
        a5.set(5, 1);
        Calendar a9 = v.a(a5);
        a9.get(2);
        a9.get(1);
        a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        return a9.getTimeInMillis();
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        p pVar = (p) r0Var;
        b bVar = this.f16048d;
        Calendar a5 = v.a(bVar.f15972a.f16032a);
        a5.add(2, i9);
        m mVar = new m(a5);
        pVar.f16046u.setText(mVar.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) pVar.f16047v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() != null && mVar.equals(materialCalendarGridView.a().f16041a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.a().getClass();
            throw null;
        }
        new n(mVar, bVar);
        throw null;
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (k.n0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            linearLayout.setLayoutParams(new C0099c0(-1, this.f16050f));
            return new p(linearLayout, true);
        }
        return new p(linearLayout, false);
    }
}
