package com.google.android.gms.auth.api.signin.internal;

import F4.y;
import G4.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i5.C1381b;
import s8.n;

/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C1381b(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f14575a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInOptions f14576b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        y.e(str);
        this.f14575a = str;
        this.f14576b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f14575a.equals(signInConfiguration.f14575a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f14576b;
            GoogleSignInOptions googleSignInOptions2 = this.f14576b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 1 * 31;
        int i10 = 0;
        String str = this.f14575a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        GoogleSignInOptions googleSignInOptions = this.f14576b;
        if (googleSignInOptions != null) {
            i10 = googleSignInOptions.hashCode();
        }
        return i11 + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.M(parcel, 2, this.f14575a);
        n.L(parcel, 5, this.f14576b, i9);
        n.U(parcel, R2);
    }
}
