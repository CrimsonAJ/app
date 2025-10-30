package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mi implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        ni from = (ni) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", from.f12824a);
        jSONObject.put("type", from.f12825b);
        jSONObject.put("retryCount", from.f12826c);
        jSONObject.put("nextRetryTime", from.f12827d);
        jSONObject.put("paramsJson", from.f12828e);
        return jSONObject;
    }
}
