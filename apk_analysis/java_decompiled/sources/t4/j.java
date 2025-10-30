package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends G4.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f23191a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23192b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23193c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23194d;

    /* renamed from: e, reason: collision with root package name */
    public static final y4.b f23190e = new y4.b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<j> CREATOR = new C1381b(18);

    public j(long j, long j4, boolean z9, boolean z10) {
        this.f23191a = Math.max(j, 0L);
        this.f23192b = Math.max(j4, 0L);
        this.f23193c = z9;
        this.f23194d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f23191a == jVar.f23191a && this.f23192b == jVar.f23192b && this.f23193c == jVar.f23193c && this.f23194d == jVar.f23194d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23191a), Long.valueOf(this.f23192b), Boolean.valueOf(this.f23193c), Boolean.valueOf(this.f23194d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 8);
        parcel.writeLong(this.f23191a);
        s8.n.V(parcel, 3, 8);
        parcel.writeLong(this.f23192b);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f23193c ? 1 : 0);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f23194d ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
