package com.google.android.gms.common.api;

import C4.s;
import F4.y;
import G4.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import s8.n;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new s(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f14653a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14654b;

    public Scope(int i9, String str) {
        y.f(str, "scopeUri must not be null or empty");
        this.f14653a = i9;
        this.f14654b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f14654b.equals(((Scope) obj).f14654b);
    }

    public final int hashCode() {
        return this.f14654b.hashCode();
    }

    public final String toString() {
        return this.f14654b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f14653a);
        n.M(parcel, 2, this.f14654b);
        n.U(parcel, R2);
    }
}
