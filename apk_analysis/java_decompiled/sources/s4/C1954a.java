package s4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import s8.n;

/* renamed from: s4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954a extends G4.a {
    public static final Parcelable.Creator<C1954a> CREATOR = new C1381b(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f22709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22710b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f22711c;

    public C1954a(int i9, int i10, Bundle bundle) {
        this.f22709a = i9;
        this.f22710b = i10;
        this.f22711c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f22709a);
        n.V(parcel, 2, 4);
        parcel.writeInt(this.f22710b);
        n.F(parcel, 3, this.f22711c);
        n.U(parcel, R2);
    }
}
