package B4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends G4.a {
    public static final Parcelable.Creator<d> CREATOR = new A1.a(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f692b;

    /* renamed from: c, reason: collision with root package name */
    public final long f693c;

    public d(long j, String str, int i9) {
        this.f691a = str;
        this.f692b = i9;
        this.f693c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f691a;
            if (((str != null && str.equals(dVar.f691a)) || (str == null && dVar.f691a == null)) && f() == dVar.f()) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        long j = this.f693c;
        if (j == -1) {
            return this.f692b;
        }
        return j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f691a, Long.valueOf(f())});
    }

    public final String toString() {
        A1.g gVar = new A1.g(this);
        gVar.j(this.f691a, "name");
        gVar.j(Long.valueOf(f()), "version");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 1, this.f691a);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f692b);
        long f9 = f();
        s8.n.V(parcel, 3, 8);
        parcel.writeLong(f9);
        s8.n.U(parcel, R2);
    }

    public d(String str) {
        this.f691a = str;
        this.f693c = 1L;
        this.f692b = -1;
    }
}
