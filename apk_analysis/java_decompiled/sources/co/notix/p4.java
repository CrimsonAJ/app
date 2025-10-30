package co.notix;

import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p4 implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f12926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gr f12927b;

    public p4(n4 n4Var, n nVar) {
        this.f12926a = n4Var;
        this.f12927b = nVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        q4 from = (q4) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        gr grVar = this.f12926a;
        gr grVar2 = this.f12927b;
        JSONObject jSONObject2 = (JSONObject) grVar.a(from.f13018a);
        Iterator<String> keys = jSONObject2.keys();
        kotlin.jvm.internal.h.d(keys, "internalJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.get(next));
        }
        jSONObject.put("user", from.f13019b);
        jSONObject.put("pt", 3);
        jSONObject.put("cdt", from.f13020c);
        jSONObject.put("notix_sdk_version", from.f13021d);
        jSONObject.put("cnt", grVar2.a(from.f13022e));
        return jSONObject;
    }
}
