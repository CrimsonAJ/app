package y6;

import android.content.Context;
import android.util.Log;
import f5.C1177i;
import f5.C1183o;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import k4.C1499E;
import l6.C1574f;
import u6.C2082a;
import v6.C2110a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25086a;

    /* renamed from: b, reason: collision with root package name */
    public final D4.v f25087b;

    /* renamed from: c, reason: collision with root package name */
    public final C1499E f25088c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25089d;

    /* renamed from: e, reason: collision with root package name */
    public C1499E f25090e;

    /* renamed from: f, reason: collision with root package name */
    public C1499E f25091f;

    /* renamed from: g, reason: collision with root package name */
    public l f25092g;

    /* renamed from: h, reason: collision with root package name */
    public final u f25093h;

    /* renamed from: i, reason: collision with root package name */
    public final E6.e f25094i;
    public final C2082a j;

    /* renamed from: k, reason: collision with root package name */
    public final C2082a f25095k;

    /* renamed from: l, reason: collision with root package name */
    public final i f25096l;

    /* renamed from: m, reason: collision with root package name */
    public final C2110a f25097m;

    /* renamed from: n, reason: collision with root package name */
    public final C1183o f25098n;

    /* renamed from: o, reason: collision with root package name */
    public final z6.d f25099o;

    public p(C1574f c1574f, u uVar, C2110a c2110a, D4.v vVar, C2082a c2082a, C2082a c2082a2, E6.e eVar, i iVar, C1183o c1183o, z6.d dVar) {
        this.f25087b = vVar;
        c1574f.a();
        this.f25086a = c1574f.f20587a;
        this.f25093h = uVar;
        this.f25097m = c2110a;
        this.j = c2082a;
        this.f25095k = c2082a2;
        this.f25094i = eVar;
        this.f25096l = iVar;
        this.f25098n = c1183o;
        this.f25099o = dVar;
        this.f25089d = System.currentTimeMillis();
        this.f25088c = new C1499E(25);
    }

    public final void a(G6.e eVar) {
        z6.d.a();
        z6.d.a();
        this.f25090e.b();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.i(new n(this));
                this.f25092g.g();
                if (eVar.i().f2880b.f2876a) {
                    if (!this.f25092g.d(eVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    this.f25092g.h(((C1177i) ((AtomicReference) eVar.f2895i).get()).f17413a);
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            } catch (Exception e8) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e8);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(G6.e eVar) {
        Future<?> submit = this.f25099o.f25505a.f25501a.submit(new m(this, eVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e8) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e8);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e9) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e9);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }

    public final void c() {
        z6.d.a();
        try {
            C1499E c1499e = this.f25090e;
            String str = (String) c1499e.f19985b;
            E6.e eVar = (E6.e) c1499e.f19986c;
            eVar.getClass();
            if (!new File((File) eVar.f1969c, str).delete()) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
        } catch (Exception e8) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e8);
        }
    }
}
