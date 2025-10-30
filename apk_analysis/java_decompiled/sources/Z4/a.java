package Z4;

import F4.y;
import android.os.Bundle;
import android.os.SystemClock;
import b5.C0612a1;
import b5.C0621d1;
import b5.C0647m0;
import b5.C0650n0;
import b5.C0677z;
import b5.M1;
import b5.P0;
import b5.P1;
import b5.RunnableC0659q0;
import b5.S0;
import b5.V;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s.C1939i;
import z2.C2235a;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final C0650n0 f9057a;

    /* renamed from: b, reason: collision with root package name */
    public final S0 f9058b;

    public a(C0650n0 c0650n0) {
        y.h(c0650n0);
        this.f9057a = c0650n0;
        S0 s02 = c0650n0.f11235p;
        C0650n0.e(s02);
        this.f9058b = s02;
    }

    @Override // b5.T0
    public final String b() {
        return (String) this.f9058b.f10947g.get();
    }

    @Override // b5.T0
    public final String c() {
        C0621d1 c0621d1 = ((C0650n0) this.f9058b.f1707a).f11234o;
        C0650n0.e(c0621d1);
        C0612a1 c0612a1 = c0621d1.f11064c;
        if (c0612a1 != null) {
            return c0612a1.f11020b;
        }
        return null;
    }

    @Override // b5.T0
    public final void d(String str) {
        C0650n0 c0650n0 = this.f9057a;
        C0677z c0677z = c0650n0.f11236q;
        C0650n0.c(c0677z);
        c0650n0.f11233n.getClass();
        c0677z.m0(SystemClock.elapsedRealtime(), str);
    }

    @Override // b5.T0
    public final void e(String str, String str2, Bundle bundle) {
        S0 s02 = this.f9057a.f11235p;
        C0650n0.e(s02);
        s02.r0(str, str2, bundle);
    }

    @Override // b5.T0
    public final List f(String str, String str2) {
        S0 s02 = this.f9058b;
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        boolean x02 = c0647m0.x0();
        V v8 = c0650n0.f11229i;
        if (x02) {
            C0650n0.f(v8);
            v8.f10971f.b("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C2235a.f()) {
            C0650n0.f(v8);
            v8.f10971f.b("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        C0647m0 c0647m02 = c0650n0.j;
        C0650n0.f(c0647m02);
        c0647m02.q0(atomicReference, 5000L, "get conditional user properties", new RunnableC0659q0(s02, atomicReference, str, str2, 3));
        List list = (List) atomicReference.get();
        if (list == null) {
            C0650n0.f(v8);
            v8.f10971f.c(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return P1.y0(list);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map, s.i] */
    @Override // b5.T0
    public final Map g(String str, String str2, boolean z9) {
        S0 s02 = this.f9058b;
        C0650n0 c0650n0 = (C0650n0) s02.f1707a;
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        boolean x02 = c0647m0.x0();
        V v8 = c0650n0.f11229i;
        if (x02) {
            C0650n0.f(v8);
            v8.f10971f.b("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (C2235a.f()) {
            C0650n0.f(v8);
            v8.f10971f.b("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        C0647m0 c0647m02 = c0650n0.j;
        C0650n0.f(c0647m02);
        c0647m02.q0(atomicReference, 5000L, "get user properties", new P0(s02, atomicReference, str, str2, z9, 1));
        List<M1> list = (List) atomicReference.get();
        if (list == null) {
            C0650n0.f(v8);
            v8.f10971f.c(Boolean.valueOf(z9), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        ?? c1939i = new C1939i(list.size());
        for (M1 m12 : list) {
            Object f9 = m12.f();
            if (f9 != null) {
                c1939i.put(m12.f10804b, f9);
            }
        }
        return c1939i;
    }

    @Override // b5.T0
    public final void h(String str) {
        C0650n0 c0650n0 = this.f9057a;
        C0677z c0677z = c0650n0.f11236q;
        C0650n0.c(c0677z);
        c0650n0.f11233n.getClass();
        c0677z.n0(SystemClock.elapsedRealtime(), str);
    }

    @Override // b5.T0
    public final int i(String str) {
        S0 s02 = this.f9058b;
        s02.getClass();
        y.e(str);
        ((C0650n0) s02.f1707a).getClass();
        return 25;
    }

    @Override // b5.T0
    public final String j() {
        C0621d1 c0621d1 = ((C0650n0) this.f9058b.f1707a).f11234o;
        C0650n0.e(c0621d1);
        C0612a1 c0612a1 = c0621d1.f11064c;
        if (c0612a1 != null) {
            return c0612a1.f11019a;
        }
        return null;
    }

    @Override // b5.T0
    public final void k(Bundle bundle) {
        S0 s02 = this.f9058b;
        ((C0650n0) s02.f1707a).f11233n.getClass();
        s02.A0(bundle, System.currentTimeMillis());
    }

    @Override // b5.T0
    public final void l(String str, String str2, Bundle bundle) {
        S0 s02 = this.f9058b;
        ((C0650n0) s02.f1707a).f11233n.getClass();
        s02.v0(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // b5.T0
    public final long m() {
        P1 p12 = this.f9057a.f11231l;
        C0650n0.d(p12);
        return p12.w1();
    }

    @Override // b5.T0
    public final String n() {
        return (String) this.f9058b.f10947g.get();
    }
}
