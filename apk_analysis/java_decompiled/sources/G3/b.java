package G3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;
import l4.y;
import u0.z;

/* loaded from: classes.dex */
public class b implements D3.b {
    public static final Parcelable.Creator<b> CREATOR = new A1.a(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f2861a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2862b;

    public b(String str, String str2) {
        this.f2861a = str;
        this.f2862b = str2;
    }

    @Override // D3.b
    public final void b(C1444a0 c1444a0) {
        String str = this.f2861a;
        str.getClass();
        String str2 = this.f2862b;
        char c3 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c3 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c3 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c3 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c3 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c3 = 4;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                c1444a0.f19508c = str2;
                return;
            case 1:
                c1444a0.f19506a = str2;
                return;
            case 2:
                c1444a0.f19512g = str2;
                return;
            case 3:
                c1444a0.f19509d = str2;
                return;
            case 4:
                c1444a0.f19507b = str2;
                return;
            default:
                return;
        }
    }

    @Override // D3.b
    public final /* synthetic */ M c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D3.b
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f2861a.equals(bVar.f2861a) && this.f2862b.equals(bVar.f2862b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2862b.hashCode() + z.c(this.f2861a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f2861a + "=" + this.f2862b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f2861a);
        parcel.writeString(this.f2862b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f2861a = readString;
        this.f2862b = parcel.readString();
    }
}
