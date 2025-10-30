package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sj implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        tj from = (tj) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", from.f13235a);
        jSONObject.put("message", from.f13236b);
        return jSONObject;
    }
}
