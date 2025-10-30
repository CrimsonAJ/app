package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wd implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        xd from = (xd) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("metric_type", "app_update");
        jSONObject.put("created_date_timestamp", from.f13518a);
        jSONObject.put("app_id", from.f13521d);
        jSONObject.put("uuid", from.f13519b);
        jSONObject.put("package_name", from.f13520c);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("package_name", from.f13520c);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }
}
