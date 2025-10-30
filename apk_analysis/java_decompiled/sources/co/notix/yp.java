package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yp extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(yh yhVar) {
        super(1);
        this.f13621a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        i9 i9Var = (i9) obj;
        if (i9Var != null) {
            yh yhVar = this.f13621a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", i9Var.f12441a);
            Object obj2 = i9Var.f12442b;
            if (obj2 != null) {
                gr grVar = (gr) yhVar.f13609c.f12449a.get(sp.class);
                if (grVar != null) {
                    jSONObject.put("data", grVar.a(obj2));
                } else {
                    throw new NullPointerException(n2.a("ToJsonAdapter for class ", sp.class, " not found"));
                }
            }
            jSONObject.put("error", i9Var.f12443c);
            return jSONObject;
        }
        return null;
    }
}
