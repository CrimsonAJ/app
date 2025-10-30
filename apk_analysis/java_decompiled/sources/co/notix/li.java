package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class li implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String string = from.getString("id");
        kotlin.jvm.internal.h.d(string, "from.getString(\"id\")");
        String string2 = from.getString("type");
        kotlin.jvm.internal.h.d(string2, "from.getString(\"type\")");
        int i9 = from.getInt("retryCount");
        long j = from.getLong("nextRetryTime");
        JSONObject jSONObject = from.getJSONObject("paramsJson");
        kotlin.jvm.internal.h.d(jSONObject, "from.getJSONObject(\"paramsJson\")");
        return new ni(string, string2, i9, j, jSONObject);
    }
}
