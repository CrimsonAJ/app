package co.notix;

import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n4 implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f12809a;

    public n4(go goVar) {
        this.f12809a = goVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject jSONObject;
        o4 from = (o4) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject2 = new JSONObject();
        gr grVar = this.f12809a;
        jSONObject2.put("zone_id", from.c());
        jSONObject2.put("vars", grVar.a(from.b()));
        jSONObject2.put("experiment", from.a());
        if (from instanceof w8) {
            jSONObject = new JSONObject();
        } else if (from instanceof j7) {
            j7 j7Var = (j7) from;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", j7Var.f12536d);
            jSONObject3.put("height", j7Var.f12537e);
            jSONObject = jSONObject3;
        } else {
            throw new RuntimeException();
        }
        Iterator<String> keys = jSONObject.keys();
        kotlin.jvm.internal.h.d(keys, "internalJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.get(next));
        }
        return jSONObject2;
    }
}
