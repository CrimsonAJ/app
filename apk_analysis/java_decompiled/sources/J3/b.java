package J3;

import B6.u0;
import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;

/* loaded from: classes.dex */
public final class b implements D3.b {
    public static final Parcelable.Creator<b> CREATOR = new H3.b(16);

    /* renamed from: a, reason: collision with root package name */
    public final long f4177a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4178b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4179c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4180d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4181e;

    public b(long j, long j4, long j9, long j10, long j11) {
        this.f4177a = j;
        this.f4178b = j4;
        this.f4179c = j9;
        this.f4180d = j10;
        this.f4181e = j11;
    }

    @Override // D3.b
    public final /* synthetic */ void b(C1444a0 c1444a0) {
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4177a == bVar.f4177a && this.f4178b == bVar.f4178b && this.f4179c == bVar.f4179c && this.f4180d == bVar.f4180d && this.f4181e == bVar.f4181e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return u0.A(this.f4181e) + ((u0.A(this.f4180d) + ((u0.A(this.f4179c) + ((u0.A(this.f4178b) + ((u0.A(this.f4177a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f4177a + ", photoSize=" + this.f4178b + ", photoPresentationTimestampUs=" + this.f4179c + ", videoStartPosition=" + this.f4180d + ", videoSize=" + this.f4181e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f4177a);
        parcel.writeLong(this.f4178b);
        parcel.writeLong(this.f4179c);
        parcel.writeLong(this.f4180d);
        parcel.writeLong(this.f4181e);
    }

    public b(Parcel parcel) {
        this.f4177a = parcel.readLong();
        this.f4178b = parcel.readLong();
        this.f4179c = parcel.readLong();
        this.f4180d = parcel.readLong();
        this.f4181e = parcel.readLong();
    }
}
