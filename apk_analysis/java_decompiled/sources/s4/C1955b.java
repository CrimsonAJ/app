package s4;

import F4.y;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r4.C1928c;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f22712c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C1955b f22713d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f22714a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f22715b;

    public C1955b(Context context) {
        this.f22715b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C1955b a(Context context) {
        y.h(context);
        ReentrantLock reentrantLock = f22712c;
        reentrantLock.lock();
        try {
            if (f22713d == null) {
                f22713d = new C1955b(context.getApplicationContext());
            }
            C1955b c1955b = f22713d;
            reentrantLock.unlock();
            return c1955b;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return AbstractC0953k1.o(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String d9;
        String d10 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d10) && (d9 = d(f("googleSignInAccount", d10))) != null) {
            try {
                return GoogleSignInAccount.f(d9);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        y.h(googleSignInAccount);
        y.h(googleSignInOptions);
        String str = googleSignInAccount.f14552i;
        e("defaultGoogleSignInAccount", str);
        String f9 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f14545b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f14546c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f14547d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f14548e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f14553k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f14554l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f14549f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f14550g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f14551h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.j;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C1928c.f22631b);
            int i9 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f14654b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(f9, jSONObject.toString());
            String f10 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f14570h;
            String str10 = googleSignInOptions.f14569g;
            ArrayList arrayList2 = googleSignInOptions.f14564b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f14562q);
                int size = arrayList2.size();
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    jSONArray2.put(((Scope) obj).f14654b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f14565c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f14566d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f14568f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f14567e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(f10, jSONObject2.toString());
            } catch (JSONException e8) {
                throw new RuntimeException(e8);
            }
        } catch (JSONException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f22714a;
        reentrantLock.lock();
        try {
            return this.f22715b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f22714a;
        reentrantLock.lock();
        try {
            this.f22715b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
