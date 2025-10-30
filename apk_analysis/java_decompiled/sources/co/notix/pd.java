package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pd extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd f12943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f12947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f12948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(qd qdVar, String str, String str2, String str3, String str4, String str5, E7.d dVar) {
        super(2, dVar);
        this.f12943b = qdVar;
        this.f12944c = str;
        this.f12945d = str2;
        this.f12946e = str3;
        this.f12947f = str4;
        this.f12948g = str5;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new pd(this.f12943b, this.f12944c, this.f12945d, this.f12946e, this.f12947f, this.f12948g, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((pd) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12942a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        JSONObject jSONObject = new JSONObject();
        String str = this.f12945d;
        String str2 = this.f12946e;
        String str3 = this.f12944c;
        String str4 = this.f12947f;
        String str5 = this.f12948g;
        jSONObject.put("action", str);
        jSONObject.put("uuid", str2);
        jSONObject.put("app_id", str3);
        jSONObject.put("audience", str4);
        jSONObject.put("package_name", str5);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.h.d(jSONObject2, "JSONObject().apply {\n   …ame)\n        }.toString()");
        dh dhVar = this.f12943b.f13035a;
        String str6 = "/api/inapp/android/audiences?app_id=" + this.f12944c;
        Cdo cdo = new Cdo(jSONObject2);
        od odVar = od.f12880a;
        no noVar = no.f12834d;
        Set set = io.f12491a;
        this.f12942a = 1;
        Object a5 = ((gh) dhVar).a(3, str6, true, cdo, odVar, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
