package com.google.android.gms.auth.api.signin;

import C4.b;
import G4.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import r4.C1928c;
import r4.C1929d;
import s4.C1954a;
import s8.n;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: k, reason: collision with root package name */
    public static final GoogleSignInOptions f14556k;

    /* renamed from: l, reason: collision with root package name */
    public static final Scope f14557l;

    /* renamed from: m, reason: collision with root package name */
    public static final Scope f14558m;

    /* renamed from: n, reason: collision with root package name */
    public static final Scope f14559n;

    /* renamed from: o, reason: collision with root package name */
    public static final Scope f14560o;

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f14561p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1928c f14562q;

    /* renamed from: a, reason: collision with root package name */
    public final int f14563a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14564b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f14565c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14566d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14567e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14568f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14569g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14570h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f14571i;
    public final String j;

    static {
        Scope scope = new Scope(1, "profile");
        f14557l = scope;
        f14558m = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f14559n = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f14560o = scope3;
        f14561p = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f14561p)) {
            Scope scope4 = f14560o;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f14556k = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f14561p)) {
            Scope scope5 = f14560o;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new C1929d(1);
        f14562q = new C1928c(1);
    }

    public GoogleSignInOptions(int i9, ArrayList arrayList, Account account, boolean z9, boolean z10, boolean z11, String str, String str2, HashMap hashMap, String str3) {
        this.f14563a = i9;
        this.f14564b = arrayList;
        this.f14565c = account;
        this.f14566d = z9;
        this.f14567e = z10;
        this.f14568f = z11;
        this.f14569g = str;
        this.f14570h = str2;
        this.f14571i = new ArrayList(hashMap.values());
        this.j = str3;
    }

    public static GoogleSignInOptions f(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            hashSet.add(new Scope(1, jSONArray.getString(i9)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z9 = jSONObject.getBoolean("idTokenRequested");
        boolean z10 = jSONObject.getBoolean("serverAuthRequested");
        boolean z11 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z9, z10, z11, str3, str4, new HashMap(), null);
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                C1954a c1954a = (C1954a) obj;
                hashMap.put(Integer.valueOf(c1954a.f22710b), c1954a);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.f14569g;
        ArrayList arrayList = this.f14564b;
        if (obj != null) {
            try {
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                ArrayList arrayList2 = googleSignInOptions.f14564b;
                String str2 = googleSignInOptions.f14569g;
                Account account = googleSignInOptions.f14565c;
                if (this.f14571i.isEmpty() && googleSignInOptions.f14571i.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                    Account account2 = this.f14565c;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.f14568f == googleSignInOptions.f14568f && this.f14566d == googleSignInOptions.f14566d && this.f14567e == googleSignInOptions.f14567e) {
                        if (TextUtils.equals(this.j, googleSignInOptions.j)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f14564b;
        int size = arrayList2.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f14654b);
        }
        Collections.sort(arrayList);
        int hashCode3 = arrayList.hashCode() + (1 * 31);
        Account account = this.f14565c;
        int i11 = hashCode3 * 31;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i12 = i11 + hashCode;
        String str = this.f14569g;
        int i13 = i12 * 31;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i14 = ((((((i13 + hashCode2) * 31) + (this.f14568f ? 1 : 0)) * 31) + (this.f14566d ? 1 : 0)) * 31) + (this.f14567e ? 1 : 0);
        String str2 = this.j;
        int i15 = i14 * 31;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i15 + i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f14563a);
        n.P(parcel, 2, new ArrayList(this.f14564b));
        n.L(parcel, 3, this.f14565c, i9);
        n.V(parcel, 4, 4);
        parcel.writeInt(this.f14566d ? 1 : 0);
        n.V(parcel, 5, 4);
        parcel.writeInt(this.f14567e ? 1 : 0);
        n.V(parcel, 6, 4);
        parcel.writeInt(this.f14568f ? 1 : 0);
        n.M(parcel, 7, this.f14569g);
        n.M(parcel, 8, this.f14570h);
        n.P(parcel, 9, this.f14571i);
        n.M(parcel, 10, this.j);
        n.U(parcel, R2);
    }
}
