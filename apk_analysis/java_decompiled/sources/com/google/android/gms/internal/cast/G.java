package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class G extends G4.a {
    public static final Parcelable.Creator<G> CREATOR = new F(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f14715a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f14716b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14717c;

    public G(String str, byte[] bArr, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f14715a = str;
        this.f14716b = bArr;
        if (arrayList == null) {
            arrayList2 = new ArrayList(0);
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f14717c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof G) {
                G g9 = (G) obj;
                if (F4.y.k(this.f14715a, g9.f14715a) && F4.y.k(this.f14716b, g9.f14716b) && F4.y.k(this.f14717c, g9.f14717c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14715a, this.f14716b, this.f14717c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 1, this.f14715a);
        s8.n.G(parcel, 2, this.f14716b);
        s8.n.J(parcel, 3, new ArrayList(this.f14717c));
        s8.n.U(parcel, R2);
    }
}
