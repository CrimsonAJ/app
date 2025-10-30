package co.notix;

import co.notix.domain.RequestVars;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class go implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        RequestVars from = (RequestVars) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("var1", from.getVar1());
        jSONObject.put("var2", from.getVar2());
        jSONObject.put("var3", from.getVar3());
        jSONObject.put("var4", from.getVar4());
        jSONObject.put("var5", from.getVar5());
        return jSONObject;
    }
}
