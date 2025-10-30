package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class I extends G4.a {
    public static final Parcelable.Creator<I> CREATOR = new F(2);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14724a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14725b;

    public I(int i9, boolean z9) {
        this.f14724a = z9;
        this.f14725b = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f14724a ? 1 : 0);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f14725b);
        s8.n.U(parcel, R2);
    }
}
