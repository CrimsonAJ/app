package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final long f16508d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a, reason: collision with root package name */
    public final String f16509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16510b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16511c;

    public t(long j, String str, String str2) {
        this.f16509a = str;
        this.f16510b = str2;
        this.f16511c = j;
    }

    public static String a(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e8) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e8);
            return null;
        }
    }

    public static t b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new t(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e8) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e8);
                return null;
            }
        }
        return new t(0L, str, null);
    }
}
