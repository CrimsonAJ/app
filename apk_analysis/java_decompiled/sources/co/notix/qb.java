package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qb implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        ob from = (ob) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("impression_data", from.f12876a);
        jSONObject.put("ad_format", from.f12877b.getName());
        return jSONObject;
    }
}
