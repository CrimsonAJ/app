package c7;

import D4.ComponentCallbacks2C0085d;
import android.app.Application;
import android.content.Context;
import com.google.firebase.messaging.s;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import f7.InterfaceC1187a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import l6.C1574f;

/* loaded from: classes.dex */
public final class n implements InterfaceC1187a {
    public static final Random j = new Random();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f11727k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f11729b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11730c;

    /* renamed from: d, reason: collision with root package name */
    public final C1574f f11731d;

    /* renamed from: e, reason: collision with root package name */
    public final T6.e f11732e;

    /* renamed from: f, reason: collision with root package name */
    public final m6.c f11733f;

    /* renamed from: g, reason: collision with root package name */
    public final S6.b f11734g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11735h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11728a = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f11736i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, D4.c] */
    public n(Context context, ScheduledExecutorService scheduledExecutorService, C1574f c1574f, T6.e eVar, m6.c cVar, S6.b bVar) {
        this.f11729b = context;
        this.f11730c = scheduledExecutorService;
        this.f11731d = c1574f;
        this.f11732e = eVar;
        this.f11733f = cVar;
        this.f11734g = bVar;
        c1574f.a();
        this.f11735h = c1574f.f20589c.f20602b;
        AtomicReference atomicReference = m.f11726a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = m.f11726a;
        if (atomicReference2.get() == null) {
            ?? obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    ComponentCallbacks2C0085d.b(application);
                    ComponentCallbacks2C0085d.f1834e.a(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        s8.n.e(scheduledExecutorService, new G6.d(1, this));
    }

    public final synchronized C0785e a() {
        O0.c cVar;
        try {
            try {
                d7.d c3 = c("fetch");
                d7.d c9 = c("activate");
                d7.d c10 = c("defaults");
                d7.m mVar = new d7.m(this.f11729b.getSharedPreferences("frc_" + this.f11735h + "_firebase_settings", 0));
                d7.j jVar = new d7.j(this.f11730c, c9, c10);
                C1574f c1574f = this.f11731d;
                S6.b bVar = this.f11734g;
                c1574f.a();
                if (c1574f.f20588b.equals("[DEFAULT]")) {
                    cVar = new O0.c(bVar);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    jVar.a(new k(cVar));
                }
                O0.c cVar2 = new O0.c(22, false);
                cVar2.f5263b = c9;
                cVar2.f5264c = c10;
                s sVar = new s(11, false);
                sVar.f16507e = Collections.newSetFromMap(new ConcurrentHashMap());
                sVar.f16504b = c9;
                sVar.f16505c = cVar2;
                ScheduledExecutorService scheduledExecutorService = this.f11730c;
                sVar.f16506d = scheduledExecutorService;
                return b(this.f11731d, this.f11732e, this.f11733f, scheduledExecutorService, c3, c9, c10, d(c3, mVar), jVar, mVar, sVar);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized C0785e b(C1574f c1574f, T6.e eVar, m6.c cVar, Executor executor, d7.d dVar, d7.d dVar2, d7.d dVar3, d7.i iVar, d7.j jVar, d7.m mVar, s sVar) {
        m6.c cVar2;
        try {
            if (!this.f11728a.containsKey("firebase")) {
                c1574f.a();
                if (c1574f.f20588b.equals("[DEFAULT]")) {
                    cVar2 = cVar;
                } else {
                    cVar2 = null;
                }
                C0785e c0785e = new C0785e(cVar2, executor, dVar, dVar2, dVar3, iVar, jVar, mVar, e(c1574f, eVar, iVar, dVar2, this.f11729b, mVar), sVar);
                dVar2.b();
                dVar3.b();
                dVar.b();
                this.f11728a.put("firebase", c0785e);
                f11727k.put("firebase", c0785e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C0785e) this.f11728a.get("firebase");
    }

    public final d7.d c(String str) {
        d7.n nVar;
        String str2 = "frc_" + this.f11735h + "_firebase_" + str + ".json";
        ScheduledExecutorService scheduledExecutorService = this.f11730c;
        Context context = this.f11729b;
        HashMap hashMap = d7.n.f16955c;
        synchronized (d7.n.class) {
            try {
                HashMap hashMap2 = d7.n.f16955c;
                if (!hashMap2.containsKey(str2)) {
                    hashMap2.put(str2, new d7.n(context, str2));
                }
                nVar = (d7.n) hashMap2.get(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return d7.d.d(scheduledExecutorService, nVar);
    }

    public final synchronized d7.i d(d7.d dVar, d7.m mVar) {
        T6.e eVar;
        S6.b lVar;
        S6.b bVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        C1574f c1574f;
        try {
            eVar = this.f11732e;
            C1574f c1574f2 = this.f11731d;
            c1574f2.a();
            if (c1574f2.f20588b.equals("[DEFAULT]")) {
                lVar = this.f11734g;
            } else {
                lVar = new l(0);
            }
            bVar = lVar;
            scheduledExecutorService = this.f11730c;
            random = j;
            C1574f c1574f3 = this.f11731d;
            c1574f3.a();
            str = c1574f3.f20589c.f20601a;
            c1574f = this.f11731d;
            c1574f.a();
        } catch (Throwable th) {
            throw th;
        }
        return new d7.i(eVar, bVar, scheduledExecutorService, random, dVar, new ConfigFetchHttpClient(this.f11729b, c1574f.f20589c.f20602b, str, mVar.f16951a.getLong("fetch_timeout_in_seconds", 60L), mVar.f16951a.getLong("fetch_timeout_in_seconds", 60L)), mVar, this.f11736i);
    }

    public final synchronized O0.c e(C1574f c1574f, T6.e eVar, d7.i iVar, d7.d dVar, Context context, d7.m mVar) {
        return new O0.c(c1574f, eVar, iVar, dVar, context, mVar, this.f11730c);
    }
}
