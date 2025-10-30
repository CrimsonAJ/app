package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import a8.EnumC0509a;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.RemoteException;
import b8.AbstractC0714M;
import b8.C0713L;
import b8.C0718Q;
import b8.C0728h;
import b8.C0733m;
import b8.InterfaceC0707F;
import c8.F;

/* loaded from: classes.dex */
public final class te {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f13218a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f13219b;

    /* renamed from: c, reason: collision with root package name */
    public ne f13220c;

    /* renamed from: d, reason: collision with root package name */
    public me f13221d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0707F f13222e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0707F f13223f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.e f13224g;

    /* JADX WARN: Type inference failed for: r0v6, types: [c8.F, b8.L] */
    public te(d9 contextProvider, InterfaceC0484z cs) {
        F f9;
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(cs, "cs");
        this.f13218a = contextProvider;
        this.f13219b = cs;
        C0718Q c3 = AbstractC0714M.c(Boolean.TRUE);
        this.f13222e = c3;
        this.f13223f = c3;
        synchronized (c3) {
            F f10 = c3.f11750d;
            f9 = f10;
            if (f10 == null) {
                int i9 = c3.f11748b;
                ?? c0713l = new C0713L(1, Integer.MAX_VALUE, EnumC0509a.f9185b);
                c0713l.d(Integer.valueOf(i9));
                c3.f11750d = c0713l;
                f9 = c0713l;
            }
        }
        B.r(cs, null, new C0728h(new C0733m(AbstractC0714M.j(new se(f9)), 2, new le(this, null)), null), 3);
        this.f13224g = Z0.a.q(new oe(this));
    }

    public static final void a(te teVar) {
        if (teVar.f13220c == null && teVar.f13221d == null) {
            if (Build.VERSION.SDK_INT >= 24) {
                ne neVar = new ne(teVar);
                ((ConnectivityManager) teVar.f13224g.getValue()).registerDefaultNetworkCallback(neVar);
                teVar.f13220c = neVar;
            } else {
                me meVar = new me(teVar);
                ((d9) teVar.f13218a).a().registerReceiver(meVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                teVar.f13221d = meVar;
            }
            teVar.a(teVar.a());
        }
    }

    public static final void b(te teVar) {
        ne neVar = teVar.f13220c;
        if (neVar == null && teVar.f13221d == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (neVar != null) {
                ((ConnectivityManager) teVar.f13224g.getValue()).unregisterNetworkCallback(neVar);
            }
            teVar.f13220c = null;
        } else {
            me meVar = teVar.f13221d;
            if (meVar != null) {
                ((d9) teVar.f13218a).a().unregisterReceiver(meVar);
            }
            teVar.f13221d = null;
        }
    }

    public final void a(boolean z9) {
        B.r(this.f13219b, null, new pe(this, z9, null), 3);
    }

    public final boolean a() {
        Object h7;
        boolean z9 = false;
        try {
            try {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f13224g.getValue()).getNetworkCapabilities(((ConnectivityManager) this.f13224g.getValue()).getActiveNetwork());
                if (networkCapabilities != null) {
                    if (!networkCapabilities.hasCapability(12)) {
                        z9 = true;
                    }
                }
                z9 = !z9;
            } catch (Throwable th) {
                h7 = AbstractC0485a.h(th);
            }
        } catch (RemoteException unused) {
        }
        h7 = Boolean.valueOf(z9);
        if (h7 instanceof A7.i) {
            h7 = null;
        }
        Boolean bool = (Boolean) h7;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
