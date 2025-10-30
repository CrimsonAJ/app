package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r4 implements gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f13081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gb f13082b;

    public r4(m4 m4Var, j jVar) {
        this.f13081a = m4Var;
        this.f13082b = jVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String string = from.getString("id");
        kotlin.jvm.internal.h.d(string, "from.getString(\"id\")");
        gb gbVar = this.f13081a;
        JSONObject jSONObject = from.getJSONObject("interstitial_request");
        kotlin.jvm.internal.h.d(jSONObject, "from.getJSONObject(\"interstitial_request\")");
        o4 o4Var = (o4) gbVar.a(jSONObject);
        gb gbVar2 = this.f13082b;
        JSONObject jSONObject2 = from.getJSONObject("interstitial_model");
        kotlin.jvm.internal.h.d(jSONObject2, "from.getJSONObject(\"interstitial_model\")");
        return new t4(string, o4Var, (l) gbVar2.a(jSONObject2), from.getLong("valid_until"));
    }
}
