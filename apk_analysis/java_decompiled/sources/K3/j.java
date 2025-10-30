package K3;

import A4.r;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends b {
    public static final Parcelable.Creator<j> CREATOR = new H3.b(24);

    /* renamed from: a, reason: collision with root package name */
    public final long f4290a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4291b;

    public j(long j, long j4) {
        this.f4290a = j;
        this.f4291b = j4;
    }

    public static long a(long j, r rVar) {
        long x5 = rVar.x();
        if ((128 & x5) != 0) {
            return 8589934591L & ((((x5 & 1) << 32) | rVar.y()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f4290a);
        parcel.writeLong(this.f4291b);
    }
}
