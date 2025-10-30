package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ud implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        vd from = (vd) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("metric_type", "app_install");
        jSONObject.put("created_date_timestamp", from.f13354a);
        jSONObject.put("app_id", from.f13357d);
        jSONObject.put("uuid", from.f13355b);
        jSONObject.put("package_name", from.f13356c);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("app_id", from.f13357d);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }
}
