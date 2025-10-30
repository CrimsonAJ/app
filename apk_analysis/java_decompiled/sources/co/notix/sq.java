package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sq implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        qq from = (qq) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("notification", new ve().a(from.f13073a));
        return jSONObject;
    }
}
