package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import co.notix.R;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class n extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f16039d = v.c(null).getMaximum(4);

    /* renamed from: e, reason: collision with root package name */
    public static final int f16040e = (v.c(null).getMaximum(7) + v.c(null).getMaximum(5)) - 1;

    /* renamed from: a, reason: collision with root package name */
    public final m f16041a;

    /* renamed from: b, reason: collision with root package name */
    public c f16042b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16043c;

    public n(m mVar, b bVar) {
        this.f16041a = mVar;
        this.f16043c = bVar;
        throw null;
    }

    public final int a() {
        int i9 = this.f16043c.f15976e;
        m mVar = this.f16041a;
        Calendar calendar = mVar.f16032a;
        int i10 = calendar.get(7);
        if (i9 <= 0) {
            i9 = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - i9;
        if (i11 < 0) {
            return i11 + mVar.f16035d;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i9) {
        if (i9 >= a() && i9 <= c()) {
            int a5 = (i9 - a()) + 1;
            Calendar a9 = v.a(this.f16041a.f16032a);
            a9.set(5, a5);
            return Long.valueOf(a9.getTimeInMillis());
        }
        return null;
    }

    public final int c() {
        return (a() + this.f16041a.f16036e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f16040e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return i9 / this.f16041a.f16035d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f16042b == null) {
            this.f16042b = new c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int a5 = i9 - a();
        if (a5 >= 0) {
            m mVar = this.f16041a;
            if (a5 < mVar.f16036e) {
                textView.setTag(mVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(a5 + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i9) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                v.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i9) == null) {
            textView.getContext();
            v.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
