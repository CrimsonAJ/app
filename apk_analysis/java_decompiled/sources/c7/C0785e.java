package c7;

import com.google.firebase.messaging.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785e {

    /* renamed from: a, reason: collision with root package name */
    public final m6.c f11713a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11714b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.d f11715c;

    /* renamed from: d, reason: collision with root package name */
    public final d7.d f11716d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.i f11717e;

    /* renamed from: f, reason: collision with root package name */
    public final d7.j f11718f;

    /* renamed from: g, reason: collision with root package name */
    public final d7.m f11719g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.c f11720h;

    /* renamed from: i, reason: collision with root package name */
    public final s f11721i;

    public C0785e(m6.c cVar, Executor executor, d7.d dVar, d7.d dVar2, d7.d dVar3, d7.i iVar, d7.j jVar, d7.m mVar, O0.c cVar2, s sVar) {
        this.f11713a = cVar;
        this.f11714b = executor;
        this.f11715c = dVar;
        this.f11716d = dVar2;
        this.f11717e = iVar;
        this.f11718f = jVar;
        this.f11719g = mVar;
        this.f11720h = cVar2;
        this.f11721i = sVar;
    }

    public static ArrayList c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i9);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap a() {
        /*
            r12 = this;
            d7.j r0 = r12.f11718f
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            d7.d r2 = r0.f16926c
            java.util.HashSet r2 = d7.j.b(r2)
            r1.addAll(r2)
            d7.d r2 = r0.f16927d
            java.util.HashSet r2 = d7.j.b(r2)
            r1.addAll(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            d7.d r4 = r0.f16926c
            d7.e r4 = r4.c()
            r5 = 0
            if (r4 != 0) goto L39
        L37:
            r4 = r5
            goto L3f
        L39:
            org.json.JSONObject r4 = r4.f16898b     // Catch: org.json.JSONException -> L37
            java.lang.String r4 = r4.getString(r3)     // Catch: org.json.JSONException -> L37
        L3f:
            if (r4 == 0) goto L77
            d7.d r5 = r0.f16926c
            d7.e r5 = r5.c()
            if (r5 != 0) goto L4a
            goto L6e
        L4a:
            java.util.HashSet r6 = r0.f16924a
            monitor-enter(r6)
            java.util.HashSet r7 = r0.f16924a     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L6b
        L53:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L6b
            c7.k r8 = (c7.k) r8     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Executor r9 = r0.f16925b     // Catch: java.lang.Throwable -> L6b
            N3.E r10 = new N3.E     // Catch: java.lang.Throwable -> L6b
            r11 = 5
            r10.<init>(r8, r3, r5, r11)     // Catch: java.lang.Throwable -> L6b
            r9.execute(r10)     // Catch: java.lang.Throwable -> L6b
            goto L53
        L6b:
            r0 = move-exception
            goto L75
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
        L6e:
            d7.o r5 = new d7.o
            r6 = 2
            r5.<init>(r4, r6)
            goto Lb0
        L75:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6b
            throw r0
        L77:
            d7.d r4 = r0.f16927d
            d7.e r4 = r4.c()
            if (r4 != 0) goto L80
            goto L86
        L80:
            org.json.JSONObject r4 = r4.f16898b     // Catch: org.json.JSONException -> L86
            java.lang.String r5 = r4.getString(r3)     // Catch: org.json.JSONException -> L86
        L86:
            if (r5 == 0) goto L90
            d7.o r4 = new d7.o
            r6 = 1
            r4.<init>(r5, r6)
            r5 = r4
            goto Lb0
        L90:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r5 = "'."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FirebaseRemoteConfig"
            android.util.Log.w(r5, r4)
            d7.o r5 = new d7.o
            java.lang.String r4 = ""
            r6 = 0
            r5.<init>(r4, r6)
        Lb0:
            r2.put(r3, r5)
            goto L22
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C0785e.a():java.util.HashMap");
    }

    public final void b(boolean z9) {
        O0.c cVar = this.f11720h;
        synchronized (cVar) {
            ((d7.k) cVar.f5264c).k(z9);
            if (!z9) {
                cVar.f();
            }
        }
    }
}
