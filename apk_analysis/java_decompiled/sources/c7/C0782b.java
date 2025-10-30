package c7;

import android.util.Log;
import com.google.firebase.messaging.s;
import e7.RunnableC1147a;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1175g;
import g7.C1258d;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import m6.C1594a;
import org.json.JSONArray;
import org.json.JSONException;
import v6.C2111b;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0782b implements InterfaceC1175g, InterfaceC1169a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0785e f11705a;

    public /* synthetic */ C0782b(C0785e c0785e) {
        this.f11705a = c0785e;
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        boolean z9;
        C0785e c0785e = this.f11705a;
        c0785e.getClass();
        if (abstractC1176h.j()) {
            d7.d dVar = c0785e.f11715c;
            synchronized (dVar) {
                dVar.f16895c = s8.n.p(null);
            }
            dVar.f16894b.a();
            d7.e eVar = (d7.e) abstractC1176h.g();
            if (eVar != null) {
                JSONArray jSONArray = eVar.f16900d;
                m6.c cVar = c0785e.f11713a;
                if (cVar != null) {
                    try {
                        cVar.c(C0785e.c(jSONArray));
                    } catch (C1594a e8) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e8);
                    } catch (JSONException e9) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e9);
                    }
                }
                s sVar = c0785e.f11721i;
                try {
                    C1258d B9 = ((O0.c) sVar.f16505c).B(eVar);
                    Iterator it = ((Set) sVar.f16507e).iterator();
                    while (it.hasNext()) {
                        ((Executor) sVar.f16506d).execute(new RunnableC1147a((C2111b) it.next(), B9, 1));
                    }
                } catch (C0787g e10) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        C0785e c0785e = this.f11705a;
        AbstractC1176h b9 = c0785e.f11715c.b();
        AbstractC1176h b10 = c0785e.f11716d.b();
        return s8.n.D(b9, b10).e(c0785e.f11714b, new C0784d(c0785e, b9, b10, 0));
    }
}
