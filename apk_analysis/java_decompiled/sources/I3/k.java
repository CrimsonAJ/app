package I3;

import android.os.Parcel;
import android.os.Parcelable;
import l4.y;

/* loaded from: classes.dex */
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new H3.b(10);

    /* renamed from: b, reason: collision with root package name */
    public final String f3510b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3511c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3512d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f3510b = str;
        this.f3511c = str2;
        this.f3512d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (y.a(this.f3511c, kVar.f3511c) && y.a(this.f3510b, kVar.f3510b) && y.a(this.f3512d, kVar.f3512d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f3510b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.f3511c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f3512d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": domain=" + this.f3510b + ", description=" + this.f3511c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3509a);
        parcel.writeString(this.f3510b);
        parcel.writeString(this.f3512d);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3510b = readString;
        this.f3511c = parcel.readString();
        this.f3512d = parcel.readString();
    }
}
