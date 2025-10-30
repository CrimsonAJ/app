package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n8 implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        l8 from = (l8) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("close_data", from.f12689a);
        jSONObject.put("ad_format", from.f12690b.getName());
        jSONObject.put("reason", from.f12691c.f12935a);
        return jSONObject;
    }
}
