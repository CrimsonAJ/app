package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import co.notix.domain.RequestVars;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zq extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cr f13707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13708c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f13711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f13712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13713h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13714i;
    public final /* synthetic */ RequestVars j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(cr crVar, String str, String str2, String str3, String str4, long j, String str5, int i9, RequestVars requestVars, E7.d dVar) {
        super(2, dVar);
        this.f13707b = crVar;
        this.f13708c = str;
        this.f13709d = str2;
        this.f13710e = str3;
        this.f13711f = str4;
        this.f13712g = j;
        this.f13713h = str5;
        this.f13714i = i9;
        this.j = requestVars;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new zq(this.f13707b, this.f13708c, this.f13709d, this.f13710e, this.f13711f, this.f13712g, this.f13713h, this.f13714i, this.j, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((zq) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13706a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        JSONObject jSONObject = new JSONObject();
        String str = this.f13708c;
        String str2 = this.f13709d;
        String str3 = this.f13710e;
        String str4 = this.f13711f;
        long j = this.f13712g;
        String str5 = this.f13713h;
        int i10 = this.f13714i;
        RequestVars vars = this.j;
        jSONObject.put("uuid", str);
        jSONObject.put("package_name", str2);
        jSONObject.put("appId", str3);
        jSONObject.put("token", str4);
        jSONObject.put("created_date_timestamp", j);
        jSONObject.put("notix_sdk_version", str5);
        jSONObject.put("android_api", i10);
        kotlin.jvm.internal.h.e(vars, "vars");
        jSONObject.put("var_1", vars.getVar1());
        jSONObject.put("var_2", vars.getVar2());
        jSONObject.put("var_3", vars.getVar3());
        jSONObject.put("var_4", vars.getVar4());
        jSONObject.put("var_5", vars.getVar5());
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.h.d(jSONObject2, "JSONObject().apply {\n   …ars)\n        }.toString()");
        dh dhVar = this.f13707b.f12064a;
        Cdo cdo = new Cdo(jSONObject2);
        yq yqVar = yq.f13622a;
        no noVar = no.f12833c;
        Set set = io.f12491a;
        this.f13706a = 1;
        Object a5 = ((gh) dhVar).a(3, "/inapp/android/subscribe", false, cdo, yqVar, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
