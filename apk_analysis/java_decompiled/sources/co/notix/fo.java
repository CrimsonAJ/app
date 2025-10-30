package co.notix;

import co.notix.domain.RequestVars;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fo implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        return new RequestVars(jc.d(from, "var1"), jc.d(from, "var2"), jc.d(from, "var3"), jc.d(from, "var4"), jc.d(from, "var5"));
    }
}
