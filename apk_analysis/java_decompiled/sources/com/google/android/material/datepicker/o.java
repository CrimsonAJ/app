package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class o implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f16044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16045b;

    public o(q qVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f16045b = qVar;
        this.f16044a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f16044a;
        n a5 = materialCalendarGridView.a();
        if (i9 >= a5.a() && i9 <= a5.c()) {
            if (materialCalendarGridView.a().getItem(i9).longValue() < ((j) this.f16045b.f16049e.f25635a).f16003x0.f15974c.f15981a) {
            } else {
                throw null;
            }
        }
    }
}
