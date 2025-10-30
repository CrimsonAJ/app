package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class up extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wp f13321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(wp wpVar) {
        super(1);
        this.f13321a = wpVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        String str = (String) obj;
        if (str != null) {
            ic icVar = this.f13321a.f13463b;
            JSONObject jSONObject = new JSONObject(str);
            gb gbVar = (gb) icVar.f12450b.get(sp.class);
            if (gbVar != null) {
                return (sp) gbVar.a(jSONObject);
            }
            throw new NullPointerException(n2.a("FromJsonAdapter for class ", sp.class, " not found"));
        }
        throw new IllegalStateException("empty response");
    }
}
