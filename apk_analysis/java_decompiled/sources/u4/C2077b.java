package u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.ext.cast.DefaultCastOptionsProvider;
import com.google.android.gms.internal.cast.AbstractC0826h;
import com.google.android.gms.internal.cast.B2;
import com.google.android.gms.internal.cast.BinderC0822g;
import com.google.android.gms.internal.cast.BinderC0873t;
import com.google.android.gms.internal.cast.C0830i;
import com.google.android.gms.internal.cast.C0854o;
import com.google.android.gms.internal.cast.C0862q;
import com.google.android.gms.internal.cast.C0885w;
import com.google.android.gms.internal.cast.C0896y2;
import com.google.android.gms.internal.cast.InterfaceExecutorServiceC0892x2;
import com.google.android.gms.internal.cast.J;
import com.google.android.gms.internal.cast.RunnableC0881v;
import f5.AbstractC1178j;
import f5.C1183o;
import f5.C1185q;
import i.G;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2077b {

    /* renamed from: k, reason: collision with root package name */
    public static final y4.b f23643k = new y4.b("CastContext", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Object f23644l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static volatile C2077b f23645m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23646a;

    /* renamed from: b, reason: collision with root package name */
    public final n f23647b;

    /* renamed from: c, reason: collision with root package name */
    public final h f23648c;

    /* renamed from: d, reason: collision with root package name */
    public final k f23649d;

    /* renamed from: e, reason: collision with root package name */
    public final C2078c f23650e;

    /* renamed from: f, reason: collision with root package name */
    public final y4.r f23651f;

    /* renamed from: g, reason: collision with root package name */
    public final BinderC0822g f23652g;

    /* renamed from: h, reason: collision with root package name */
    public final C0862q f23653h;

    /* renamed from: i, reason: collision with root package name */
    public final C0885w f23654i;
    public final C0830i j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [S4.a] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v3, types: [u4.r] */
    /* JADX WARN: Type inference failed for: r6v6 */
    public C2077b(Context context, C2078c c2078c, List list, BinderC0873t binderC0873t, y4.r rVar) {
        ?? r62;
        InterfaceExecutorServiceC0892x2 c0896y2;
        InterfaceExecutorServiceC0892x2 interfaceExecutorServiceC0892x2;
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        int i9 = 1;
        this.f23646a = context;
        this.f23650e = c2078c;
        this.f23651f = rVar;
        this.f23653h = new C0862q(context);
        this.f23654i = binderC0873t.j;
        y yVar = null;
        if (!TextUtils.isEmpty(c2078c.f23658a)) {
            this.j = new C0830i(context, c2078c, binderC0873t);
        } else {
            this.j = null;
        }
        HashMap hashMap = new HashMap();
        C0830i c0830i = this.j;
        if (c0830i != null) {
            hashMap.put(c0830i.f14857b, c0830i.f14858c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0830i c0830i2 = (C0830i) it.next();
                F4.y.i(c0830i2, "Additional SessionProvider must not be null.");
                String str = c0830i2.f14857b;
                F4.y.f(str, "Category for SessionProvider must not be null or empty string.");
                F4.y.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, c0830i2.f14858c);
            }
        }
        c2078c.f23672p = new B(1);
        try {
            n a5 = AbstractC0826h.a(context, c2078c, binderC0873t, hashMap);
            this.f23647b = a5;
            try {
                l lVar = (l) a5;
                Parcel f12 = lVar.f1(lVar.Q(), 6);
                IBinder readStrongBinder = f12.readStrongBinder();
                if (readStrongBinder == null) {
                    r62 = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        r62 = (r) queryLocalInterface;
                    } else {
                        r62 = new S4.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 3);
                    }
                }
                f12.recycle();
                this.f23649d = new k(r62);
                try {
                    l lVar2 = (l) a5;
                    Parcel f13 = lVar2.f1(lVar2.Q(), 5);
                    IBinder readStrongBinder2 = f13.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof y) {
                            yVar = (y) queryLocalInterface2;
                        } else {
                            yVar = new S4.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 3);
                        }
                    }
                    f13.recycle();
                    h hVar = new h(yVar, context);
                    this.f23648c = hVar;
                    F4.y.f("PrecacheManager", "The log tag cannot be null or empty.");
                    C0885w c0885w = this.f23654i;
                    if (c0885w != null) {
                        c0885w.f15079f = hVar;
                        T4.d dVar = c0885w.f15076c;
                        F4.y.h(dVar);
                        dVar.post(new RunnableC0881v(c0885w, i9));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    if (newFixedThreadPool instanceof InterfaceExecutorServiceC0892x2) {
                        interfaceExecutorServiceC0892x2 = (InterfaceExecutorServiceC0892x2) newFixedThreadPool;
                    } else {
                        if (newFixedThreadPool instanceof ScheduledExecutorService) {
                            c0896y2 = new B2((ScheduledExecutorService) newFixedThreadPool);
                        } else {
                            c0896y2 = new C0896y2(newFixedThreadPool);
                        }
                        interfaceExecutorServiceC0892x2 = c0896y2;
                    }
                    com.google.android.gms.internal.cast.E e8 = new com.google.android.gms.internal.cast.E(context, interfaceExecutorServiceC0892x2);
                    F4.y.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    com.google.android.gms.internal.cast.E.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!e8.f14709f && (connectivityManager = e8.f14706c) != null && E.d.a(e8.f14710g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            e8.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), e8.f14705b);
                        e8.f14709f = true;
                    }
                    BinderC0822g binderC0822g = new BinderC0822g();
                    this.f23652g = binderC0822g;
                    try {
                        l lVar3 = (l) a5;
                        Parcel Q7 = lVar3.Q();
                        com.google.android.gms.internal.cast.C.d(Q7, binderC0822g);
                        lVar3.g1(Q7, 3);
                        binderC0822g.f14848g.add(this.f23653h.f14952a);
                        if (!Collections.unmodifiableList(c2078c.f23668l).isEmpty()) {
                            y4.b bVar = f23643k;
                            Log.i(bVar.f24917a, bVar.d("Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.f23650e.f23668l))), new Object[0]));
                            C0862q c0862q = this.f23653h;
                            List unmodifiableList = Collections.unmodifiableList(this.f23650e.f23668l);
                            c0862q.getClass();
                            y4.b bVar2 = C0862q.f14951f;
                            bVar2.b(A0.a.m("SetRouteDiscovery for ", unmodifiableList.size(), " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(J.f((String) it2.next()));
                            }
                            Map map = c0862q.f14954c;
                            bVar2.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (map) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        C0854o c0854o = (C0854o) map.get(J.f(str2));
                                        if (c0854o != null) {
                                            hashMap2.put(str2, c0854o);
                                        }
                                    }
                                    map.clear();
                                    map.putAll(hashMap2);
                                } finally {
                                }
                            }
                            bVar2.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                            LinkedHashSet linkedHashSet2 = c0862q.f14955d;
                            synchronized (linkedHashSet2) {
                                linkedHashSet2.clear();
                                linkedHashSet2.addAll(linkedHashSet);
                            }
                            c0862q.o();
                        }
                        C1185q d9 = rVar.d(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"});
                        G g9 = new G(16, this);
                        d9.getClass();
                        D4.q qVar = AbstractC1178j.f17414a;
                        d9.d(qVar, g9);
                        D4.n g10 = D4.n.g();
                        g10.f1864e = new G(rVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        g10.f1861b = new B4.d[]{t4.v.f23273d};
                        g10.f1862c = false;
                        g10.f1863d = 8427;
                        C1185q c3 = rVar.c(0, g10.f());
                        C1183o c1183o = new C1183o(18, this);
                        c3.getClass();
                        c3.d(qVar, c1183o);
                    } catch (RemoteException e9) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e9);
                    }
                } catch (RemoteException e10) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e10);
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e11);
            }
        } catch (RemoteException e12) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e12);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [C4.j, y4.r] */
    public static C2077b a(Context context) {
        F4.y.d();
        if (f23645m == null) {
            synchronized (f23644l) {
                if (f23645m == null) {
                    Context applicationContext = context.getApplicationContext();
                    DefaultCastOptionsProvider b9 = b(applicationContext);
                    C2078c castOptions = b9.getCastOptions(applicationContext);
                    ?? jVar = new C4.j(applicationContext, null, y4.r.f24972k, C4.b.f1567E, C4.i.f1575c);
                    try {
                        f23645m = new C2077b(applicationContext, castOptions, b9.getAdditionalSessionProviders(applicationContext), new BinderC0873t(applicationContext, t0.D.d(applicationContext), castOptions, jVar), jVar);
                    } catch (C2080e e8) {
                        throw new RuntimeException(e8);
                    }
                }
            }
        }
        return f23645m;
    }

    public static DefaultCastOptionsProvider b(Context context) {
        try {
            Bundle bundle = M4.c.a(context).b(128, context.getPackageName()).metaData;
            if (bundle == null) {
                f23643k.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (DefaultCastOptionsProvider) Class.forName(string).asSubclass(DefaultCastOptionsProvider.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e8) {
            throw new IllegalStateException("Failed to initialize CastContext.", e8);
        }
    }
}
