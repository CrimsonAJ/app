package co.notix;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class jc {
    public static final Boolean a(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        try {
            return Boolean.valueOf(jSONObject.getBoolean(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final Integer b(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        try {
            return Integer.valueOf(jSONObject.getInt(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final Long c(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        try {
            return Long.valueOf(jSONObject.getLong(name));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final String d(JSONObject jSONObject, String name) {
        kotlin.jvm.internal.h.e(jSONObject, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        try {
            return jSONObject.getString(name);
        } catch (JSONException unused) {
            return null;
        }
    }
}
