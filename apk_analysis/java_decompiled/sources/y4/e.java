package y4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import t4.C2010B;
import t4.C2014d;

/* loaded from: classes.dex */
public final class e extends G4.a {
    public static final Parcelable.Creator<e> CREATOR = new C2010B(10);

    /* renamed from: a, reason: collision with root package name */
    public double f24930a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24931b;

    /* renamed from: c, reason: collision with root package name */
    public int f24932c;

    /* renamed from: d, reason: collision with root package name */
    public C2014d f24933d;

    /* renamed from: e, reason: collision with root package name */
    public int f24934e;

    /* renamed from: f, reason: collision with root package name */
    public t4.u f24935f;

    /* renamed from: g, reason: collision with root package name */
    public double f24936g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f24930a == eVar.f24930a && this.f24931b == eVar.f24931b && this.f24932c == eVar.f24932c && a.e(this.f24933d, eVar.f24933d) && this.f24934e == eVar.f24934e) {
            t4.u uVar = this.f24935f;
            if (a.e(uVar, uVar) && this.f24936g == eVar.f24936g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f24930a), Boolean.valueOf(this.f24931b), Integer.valueOf(this.f24932c), this.f24933d, Integer.valueOf(this.f24934e), this.f24935f, Double.valueOf(this.f24936g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f24930a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 8);
        parcel.writeDouble(this.f24930a);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f24931b ? 1 : 0);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f24932c);
        s8.n.L(parcel, 5, this.f24933d, i9);
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(this.f24934e);
        s8.n.L(parcel, 7, this.f24935f, i9);
        s8.n.V(parcel, 8, 8);
        parcel.writeDouble(this.f24936g);
        s8.n.U(parcel, R2);
    }
}
