package co.notix;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yd implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        zd from = (zd) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("foreground_time", from.f13671l);
        jSONObject2.put("periodic_worker_run_count", from.f13672m);
        jSONObject.put("usage_stats", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("app_version", from.f13662b);
        jSONObject3.put("android_api", from.f13666f);
        jSONObject3.put("app_target_sdk", from.f13667g);
        jSONObject3.put("notix_sdk_version", from.f13668h);
        jSONObject3.put("model", from.f13669i);
        jSONObject3.put("manufacturer", from.j);
        JSONArray jSONArray = new JSONArray();
        Iterator it = from.f13670k.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject3.put("supported_abis", jSONArray);
        jSONObject.put("client_info", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("can_post", from.f13673n);
        jSONObject.put("notifications", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("metric_type", "general");
        jSONObject5.put("created_date_timestamp", from.f13661a);
        jSONObject5.put("data", jSONObject);
        jSONObject5.put("app_id", from.f13663c);
        jSONObject5.put("uuid", from.f13664d);
        jSONObject5.put("package_name", from.f13665e);
        return jSONObject5;
    }
}
