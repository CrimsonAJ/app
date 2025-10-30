package b5;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final /* synthetic */ class I0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f10726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f10727c;

    public /* synthetic */ I0(S0 s02, Bundle bundle, int i9) {
        this.f10725a = i9;
        this.f10727c = s02;
        this.f10726b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i9;
        switch (this.f10725a) {
            case 0:
                Bundle bundle2 = this.f10726b;
                boolean isEmpty = bundle2.isEmpty();
                S0 s02 = this.f10727c;
                if (isEmpty) {
                    bundle = bundle2;
                } else {
                    C0650n0 c0650n0 = (C0650n0) s02.f1707a;
                    C0623e0 c0623e0 = c0650n0.f11228h;
                    C0650n0.d(c0623e0);
                    bundle = new Bundle(c0623e0.f11106z.w());
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        s4.i iVar = s02.f10962w;
                        C0628g c0628g = c0650n0.f11227g;
                        V v8 = c0650n0.f11229i;
                        P1 p12 = c0650n0.f11231l;
                        if (hasNext) {
                            String next = it.next();
                            Object obj = bundle2.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                C0650n0.d(p12);
                                if (P1.c1(obj)) {
                                    P1.F0(iVar, null, 27, null, null, 0);
                                }
                                C0650n0.f(v8);
                                v8.f10975k.d(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (P1.f1(next)) {
                                C0650n0.f(v8);
                                v8.f10975k.c(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle.remove(next);
                            } else {
                                C0650n0.d(p12);
                                c0628g.getClass();
                                if (p12.X0("param", next, 500, obj)) {
                                    p12.G0(bundle, next, obj);
                                }
                            }
                        } else {
                            C0650n0.d(p12);
                            P1 p13 = ((C0650n0) c0628g.f1707a).f11231l;
                            C0650n0.d(p13);
                            if (p13.e1(201500000)) {
                                i9 = 100;
                            } else {
                                i9 = 25;
                            }
                            if (bundle.size() > i9) {
                                Iterator it2 = new TreeSet(bundle.keySet()).iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i10++;
                                    if (i10 > i9) {
                                        bundle.remove(str);
                                    }
                                }
                                C0650n0.d(p12);
                                P1.F0(iVar, null, 26, null, null, 0);
                                C0650n0.f(v8);
                                v8.f10975k.b("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                C0650n0 c0650n02 = (C0650n0) s02.f1707a;
                C0623e0 c0623e02 = c0650n02.f11228h;
                C0650n0.d(c0623e02);
                c0623e02.f11106z.A(bundle);
                if (bundle2.isEmpty()) {
                    if (!c0650n02.f11227g.y0(null, E.f10649e1)) {
                        return;
                    }
                }
                ((C0650n0) s02.f1707a).m().u0(bundle);
                return;
            case 1:
                S0 s03 = this.f10727c;
                s03.l0();
                s03.m0();
                Bundle bundle3 = this.f10726b;
                String string = bundle3.getString("name");
                String string2 = bundle3.getString("origin");
                F4.y.e(string);
                F4.y.e(string2);
                F4.y.h(bundle3.get("value"));
                C0650n0 c0650n03 = (C0650n0) s03.f1707a;
                if (!c0650n03.a()) {
                    V v9 = c0650n03.f11229i;
                    C0650n0.f(v9);
                    v9.f10978n.b("Conditional property not set since app measurement is disabled");
                    return;
                }
                M1 m12 = new M1(bundle3.getLong("triggered_timestamp"), bundle3.get("value"), string, string2);
                try {
                    P1 p14 = c0650n03.f11231l;
                    C0650n0.d(p14);
                    bundle3.getString("app_id");
                    C0665t r0 = p14.r0(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string2, 0L, true);
                    C0650n0.d(p14);
                    bundle3.getString("app_id");
                    C0665t r02 = p14.r0(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string2, 0L, true);
                    bundle3.getString("app_id");
                    c0650n03.m().t0(new C0622e(bundle3.getString("app_id"), string2, m12, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), r02, bundle3.getLong("trigger_timeout"), r0, bundle3.getLong("time_to_live"), p14.r0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                S0 s04 = this.f10727c;
                s04.l0();
                s04.m0();
                Bundle bundle4 = this.f10726b;
                String string3 = bundle4.getString("name");
                F4.y.e(string3);
                C0650n0 c0650n04 = (C0650n0) s04.f1707a;
                if (!c0650n04.a()) {
                    V v10 = c0650n04.f11229i;
                    C0650n0.f(v10);
                    v10.f10978n.b("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                M1 m13 = new M1(0L, null, string3, "");
                try {
                    P1 p15 = c0650n04.f11231l;
                    C0650n0.d(p15);
                    bundle4.getString("app_id");
                    c0650n04.m().t0(new C0622e(bundle4.getString("app_id"), "", m13, bundle4.getLong("creation_timestamp"), bundle4.getBoolean("active"), bundle4.getString("trigger_event_name"), null, bundle4.getLong("trigger_timeout"), null, bundle4.getLong("time_to_live"), p15.r0(bundle4.getString("expired_event_name"), bundle4.getBundle("expired_event_params"), "", bundle4.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
        }
    }
}
