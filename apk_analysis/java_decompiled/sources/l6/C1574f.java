package l6;

import D4.ComponentCallbacks2C0085d;
import F4.y;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import d0.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s.C1935e;
import s.C1939i;
import s6.C1962b;
import s6.l;
import t6.EnumC2026k;

/* renamed from: l6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1574f {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f20585k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final C1935e f20586l = new C1939i(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f20587a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20588b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20589c;

    /* renamed from: d, reason: collision with root package name */
    public final s6.e f20590d;

    /* renamed from: g, reason: collision with root package name */
    public final l f20593g;

    /* renamed from: h, reason: collision with root package name */
    public final S6.b f20594h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20591e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f20592f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f20595i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    public C1574f(Context context, String str, i iVar) {
        ?? arrayList;
        int i9 = 2;
        ?? r1 = 1;
        this.f20587a = context;
        y.e(str);
        this.f20588b = str;
        this.f20589c = iVar;
        C1569a c1569a = FirebaseInitProvider.f16537a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new T6.b(r1 == true ? 1 : 0, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC2026k enumC2026k = EnumC2026k.f23318a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new T6.b(i9, new FirebaseCommonRegistrar()));
        arrayList3.add(new T6.b(i9, new ExecutorsRegistrar()));
        arrayList4.add(C1962b.c(context, Context.class, new Class[0]));
        arrayList4.add(C1962b.c(this, C1574f.class, new Class[0]));
        arrayList4.add(C1962b.c(iVar, i.class, new Class[0]));
        o oVar = new o(10);
        if ((Build.VERSION.SDK_INT >= 24 ? L.d.f(context) : true) && FirebaseInitProvider.f16538b.get()) {
            arrayList4.add(C1962b.c(c1569a, C1569a.class, new Class[0]));
        }
        s6.e eVar = new s6.e(arrayList3, arrayList4, oVar);
        this.f20590d = eVar;
        Trace.endSection();
        this.f20593g = new l(new Q6.c(this, context));
        this.f20594h = eVar.h(Q6.e.class);
        C1571c c1571c = new C1571c(this);
        a();
        if (this.f20591e.get()) {
            ComponentCallbacks2C0085d.f1834e.f1835a.get();
        }
        this.f20595i.add(c1571c);
        Trace.endSection();
    }

    public static C1574f c() {
        C1574f c1574f;
        synchronized (f20585k) {
            try {
                c1574f = (C1574f) f20586l.get("[DEFAULT]");
                if (c1574f != null) {
                    ((Q6.e) c1574f.f20594h.get()).c();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + K4.b.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1574f;
    }

    public static C1574f f(Context context) {
        synchronized (f20585k) {
            try {
                if (f20586l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a5 = i.a(context);
                if (a5 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, "[DEFAULT]", a5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, D4.c] */
    public static C1574f g(Context context, String str, i iVar) {
        C1574f c1574f;
        AtomicReference atomicReference = C1572d.f20582a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C1572d.f20582a;
            if (atomicReference2.get() == null) {
                ?? obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        ComponentCallbacks2C0085d.b(application);
                        ComponentCallbacks2C0085d.f1834e.a(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f20585k) {
            C1935e c1935e = f20586l;
            y.j("FirebaseApp name " + trim + " already exists!", !c1935e.containsKey(trim));
            y.i(context, "Application context cannot be null.");
            c1574f = new C1574f(context, trim, iVar);
            c1935e.put(trim, c1574f);
        }
        c1574f.e();
        return c1574f;
    }

    public final void a() {
        y.j("FirebaseApp was deleted", !this.f20592f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f20590d.b(cls);
    }

    public final String d() {
        String encodeToString;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f20588b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb.append(encodeToString);
        sb.append("+");
        a();
        byte[] bytes2 = this.f20589c.f20602b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void e() {
        boolean z9;
        HashMap hashMap;
        Context context = this.f20587a;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = L.d.f(context);
        } else {
            z9 = true;
        }
        if (!z9) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f20588b);
            Log.i("FirebaseApp", sb.toString());
            Context context2 = this.f20587a;
            AtomicReference atomicReference = C1573e.f20583b;
            if (atomicReference.get() == null) {
                C1573e c1573e = new C1573e(context2);
                while (!atomicReference.compareAndSet(null, c1573e)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context2.registerReceiver(c1573e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f20588b);
        Log.i("FirebaseApp", sb2.toString());
        s6.e eVar = this.f20590d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f20588b);
        AtomicReference atomicReference2 = eVar.f22760f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (eVar) {
                    hashMap = new HashMap(eVar.f22755a);
                }
                eVar.a(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((Q6.e) this.f20594h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1574f)) {
            return false;
        }
        C1574f c1574f = (C1574f) obj;
        c1574f.a();
        return this.f20588b.equals(c1574f.f20588b);
    }

    public final boolean h() {
        boolean z9;
        a();
        X6.a aVar = (X6.a) this.f20593g.get();
        synchronized (aVar) {
            z9 = aVar.f8471a;
        }
        return z9;
    }

    public final int hashCode() {
        return this.f20588b.hashCode();
    }

    public final String toString() {
        A1.g gVar = new A1.g(this);
        gVar.j(this.f20588b, "name");
        gVar.j(this.f20589c, "options");
        return gVar.toString();
    }
}
