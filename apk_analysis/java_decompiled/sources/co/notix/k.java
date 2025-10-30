package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        l from = (l) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("title", from.f12649a);
        jSONObject.put("description", from.f12650b);
        jSONObject.put("image_url", from.f12651c);
        jSONObject.put("icon_url", from.f12652d);
        jSONObject.put("target_url", from.f12653e);
        jSONObject.put("impression_data", from.f12654f);
        jSONObject.put("nurl", from.f12655g);
        jSONObject.put("adm", from.f12656h);
        return jSONObject;
    }
}
