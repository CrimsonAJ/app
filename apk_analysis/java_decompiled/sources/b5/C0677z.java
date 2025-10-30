package b5;

import android.os.Bundle;
import java.util.Iterator;
import s.C1932b;
import s.C1935e;
import s.C1939i;

/* renamed from: b5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677z extends AbstractC0609A {

    /* renamed from: b, reason: collision with root package name */
    public final C1935e f11352b;

    /* renamed from: c, reason: collision with root package name */
    public final C1935e f11353c;

    /* renamed from: d, reason: collision with root package name */
    public long f11354d;

    /* JADX WARN: Type inference failed for: r2v1, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r2v2, types: [s.e, s.i] */
    public C0677z(C0650n0 c0650n0) {
        super(c0650n0);
        this.f11353c = new C1939i(0);
        this.f11352b = new C1939i(0);
    }

    public final void m0(long j, String str) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (str != null && str.length() != 0) {
            C0647m0 c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            c0647m0.v0(new RunnableC0610a(this, str, j, 0));
        } else {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Ad unit id must be a non-empty string");
        }
    }

    public final void n0(long j, String str) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (str != null && str.length() != 0) {
            C0647m0 c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            c0647m0.v0(new RunnableC0610a(this, str, j, 1));
        } else {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Ad unit id must be a non-empty string");
        }
    }

    public final void o0(long j) {
        C0621d1 c0621d1 = ((C0650n0) this.f1707a).f11234o;
        C0650n0.e(c0621d1);
        C0612a1 s02 = c0621d1.s0(false);
        C1935e c1935e = this.f11352b;
        Iterator it = ((C1932b) c1935e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            q0(str, j - ((Long) c1935e.get(str)).longValue(), s02);
        }
        if (!c1935e.isEmpty()) {
            p0(j - this.f11354d, s02);
        }
        r0(j);
    }

    public final void p0(long j, C0612a1 c0612a1) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0612a1 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10978n.b("Not logging ad exposure. No active activity");
        } else {
            if (j < 1000) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10978n.c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            P1.B0(c0612a1, bundle, true);
            S0 s02 = c0650n0.f11235p;
            C0650n0.e(s02);
            s02.w0("am", "_xa", bundle);
        }
    }

    public final void q0(String str, long j, C0612a1 c0612a1) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0612a1 == null) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10978n.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10978n.c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            P1.B0(c0612a1, bundle, true);
            S0 s02 = c0650n0.f11235p;
            C0650n0.e(s02);
            s02.w0("am", "_xu", bundle);
        }
    }

    public final void r0(long j) {
        C1935e c1935e = this.f11352b;
        Iterator it = ((C1932b) c1935e.keySet()).iterator();
        while (it.hasNext()) {
            c1935e.put((String) it.next(), Long.valueOf(j));
        }
        if (!c1935e.isEmpty()) {
            this.f11354d = j;
        }
    }
}
