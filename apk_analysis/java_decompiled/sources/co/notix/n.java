package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        o from = (o) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pnt", from.f12844a);
        jSONObject.put("pnd", from.f12845b);
        jSONObject.put("lnt", from.f12846c);
        jSONObject.put("lnd", from.f12847d);
        jSONObject.put("rnt", from.f12848e);
        jSONObject.put("rnd", from.f12849f);
        jSONObject.put("rst", from.f12850g);
        jSONObject.put("rsd", from.f12851h);
        jSONObject.put("int", from.f12852i);
        jSONObject.put("ind", from.j);
        jSONObject.put("ist", from.f12853k);
        jSONObject.put("isd", from.f12854l);
        return jSONObject;
    }
}
