package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import t0.AbstractC1989x;
import t0.C1988w;

/* renamed from: com.google.android.gms.internal.cast.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862q extends AbstractC1989x {

    /* renamed from: f, reason: collision with root package name */
    public static final y4.b f14951f = new y4.b("MRDiscoveryCallback", null);

    /* renamed from: e, reason: collision with root package name */
    public final C0877u f14956e;

    /* renamed from: c, reason: collision with root package name */
    public final Map f14954c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f14955d = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f14953b = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: a, reason: collision with root package name */
    public final C0858p f14952a = new C0858p(this);

    public C0862q(Context context) {
        this.f14956e = new C0877u(context);
    }

    @Override // t0.AbstractC1989x
    public final void d(t0.D d9, t0.C c3) {
        f14951f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        q(c3, true);
    }

    @Override // t0.AbstractC1989x
    public final void e(t0.D d9, t0.C c3) {
        f14951f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        q(c3, true);
    }

    @Override // t0.AbstractC1989x
    public final void h(t0.D d9, t0.C c3) {
        f14951f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        q(c3, false);
    }

    public final void o() {
        y4.b bVar = f14951f;
        bVar.b(A0.a.m("Starting RouteDiscovery with ", this.f14955d.size(), " IDs"), new Object[0]);
        bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f14954c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            p();
        } else {
            new T4.d(Looper.getMainLooper(), 4).post(new RunnableC0850n(this, 1));
        }
    }

    public final void p() {
        C0877u c0877u = this.f14956e;
        if (c0877u.f15006b == null) {
            c0877u.f15006b = t0.D.d(c0877u.f15005a);
        }
        t0.D d9 = c0877u.f15006b;
        if (d9 != null) {
            d9.h(this);
        }
        LinkedHashSet linkedHashSet = this.f14955d;
        synchronized (linkedHashSet) {
            try {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String a5 = t4.v.a(str);
                    if (a5 != null) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        if (!arrayList.contains(a5)) {
                            arrayList.add(a5);
                        }
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("controlCategories", arrayList);
                        C1988w c1988w = new C1988w(bundle, arrayList);
                        Map map = this.f14954c;
                        if (((C0854o) map.get(str)) == null) {
                            map.put(str, new C0854o(c1988w));
                        }
                        f14951f.b("Adding mediaRouter callback for control category " + t4.v.a(str), new Object[0]);
                        if (c0877u.f15006b == null) {
                            c0877u.f15006b = t0.D.d(c0877u.f15005a);
                        }
                        c0877u.f15006b.a(c1988w, this, 4);
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f14951f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f14954c.keySet())), new Object[0]);
    }

    public final void q(t0.C c3, boolean z9) {
        boolean z10;
        Set g9;
        y4.b bVar = f14951f;
        bVar.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z9), c3);
        Map map = this.f14954c;
        synchronized (map) {
            try {
                bVar.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
                z10 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    C0854o c0854o = (C0854o) entry.getValue();
                    if (c3.h(c0854o.f14934b)) {
                        if (z9) {
                            bVar.b("Adding/updating route for appId " + str, new Object[0]);
                            z10 = c0854o.f14933a.add(c3);
                            if (!z10) {
                                Log.w(bVar.f24917a, bVar.d("Route " + String.valueOf(c3) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            bVar.b("Removing route for appId " + str, new Object[0]);
                            z10 = c0854o.f14933a.remove(c3);
                            if (!z10) {
                                Log.w(bVar.f24917a, bVar.d("Route " + String.valueOf(c3) + " already removed from appId " + str, new Object[0]));
                            }
                        }
                    }
                }
            } finally {
            }
        }
        if (z10) {
            f14951f.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f14953b) {
                try {
                    HashMap hashMap = new HashMap();
                    Map map2 = this.f14954c;
                    synchronized (map2) {
                        for (String str2 : map2.keySet()) {
                            C0854o c0854o2 = (C0854o) map2.get(J.f(str2));
                            if (c0854o2 == null) {
                                int i9 = AbstractC0815e0.f14826c;
                                g9 = C0847m0.j;
                            } else {
                                LinkedHashSet linkedHashSet = c0854o2.f14933a;
                                int i10 = AbstractC0815e0.f14826c;
                                Object[] array = linkedHashSet.toArray();
                                g9 = AbstractC0815e0.g(array.length, array);
                            }
                            if (!g9.isEmpty()) {
                                hashMap.put(str2, g9);
                            }
                        }
                    }
                    C0843l0.a(hashMap.entrySet());
                    Iterator it = this.f14953b.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
    }
}
