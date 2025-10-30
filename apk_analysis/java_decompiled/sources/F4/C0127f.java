package F4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127f extends G4.a {
    public static final Parcelable.Creator<C0127f> CREATOR = new A1.a(17);

    /* renamed from: a, reason: collision with root package name */
    public final C0133l f2391a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2392b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2393c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f2394d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2395e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2396f;

    public C0127f(C0133l c0133l, boolean z9, boolean z10, int[] iArr, int i9, int[] iArr2) {
        this.f2391a = c0133l;
        this.f2392b = z9;
        this.f2393c = z10;
        this.f2394d = iArr;
        this.f2395e = i9;
        this.f2396f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.L(parcel, 1, this.f2391a, i9);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f2392b ? 1 : 0);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f2393c ? 1 : 0);
        s8.n.I(parcel, 4, this.f2394d);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f2395e);
        s8.n.I(parcel, 6, this.f2396f);
        s8.n.U(parcel, R2);
    }
}
