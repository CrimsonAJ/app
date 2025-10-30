package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class l<S> extends r {

    /* renamed from: w0, reason: collision with root package name */
    public int f16030w0;

    /* renamed from: x0, reason: collision with root package name */
    public b f16031x0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.f18390f;
        }
        this.f16030w0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f16031x0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            return;
        }
        throw new ClassCastException();
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m(), this.f16030w0));
        throw null;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void P(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f16030w0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16031x0);
    }
}
