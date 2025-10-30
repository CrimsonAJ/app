package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final m f15972a;

    /* renamed from: b, reason: collision with root package name */
    public final m f15973b;

    /* renamed from: c, reason: collision with root package name */
    public final d f15974c;

    /* renamed from: d, reason: collision with root package name */
    public final m f15975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15976e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15978g;

    public b(m mVar, m mVar2, d dVar, m mVar3, int i9) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f15972a = mVar;
        this.f15973b = mVar2;
        this.f15975d = mVar3;
        this.f15976e = i9;
        this.f15974c = dVar;
        if (mVar3 != null && mVar.f16032a.compareTo(mVar3.f16032a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.f16032a.compareTo(mVar2.f16032a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i9 >= 0 && i9 <= v.c(null).getMaximum(7)) {
            this.f15978g = mVar.g(mVar2) + 1;
            this.f15977f = (mVar2.f16034c - mVar.f16034c) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15972a.equals(bVar.f15972a) && this.f15973b.equals(bVar.f15973b) && Objects.equals(this.f15975d, bVar.f15975d) && this.f15976e == bVar.f15976e && this.f15974c.equals(bVar.f15974c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15972a, this.f15973b, this.f15975d, Integer.valueOf(this.f15976e), this.f15974c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeParcelable(this.f15972a, 0);
        parcel.writeParcelable(this.f15973b, 0);
        parcel.writeParcelable(this.f15975d, 0);
        parcel.writeParcelable(this.f15974c, 0);
        parcel.writeInt(this.f15976e);
    }
}
