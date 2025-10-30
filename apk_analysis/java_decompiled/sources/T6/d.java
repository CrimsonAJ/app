package T6;

import A3.E;
import F4.y;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import f5.C1177i;
import f5.C1185q;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import l6.C1574f;
import org.json.JSONException;
import org.json.JSONObject;
import s6.l;
import s8.n;
import t6.ExecutorC2025j;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f7216m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final C1574f f7217a;

    /* renamed from: b, reason: collision with root package name */
    public final V6.c f7218b;

    /* renamed from: c, reason: collision with root package name */
    public final O0.c f7219c;

    /* renamed from: d, reason: collision with root package name */
    public final k f7220d;

    /* renamed from: e, reason: collision with root package name */
    public final l f7221e;

    /* renamed from: f, reason: collision with root package name */
    public final i f7222f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7223g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f7224h;

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorC2025j f7225i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f7226k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7227l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, T6.i] */
    public d(C1574f c1574f, S6.b bVar, ExecutorService executorService, ExecutorC2025j executorC2025j) {
        c1574f.a();
        V6.c cVar = new V6.c(c1574f.f20587a, bVar);
        O0.c cVar2 = new O0.c(8, c1574f);
        if (F5.e.f2463b == null) {
            F5.e.f2463b = new F5.e(15);
        }
        F5.e eVar = F5.e.f2463b;
        if (k.f7235d == null) {
            k.f7235d = new k(eVar);
        }
        k kVar = k.f7235d;
        l lVar = new l(new b(0, c1574f));
        ?? obj = new Object();
        this.f7223g = new Object();
        this.f7226k = new HashSet();
        this.f7227l = new ArrayList();
        this.f7217a = c1574f;
        this.f7218b = cVar;
        this.f7219c = cVar2;
        this.f7220d = kVar;
        this.f7221e = lVar;
        this.f7222f = obj;
        this.f7224h = executorService;
        this.f7225i = executorC2025j;
    }

    public final void a(j jVar) {
        synchronized (this.f7223g) {
            this.f7227l.add(jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = h(r2);
        r4 = r6.f7219c;
        r2 = r2.a();
        r2.f7522b = r3;
        r2.f7521a = 3;
        r2 = r2.i();
        r4.E(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            java.lang.Object r0 = T6.d.f7216m
            monitor-enter(r0)
            l6.f r1 = r6.f7217a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.f20587a     // Catch: java.lang.Throwable -> L3f
            O0.c r1 = O0.c.e(r1)     // Catch: java.lang.Throwable -> L3f
            O0.c r2 = r6.f7219c     // Catch: java.lang.Throwable -> L37
            U6.b r2 = r2.K()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.f7529b     // Catch: java.lang.Throwable -> L37
            r4 = 1
            r5 = 2
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L1d
            goto L1e
        L1d:
            r4 = 0
        L1e:
            if (r4 == 0) goto L39
            java.lang.String r3 = r6.h(r2)     // Catch: java.lang.Throwable -> L37
            O0.c r4 = r6.f7219c     // Catch: java.lang.Throwable -> L37
            U6.a r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.f7522b = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.f7521a = r3     // Catch: java.lang.Throwable -> L37
            U6.b r2 = r2.i()     // Catch: java.lang.Throwable -> L37
            r4.E(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.O()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.k(r2)
            t6.j r0 = r6.f7225i
            T6.c r1 = new T6.c
            r2 = 2
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.O()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.d.b():void");
    }

    public final U6.b c(U6.b bVar) {
        int responseCode;
        boolean z9;
        V6.b f9;
        C1574f c1574f = this.f7217a;
        c1574f.a();
        String str = c1574f.f20589c.f20601a;
        c1574f.a();
        String str2 = c1574f.f20589c.f20607g;
        String str3 = bVar.f7531d;
        V6.c cVar = this.f7218b;
        V6.d dVar = cVar.f7806c;
        if (dVar.b()) {
            URL a5 = V6.c.a("projects/" + str2 + "/installations/" + bVar.f7528a + "/authTokens:generate");
            for (int i9 = 0; i9 <= 1; i9++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c3 = cVar.c(a5, str);
                try {
                    try {
                        c3.setRequestMethod("POST");
                        c3.addRequestProperty("Authorization", "FIS_v2 " + str3);
                        c3.setDoOutput(true);
                        V6.c.h(c3);
                        responseCode = c3.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } catch (Throwable th) {
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (z9) {
                    f9 = V6.c.f(c3);
                } else {
                    V6.c.b(c3, null, str, str2);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                E a9 = V6.b.a();
                                a9.f46b = 2;
                                f9 = a9.c();
                            }
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new l6.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        E a10 = V6.b.a();
                        a10.f46b = 3;
                        f9 = a10.c();
                    }
                }
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
                int b9 = AbstractC2128h.b(f9.f7801c);
                if (b9 != 0) {
                    if (b9 != 1) {
                        if (b9 == 2) {
                            l(null);
                            U6.a a11 = bVar.a();
                            a11.f7521a = 2;
                            return a11.i();
                        }
                        throw new l6.h("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    U6.a a12 = bVar.a();
                    a12.f7525e = "BAD CONFIG";
                    a12.f7521a = 5;
                    return a12.i();
                }
                k kVar = this.f7220d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f7236a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                U6.a a13 = bVar.a();
                a13.f7523c = f9.f7799a;
                a13.f7526f = Long.valueOf(f9.f7800b);
                a13.f7527g = Long.valueOf(seconds);
                return a13.i();
            }
            throw new l6.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new l6.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final C1185q d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return n.p(str);
        }
        C1177i c1177i = new C1177i();
        a(new h(c1177i));
        C1185q c1185q = c1177i.f17413a;
        this.f7224h.execute(new c(this, 0));
        return c1185q;
    }

    public final C1185q e() {
        g();
        C1177i c1177i = new C1177i();
        a(new g(this.f7220d, c1177i));
        this.f7224h.execute(new c(this, 1));
        return c1177i.f17413a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(U6.b bVar) {
        synchronized (f7216m) {
            try {
                C1574f c1574f = this.f7217a;
                c1574f.a();
                O0.c e8 = O0.c.e(c1574f.f20587a);
                try {
                    this.f7219c.E(bVar);
                    if (e8 != null) {
                        e8.O();
                    }
                } catch (Throwable th) {
                    if (e8 != null) {
                        e8.O();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        C1574f c1574f = this.f7217a;
        c1574f.a();
        y.f(c1574f.f20589c.f20602b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1574f.a();
        y.f(c1574f.f20589c.f20607g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1574f.a();
        y.f(c1574f.f20589c.f20601a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c1574f.a();
        String str = c1574f.f20589c.f20602b;
        Pattern pattern = k.f7234c;
        y.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        c1574f.a();
        y.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f7234c.matcher(c1574f.f20589c.f20601a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f20588b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(U6.b r3) {
        /*
            r2 = this;
            l6.f r0 = r2.f7217a
            r0.a()
            java.lang.String r0 = r0.f20588b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            l6.f r0 = r2.f7217a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f20588b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            r0 = 1
            int r3 = r3.f7529b
            if (r3 != r0) goto L50
            s6.l r3 = r2.f7221e
            java.lang.Object r3 = r3.get()
            U6.c r3 = (U6.c) r3
            android.content.SharedPreferences r0 = r3.f7536a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            T6.i r3 = r2.f7222f
            r3.getClass()
            java.lang.String r3 = T6.i.a()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            T6.i r3 = r2.f7222f
            r3.getClass()
            java.lang.String r3 = T6.i.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.d.h(U6.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [V6.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [V6.a] */
    public final U6.b i(U6.b bVar) {
        int responseCode;
        boolean z9;
        String str = bVar.f7528a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            U6.c cVar = (U6.c) this.f7221e.get();
            synchronized (cVar.f7536a) {
                try {
                    String[] strArr = U6.c.f7535c;
                    int i9 = 0;
                    while (true) {
                        if (i9 < 4) {
                            String str3 = strArr[i9];
                            String string = cVar.f7536a.getString("|T|" + cVar.f7537b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i9++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        V6.c cVar2 = this.f7218b;
        C1574f c1574f = this.f7217a;
        c1574f.a();
        String str4 = c1574f.f20589c.f20601a;
        String str5 = bVar.f7528a;
        C1574f c1574f2 = this.f7217a;
        c1574f2.a();
        String str6 = c1574f2.f20589c.f20607g;
        C1574f c1574f3 = this.f7217a;
        c1574f3.a();
        String str7 = c1574f3.f20589c.f20602b;
        V6.d dVar = cVar2.f7806c;
        if (dVar.b()) {
            URL a5 = V6.c.a("projects/" + str6 + "/installations");
            int i10 = 0;
            V6.a aVar = cVar2;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c3 = aVar.c(a5, str4);
                try {
                    try {
                        c3.setRequestMethod("POST");
                        c3.setDoOutput(true);
                        if (str2 != null) {
                            c3.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        V6.c.g(c3, str5, str7);
                        responseCode = c3.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z9) {
                        V6.a e8 = V6.c.e(c3);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e8;
                    } else {
                        try {
                            V6.c.b(c3, str7, str4, str6);
                        } catch (IOException | AssertionError unused3) {
                            c3.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                            aVar = aVar;
                        }
                        if (responseCode != 429) {
                            if (responseCode >= 500 && responseCode < 600) {
                                c3.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i10++;
                                aVar = aVar;
                            } else {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                V6.a aVar2 = new V6.a(null, null, null, null, 2);
                                c3.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            }
                        } else {
                            throw new l6.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int b9 = AbstractC2128h.b(aVar.f7798e);
                    if (b9 != 0) {
                        if (b9 == 1) {
                            U6.a a9 = bVar.a();
                            a9.f7525e = "BAD CONFIG";
                            a9.f7521a = 5;
                            return a9.i();
                        }
                        throw new l6.h("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = aVar.f7795b;
                    String str9 = aVar.f7796c;
                    k kVar = this.f7220d;
                    kVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    kVar.f7236a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    V6.b bVar2 = aVar.f7797d;
                    String str10 = bVar2.f7799a;
                    long j = bVar2.f7800b;
                    U6.a a10 = bVar.a();
                    a10.f7522b = str8;
                    a10.f7521a = 4;
                    a10.f7523c = str10;
                    a10.f7524d = str9;
                    a10.f7526f = Long.valueOf(j);
                    a10.f7527g = Long.valueOf(seconds);
                    return a10.i();
                } finally {
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new l6.h("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new l6.h("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f7223g) {
            try {
                Iterator it = this.f7227l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(U6.b bVar) {
        synchronized (this.f7223g) {
            try {
                Iterator it = this.f7227l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(U6.b bVar, U6.b bVar2) {
        try {
            if (this.f7226k.size() != 0 && !TextUtils.equals(bVar.f7528a, bVar2.f7528a)) {
                Iterator it = this.f7226k.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        } finally {
        }
    }
}
