package d5;

import F4.r;
import android.os.Parcel;
import android.os.Parcelable;
import s8.n;

/* loaded from: classes.dex */
public final class e extends G4.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f16878a;

    /* renamed from: b, reason: collision with root package name */
    public final B4.b f16879b;

    /* renamed from: c, reason: collision with root package name */
    public final r f16880c;

    public e(int i9, B4.b bVar, r rVar) {
        this.f16878a = i9;
        this.f16879b = bVar;
        this.f16880c = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f16878a);
        n.L(parcel, 2, this.f16879b, i9);
        n.L(parcel, 3, this.f16880c, i9);
        n.U(parcel, R2);
    }
}
