package com.google.android.gms.internal.cast;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class E {
    public static final y4.b j = new y4.b("ConnectivityMonitor", null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceExecutorServiceC0892x2 f14704a;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectivityManager f14706c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14709f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f14710g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f14711h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final Set f14712i = Collections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    public final Map f14707d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e, reason: collision with root package name */
    public final List f14708e = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public final B1.f f14705b = new B1.f(1, this);

    public E(Context context, InterfaceExecutorServiceC0892x2 interfaceExecutorServiceC0892x2) {
        this.f14704a = interfaceExecutorServiceC0892x2;
        this.f14710g = context;
        this.f14706c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        List list;
        synchronized (this.f14711h) {
            try {
                Map map = this.f14707d;
                if (map != null && (list = this.f14708e) != null) {
                    j.b("a new network is available", new Object[0]);
                    if (map.containsKey(network)) {
                        list.remove(network);
                    }
                    map.put(network, linkProperties);
                    list.add(network);
                    b();
                }
            } finally {
            }
        }
    }

    public final void b() {
        InterfaceExecutorServiceC0892x2 interfaceExecutorServiceC0892x2 = this.f14704a;
        if (interfaceExecutorServiceC0892x2 == null) {
            return;
        }
        Set set = this.f14712i;
        synchronized (set) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        C0896y2 c0896y2 = (C0896y2) interfaceExecutorServiceC0892x2;
                        if (!c0896y2.f15167a.isShutdown()) {
                            c0896y2.execute(new RunnableC0893y(1, this));
                        }
                    } else {
                        throw new ClassCastException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
