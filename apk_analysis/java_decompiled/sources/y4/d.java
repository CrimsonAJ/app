package y4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import t4.C2010B;

/* loaded from: classes.dex */
public final class d extends G4.a {
    public static final Parcelable.Creator<d> CREATOR = new C2010B(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f24921a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24922b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24923c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24924d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24925e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24926f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24927g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24928h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24929i;

    public d(int i9, boolean z9, boolean z10, String str, String str2, String str3, String str4, String str5, boolean z11) {
        this.f24921a = i9;
        this.f24922b = z9;
        this.f24923c = z10;
        this.f24924d = str;
        this.f24925e = str2;
        this.f24926f = str3;
        this.f24927g = str4;
        this.f24928h = str5;
        this.f24929i = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f24921a == dVar.f24921a && this.f24922b == dVar.f24922b && this.f24923c == dVar.f24923c && TextUtils.equals(this.f24924d, dVar.f24924d) && TextUtils.equals(this.f24925e, dVar.f24925e) && TextUtils.equals(this.f24926f, dVar.f24926f) && TextUtils.equals(this.f24927g, dVar.f24927g) && TextUtils.equals(this.f24928h, dVar.f24928h) && this.f24929i == dVar.f24929i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24921a), Boolean.valueOf(this.f24922b), Boolean.valueOf(this.f24923c), this.f24924d, this.f24925e, this.f24926f, this.f24927g, this.f24928h, Boolean.valueOf(this.f24929i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f24921a);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f24922b ? 1 : 0);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f24923c ? 1 : 0);
        s8.n.M(parcel, 5, this.f24924d);
        s8.n.M(parcel, 6, this.f24925e);
        s8.n.M(parcel, 7, this.f24926f);
        s8.n.M(parcel, 8, this.f24927g);
        s8.n.M(parcel, 9, this.f24928h);
        s8.n.V(parcel, 10, 4);
        parcel.writeInt(this.f24929i ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
