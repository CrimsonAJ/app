package N3;

import U3.C0399f;
import U3.InterfaceC0398e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import b6.C0693o;
import co.notix.R;
import co.notix.b6;
import co.notix.j6;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d0.C1093k;
import d0.InterfaceC1090h;
import f5.C1177i;
import i0.C1349e;
import i0.C1353i;
import j3.C0;
import j3.C1441D;
import j3.C1452e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import k3.C1489e;
import k4.C1499E;
import n3.C1635l;
import org.json.JSONObject;
import p6.C1862c;
import p6.InterfaceC1861b;
import z8.C2263l;
import z8.InterfaceC2258g;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4918d;

    public /* synthetic */ E(Object obj, Object obj2, Object obj3, int i9) {
        this.f4915a = i9;
        this.f4916b = obj;
        this.f4917c = obj2;
        this.f4918d = obj3;
    }

    private final void a() {
        JSONObject optJSONObject;
        c7.k kVar = (c7.k) this.f4916b;
        String str = (String) this.f4917c;
        d7.e eVar = (d7.e) this.f4918d;
        O0.c cVar = kVar.f11724a;
        InterfaceC1861b interfaceC1861b = (InterfaceC1861b) ((S6.b) cVar.f5263b).get();
        if (interfaceC1861b != null) {
            JSONObject jSONObject = eVar.f16901e;
            if (jSONObject.length() >= 1) {
                JSONObject jSONObject2 = eVar.f16898b;
                if (jSONObject2.length() >= 1 && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (optString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) cVar.f5264c)) {
                        try {
                            if (optString.equals(((Map) cVar.f5264c).get(str))) {
                                return;
                            }
                            ((Map) cVar.f5264c).put(str, optString);
                            Bundle bundle = new Bundle();
                            bundle.putString("arm_key", str);
                            bundle.putString("arm_value", jSONObject2.optString(str));
                            bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                            bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                            bundle.putString("group", optJSONObject.optString("group"));
                            C1862c c1862c = (C1862c) interfaceC1861b;
                            c1862c.a("fp", "personalization_assignment", bundle);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_fpid", optString);
                            c1862c.a("fp", "_fpc", bundle2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.H] */
    /* JADX WARN: Type inference failed for: r2v14, types: [n3.m, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4915a) {
            case 0:
                G g9 = (G) this.f4916b;
                int i9 = g9.f4921a;
                this.f4917c.H(i9, g9.f4922b, (C0270v) this.f4918d);
                return;
            case 1:
                C3.v vVar = ((C0399f) this.f4916b).f7360c;
                String str = (String) this.f4917c;
                U3.q qVar = (U3.q) vVar.f1562b;
                qVar.f7428c = str;
                InterfaceC0398e interfaceC0398e = (InterfaceC0398e) this.f4918d;
                U3.F x5 = interfaceC0398e.x();
                U3.s sVar = qVar.f7429d;
                if (x5 != null) {
                    U3.n nVar = sVar.f7439d;
                    int f9 = interfaceC0398e.f();
                    U3.x xVar = nVar.f7414i;
                    xVar.f7478c.put(Integer.valueOf(f9), x5);
                    sVar.f7456v = true;
                }
                sVar.e();
                return;
            case 2:
                b6.a((j6) this.f4916b, (A7.h) this.f4917c, (A7.h) this.f4918d);
                return;
            case 3:
                Intent intent = (Intent) this.f4917c;
                C1177i c1177i = (C1177i) this.f4918d;
                com.google.firebase.messaging.h hVar = (com.google.firebase.messaging.h) this.f4916b;
                hVar.getClass();
                try {
                    hVar.handleIntent(intent);
                    return;
                } finally {
                    c1177i.b(null);
                }
            case 4:
                M4.b bVar = (M4.b) this.f4916b;
                Z0.a aVar = (Z0.a) this.f4917c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4918d;
                bVar.getClass();
                try {
                    d0.q p9 = O4.h.p(bVar.f4790a);
                    if (p9 != null) {
                        d0.p pVar = (d0.p) ((InterfaceC1090h) p9.f2042b);
                        synchronized (pVar.f16665d) {
                            pVar.f16667f = threadPoolExecutor;
                        }
                        ((InterfaceC1090h) p9.f2042b).a(new C1093k(aVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    aVar.s(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 5:
                a();
                return;
            case 6:
                ArrayList arrayList = (ArrayList) this.f4916b;
                i0.Z z9 = (i0.Z) this.f4917c;
                kotlin.jvm.internal.h.e((C1353i) this.f4918d, "this$0");
                if (arrayList.contains(z9)) {
                    arrayList.remove(z9);
                    View view = z9.f18276c.Y;
                    int i10 = z9.f18274a;
                    kotlin.jvm.internal.h.d(view, "view");
                    AbstractC0953k1.b(view, i10);
                    return;
                }
                return;
            case 7:
                C1353i this$0 = (C1353i) this.f4916b;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                C1349e animationInfo = (C1349e) this.f4918d;
                kotlin.jvm.internal.h.e(animationInfo, "$animationInfo");
                this$0.f18333a.endViewTransition((View) this.f4917c);
                animationInfo.e();
                return;
            case 8:
                C1452e0 c1452e0 = (C1452e0) this.f4916b;
                c1452e0.getClass();
                P5.S d9 = ((P5.C) this.f4917c).d();
                C1489e c1489e = c1452e0.f19606c;
                C1441D c1441d = c1489e.f19934g;
                c1441d.getClass();
                C0693o c0693o = c1489e.f19931d;
                c0693o.getClass();
                c0693o.f11383b = P5.F.o(d9);
                if (!d9.isEmpty()) {
                    c0693o.f11386e = (A) d9.get(0);
                    A a5 = (A) this.f4918d;
                    a5.getClass();
                    c0693o.f11387f = a5;
                }
                if (((A) c0693o.f11385d) == null) {
                    c0693o.f11385d = C0693o.h(c1441d, (P5.F) c0693o.f11383b, (A) c0693o.f11386e, (C0) c0693o.f11382a);
                }
                c0693o.o(c1441d.I());
                return;
            case 9:
                C1635l c1635l = (C1635l) this.f4916b;
                int i11 = c1635l.f21130a;
                this.f4917c.p(i11, c1635l.f21131b, (Exception) this.f4918d);
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                String str2 = (String) this.f4917c;
                String str3 = (String) this.f4918d;
                y6.l lVar = ((y6.p) this.f4916b).f25092g;
                lVar.getClass();
                try {
                    ((A6.t) lVar.f25065d.f1970d).l(str2, str3);
                    return;
                } catch (IllegalArgumentException e8) {
                    Context context = lVar.f25062a;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e8;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case R.styleable.GradientColor_android_endY /* 11 */:
                C2263l c2263l = (C2263l) ((C1499E) this.f4916b).f19986c;
                boolean s9 = c2263l.f25618b.s();
                InterfaceC2258g interfaceC2258g = (InterfaceC2258g) this.f4917c;
                if (s9) {
                    interfaceC2258g.e(c2263l, new IOException("Canceled"));
                    return;
                } else {
                    interfaceC2258g.g(c2263l, (z8.O) this.f4918d);
                    return;
                }
            default:
                ((InterfaceC2258g) this.f4917c).e((C2263l) ((C1499E) this.f4916b).f19986c, (Throwable) this.f4918d);
                return;
        }
    }
}
