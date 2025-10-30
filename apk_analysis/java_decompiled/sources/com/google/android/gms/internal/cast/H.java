package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class H extends G4.a {
    public static final Parcelable.Creator<H> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14719a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14720b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14721c;

    static {
        new H(null, false, false);
        CREATOR = new F(1);
    }

    public H(ArrayList arrayList, boolean z9, boolean z10) {
        ArrayList arrayList2;
        if (arrayList == null) {
            arrayList2 = new ArrayList(0);
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f14719a = arrayList2;
        this.f14720b = z9;
        this.f14721c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof H) {
                H h7 = (H) obj;
                if (F4.y.k(this.f14719a, h7.f14719a) && F4.y.k(Boolean.valueOf(this.f14720b), Boolean.valueOf(h7.f14720b))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14719a, Boolean.valueOf(this.f14720b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.P(parcel, 1, new ArrayList(this.f14719a));
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f14720b ? 1 : 0);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f14721c ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
