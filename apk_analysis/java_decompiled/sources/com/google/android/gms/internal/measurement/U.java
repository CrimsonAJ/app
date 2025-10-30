package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class U extends G4.a {
    public static final Parcelable.Creator<U> CREATOR = new V(0);

    /* renamed from: a, reason: collision with root package name */
    public final long f15303a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15304b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15305c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15306d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15307e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15308f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f15309g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15310h;

    public U(long j, long j4, boolean z9, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f15303a = j;
        this.f15304b = j4;
        this.f15305c = z9;
        this.f15306d = str;
        this.f15307e = str2;
        this.f15308f = str3;
        this.f15309g = bundle;
        this.f15310h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 8);
        parcel.writeLong(this.f15303a);
        s8.n.V(parcel, 2, 8);
        parcel.writeLong(this.f15304b);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f15305c ? 1 : 0);
        s8.n.M(parcel, 4, this.f15306d);
        s8.n.M(parcel, 5, this.f15307e);
        s8.n.M(parcel, 6, this.f15308f);
        s8.n.F(parcel, 7, this.f15309g);
        s8.n.M(parcel, 8, this.f15310h);
        s8.n.U(parcel, R2);
    }
}
