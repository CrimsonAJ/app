package d7;

import android.util.Log;
import c1.C0753b;
import c7.C0781a;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1169a;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D0.b f16888c;

    public b(D0.b bVar, int i9, long j) {
        this.f16888c = bVar;
        this.f16886a = i9;
        this.f16887b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final D0.b bVar = this.f16888c;
        int i9 = this.f16886a;
        final long j = this.f16887b;
        synchronized (bVar) {
            final int i10 = i9 - 1;
            final C1185q c3 = ((i) bVar.f1740d).c(3 - i10);
            final AbstractC1176h b9 = ((d) bVar.f1741e).b();
            s8.n.D(c3, b9).e((ScheduledExecutorService) bVar.f1743g, new InterfaceC1169a() { // from class: d7.a
                @Override // f5.InterfaceC1169a
                public final Object i(AbstractC1176h abstractC1176h) {
                    Boolean valueOf;
                    JSONObject jSONObject;
                    D0.b bVar2 = D0.b.this;
                    C1185q c1185q = c3;
                    AbstractC1176h abstractC1176h2 = b9;
                    long j4 = j;
                    int i11 = i10;
                    bVar2.getClass();
                    if (!c1185q.j()) {
                        return s8.n.o(new l6.h("Failed to auto-fetch config update.", c1185q.f()));
                    }
                    if (!abstractC1176h2.j()) {
                        return s8.n.o(new l6.h("Failed to get activated config for auto-fetch", abstractC1176h2.f()));
                    }
                    h hVar = (h) c1185q.g();
                    e eVar = (e) abstractC1176h2.g();
                    e eVar2 = hVar.f16913b;
                    boolean z9 = false;
                    if (eVar2 != null) {
                        if (eVar2.f16902f >= j4) {
                            z9 = true;
                        }
                        valueOf = Boolean.valueOf(z9);
                    } else {
                        if (hVar.f16912a == 1) {
                            z9 = true;
                        }
                        valueOf = Boolean.valueOf(z9);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        bVar2.a(j4, i11);
                        return s8.n.p(null);
                    }
                    if (hVar.f16913b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return s8.n.p(null);
                    }
                    if (eVar == null) {
                        C0753b c9 = e.c();
                        eVar = new e((JSONObject) c9.f11589b, (Date) c9.f11590c, (JSONArray) c9.f11591d, (JSONObject) c9.f11592e, c9.f11588a, (JSONArray) c9.f11593f);
                    }
                    e eVar3 = hVar.f16913b;
                    e a5 = e.a(new JSONObject(eVar3.f16897a.toString()));
                    HashMap b10 = eVar.b();
                    HashMap b11 = eVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = eVar.f16898b;
                    Iterator<String> keys = jSONObject2.keys();
                    while (true) {
                        boolean hasNext = keys.hasNext();
                        jSONObject = a5.f16898b;
                        if (!hasNext) {
                            break;
                        }
                        String next = keys.next();
                        JSONObject jSONObject3 = eVar3.f16898b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else {
                            JSONObject jSONObject4 = eVar.f16901e;
                            boolean has = jSONObject4.has(next);
                            JSONObject jSONObject5 = eVar3.f16901e;
                            if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (b10.containsKey(next) != b11.containsKey(next)) {
                                hashSet.add(next);
                            } else if (b10.containsKey(next) && b11.containsKey(next) && !((Map) b10.get(next)).equals(b11.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        }
                    }
                    Iterator<String> keys2 = jSONObject.keys();
                    while (keys2.hasNext()) {
                        hashSet.add(keys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return s8.n.p(null);
                    }
                    C0781a c0781a = new C0781a(hashSet);
                    synchronized (bVar2) {
                        Iterator it = ((LinkedHashSet) bVar2.f1738b).iterator();
                        while (it.hasNext()) {
                            ((I1.c) it.next()).c(c0781a);
                        }
                    }
                    return s8.n.p(null);
                }
            });
        }
    }
}
