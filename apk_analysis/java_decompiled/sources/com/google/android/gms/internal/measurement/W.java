package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class W extends G4.a {
    public static final Parcelable.Creator<W> CREATOR = new V(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f15322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15323b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f15324c;

    public W(int i9, String str, Intent intent) {
        this.f15322a = i9;
        this.f15323b = str;
        this.f15324c = intent;
    }

    public static W f(Activity activity) {
        return new W(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w7 = (W) obj;
        if (this.f15322a == w7.f15322a && Objects.equals(this.f15323b, w7.f15323b) && Objects.equals(this.f15324c, w7.f15324c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15322a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f15322a);
        s8.n.M(parcel, 2, this.f15323b);
        s8.n.L(parcel, 3, this.f15324c, i9);
        s8.n.U(parcel, R2);
    }
}
