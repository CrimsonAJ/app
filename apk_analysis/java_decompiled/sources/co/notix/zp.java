package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zp extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13705a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(yh yhVar) {
        super(1);
        this.f13705a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Object obj2 = null;
        if (jSONObject == null) {
            return null;
        }
        yh yhVar = this.f13705a;
        long j = jSONObject.getLong("timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            gb gbVar = (gb) yhVar.f13609c.f12450b.get(sp.class);
            if (gbVar != null) {
                obj2 = gbVar.a(optJSONObject);
            } else {
                throw new NullPointerException(n2.a("FromJsonAdapter for class ", sp.class, " not found"));
            }
        }
        return new i9(j, obj2, jSONObject.getBoolean("error"));
    }
}
