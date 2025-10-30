package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k9 implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        l9 from = (l9) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("dn_df", from.f12692a);
        jSONObject.put("dn_ad", from.f12693b);
        jSONObject.put("dn_fb", from.f12694c);
        return jSONObject;
    }
}
