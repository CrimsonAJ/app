package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cl extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el f12050a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(InterfaceC0484z interfaceC0484z, el elVar) {
        super(1);
        this.f12050a = elVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Object h7;
        String jSONObject;
        try {
            h7 = new JSONArray((String) obj).getJSONObject(0);
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        if (h7 instanceof A7.i) {
            h7 = null;
        }
        JSONObject jSONObject2 = (JSONObject) h7;
        if (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) {
            return null;
        }
        ic icVar = this.f12050a.f12185b;
        JSONObject jSONObject3 = new JSONObject(jSONObject);
        gb gbVar = (gb) icVar.f12450b.get(we.class);
        if (gbVar != null) {
            return (we) gbVar.a(jSONObject3);
        }
        throw new NullPointerException(n2.a("FromJsonAdapter for class ", we.class, " not found"));
    }
}
