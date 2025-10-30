package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new android.support.v4.media.a(18);

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f16032a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16034c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16035d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16036e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16037f;

    /* renamed from: g, reason: collision with root package name */
    public String f16038g;

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a5 = v.a(calendar);
        this.f16032a = a5;
        this.f16033b = a5.get(2);
        this.f16034c = a5.get(1);
        this.f16035d = a5.getMaximum(7);
        this.f16036e = a5.getActualMaximum(5);
        this.f16037f = a5.getTimeInMillis();
    }

    public static m a(int i9, int i10) {
        Calendar c3 = v.c(null);
        c3.set(1, i9);
        c3.set(2, i10);
        return new m(c3);
    }

    public static m d(long j) {
        Calendar c3 = v.c(null);
        c3.setTimeInMillis(j);
        return new m(c3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f16032a.compareTo(((m) obj).f16032a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f16033b == mVar.f16033b && this.f16034c == mVar.f16034c) {
            return true;
        }
        return false;
    }

    public final String f() {
        String formatDateTime;
        DateFormat instanceForSkeleton;
        TimeZone timeZone;
        DisplayContext unused;
        if (this.f16038g == null) {
            long timeInMillis = this.f16032a.getTimeInMillis();
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
            this.f16038g = formatDateTime;
        }
        return this.f16038g;
    }

    public final int g(m mVar) {
        if (this.f16032a instanceof GregorianCalendar) {
            return (mVar.f16033b - this.f16033b) + ((mVar.f16034c - this.f16034c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16033b), Integer.valueOf(this.f16034c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f16034c);
        parcel.writeInt(this.f16033b);
    }
}
