package C4;

import D4.B;
import D4.C0082a;
import D4.C0083b;
import D4.C0088g;
import D4.C0090i;
import D4.C0091j;
import D4.H;
import D4.L;
import D4.w;
import F4.y;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import f5.C1177i;
import f5.C1185q;
import i0.AbstractActivityC1369y;
import i0.C1337N;
import i0.C1345a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import s.C1936f;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1578a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1579b;

    /* renamed from: c, reason: collision with root package name */
    public final A1.g f1580c;

    /* renamed from: d, reason: collision with root package name */
    public final b f1581d;

    /* renamed from: e, reason: collision with root package name */
    public final C0083b f1582e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f1583f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1584g;

    /* renamed from: h, reason: collision with root package name */
    public final w f1585h;

    /* renamed from: i, reason: collision with root package name */
    public final C0082a f1586i;
    public final C0088g j;

    public j(Context context, AbstractActivityC1369y abstractActivityC1369y, A1.g gVar, b bVar, i iVar) {
        String str;
        L l9;
        y.i(context, "Null context is not permitted.");
        y.i(gVar, "Api must not be null.");
        y.i(iVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y.i(applicationContext, "The provided context did not have an application context.");
        this.f1578a = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.f1579b = str;
        this.f1580c = gVar;
        this.f1581d = bVar;
        this.f1583f = iVar.f1577b;
        C0083b c0083b = new C0083b(gVar, bVar, str);
        this.f1582e = c0083b;
        this.f1585h = new w(this);
        C0088g g9 = C0088g.g(applicationContext);
        this.j = g9;
        this.f1584g = g9.f1850h.getAndIncrement();
        this.f1586i = iVar.f1576a;
        if (abstractActivityC1369y != null && Looper.myLooper() == Looper.getMainLooper()) {
            WeakHashMap weakHashMap = L.f1828w0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC1369y);
            if (weakReference == null || (l9 = (L) weakReference.get()) == null) {
                try {
                    l9 = (L) abstractActivityC1369y.P().C("SLifecycleFragmentImpl");
                    if (l9 == null || l9.f18401l) {
                        l9 = new L();
                        C1337N P8 = abstractActivityC1369y.P();
                        P8.getClass();
                        C1345a c1345a = new C1345a(P8);
                        c1345a.g(0, l9, "SLifecycleFragmentImpl", 1);
                        c1345a.e(true);
                    }
                    weakHashMap.put(abstractActivityC1369y, new WeakReference(l9));
                } catch (ClassCastException e8) {
                    throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
                }
            }
            D4.p b9 = l9.b();
            if (b9 == null) {
                Object obj = B4.f.f694c;
                b9 = new D4.p(l9, g9);
            }
            b9.f1873f.add(c0083b);
            g9.a(b9);
        }
        T4.d dVar = g9.f1855n;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final android.support.v4.media.session.y a() {
        android.support.v4.media.session.y yVar = new android.support.v4.media.session.y(9, (byte) 0);
        Set set = Collections.EMPTY_SET;
        if (((C1936f) yVar.f9331b) == null) {
            yVar.f9331b = new C1936f(0);
        }
        ((C1936f) yVar.f9331b).addAll(set);
        Context context = this.f1578a;
        yVar.f9333d = context.getClass().getName();
        yVar.f9332c = context.getPackageName();
        return yVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [D4.j, java.lang.Object] */
    public final C0091j b(y4.i iVar) {
        Looper looper = this.f1583f;
        y.i(iVar, "Listener must not be null");
        y.i(looper, "Looper must not be null");
        ?? obj = new Object();
        new T4.d(looper, 2);
        y.e("castDeviceControllerListenerKey");
        obj.f1858a = new C0090i(iVar);
        return obj;
    }

    public final C1185q c(int i9, D4.n nVar) {
        C1177i c1177i = new C1177i();
        C0088g c0088g = this.j;
        c0088g.getClass();
        c0088g.f(c1177i, nVar.f1863d, this);
        B b9 = new B(new H(i9, nVar, c1177i, this.f1586i), c0088g.f1851i.get(), this);
        T4.d dVar = c0088g.f1855n;
        dVar.sendMessage(dVar.obtainMessage(4, b9));
        return c1177i.f17413a;
    }
}
