package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s4 implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f13148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gr f13149b;

    public s4(n4 n4Var, k kVar) {
        this.f13148a = n4Var;
        this.f13149b = kVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        t4 from = (t4) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        gr grVar = this.f13148a;
        gr grVar2 = this.f13149b;
        jSONObject.put("id", from.f13208a);
        jSONObject.put("interstitial_request", grVar.a(from.f13209b));
        jSONObject.put("interstitial_model", grVar2.a(from.f13210c));
        jSONObject.put("valid_until", from.f13211d);
        return jSONObject;
    }
}
