package I3;

import android.os.Parcel;
import android.os.Parcelable;
import l4.y;

/* loaded from: classes.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new H3.b(8);

    /* renamed from: b, reason: collision with root package name */
    public final String f3497b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3498c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3499d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f3497b = str;
        this.f3498c = str2;
        this.f3499d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (y.a(this.f3498c, eVar.f3498c) && y.a(this.f3497b, eVar.f3497b) && y.a(this.f3499d, eVar.f3499d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f3497b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.f3498c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f3499d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": language=" + this.f3497b + ", description=" + this.f3498c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3509a);
        parcel.writeString(this.f3497b);
        parcel.writeString(this.f3499d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3497b = readString;
        this.f3498c = parcel.readString();
        this.f3499d = parcel.readString();
    }
}
