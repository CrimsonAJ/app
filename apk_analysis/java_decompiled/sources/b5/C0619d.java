package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619d extends G4.a {
    public static final Parcelable.Creator<C0619d> CREATOR = new android.support.v4.media.a(4);

    /* renamed from: a, reason: collision with root package name */
    public final long f11056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11057b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11058c;

    public C0619d(long j, long j4, int i9) {
        this.f11056a = j;
        this.f11057b = i9;
        this.f11058c = j4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 8);
        parcel.writeLong(this.f11056a);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f11057b);
        s8.n.V(parcel, 3, 8);
        parcel.writeLong(this.f11058c);
        s8.n.U(parcel, R2);
    }
}
