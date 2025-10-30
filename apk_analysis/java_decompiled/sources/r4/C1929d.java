package r4;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import co.notix.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import s4.C1954a;
import s8.e;

/* renamed from: r4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1929d implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22633a;

    public /* synthetic */ C1929d(int i9) {
        this.f22633a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f22633a) {
            case 0:
                int f02 = e.f0(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j = 0;
                int i9 = 0;
                while (parcel.dataPosition() < f02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i9 = e.T(parcel, readInt);
                            break;
                        case 2:
                            str = e.o(parcel, readInt);
                            break;
                        case 3:
                            str2 = e.o(parcel, readInt);
                            break;
                        case 4:
                            str3 = e.o(parcel, readInt);
                            break;
                        case 5:
                            str4 = e.o(parcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) e.n(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = e.o(parcel, readInt);
                            break;
                        case '\b':
                            j = e.U(parcel, readInt);
                            break;
                        case '\t':
                            str6 = e.o(parcel, readInt);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            arrayList = e.s(parcel, readInt, Scope.CREATOR);
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            str7 = e.o(parcel, readInt);
                            break;
                        case '\f':
                            str8 = e.o(parcel, readInt);
                            break;
                        default:
                            e.e0(parcel, readInt);
                            break;
                    }
                }
                e.w(parcel, f02);
                return new GoogleSignInAccount(i9, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
            case 1:
                int f03 = e.f0(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i10 = 0;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                while (parcel.dataPosition() < f03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i10 = e.T(parcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = e.s(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) e.n(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z9 = e.P(parcel, readInt2);
                            break;
                        case 5:
                            z10 = e.P(parcel, readInt2);
                            break;
                        case 6:
                            z11 = e.P(parcel, readInt2);
                            break;
                        case 7:
                            str9 = e.o(parcel, readInt2);
                            break;
                        case '\b':
                            str10 = e.o(parcel, readInt2);
                            break;
                        case '\t':
                            arrayList2 = e.s(parcel, readInt2, C1954a.CREATOR);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            str11 = e.o(parcel, readInt2);
                            break;
                        default:
                            e.e0(parcel, readInt2);
                            break;
                    }
                }
                e.w(parcel, f03);
                return new GoogleSignInOptions(i10, arrayList3, account, z9, z10, z11, str9, str10, GoogleSignInOptions.g(arrayList2), str11);
            default:
                int f04 = e.f0(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < f04) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 4) {
                        if (c3 != 7) {
                            if (c3 != '\b') {
                                e.e0(parcel, readInt3);
                            } else {
                                str13 = e.o(parcel, readInt3);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) e.n(parcel, readInt3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str12 = e.o(parcel, readInt3);
                    }
                }
                e.w(parcel, f04);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.f22633a) {
            case 0:
                return new GoogleSignInAccount[i9];
            case 1:
                return new GoogleSignInOptions[i9];
            default:
                return new SignInAccount[i9];
        }
    }
}
