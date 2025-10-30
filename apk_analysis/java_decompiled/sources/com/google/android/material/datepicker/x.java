package com.google.android.material.datepicker;

import F0.S;
import F0.r0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import b5.C0671w;
import co.notix.R;
import java.util.Locale;

/* loaded from: classes.dex */
public final class x extends S {

    /* renamed from: d, reason: collision with root package name */
    public final j f16054d;

    public x(j jVar) {
        this.f16054d = jVar;
    }

    @Override // F0.S
    public final int a() {
        return this.f16054d.f16003x0.f15977f;
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        String format;
        j jVar = this.f16054d;
        int i10 = jVar.f16003x0.f15972a.f16034c + i9;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i10));
        TextView textView = ((w) r0Var).f16053u;
        textView.setText(format2);
        Context context = textView.getContext();
        if (v.b().get(1) == i10) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
        }
        textView.setContentDescription(format);
        c cVar = jVar.f15995A0;
        if (v.b().get(1) == i10) {
            C0671w c0671w = cVar.f15980b;
        } else {
            C0671w c0671w2 = cVar.f15979a;
        }
        throw null;
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        return new w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
