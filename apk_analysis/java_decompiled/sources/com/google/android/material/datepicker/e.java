package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import co.notix.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15982d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f15983a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15984b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15985c;

    static {
        int i9;
        if (Build.VERSION.SDK_INT >= 26) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        f15982d = i9;
    }

    public e() {
        Calendar c3 = v.c(null);
        this.f15983a = c3;
        this.f15984b = c3.getMaximum(7);
        this.f15985c = c3.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f15984b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i9) {
        int i10 = this.f15984b;
        if (i9 >= i10) {
            return null;
        }
        int i11 = i9 + this.f15985c;
        if (i11 > i10) {
            i11 -= i10;
        }
        return Integer.valueOf(i11);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i9) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i10 = i9 + this.f15985c;
        int i11 = this.f15984b;
        if (i10 > i11) {
            i10 -= i11;
        }
        Calendar calendar = this.f15983a;
        calendar.set(7, i10);
        textView.setText(calendar.getDisplayName(7, f15982d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i9) {
        Calendar c3 = v.c(null);
        this.f15983a = c3;
        this.f15984b = c3.getMaximum(7);
        this.f15985c = i9;
    }
}
