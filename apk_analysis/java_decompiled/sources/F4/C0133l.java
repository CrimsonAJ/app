package F4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133l extends G4.a {
    public static final Parcelable.Creator<C0133l> CREATOR = new A1.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2427c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2428d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2429e;

    public C0133l(int i9, int i10, int i11, boolean z9, boolean z10) {
        this.f2425a = i9;
        this.f2426b = z9;
        this.f2427c = z10;
        this.f2428d = i10;
        this.f2429e = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f2425a);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f2426b ? 1 : 0);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f2427c ? 1 : 0);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f2428d);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f2429e);
        s8.n.U(parcel, R2);
    }
}
