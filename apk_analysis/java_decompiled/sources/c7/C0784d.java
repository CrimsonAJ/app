package c7;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.s;
import com.google.firebase.messaging.t;
import com.google.firebase.messaging.u;
import d3.C1119a;
import e7.RunnableC1147a;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1173e;
import f5.InterfaceC1175g;
import g3.InterfaceC1251b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l6.C1574f;
import v6.C2111b;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0784d implements InterfaceC1169a, InterfaceC1175g, InterfaceC1251b, InterfaceC1173e, f3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11711c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11712d;

    public /* synthetic */ C0784d(Object obj, Object obj2, Object obj3, int i9) {
        this.f11709a = i9;
        this.f11710b = obj;
        this.f11711c = obj2;
        this.f11712d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, Y2.h] */
    @Override // f3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object apply(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C0784d.apply(java.lang.Object):java.lang.Object");
    }

    @Override // g3.InterfaceC1251b
    public Object f() {
        C1119a c1119a = (C1119a) this.f11710b;
        f3.h hVar = (f3.h) c1119a.f16831d;
        hVar.getClass();
        Y2.j jVar = (Y2.j) this.f11711c;
        Y2.i iVar = (Y2.i) this.f11712d;
        String F2 = AbstractC1002u1.F("SQLiteEventStore");
        if (Log.isLoggable(F2, 3)) {
            Log.d(F2, "Storing event with priority=" + jVar.f8631c + ", name=" + iVar.f8620a + " for destination " + jVar.f8629a);
        }
        ((Long) hVar.g(new C0784d(hVar, iVar, jVar, 5))).getClass();
        c1119a.f16828a.a(jVar, 1, false);
        return null;
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        d7.e eVar;
        URL url;
        switch (this.f11709a) {
            case 0:
                C0785e c0785e = (C0785e) this.f11710b;
                c0785e.getClass();
                AbstractC1176h abstractC1176h2 = (AbstractC1176h) this.f11711c;
                if (abstractC1176h2.j() && abstractC1176h2.g() != null) {
                    d7.e eVar2 = (d7.e) abstractC1176h2.g();
                    AbstractC1176h abstractC1176h3 = (AbstractC1176h) this.f11712d;
                    if (abstractC1176h3.j() && (eVar = (d7.e) abstractC1176h3.g()) != null && eVar2.f16899c.equals(eVar.f16899c)) {
                        return s8.n.p(Boolean.FALSE);
                    }
                    d7.d dVar = c0785e.f11716d;
                    dVar.getClass();
                    CallableC0783c callableC0783c = new CallableC0783c(dVar, 2, eVar2);
                    Executor executor = dVar.f16893a;
                    return s8.n.e(executor, callableC0783c).m(executor, new N1.h(dVar, 7, eVar2)).l(c0785e.f11714b, new C0782b(c0785e));
                }
                return s8.n.p(Boolean.FALSE);
            case 3:
                d7.k kVar = (d7.k) this.f11710b;
                kVar.getClass();
                C1185q c1185q = (C1185q) this.f11711c;
                if (!c1185q.j()) {
                    return s8.n.o(new l6.h("Firebase Installations failed to get installation auth token for config update listener connection.", c1185q.f()));
                }
                C1185q c1185q2 = (C1185q) this.f11712d;
                try {
                    if (!c1185q2.j()) {
                        return s8.n.o(new l6.h("Firebase Installations failed to get installation ID for config update listener connection.", c1185q2.f()));
                    }
                    try {
                        url = new URL(kVar.c(kVar.f16942n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    kVar.l(httpURLConnection, (String) c1185q2.g(), ((T6.a) c1185q.g()).f7209a);
                    return s8.n.p(httpURLConnection);
                } catch (IOException e8) {
                    return s8.n.o(new l6.h("Failed to open HTTP stream connection", e8));
                }
            default:
                boolean j = abstractC1176h.j();
                C1177i c1177i = (C1177i) this.f11710b;
                if (j) {
                    c1177i.d(abstractC1176h.g());
                } else if (abstractC1176h.f() != null) {
                    c1177i.c(abstractC1176h.f());
                } else if (((AtomicBoolean) this.f11711c).getAndSet(true)) {
                    ((C1185q) ((s4.i) ((u) this.f11712d).f16512a).f22734a).q(null);
                }
                return s8.n.p(null);
        }
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        AbstractC1176h abstractC1176h = (AbstractC1176h) this.f11711c;
        C2111b c2111b = (C2111b) this.f11712d;
        s sVar = (s) this.f11710b;
        try {
            d7.e eVar = (d7.e) abstractC1176h.g();
            if (eVar != null) {
                ((Executor) sVar.f16506d).execute(new RunnableC1147a(c2111b, ((O0.c) sVar.f16505c).B(eVar), 0));
            }
        } catch (C0787g e8) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e8);
        }
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        String d9;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f11710b;
        String str = (String) this.f11711c;
        t tVar = (t) this.f11712d;
        String str2 = (String) obj;
        u c3 = FirebaseMessaging.c(firebaseMessaging.f16444b);
        C1574f c1574f = firebaseMessaging.f16443a;
        c1574f.a();
        if ("[DEFAULT]".equals(c1574f.f20588b)) {
            d9 = "";
        } else {
            d9 = c1574f.d();
        }
        String a5 = firebaseMessaging.f16451i.a();
        synchronized (c3) {
            String a9 = t.a(System.currentTimeMillis(), str2, a5);
            if (a9 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c3.f16512a).edit();
                edit.putString(d9 + "|T|" + str + "|*", a9);
                edit.commit();
            }
        }
        if (tVar == null || !str2.equals(tVar.f16509a)) {
            C1574f c1574f2 = firebaseMessaging.f16443a;
            c1574f2.a();
            if ("[DEFAULT]".equals(c1574f2.f20588b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    c1574f2.a();
                    sb.append(c1574f2.f20588b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.j(firebaseMessaging.f16444b).b(intent);
            }
        }
        return s8.n.p(str2);
    }
}
