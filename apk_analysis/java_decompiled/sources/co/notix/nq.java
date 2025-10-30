package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nq implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        oq from = (oq) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user", from.f12909a);
        jSONObject.put("app_id", from.f12910b);
        return jSONObject;
    }
}
