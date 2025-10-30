package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oj implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f12898a;

    public oj(n nVar) {
        this.f12898a = nVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        pj from = (pj) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        gr grVar = this.f12898a;
        jSONObject.put("user", from.f12974a);
        jSONObject.put("app", from.f12975b);
        jSONObject.put("var_1", from.f12976c);
        jSONObject.put("var_2", from.f12977d);
        jSONObject.put("var_3", from.f12978e);
        jSONObject.put("var_4", from.f12979f);
        jSONObject.put("var_5", from.f12980g);
        jSONObject.put("cnt", grVar.a(from.f12981h));
        return jSONObject;
    }
}
