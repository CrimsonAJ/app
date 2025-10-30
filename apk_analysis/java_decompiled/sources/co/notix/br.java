package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class br extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cr f11964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f11968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(cr crVar, String str, String str2, String str3, String str4, int i9, E7.d dVar) {
        super(2, dVar);
        this.f11964b = crVar;
        this.f11965c = str;
        this.f11966d = str2;
        this.f11967e = str3;
        this.f11968f = str4;
        this.f11969g = i9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new br(this.f11964b, this.f11965c, this.f11966d, this.f11967e, this.f11968f, this.f11969g, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((br) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11963a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        JSONObject jSONObject = new JSONObject();
        String str = this.f11965c;
        String str2 = this.f11966d;
        String str3 = this.f11967e;
        String str4 = this.f11968f;
        int i10 = this.f11969g;
        jSONObject.put("uuid", str);
        jSONObject.put("package_name", str2);
        jSONObject.put("appId", str3);
        jSONObject.put("notix_sdk_version", str4);
        jSONObject.put("android_api", i10);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.h.d(jSONObject2, "JSONObject().apply {\n   …Api)\n        }.toString()");
        dh dhVar = this.f11964b.f12064a;
        Cdo cdo = new Cdo(jSONObject2);
        ar arVar = ar.f11898a;
        no noVar = no.f12835e;
        Set set = io.f12491a;
        this.f11963a = 1;
        Object a5 = ((gh) dhVar).a(3, "/inapp/android/unsubscribe", false, cdo, arVar, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
