package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h8 implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        f8 from = (f8) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("click_data", from.f12233a);
        return jSONObject;
    }
}
