package F4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes.dex */
public final class q extends G4.a {
    public static final Parcelable.Creator<q> CREATOR = new A1.a(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f2439a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f2440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2441c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f2442d;

    public q(int i9, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f2439a = i9;
        this.f2440b = account;
        this.f2441c = i10;
        this.f2442d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f2439a);
        s8.n.L(parcel, 2, this.f2440b, i9);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f2441c);
        s8.n.L(parcel, 4, this.f2442d, i9);
        s8.n.U(parcel, R2);
    }
}
