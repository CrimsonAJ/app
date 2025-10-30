package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rj implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        long j = from.getLong("timestamp");
        String string = from.getString("message");
        kotlin.jvm.internal.h.d(string, "from.getString(\"message\")");
        return new tj(j, string);
    }
}
