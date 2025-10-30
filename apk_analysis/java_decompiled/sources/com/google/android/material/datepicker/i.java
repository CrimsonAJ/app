package com.google.android.material.datepicker;

import F0.e0;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f15992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f15993b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f15994c;

    public i(j jVar, q qVar, MaterialButton materialButton) {
        this.f15994c = jVar;
        this.f15992a = qVar;
        this.f15993b = materialButton;
    }

    @Override // F0.e0
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 0) {
            recyclerView.announceForAccessibility(this.f15993b.getText());
        }
    }

    @Override // F0.e0
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int V02;
        String formatDateTime;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext unused;
        j jVar = this.f15994c;
        if (i9 < 0) {
            V02 = ((LinearLayoutManager) jVar.f15997C0.getLayoutManager()).U0();
        } else {
            V02 = ((LinearLayoutManager) jVar.f15997C0.getLayoutManager()).V0();
        }
        b bVar = this.f15992a.f16048d;
        Calendar a5 = v.a(bVar.f15972a.f16032a);
        a5.add(2, V02);
        jVar.f16004y0 = new m(a5);
        Calendar a9 = v.a(bVar.f15972a.f16032a);
        a9.add(2, V02);
        a9.set(5, 1);
        Calendar a10 = v.a(a9);
        a10.get(2);
        a10.get(1);
        a10.getMaximum(7);
        a10.getActualMaximum(5);
        a10.getTimeInMillis();
        long timeInMillis = a10.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = v.f16052a;
            instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            timeZone = TimeZone.getTimeZone("UTC");
            instanceForSkeleton.setTimeZone(timeZone);
            unused = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            formatDateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f15993b.setText(formatDateTime);
    }
}
