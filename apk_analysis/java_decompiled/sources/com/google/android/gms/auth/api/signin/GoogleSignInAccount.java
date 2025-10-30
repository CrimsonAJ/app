package com.google.android.gms.auth.api.signin;

import F4.y;
import G4.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import r4.C1929d;
import s8.n;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1929d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f14544a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14545b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14546c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14547d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14548e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f14549f;

    /* renamed from: g, reason: collision with root package name */
    public String f14550g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14551h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14552i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14553k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14554l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f14555m = new HashSet();

    public GoogleSignInAccount(int i9, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f14544a = i9;
        this.f14545b = str;
        this.f14546c = str2;
        this.f14547d = str3;
        this.f14548e = str4;
        this.f14549f = uri;
        this.f14550g = str5;
        this.f14551h = j;
        this.f14552i = str6;
        this.j = arrayList;
        this.f14553k = str7;
        this.f14554l = str8;
    }

    public static GoogleSignInAccount f(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            hashSet.add(new Scope(1, jSONArray.getString(i9)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        y.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.f14550g = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.f14552i.equals(this.f14552i)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.j);
                        hashSet.addAll(googleSignInAccount.f14555m);
                        HashSet hashSet2 = new HashSet(this.j);
                        hashSet2.addAll(this.f14555m);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14552i.hashCode() + 527;
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.f14555m);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f14544a);
        n.M(parcel, 2, this.f14545b);
        n.M(parcel, 3, this.f14546c);
        n.M(parcel, 4, this.f14547d);
        n.M(parcel, 5, this.f14548e);
        n.L(parcel, 6, this.f14549f, i9);
        n.M(parcel, 7, this.f14550g);
        n.V(parcel, 8, 8);
        parcel.writeLong(this.f14551h);
        n.M(parcel, 9, this.f14552i);
        n.P(parcel, 10, this.j);
        n.M(parcel, 11, this.f14553k);
        n.M(parcel, 12, this.f14554l);
        n.U(parcel, R2);
    }
}
