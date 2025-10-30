package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class po implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        qo from = (qo) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", from.f13067a);
        jSONObject.put("level", from.f13068b.f13063a);
        return jSONObject;
    }
}
