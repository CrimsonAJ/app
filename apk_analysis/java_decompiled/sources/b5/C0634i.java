package b5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0634i extends G4.a {
    public static final Parcelable.Creator<C0634i> CREATOR = new android.support.v4.media.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f11139a;

    public C0634i(Bundle bundle) {
        this.f11139a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.F(parcel, 1, this.f11139a);
        s8.n.U(parcel, R2);
    }
}
