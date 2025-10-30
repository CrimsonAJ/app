package com.google.android.gms.auth.api.signin;

import F4.y;
import G4.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r4.C1929d;
import s8.n;

/* loaded from: classes.dex */
public class SignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C1929d(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f14572a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f14573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14574c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f14573b = googleSignInAccount;
        y.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f14572a = str;
        y.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f14574c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.M(parcel, 4, this.f14572a);
        n.L(parcel, 7, this.f14573b, i9);
        n.M(parcel, 8, this.f14574c);
        n.U(parcel, R2);
    }
}
