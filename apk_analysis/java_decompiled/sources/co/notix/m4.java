package co.notix;

import co.notix.domain.RequestVars;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m4 implements gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12759a;

    public m4(fo foVar) {
        this.f12759a = foVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        if (from.has("width")) {
            long j = from.getLong("zone_id");
            gb gbVar = this.f12759a;
            JSONObject jSONObject = from.getJSONObject("vars");
            kotlin.jvm.internal.h.d(jSONObject, "from.getJSONObject(\"vars\")");
            return new j7(j, (RequestVars) gbVar.a(jSONObject), jc.b(from, "experiment"), jc.b(from, "width"), jc.b(from, "height"));
        }
        long j4 = from.getLong("zone_id");
        gb gbVar2 = this.f12759a;
        JSONObject jSONObject2 = from.getJSONObject("vars");
        kotlin.jvm.internal.h.d(jSONObject2, "from.getJSONObject(\"vars\")");
        return new w8(j4, (RequestVars) gbVar2.a(jSONObject2), jc.b(from, "experiment"));
    }
}
