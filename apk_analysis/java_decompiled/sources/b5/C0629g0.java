package b5;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b5.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0629g0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0650n0 f11122a;

    public /* synthetic */ C0629g0(C0650n0 c0650n0) {
        this.f11122a = c0650n0;
    }

    public boolean a() {
        C0650n0 c0650n0 = this.f11122a;
        try {
            M4.b a5 = M4.c.a(c0650n0.f11221a);
            if (a5 == null) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10978n.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a5.c(128, "com.android.vending").versionCode < 80837300) {
                return false;
            }
            return true;
        } catch (Exception e8) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10978n.c(e8, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // b5.U0
    public void f(int i9, IOException iOException, byte[] bArr) {
        V v8;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        int i10 = i9;
        C0650n0 c0650n0 = this.f11122a;
        if (i10 != 200 && i10 != 204) {
            if (i10 == 304) {
                i10 = 304;
            }
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10974i.d(Integer.valueOf(i10), iOException, "Network Request for Deferred Deep Link failed. response, exception");
        }
        if (iOException == null) {
            C0623e0 c0623e0 = c0650n0.f11228h;
            C0650n0.d(c0623e0);
            c0623e0.f11101u.a(true);
            V v10 = c0650n0.f11229i;
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(optString)) {
                        C0650n0.f(v10);
                        v10.f10977m.b("Deferred Deep Link is empty.");
                        return;
                    }
                    String optString2 = jSONObject.optString("gclid", "");
                    String optString3 = jSONObject.optString("gbraid", "");
                    String optString4 = jSONObject.optString("gad_source", "");
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle2 = new Bundle();
                    P1 p12 = c0650n0.f11231l;
                    C0650n0.d(p12);
                    C0650n0 c0650n02 = (C0650n0) p12.f1707a;
                    if (TextUtils.isEmpty(optString)) {
                        v8 = v10;
                    } else {
                        Context context = c0650n02.f11221a;
                        v8 = v10;
                        try {
                            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(optString3)) {
                                    bundle2.putString("gbraid", optString3);
                                }
                                if (!TextUtils.isEmpty(optString4)) {
                                    bundle2.putString("gad_source", optString4);
                                }
                                bundle2.putString("gclid", optString2);
                                bundle2.putString("_cis", "ddp");
                                c0650n0.f11235p.w0("auto", "_cmp", bundle2);
                                if (!TextUtils.isEmpty(optString)) {
                                    try {
                                        SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                        edit.putString("deeplink", optString);
                                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                        if (edit.commit()) {
                                            Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                            Context context2 = c0650n02.f11221a;
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                makeBasic = BroadcastOptions.makeBasic();
                                                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                                                bundle = shareIdentityEnabled.toBundle();
                                                context2.sendBroadcast(intent, null, bundle);
                                                return;
                                            }
                                            context2.sendBroadcast(intent);
                                            return;
                                        }
                                        return;
                                    } catch (RuntimeException e8) {
                                        V v11 = c0650n02.f11229i;
                                        C0650n0.f(v11);
                                        v11.f10971f.c(e8, "Failed to persist Deferred Deep Link. exception");
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (JSONException e9) {
                            e = e9;
                            v10 = v8;
                            C0650n0.f(v10);
                            v10.f10971f.c(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    C0650n0.f(v8);
                    v8.f10974i.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                } catch (JSONException e10) {
                    e = e10;
                }
            } else {
                C0650n0.f(v10);
                v10.f10977m.b("Deferred Deep Link response empty.");
                return;
            }
        }
        V v92 = c0650n0.f11229i;
        C0650n0.f(v92);
        v92.f10974i.d(Integer.valueOf(i10), iOException, "Network Request for Deferred Deep Link failed. response, exception");
    }

    public C0629g0(J1 j12) {
        this.f11122a = j12.f10755l;
    }
}
