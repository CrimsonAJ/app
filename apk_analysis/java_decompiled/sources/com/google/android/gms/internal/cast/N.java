package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N extends G4.a {
    public static final Parcelable.Creator<N> CREATOR = new F(3);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14749a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14750b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14751c;

    public N(int i9, boolean z9, boolean z10) {
        this.f14749a = z9;
        this.f14750b = z10;
        this.f14751c = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f14749a ? 1 : 0);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f14750b ? 1 : 0);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f14751c);
        s8.n.U(parcel, R2);
    }
}
