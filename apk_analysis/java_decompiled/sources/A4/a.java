package A4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends G4.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f331a;

    public a(Intent intent) {
        this.f331a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.L(parcel, 1, this.f331a, i9);
        s8.n.U(parcel, R2);
    }
}
