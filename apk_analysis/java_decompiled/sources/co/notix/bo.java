package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.Context;
import android.content.pm.PackageManager;
import org.json.JSONObject;
import p4.C1857a;

/* loaded from: classes.dex */
public final class bo extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ co f11955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(String str, co coVar, E7.d dVar) {
        super(2, dVar);
        this.f11954b = str;
        this.f11955c = coVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        bo boVar = new bo(this.f11954b, this.f11955c, dVar);
        boVar.f11953a = obj;
        return boVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((bo) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        Object h9;
        AbstractC0485a.A(obj);
        co coVar = this.f11955c;
        String str = this.f11954b;
        Object obj2 = null;
        try {
            Context a5 = ((d9) coVar.f12055a).a();
            String packageName = a5.getPackageName();
            JSONObject jSONObject = new JSONObject(str);
            n5 n5Var = coVar.f12057c;
            n5Var.getClass();
            try {
                h9 = C1857a.a(((d9) n5Var.f12810a).a()).f2365c;
            } catch (Throwable th) {
                h9 = AbstractC0485a.h(th);
            }
            if (h9 instanceof A7.i) {
                h9 = null;
            }
            jSONObject.put("gaid", (String) h9);
            jSONObject.put("package_name", packageName);
            jSONObject.put("user", coVar.f12056b.c());
            coVar.f12056b.getClass();
            jSONObject.put("app_id", xq.a());
            PackageManager packageManager = a5.getPackageManager();
            kotlin.jvm.internal.h.d(packageManager, "context.packageManager");
            kotlin.jvm.internal.h.d(packageName, "packageName");
            jSONObject.put("app_version", f7.a(packageManager, packageName).versionName);
            jSONObject.put("sdk_version", "0.1.86");
            jSONObject.put("app_src", a5.getPackageManager().getInstallerPackageName(packageName));
            h7 = jSONObject.toString();
        } catch (Throwable th2) {
            h7 = AbstractC0485a.h(th2);
        }
        if (!(h7 instanceof A7.i)) {
            obj2 = h7;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            return this.f11954b;
        }
        return str2;
    }
}
