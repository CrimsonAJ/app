package t0;

import F0.ExecutorC0101e;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import b5.C0617c0;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import f5.C1183o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import l3.C1553b;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1971e {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f22957F = 0;

    /* renamed from: A, reason: collision with root package name */
    public C1981o f22958A;

    /* renamed from: B, reason: collision with root package name */
    public int f22959B;

    /* renamed from: C, reason: collision with root package name */
    public G1 f22960C;

    /* renamed from: D, reason: collision with root package name */
    public android.support.v4.media.session.y f22961D;

    /* renamed from: E, reason: collision with root package name */
    public final C1183o f22962E;

    /* renamed from: c, reason: collision with root package name */
    public final X f22965c;

    /* renamed from: d, reason: collision with root package name */
    public C f22966d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1984s f22967e;

    /* renamed from: f, reason: collision with root package name */
    public C1965A f22968f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f22969g;

    /* renamed from: n, reason: collision with root package name */
    public final C1553b f22975n;

    /* renamed from: o, reason: collision with root package name */
    public final i.G f22976o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f22977p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f22978q;

    /* renamed from: r, reason: collision with root package name */
    public C1979m f22979r;

    /* renamed from: s, reason: collision with root package name */
    public final N f22980s;

    /* renamed from: t, reason: collision with root package name */
    public final C0617c0 f22981t;

    /* renamed from: u, reason: collision with root package name */
    public F f22982u;

    /* renamed from: v, reason: collision with root package name */
    public C f22983v;

    /* renamed from: w, reason: collision with root package name */
    public C f22984w;

    /* renamed from: x, reason: collision with root package name */
    public C f22985x;

    /* renamed from: y, reason: collision with root package name */
    public r f22986y;

    /* renamed from: z, reason: collision with root package name */
    public C1981o f22987z;

    /* renamed from: a, reason: collision with root package name */
    public final HandlerC1968b f22963a = new HandlerC1968b(this);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22964b = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22970h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22971i = new ArrayList();
    public final HashMap j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f22972k = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f22973l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f22974m = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, l3.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1971e(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1971e.<init>(android.content.Context):void");
    }

    public final void a(AbstractC1986u abstractC1986u, boolean z9) {
        if (d(abstractC1986u) == null) {
            C1966B c1966b = new C1966B(abstractC1986u, z9);
            this.f22973l.add(c1966b);
            this.f22963a.b(513, c1966b);
            n(c1966b, abstractC1986u.f23041g);
            D.b();
            abstractC1986u.f23038d = this.f22976o;
            abstractC1986u.g(this.f22987z);
        }
    }

    public final String b(C1966B c1966b, String str) {
        String o9;
        String flattenToShortString = ((ComponentName) c1966b.f22838d.f17433b).flattenToShortString();
        boolean z9 = c1966b.f22837c;
        if (z9) {
            o9 = str;
        } else {
            o9 = AbstractC0953k1.o(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f22972k;
        if (!z9) {
            ArrayList arrayList = this.f22971i;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    if (((C) arrayList.get(i9)).f22842c.equals(o9)) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                Log.w("AxMediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = o9 + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (((C) arrayList.get(i11)).f22842c.equals(str2)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 < 0) {
                        hashMap.put(new O.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i10++;
                }
            }
        }
        hashMap.put(new O.b(flattenToShortString, str), o9);
        return o9;
    }

    public final C c() {
        ArrayList arrayList = this.f22971i;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C c3 = (C) obj;
            if (c3 != this.f22983v && c3.c() == this.f22980s && c3.m("android.media.intent.category.LIVE_AUDIO") && !c3.m("android.media.intent.category.LIVE_VIDEO") && c3.f()) {
                return c3;
            }
        }
        return this.f22983v;
    }

    public final C1966B d(AbstractC1986u abstractC1986u) {
        ArrayList arrayList = this.f22973l;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C1966B c1966b = (C1966B) obj;
            if (c1966b.f22835a == abstractC1986u) {
                return c1966b;
            }
        }
        return null;
    }

    public final void e() {
        Iterator it = this.j.values().iterator();
        if (!it.hasNext()) {
        } else {
            throw A0.a.h(it);
        }
    }

    public final AbstractC1984s f(C c3) {
        AbstractC1984s abstractC1984s;
        if (c3 == this.f22966d && (abstractC1984s = this.f22967e) != null) {
            return abstractC1984s;
        }
        if ((c3 instanceof C1991z) && ((C1991z) c3).n()) {
            e();
            return null;
        }
        AbstractC1984s abstractC1984s2 = (AbstractC1984s) this.f22964b.get(c3.f22842c);
        if (abstractC1984s2 != null) {
            return abstractC1984s2;
        }
        Iterator it = this.j.values().iterator();
        if (!it.hasNext()) {
            return abstractC1984s2;
        }
        throw A0.a.h(it);
    }

    public final C g() {
        C c3 = this.f22966d;
        if (c3 != null) {
            return c3;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean h() {
        if (this.f22978q) {
            F f9 = this.f22982u;
            if (f9 == null || f9.f22868a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        if (this.f22966d.e()) {
            List<C> unmodifiableList = Collections.unmodifiableList(this.f22966d.f22860v);
            HashSet hashSet = new HashSet();
            Iterator it = unmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((C) it.next()).f22842c);
            }
            HashMap hashMap = this.f22964b;
            Iterator it2 = hashMap.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    AbstractC1984s abstractC1984s = (AbstractC1984s) entry.getValue();
                    abstractC1984s.h(0);
                    abstractC1984s.d();
                    it2.remove();
                }
            }
            for (C c3 : unmodifiableList) {
                if (!hashMap.containsKey(c3.f22842c)) {
                    AbstractC1984s c9 = c3.c().c(c3.f22841b, this.f22966d.f22841b);
                    if (c9 != null) {
                        c9.e();
                        hashMap.put(c3.f22842c, c9);
                    }
                }
            }
        }
    }

    public final void j(C c3, int i9, boolean z9) {
        if (!this.f22971i.contains(c3)) {
            Log.w("AxMediaRouter", "Ignoring attempt to select removed route: " + c3);
            return;
        }
        if (!c3.f22846g) {
            Log.w("AxMediaRouter", "Ignoring attempt to select disabled route: " + c3);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC1986u c9 = c3.c();
            C1979m c1979m = this.f22979r;
            if (c9 == c1979m && this.f22966d != c3) {
                String str = c3.f22841b;
                MediaRoute2Info h7 = c1979m.h(str);
                if (h7 != null) {
                    c1979m.f23006i.transferTo(h7);
                    return;
                }
                Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                return;
            }
        }
        k(c3, i9, z9);
    }

    public final void k(C c3, int i9, boolean z9) {
        boolean z10;
        C1987v c1987v;
        Executor executorC0101e;
        String str;
        boolean z11;
        if (this.f22966d == c3) {
            return;
        }
        if (c3 == this.f22983v) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f22984w != null && z10) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder("- Stracktrace: [");
            int i10 = 3;
            while (i10 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                i10++;
                if (i10 < stackTrace.length) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            C c9 = this.f22966d;
            if (c9 != null) {
                Locale locale = Locale.US;
                String str2 = c9.f22843d;
                D.b();
                if (D.c().f22984w == c9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                str = str2 + "(BT=" + z11 + ", syncMediaRoute1Provider=" + z9 + ")";
            } else {
                str = null;
            }
            StringBuilder r5 = AbstractC0953k1.r("Changing selection(", str, ") to default while BT is available: pkgName=");
            r5.append(this.f22969g.getPackageName());
            r5.append((Object) sb);
            Log.w("AxMediaRouter", r5.toString());
        }
        if (this.f22985x != null) {
            this.f22985x = null;
            r rVar = this.f22986y;
            if (rVar != null) {
                rVar.h(3);
                this.f22986y.d();
                this.f22986y = null;
            }
        }
        if (h() && (c1987v = c3.f22840a.f22839e) != null && c1987v.f23045c) {
            AbstractC1986u c10 = c3.c();
            String str3 = c3.f22841b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.f22969g.getPackageName());
            r a5 = c10.a(str3, new C1985t(bundle));
            if (a5 != null) {
                Context context = this.f22969g;
                if (Build.VERSION.SDK_INT >= 28) {
                    executorC0101e = E.c.a(context);
                } else {
                    executorC0101e = new ExecutorC0101e(new Handler(context.getMainLooper()), 1);
                }
                C1183o c1183o = this.f22962E;
                synchronized (a5.f23028a) {
                    try {
                        if (executorC0101e != null) {
                            if (c1183o != null) {
                                a5.f23029b = executorC0101e;
                                a5.f23030c = c1183o;
                                ArrayList arrayList = a5.f23032e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    C1980n c1980n = a5.f23031d;
                                    ArrayList arrayList2 = a5.f23032e;
                                    a5.f23031d = null;
                                    a5.f23032e = null;
                                    a5.f23029b.execute(new RunnableC1982p(a5, c1183o, c1980n, arrayList2, 1));
                                }
                            } else {
                                throw new NullPointerException("Listener shouldn't be null");
                            }
                        } else {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f22985x = c3;
                this.f22986y = a5;
                a5.e();
                return;
            }
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + c3);
        }
        AbstractC1986u c11 = c3.c();
        String str4 = c3.f22841b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.f22969g.getPackageName());
        AbstractC1984s d9 = c11.d(str4, new C1985t(bundle2));
        if (d9 != null) {
            d9.e();
        }
        if (this.f22966d == null) {
            this.f22966d = c3;
            this.f22967e = d9;
            HandlerC1968b handlerC1968b = this.f22963a;
            handlerC1968b.getClass();
            Message obtainMessage = handlerC1968b.obtainMessage(262, new C1970d(null, c3, z9));
            obtainMessage.arg1 = i9;
            obtainMessage.sendToTarget();
            return;
        }
        C1965A c1965a = this.f22968f;
        if (c1965a != null) {
            if (!c1965a.f22834i && !c1965a.j) {
                c1965a.j = true;
                AbstractC1984s abstractC1984s = c1965a.f22826a;
                if (abstractC1984s != null) {
                    abstractC1984s.h(0);
                    abstractC1984s.d();
                }
            }
            this.f22968f = null;
        }
        C1965A c1965a2 = new C1965A(this, c3, d9, i9, z9, null, null);
        this.f22968f = c1965a2;
        c1965a2.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x014c, code lost:
    
        if (r25.f22958A.b() == r1) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v6, types: [o7.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1971e.l():void");
    }

    public final void m() {
        int i9;
        MediaRouter2.RoutingController routingController;
        C c3 = this.f22966d;
        if (c3 != null) {
            int i10 = c3.f22854p;
            C1553b c1553b = this.f22975n;
            c1553b.f20384a = i10;
            c1553b.f20385b = c3.f22855q;
            int i11 = 0;
            if (c3.e() && !D.g()) {
                i9 = 0;
            } else {
                i9 = c3.f22853o;
            }
            c1553b.f20386c = i9;
            c1553b.f20387d = this.f22966d.f22851m;
            String str = null;
            if (h() && this.f22966d.c() == this.f22979r) {
                AbstractC1984s abstractC1984s = this.f22967e;
                int i12 = C1979m.f23005s;
                if ((abstractC1984s instanceof C1975i) && (routingController = ((C1975i) abstractC1984s).f22991g) != null) {
                    str = routingController.getId();
                }
                c1553b.f20388e = str;
            } else {
                c1553b.f20388e = null;
            }
            Iterator it = this.f22974m.iterator();
            if (!it.hasNext()) {
                G1 g12 = this.f22960C;
                if (g12 != null) {
                    C c9 = this.f22966d;
                    C c10 = this.f22983v;
                    if (c10 != null) {
                        if (c9 != c10 && c9 != this.f22984w) {
                            if (c1553b.f20386c == 1) {
                                i11 = 2;
                            }
                            int i13 = i11;
                            int i14 = c1553b.f20385b;
                            int i15 = c1553b.f20384a;
                            String str2 = c1553b.f20388e;
                            android.support.v4.media.session.y yVar = (android.support.v4.media.session.y) g12.f10717b;
                            if (yVar != null) {
                                d0.n nVar = (d0.n) g12.f10718c;
                                if (nVar != null && i13 == 0 && i14 == 0) {
                                    nVar.f16657c = i15;
                                    p0.g.a(nVar.b(), i15);
                                    return;
                                }
                                d0.n nVar2 = new d0.n(g12, i13, i14, i15, str2);
                                g12.f10718c = nVar2;
                                android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) yVar.f9331b;
                                tVar.getClass();
                                tVar.f9318a.setPlaybackToRemote(nVar2.b());
                                return;
                            }
                            return;
                        }
                        g12.e();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            throw A0.a.h(it);
        }
        G1 g13 = this.f22960C;
        if (g13 != null) {
            g13.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r21 == r19.f22980s.f23041g) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5 A[LOOP:5: B:77:0x01a3->B:78:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0 A[LOOP:6: B:81:0x01be->B:82:0x01c0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(t0.C1966B r20, t0.C1987v r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1971e.n(t0.B, t0.v):void");
    }

    public final int o(C c3, C1980n c1980n) {
        int i9 = c3.i(c1980n);
        if (i9 != 0) {
            int i10 = i9 & 1;
            HandlerC1968b handlerC1968b = this.f22963a;
            if (i10 != 0) {
                handlerC1968b.b(259, c3);
            }
            if ((i9 & 2) != 0) {
                handlerC1968b.b(260, c3);
            }
            if ((i9 & 4) != 0) {
                handlerC1968b.b(261, c3);
            }
        }
        return i9;
    }

    public final void p(boolean z9) {
        C c3 = this.f22983v;
        if (c3 != null && !c3.f()) {
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.f22983v);
            this.f22983v = null;
        }
        C c9 = this.f22983v;
        ArrayList arrayList = this.f22971i;
        if (c9 == null) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                C c10 = (C) obj;
                if (c10.c() == this.f22980s && c10.f22841b.equals("DEFAULT_ROUTE") && c10.f()) {
                    this.f22983v = c10;
                    Log.i("AxMediaRouter", "Found default route: " + this.f22983v);
                    break;
                }
            }
        }
        C c11 = this.f22984w;
        if (c11 != null && !c11.f()) {
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f22984w);
            this.f22984w = null;
        }
        if (this.f22984w == null) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                C c12 = (C) obj2;
                if (c12.c() == this.f22980s && c12.m("android.media.intent.category.LIVE_AUDIO") && !c12.m("android.media.intent.category.LIVE_VIDEO") && c12.f()) {
                    this.f22984w = c12;
                    Log.i("AxMediaRouter", "Found bluetooth route: " + this.f22984w);
                    break;
                }
            }
        }
        C c13 = this.f22966d;
        if (c13 != null && c13.f22846g) {
            if (z9) {
                i();
                m();
                return;
            }
            return;
        }
        Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f22966d);
        k(c(), 0, true);
    }
}
